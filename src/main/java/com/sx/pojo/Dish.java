package com.sx.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sx
 * @since 2024-02-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dish")
@ToString
public class Dish implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dish_id", type = IdType.AUTO)
    private Integer dishId;

    @TableField("dish_name")
    private String dishName;

    @TableField("dish_price")
    private Double dishPrice;

    @TableField("dish_img")
    private String dishImg;

    @TableField("type_id")
    private Integer typeId;

    @TableField(exist = false)
    private DishType dishType;
}
