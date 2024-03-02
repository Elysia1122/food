package com.sx.controller;


import com.sx.pojo.DishType;
import com.sx.pojo.Result;
import com.sx.service.IDishTypeService;
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
@RequestMapping("/dish-type")
@CrossOrigin
public class DishTypeController {
    @Autowired
    private IDishTypeService iDishTypeService;

    @PostMapping("/getDishType")
    public Result getDishType(@RequestBody DishType dishType){
        List<DishType> dishTypes=iDishTypeService.getDishType(dishType);
        return new Result(200,dishTypes,"ok");
    }
}
