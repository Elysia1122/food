package com.sx.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sx
 * @since 2024-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pack_id", type = IdType.AUTO)
    private Integer packId;

    @TableField("pack_name")
    private String packName;

    @TableField("pack_dish01")
    private Integer packDish01;

    @TableField("pack_dish02")
    private Integer packDish02;

    @TableField("pack_dish03")
    private Integer packDish03;

    @TableField("pack_money")
    private Integer packMoney;

    @TableField("pack_img")
    private String packImg;

    @TableField("pack_type")
    private String packType;

    @TableField(exist = false)
    private Dish dish;

    @TableField(exist = false)
    private Dish dish01;

    @TableField(exist = false)
    private Dish dish02;

    @TableField(exist = false)
    private Dish dish03;
}
