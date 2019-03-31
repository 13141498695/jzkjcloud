package com.gasxgj3iotyun.miservice.entity.product;

import java.io.Serializable;
import java.util.Date;

public class ProductEntity implements Serializable {
    /**
     * 产品id
     */
    private String productid;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品版本
     */
    private String version;

    /**
     * 节点类型
     */
    private String nodetype;

    /**
     * 是否接入网关 0是 1否 
     */
    private Integer gateway;

    /**
     * 产品类型id关联
     */
    private String typeId;

    /**
     * 联网方式 1.3g 2.蜂巢 3.wifi
     */
    private Integer network;

    /**
     * 0 .发布 1.未发布 2.发布中 3.下线
     */
    private Integer status;

    /**
     * 是否id认证
     */
    private Integer authentication;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    private Byte delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * sys_product
     */
    private static final long serialVersionUID = 1L;

    /**
     * 产品id
     * @return productId 产品id
     */
    public String getProductid() {
        return productid;
    }

    /**
     * 产品id
     * @param productid 产品id
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * 产品名称
     * @return product_name 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 产品名称
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 产品版本
     * @return version 产品版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 产品版本
     * @param version 产品版本
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 节点类型
     * @return nodetype 节点类型
     */
    public String getNodetype() {
        return nodetype;
    }

    /**
     * 节点类型
     * @param nodetype 节点类型
     */
    public void setNodetype(String nodetype) {
        this.nodetype = nodetype == null ? null : nodetype.trim();
    }

    /**
     * 是否接入网关 0是 1否 
     * @return gateway 是否接入网关 0是 1否 
     */
    public Integer getGateway() {
        return gateway;
    }

    /**
     * 是否接入网关 0是 1否 
     * @param gateway 是否接入网关 0是 1否 
     */
    public void setGateway(Integer gateway) {
        this.gateway = gateway;
    }

    /**
     * 产品类型id关联
     * @return type_id 产品类型id关联
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 产品类型id关联
     * @param typeId 产品类型id关联
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * 联网方式 1.3g 2.蜂巢 3.wifi
     * @return network 联网方式 1.3g 2.蜂巢 3.wifi
     */
    public Integer getNetwork() {
        return network;
    }

    /**
     * 联网方式 1.3g 2.蜂巢 3.wifi
     * @param network 联网方式 1.3g 2.蜂巢 3.wifi
     */
    public void setNetwork(Integer network) {
        this.network = network;
    }

    /**
     * 0 .发布 1.未发布 2.发布中 3.下线
     * @return status 0 .发布 1.未发布 2.发布中 3.下线
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0 .发布 1.未发布 2.发布中 3.下线
     * @param status 0 .发布 1.未发布 2.发布中 3.下线
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 是否id认证
     * @return authentication 是否id认证
     */
    public Integer getAuthentication() {
        return authentication;
    }

    /**
     * 是否id认证
     * @param authentication 是否id认证
     */
    public void setAuthentication(Integer authentication) {
        this.authentication = authentication;
    }

    /**
     * 是否删除  -1：已删除  0：正常
     * @return del_flag 是否删除  -1：已删除  0：正常
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 是否删除  -1：已删除  0：正常
     * @param delFlag 是否删除  -1：已删除  0：正常
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}