package com.jzkj.modules.shop.controller;


import com.jzkj.common.platform.utils.Query;
import com.jzkj.common.platform.utils.R;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.modules.shop.entity.CommentPictureEntity;
import com.jzkj.modules.shop.service.CommentPictureService;
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
@RequestMapping("commentpicture")
public class CommentPictureController {
    @Autowired
    private CommentPictureService commentPictureService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("commentpicture:list")
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<CommentPictureEntity> commentPictureList = commentPictureService.queryList(query);
        int total = commentPictureService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(commentPictureList, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }

    /**
     * 查看信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("commentpicture:info")
    public R info(@PathVariable("id") Integer id) {
        CommentPictureEntity commentPicture = commentPictureService.queryObject(id);

        return R.ok().put("commentPicture", commentPicture);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("commentpicture:save")
    public R save(@RequestBody CommentPictureEntity commentPicture) {
        commentPictureService.save(commentPicture);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("commentpicture:update")
    public R update(@RequestBody CommentPictureEntity commentPicture) {
        commentPictureService.update(commentPicture);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("commentpicture:delete")
    public R delete(@RequestBody Integer[] ids) {
        commentPictureService.deleteBatch(ids);

        return R.ok();
    }

    /**
     * 查看所有列表
     */
    @RequestMapping("/queryAll")
    public R queryAll(@RequestParam Map<String, Object> params) {

        List<CommentPictureEntity> list = commentPictureService.queryList(params);

        return R.ok().put("list", list);
    }
}
