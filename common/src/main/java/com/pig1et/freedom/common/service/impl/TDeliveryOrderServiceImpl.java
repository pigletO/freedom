package com.pig1et.freedom.common.service.impl;

import com.pig1et.common.entity.TDeliveryOrder;
import com.pig1et.common.mapper.TDeliveryOrderMapper;
import com.pig1et.common.service.TDeliveryOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 外卖订单表 t_delivery_order（收配送费和包装费） 服务实现类
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Service
public class TDeliveryOrderServiceImpl extends ServiceImpl<TDeliveryOrderMapper, TDeliveryOrder> implements TDeliveryOrderService {

}
