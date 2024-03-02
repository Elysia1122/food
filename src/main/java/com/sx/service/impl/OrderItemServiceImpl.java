package com.sx.service.impl;

import com.sx.pojo.OrderItem;
import com.sx.mapper.OrderItemMapper;
import com.sx.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sx
 * @since 2024-02-29
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
