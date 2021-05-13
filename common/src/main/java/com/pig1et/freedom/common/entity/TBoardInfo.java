package com.pig1et.freedom.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 餐桌信息表t_board_info
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TBoardInfo implements Serializable {

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
     * 餐桌号
     */
    private String boardCode;

    /**
     * 最大容纳人数
     */
    private Integer maxCount;

    /**
     * 当前餐桌就餐人数
     */
    private Integer currentCount;


}
