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
@TableName("package")
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pack_id", type = IdType.AUTO)
    private Integer packId;

    @TableField("pack_name")
    private String packName;

    @TableField("pack_length")
    private Integer packLength;

    @TableField("pack_img")
    private String packImg;


}
