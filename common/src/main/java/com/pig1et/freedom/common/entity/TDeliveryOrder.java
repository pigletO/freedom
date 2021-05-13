package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 外卖订单表 t_delivery_order（收配送费和包装费）
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TDeliveryOrder implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Date createDate;

    private Date lastModifiedDate;

    /**
     * 商家id
     */
    private Integer shopInfoId;

    /**
     * 0-等待商家接单 1-商家已接单 2-商家配送中 3-已完成
     */
    private Integer orderStatus;

    /**
     * 支付状态 0-未支付 1-已支付 2已完成 -1退款中 -2已退款
     */
    private Integer payStatus;

    /**
     * 配送状态 0-未配送 1-配送中 2-已完成
     */
    private Integer deliveryStatus;

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

    /**
     * 用户备注
     */
    private String remark;


}
