package com.sx.service.impl;

import com.baomidou.mybatisplus.extension.toolkit.Db;
import com.sx.pojo.DishType;
import com.sx.mapper.DishTypeMapper;
import com.sx.service.IDishTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class DishTypeServiceImpl extends ServiceImpl<DishTypeMapper, DishType> implements IDishTypeService {

    @Override
    public List<DishType> getDishType(DishType dishType) {
        List<DishType> dishTypeList= Db.lambdaQuery(DishType.class)
                .eq(dishType!=null&&dishType.getTypeId()!=null,DishType::getTypeId,dishType.getTypeId())
                .eq(dishType!=null&&dishType.getTypeId()!=null,DishType::getTypeId,dishType.getTypeId())
                .list();
        return list();
    }
}
