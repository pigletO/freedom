package com.pig1et.freedom.common.service.impl;

import com.pig1et.common.entity.TSubOrder;
import com.pig1et.common.mapper.TSubOrderMapper;
import com.pig1et.common.service.TSubOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单子表，购物车表 t_sub_order（订单表于订单子表一对多） 服务实现类
 * </p>
 *
 * @author pig1et
 * @since 2021-05-13
 */
@Service
public class TSubOrderServiceImpl extends ServiceImpl<TSubOrderMapper, TSubOrder> implements TSubOrderService {

}
