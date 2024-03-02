package com.sx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.toolkit.Db;
import com.github.pagehelper.PageInfo;
import com.sx.pojo.Dish;
import com.sx.mapper.DishMapper;
import com.sx.pojo.DishType;
import com.sx.service.IDishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sx
 * @since 2024-02-28
 */
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements IDishService {

    @Autowired
    private DishMapper dishMapper;

    @Override
    public List<Dish> getAll(Dish dish) {
        List<Dish> list = Db.lambdaQuery(Dish.class)
                .eq(dish!=null&&dish.getDishId()!=null,Dish::getDishId, dish.getDishId())
                .eq(dish!=null&&dish.getDishName()!=null,Dish::getDishName, dish.getDishName())
                .eq(dish!=null&&dish.getTypeId()!=null,Dish::getTypeId, dish.getTypeId())
                .list();
        list.forEach(dish1 -> {
            dish1.setDishType(Db.getById(dish1.getTypeId(), DishType.class));
        });
        return list;
    }

    @Override
    public PageInfo<Dish> getDishCondition(Dish dish, int page) {
        return null;
    }

    @Override
    public List<Dish> getDishByType(int typeId) {
        return dishMapper.selectList(new QueryWrapper<Dish>().eq("type_id", typeId));
    }

}
