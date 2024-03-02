package com.sx.service;

import com.sx.pojo.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sx
 * @since 2024-02-29
 */
public interface IOrdersService extends IService<Orders> {
    boolean addOrders(Orders orders);
    List<Orders> getOrders(Orders orders);
    Double getUnpaidTotalPrice();
//    boolean deleteOrderById(Long orderId);
}
