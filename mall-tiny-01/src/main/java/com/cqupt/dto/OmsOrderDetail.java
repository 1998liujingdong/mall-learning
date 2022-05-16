package com.cqupt.dto;

import com.cqupt.mbg.model.OmsOrderItem;
import com.cqupt.mbg.model.OmsOrderOperateHistory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jingdong
 * @description:
 * @menu
 * @date 2022/5/16 21:09
 */
public class OmsOrderDetail {
    @Getter
    @Setter
    @ApiModelProperty("订单商品列表")
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    @ApiModelProperty("订单操作记录列表")
    private List<OmsOrderOperateHistory> historyList;
}
