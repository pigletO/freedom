package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单子表，购物车表 t_sub_order（订单表于订单子表一对多）
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TSubOrder implements Serializable {

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
     * 餐品id
     */
    private Integer menuInfoId;

    /**
     * 订单表id
     */
    private Integer orderId;

    /**
     * 订单类型1-外卖 2-堂食
     */
    private Integer orderType;

    /**
     * 单品原价=单品折扣掉价格+单品应付价格
     */
    private Long originPrice;

    /**
     * 单品折扣掉价格
     */
    private Long discountPrice;

    /**
     * 单品应付价格
     */
    private Long applyPrice;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 同一批下的订单code相同，取一个uuid
     */
    private String relationCode;


}
