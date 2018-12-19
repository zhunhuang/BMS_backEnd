package com.learn.nolan.model.DO;

/**
 * description:
 *
 * @author zhun.huang 2018-12-18
 */
public class GoodsSaleInfoDO {

    private long id;

    private String goodsName;

    private long totalSale;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public long getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(long totalSale) {
        this.totalSale = totalSale;
    }
}
