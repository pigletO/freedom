package com.pig1et.freedom.common.service.impl;

import com.pig1et.common.entity.TOrder;
import com.pig1et.common.mapper.TOrderMapper;
import com.pig1et.common.service.TOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 堂食订单表 t_order（不熟配送费包装费） 服务实现类
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements TOrderService {

}
