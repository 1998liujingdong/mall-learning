package com.cqupt.component;

import com.cqupt.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author jingdong
 * @description: 订单超时取消并解锁库存的定时器
 * @menu
 * @date 2022/5/16 20:26
 */
@Component
public class OrderTimeOutCancelTask {
    private Logger LoGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    @Autowired
    private OmsPortalOrderService portalOrderService;

    /**
     * ron表达式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 从下单开始每10分钟扫描一次，扫描设定超时时间之前下的订单，如果没支付则取消该订单
     */
    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancalTimeOutOrder() {
        //TODO: 2022/5/16 此处应该调用取消订单的方法
        LoGGER.info("取消订单，并根据sku编号释放锁定的库存");
    }
}
