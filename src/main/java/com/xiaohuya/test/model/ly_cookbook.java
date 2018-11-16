package com.xiaohuya.test.model;

public class ly_cookbook {
    private String id;
    private  String cook_name;
    private  String intro;
    private  String is_public;
    private  String fk_cookhouse_id;
    private  String cookhouse_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCook_name() {
        return cook_name;
    }

    public void setCook_name(String cook_name) {
        this.cook_name = cook_name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIs_public() {
        return is_public;
    }

    public void setIs_public(String is_public) {
        this.is_public = is_public;
    }

    public String getFk_cookhouse_id() {
        return fk_cookhouse_id;
    }

    public void setFk_cookhouse_id(String fk_cookhouse_id) {
        this.fk_cookhouse_id = fk_cookhouse_id;
    }

    public String getCookhouse_name() {
        return cookhouse_name;
    }

    public void setCookhouse_name(String cookhouse_name) {
        this.cookhouse_name = cookhouse_name;
    }
}
