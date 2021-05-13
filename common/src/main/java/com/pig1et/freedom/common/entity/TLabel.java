package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 标签表 t_label
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TLabel implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Date createDate;

    private Date lastModifiedDate;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 标签类型（餐厅标签、商品标签之类的）
     */
    private Integer type;


}
