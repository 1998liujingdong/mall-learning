package com.cqupt.dto;

import com.cqupt.mbg.model.SmsCoupon;
import com.cqupt.mbg.model.SmsCouponProductCategoryRelation;
import com.cqupt.mbg.model.SmsCouponProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jingdong
 * @description: 优惠券领取历史详情（包括优惠券信息和关联关系）
 * @menu
 * @date 2022/5/16 21:07
 */
@Getter
@Setter
public class SmsCouponHistoryDetail {
    @ApiModelProperty("相关优惠券信息")
    private SmsCoupon coupon;
    @ApiModelProperty("优惠券关联商品")
    private List<SmsCouponProductRelation> productRelationList;
    @ApiModelProperty("优惠券关联商品分类")
    private List<SmsCouponProductCategoryRelation> categoryRelationList;
}
