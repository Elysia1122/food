package com.sx.service;

import com.sx.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sx
 * @since 2024-03-03
 */
public interface IMenuService extends IService<Menu> {
    List<Menu> getMenu(Menu menu);
}
