package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 店铺基本信息t_shop_info
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TShopInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Date createDate;

    private Date lastModifiedDate;

    /**
     * 店铺名称
     */
    private String name;

    /**
     * 店铺缩略图
     */
    private String thumbPic;

    /**
     * 店铺背景图
     */
    private String backgroundPic;

    /**
     * 公告
     */
    private String notice;

    /**
     * 店铺累计销量
     */
    private Integer salesVolume;

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 配送费
     */
    private Long deliveryPrice;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 店铺简介
     */
    private String introduce;

    /**
     * 包装费
     */
    private Long packagePrice;

    /**
     * 1-一口价 2-按商品件数*包装费收费
     */
    private Integer packagePriceType;

    /**
     * 支持配送范围100=10公里
     */
    private Integer deliverScope;

    /**
     * 自动接单1-开启 0-关闭
     */
    private Integer autoTakeOrder;


}
