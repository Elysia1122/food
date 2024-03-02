package com.sx.mapper;

import com.sx.pojo.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sx
 * @since 2024-02-29
 */
public interface OrdersMapper extends BaseMapper<Orders> {
    @Select("SELECT SUM(total_price) FROM orders WHERE is_payed = 0")
    Double getUnpaidTotalPrice();

//    @Delete("delete from orders where order_id = #{orderId}")
//    int deleteOrderById(@Param("orderId") Long orderId);
}

