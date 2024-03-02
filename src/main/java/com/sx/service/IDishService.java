package com.sx.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sx.pojo.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sx
 * @since 2024-02-28
 */
public interface IDishService extends IService<Dish> {
    List<Dish> getAll(Dish dish);
    PageInfo<Dish> getDishCondition(Dish dish, int page);
    List<Dish> getDishByType(int typeId);
}
