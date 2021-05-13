package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户微信信息表 t_user_info
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Date createDate;

    private Date lastModifiedDate;

    /**
     * 微信登录唯一code
     */
    private String wxUniqueCode;

    /**
     * 最后登录时间
     */
    private Date astLoginDate;


}
