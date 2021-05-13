package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户收货地址表 t_user_address
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TUserAddress implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Date createDate;

    private Date lastModifiedDate;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 性别1-先生 2女士
     */
    private Integer sex;

    private String phone;

    private String address;

    /**
     * 门牌号
     */
    private String houseNumber;

    /**
     * 地址标签 1-家 2-公司 3-学校
     */
    private Integer label;


}
