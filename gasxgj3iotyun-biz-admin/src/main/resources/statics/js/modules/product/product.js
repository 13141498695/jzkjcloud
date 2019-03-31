$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + '/sys/product/list',
        datatype: "json",
        colModel: [		
          
			{ label: '产品ID', name: 'productid', index: "productid", width: 45, key: true },
			{ label: '产品名称', name: 'productName', width: 75 },
            { label: '产品版本', name: 'version', sortable: false, width: 75 },
			{ label: '节点类型', name: 'nodetype', width: 90 },
			/*{ label: '是否接入网络', name: 'gateway', width: 100 },*/
			{ label: '读写类型', name: 'gateway', width: 60, formatter: function(value, options, row){
				return value === 0 ? 
					'<span class="label label-danger">是</span>' : 
					'<span class="label label-success">否</span>';
			}},
			{ label: '产品类型', name: 'typeId', width: 100 },
		/*	{ label: '联网方式', name: 'network', width: 100 },*/
			{ label: '联网方式', name: 'network', width: 60, formatter: function(value, options, row){
				return value === 0 ? 
					'<span class="label label-danger">3G/4G/5G</span>' : value === 1 ?
					'<span class="label label-success">蜂巢网络</span>' : value === 2 ?
							'<span class="label label-success">WIFI</span>' :
								'<span class="label label-success">其他</span>';
			}},
			/*{ label: '产品状态', name: 'status', width: 100 },*/
			{ label: '产品状态', name: 'status', width: 60, formatter: function(value, options, row){
				return value === 0 ? 
					'<span class="label label-danger">未发布</span>' : value === 1 ?
					'<span class="label label-danger">发布中</span>' : value === 2 ?
					'<span class="label label-success">已发布</span>':
							'<span class="label label-danger">下线</span>';		

						
			}},
			{ label: '创建时间', name: 'createTime', index: "createTime", width: 85}

        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});
var setting = {
    data: {
        simpleData: {
            enable: true,
            idKey: "deptId",
            pIdKey: "parentId",
            rootPId: -1
        },
        key: {
            url:"nourl"
        }
    }
};
var ztree;

var vm = new Vue({

    el:'#rrapp',
    data:{
        q:{
        	productName:null
        },
        showList: true,
        title:null,
        product:{
            productTypeId:null,
            productTypeName:null,
            status:1,
            productId:null,
            productName:null,
            version:null,
            nodetype:null,
            gateway:null,
            typeId:null,
            network:null,
            status:null
        }
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function(){
 
            vm.showList = false;
            vm.title = "新增";
            vm.product = { 
                    productTypeId:null,
                    productTypeName:null,
            		  productId:null,
            		  productName:null,
                       version:null,
                       nodetype:null,
                       gateway:null,
                       typeId:null,
                       network:null,
                       status:null
            };
            vm.getDept();
        },
        getDept: function(){
            //加载公司树
            $.get(baseURL + "/sys/producttype/infoList", function(r){
                ztree = $.fn.zTree.init($("#deptTree"), setting, r);
                var node = ztree.getNodeByParam("productTypeId", vm.product.productTypeId);
                if(node != null){
                    ztree.selectNode(node);
                    vm.product.productTypeName=node.productTypeName;
                }
            })
        },
        update: function () {
            var modelId = getSelectedRow();
            console.log(modelId);
            console.log('11111')
            if(modelId == null){
                return ;
            }
            vm.showList = false;
            vm.title = "修改";
            vm.getmodel(modelId);
            //获取角色信息
        },
        
        del: function () {
            var productid = getSelectedRows();
            if(productid == null){
                return ;
            }

            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/product/delete",
                    contentType: "application/json",
                    data: JSON.stringify(productid),
                    success: function(r){
                        if(r.code == 0){
                            alert('操作成功', function(){
                                vm.reload();
                                location.href="modules/product/productlist.html";

                            });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            });
        },
        saveOrUpdate: function () {
            var url = vm.product.productid == null ? "sys/product/add" : "sys/product/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.product),
                success: function(r){
                    if(r.code === 0){
                        alert('操作成功', function(){
                            vm.reload();
                            location.href="modules/product/productlist.html";

                        });
                    }else{
                        alert(r.msg);
                    }
                }
            });
        },
        getmodel: function(productid){
            $.get(baseURL + "sys/product/info/"+productid, function(r){
                vm.product = r.product;
            });
        },
        deptTree: function(){
            layer.open({
                type: 1,
                offset: '50px',
                skin: 'layui-layer-molv',
                title: "选择所属行业",
                area: ['300px', '450px'],
                shade: 0,
                shadeClose: false,
                content: jQuery("#deptLayer"),
                btn: ['确定', '取消'],
                btn1: function (index) {
                    var node = ztree.getSelectedNodes();
                    vm.product.productTypeName =node[0].productTypeName;

                    vm.product.productTypeId =node[0].productTypeId;

                    layer.close(index);
                }
            });
        },
        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'productName': vm.q.productName},
                page:page
            }).trigger("reloadGrid");
        }
    }
});