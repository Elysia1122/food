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
 * @since 2024-02-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("package_item")
public class PackageItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("pack_id")
    private Integer packId;

    @TableField("dish_id")
    private Integer dishId;

    @TableField("pack_index")
    private Integer packIndex;


}
