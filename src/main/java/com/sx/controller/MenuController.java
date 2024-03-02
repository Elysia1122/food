package com.sx.controller;


import com.sx.pojo.Menu;
import com.sx.pojo.Result;
import com.sx.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sx
 * @since 2024-03-03
 */
@RestController
@RequestMapping("/menu")
@CrossOrigin
public class MenuController {
    @Autowired
    private IMenuService menuService;

    @PostMapping("/getMenu")
    public Result getMenu(@RequestBody Menu menu){
        List<Menu> menuList=menuService.getMenu(menu);
        return new Result(200,menuList,"ok");
    }
}
