package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 堂食订单表 t_order（不熟配送费包装费）
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Date createDate;

    private Date lastModified;

    /**
     * 商家id
     */
    private Integer shopInfoId;

    /**
     * 支付状态 0-未支付 1-已支付 2已完成 -1退款中 -2已退款
     */
    private Integer payStatus;

    /**
     * 堂食餐桌号
     */
    private Integer boardCode;

    /**
     * 就餐人数
     */
    private Integer boardCount;

    /**
     * 订单总价=订单子表origin_price总和
     */
    private Long sumPrice;

    /**
     * 折扣掉总的价格=订单子表discount_price总和
     */
    private Long sumDiscountPrice;

    /**
     * 应付金额=订单子表apply_price总和
     */
    private Long applyPrice;

    /**
     * 实付金额
     */
    private Long realPrice;

    /**
     * 用户id
     */
    private Integer userId;


}
