package com.xiaohuya.test.model;

import java.math.BigDecimal;

public class ly_goods_supplier {
    private String  fk_goods_id;
    private  String fk_supplier_id;
    private BigDecimal price;
    private  String dict_verify_quoted_price;

    public String getFk_goods_id() {
        return fk_goods_id;
    }

    public void setFk_goods_id(String fk_goods_id) {
        this.fk_goods_id = fk_goods_id;
    }

    public String getFk_supplier_id() {
        return fk_supplier_id;
    }

    public void setFk_supplier_id(String fk_supplier_id) {
        this.fk_supplier_id = fk_supplier_id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDict_verify_quoted_price() {
        return dict_verify_quoted_price;
    }

    public void setDict_verify_quoted_price(String dict_verify_quoted_price) {
        this.dict_verify_quoted_price = dict_verify_quoted_price;
    }
}
