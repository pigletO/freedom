package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 餐品信息表 t_menu_info
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TMenuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Date createDate;

    private Date lastModifiedDate;

    /**
     * 店铺表id
     */
    private Integer shopInfoId;

    /**
     * 菜单tab表id
     */
    private Integer menuTabId;

    /**
     * 餐品名称
     */
    private String name;

    /**
     * 餐品图
     */
    private String pic;

    /**
     * 外卖餐品售价
     */
    private Long deliveryPrice;

    /**
     * 堂食售价
     */
    private Long price;

    /**
     * 餐品市场价，须大于餐品实际售价（外卖展示使用）
     */
    private Long marketPrice;

    /**
     * 餐品排序 越大越靠前
     */
    private Integer sort;

    /**
     * 商品简介
     */
    @TableField("Introduce")
    private String Introduce;


}
