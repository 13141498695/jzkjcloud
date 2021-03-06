package com.jzkj.modules.shop.controller;

import com.jzkj.common.platform.utils.Query;
import com.jzkj.common.platform.utils.R;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.modules.shop.entity.CartEntity;
import com.jzkj.modules.shop.service.CartService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * Controller
 *
 * @author zhangbin
 * @email 1314149869@163.com
 * @date 2018-08-19 09:37:35
 */

@RestController
@RequestMapping("cart")
public class CartController {
	@Autowired
	private CartService cartService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("cart:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CartEntity> cartList = cartService.queryList(query);
		int total = cartService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(cartList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("cart:info")
	public R info(@PathVariable("id") Integer id){
		CartEntity cart = cartService.queryObject(id);
		
		return R.ok().put("cart", cart);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("cart:save")
	public R save(@RequestBody CartEntity cart){
		cartService.save(cart);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("cart:update")
	public R update(@RequestBody CartEntity cart){
		cartService.update(cart);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("cart:delete")
	public R delete(@RequestBody Integer[] ids){
		cartService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
