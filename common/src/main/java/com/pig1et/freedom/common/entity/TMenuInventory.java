package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 餐品库存表 t_menu_inventory
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TMenuInventory implements Serializable {

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
     * 餐品表id
     */
    private Integer menuInfoId;

    /**
     * 餐品库存时间(yyyy-MM-dd)
     */
    private String startDate;

    /**
     * 库存总量，等于库存余量+已销售数量+占用库存量
     */
    private Integer sumStock;

    /**
     * 库存余量
     */
    private Integer stock;

    /**
     * 已销售数量
     */
    private Integer saleStock;

    /**
     * 占用库存量
     */
    private Integer occupyStock;


}
