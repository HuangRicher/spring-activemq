package com.activemq.entity;

public class CouponsWithBLOBs extends Coupons {

	private static final long serialVersionUID = 5007822924829078913L;

	private String goodsIds;

    private String goodsNames;

    private String remark;

    public String getGoodsIds() {
        return goodsIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds == null ? null : goodsIds.trim();
    }

    public String getGoodsNames() {
        return goodsNames;
    }

    public void setGoodsNames(String goodsNames) {
        this.goodsNames = goodsNames == null ? null : goodsNames.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}