package com.sx.service;

import com.sx.pojo.Dish;
import com.sx.pojo.DishType;
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
public interface IDishTypeService extends IService<DishType> {
    List<DishType> getDishType(DishType dishType);
}
