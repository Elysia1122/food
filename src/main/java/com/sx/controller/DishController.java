package com.sx.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sx.pojo.Dish;
import com.sx.pojo.Result;
import com.sx.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sx
 * @since 2024-02-28
 */
@RestController
@RequestMapping("/dish")
@CrossOrigin
public class DishController {
    @Autowired
    private IDishService iDishService;

    @PostMapping("/getDish")
    public Result getDish(@RequestBody Dish dish){
        List<Dish> dishes=iDishService.getAll(dish);
        return new Result(200,dishes,"ok");
    }

    @GetMapping("/page/{pageNum}")
    public PageInfo<Dish> pageInfo(@PathVariable Integer pageNum){
        PageHelper.startPage(pageNum,6);
        List<Dish> list=iDishService.list();
        return new PageInfo<Dish>(list);
    }

    @GetMapping("/getByType/{typeId}")
    public List<Dish> getDishByType(@PathVariable int typeId) {
        return iDishService.getDishByType(typeId);
    }

//    @GetMapping("/page")
//    public PageInfo<Dish> pageInfo(){
//        PageHelper.startPage(1, 6);
//        List<Dish> list = iDishService.getAll(new Dish());
//        PageInfo<Dish> pageInfo = new PageInfo<>(list);
//        return pageInfo;
//    }
}
