package com.sx.service.impl;

import com.baomidou.mybatisplus.extension.toolkit.Db;
import com.sx.pojo.Orders;
import com.sx.mapper.OrdersMapper;
import com.sx.service.IOrdersService;
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
 * @since 2024-02-29
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public boolean addOrders(Orders orders) {
        int order=ordersMapper.insert(orders);
        return  order>0;
    }

    @Override
    public List<Orders> getOrders(Orders orders) {
        List<Orders> ordersList= Db.lambdaQuery(Orders.class)
                .eq(orders.getOrderId()!=null,Orders::getOrderId,orders.getOrderId())
                .list();
        return ordersList;
    }

    public Double getUnpaidTotalPrice() {
        return ordersMapper.getUnpaidTotalPrice();
    }

//    @Override
//    public boolean deleteOrderById(Long orderId) {
//        int rows = baseMapper.deleteOrderById(orderId);
//        return rows > 0;
//    }


}
