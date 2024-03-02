package com.sx.controller;


import com.sx.pojo.Orders;
import com.sx.pojo.Result;
import com.sx.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sx
 * @since 2024-02-29
 */
@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrdersController {
    @Autowired
    private IOrdersService ordersService;

    @PostMapping("/addOrder")
    public String addOrder(@RequestBody Orders orders){
        if (ordersService.addOrders(orders)){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @GetMapping("/getOrder")
    public Result getOrder(Orders orders){
        List<Orders> ordersList=ordersService.getOrders(orders);
        return new Result(200,ordersList,"ok");
    }

    @GetMapping("/unpaidTotalPrice")
    public Double getUnpaidTotalPrice() {
        return ordersService.getUnpaidTotalPrice();
    }

//    @DeleteMapping("/delOrder/{orderId}")
//    public String deleteOrder(@PathVariable Long orderId) {
//        boolean success = ordersService.deleteOrderById(orderId);
//        if (success) {
//            return "Order deleted successfully";
//        } else {
//            return "Failed to delete order";
//        }
//    }
}
