package com.sx.service.impl;

import com.baomidou.mybatisplus.extension.toolkit.Db;
import com.sx.pojo.Dish;
import com.sx.pojo.Menu;
import com.sx.mapper.MenuMapper;
import com.sx.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sx
 * @since 2024-03-03
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Override
    public List<Menu> getMenu(Menu menu) {
        List<Menu> menuList = Db.lambdaQuery(Menu.class)
                .eq(menu.getPackId() != null, Menu::getPackId, menu.getPackId())
                .eq(menu.getPackDish01() != null, Menu::getPackDish01, menu.getPackDish01())
                .eq(menu.getPackDish02() != null, Menu::getPackDish02, menu.getPackDish02())
            .eq(menu.getPackDish03() != null, Menu::getPackDish03, menu.getPackDish03())
            .list();
        for (Menu menu1 : menuList) {
            Dish dish01 = Db.getById(menu1.getPackDish01(), Dish.class);
            Dish dish02 = Db.getById(menu1.getPackDish02(), Dish.class);
            Dish dish03 = Db.getById(menu1.getPackDish03(), Dish.class);
            menu1.setDish01(dish01);
            menu1.setDish02(dish02);
            menu1.setDish03(dish03);
        }
        return menuList;
    }

}
