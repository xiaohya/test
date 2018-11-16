package com.xiaohuya.test.model;

import java.util.Date;

public class ly_exam_test_room {
    private  String id;
    private  String room_name;
    private  int dict_test_room_status;
    private  String fk_account_id;
    private Date update_time;
    private  String fk_picture_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public int getDict_test_room_status() {
        return dict_test_room_status;
    }

    public void setDict_test_room_status(int dict_test_room_status) {
        this.dict_test_room_status = dict_test_room_status;
    }

    public String getFk_account_id() {
        return fk_account_id;
    }

    public void setFk_account_id(String fk_account_id) {
        this.fk_account_id = fk_account_id;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getFk_picture_id() {
        return fk_picture_id;
    }

    public void setFk_picture_id(String fk_picture_id) {
        this.fk_picture_id = fk_picture_id;
    }
}
