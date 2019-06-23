package com.jzkj.modules.sys.controller;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.miservice.entity.product.ProductEntity;
import com.jzkj.modules.product.service.ProduceService;

import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 系统页面视图
 *
 * @author
 * @email
 * @date
 */
@Controller
public class SysPageController {
	@Resource
	private ProduceService produceService;

	@RequestMapping("modules/{module}/{url}.html")
	public String module(@PathVariable("module") String module, @PathVariable("url") String url){
		return "modules/" + module + "/" + url;
	}
	@RequestMapping("shop/{shop}/{url}.html")
	public String shop(@PathVariable("shop") String module, @PathVariable("url") String url){
		return "shop/" + module + "/" + url;
	}


	@RequestMapping(value = {"/", "index.html"})
	public String index(){
		return "index";
	}


	@RequestMapping("http://localhost:8073/image/*")
	public String tets(){
		return "http://localhost:8073/image/*";
	}




	@RequestMapping("index1.html")
	public String index1(){

		return "index1";
	}

	@RequestMapping("suyuanindex.html")
	public String suyuanindex(){
		return "suyuanindex";
	}


	@RequestMapping("about.html")
	public String abouthtml(){
		return "about";
	}


	@RequestMapping("bird.html")
	public String birdhtml(){

		return "bird";
	}
	@RequestMapping("data.html")
	public String datahtml(){
		return "data";
	}

	@RequestMapping("certification.html")
	public String certification(){

		return "certification";
	}

	@RequestMapping("download.html")
	public String download(){

		return "download";
	}
	@RequestMapping("data-list.html")
	public String datalist(){
		return "datalist";
	}
	@RequestMapping("distribute.html")
	public String distribute(){
		return "distribute";
	}
	@RequestMapping("register.html")
	public String registerhtml(){

		return "register";
	}

	@RequestMapping("new.html")
	public String newhtml(){

		return "new";
	}
	@RequestMapping("productlist.html")
	public String productlist(){

		return "productlist";
	}
	@RequestMapping("login.html")
	public String login(){
		return "login";
	}

	@RequestMapping("main.html")
	public String main(){

		return "main";
	}
	@RequestMapping("productNull.html")
	public String productNull(){

		return "productNull";
	}

	@RequestMapping("404.html")
	public String notFound(){

		return "404";
	}
//	@RequestMapping("productContext.html")
//	public String productContext(){
//
//		return "productContext";
//	}
//	@RequestMapping("productContextTest.jsp")
////	public String productContextTest(){
////
////		return "productContextTest.jsp";
////	}





	@SysLog("修改单个产品回显")
	@RequestMapping("/getsession")
	/*@RequiresPermissions("sys:model:select")*/
	public ReturnResult getsession(HttpServletRequest request){
		Object productId = request.getSession().getAttribute("productId");
		return ReturnResult.ok().put("productId",productId.toString());

	}



	/**
	 * 查询单个
	 */
	@ApiOperation("产品回显")
	@GetMapping("/info")
	public String select(String productId, ModelMap map, HttpServletRequest request, HttpServletResponse response){
		System.out.println("修改查询："+productId);
		ProductEntity	product=this.produceService.selectByid(productId);
		if(product!=null) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("html");
			System.out.println("修改查询：" + product.getProductName());
			map.addAttribute("productName", product.getProductName());
			map.addAttribute("productContext", product.getProductContext());
			map.addAttribute("productVersion", product.getProductVersion());
			map.addAttribute("productId", product.getProductId());
			return "productContext.html";
		}else{
			return "productNull.html";

		}

	}




	/**
	 * 查询单个
	 */
	@ApiOperation("产品回显")
	@RequestMapping("/info4")
	@ResponseBody
	public ReturnResult select4(String productId,ModelMap map, HttpServletRequest request){
		ProductEntity	product=this.produceService.selectByid(productId);
		System.out.println("修改查询："+product.getProductName());
		//查询单个用户的信息
		return ReturnResult.ok().put("product", product);
	}


}
