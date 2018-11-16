package com.xiaohuya.test.model;

import java.math.BigDecimal;

public class ly_cookbook_member {
    private String fk_cookbook_id;
    private  String fk_food_material_id;
    private String food_name;
    private BigDecimal spec_value;
    private  int target_unit;
    private  String remark;
    private  int dict_unit_measure;
    private  int is_pack_alone;
    private int is_enable;

    public String getFk_cookbook_id() {
        return fk_cookbook_id;
    }

    public void setFk_cookbook_id(String fk_cookbook_id) {
        this.fk_cookbook_id = fk_cookbook_id;
    }

    public String getFk_food_material_id() {
        return fk_food_material_id;
    }

    public void setFk_food_material_id(String fk_food_material_id) {
        this.fk_food_material_id = fk_food_material_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public BigDecimal getSpec_value() {
        return spec_value;
    }

    public void setSpec_value(BigDecimal spec_value) {
        this.spec_value = spec_value;
    }

    public int getTarget_unit() {
        return target_unit;
    }

    public void setTarget_unit(int target_unit) {
        this.target_unit = target_unit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getDict_unit_measure() {
        return dict_unit_measure;
    }

    public void setDict_unit_measure(int dict_unit_measure) {
        this.dict_unit_measure = dict_unit_measure;
    }

    public int getIs_pack_alone() {
        return is_pack_alone;
    }

    public void setIs_pack_alone(int is_pack_alone) {
        this.is_pack_alone = is_pack_alone;
    }

    public int getIs_enable() {
        return is_enable;
    }

    public void setIs_enable(int is_enable) {
        this.is_enable = is_enable;
    }
}
