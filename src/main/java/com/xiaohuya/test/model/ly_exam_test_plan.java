package com.xiaohuya.test.model;

import java.util.Date;

public class ly_exam_test_plan {
    private  String id;
    private  String test_name;
    private  int dict_test_plan_type;
    private  int dict_test_plan_status;
    private String fk_exam_test_room_id;
    private  String fk_exam_test_paper_id;
    private Date start_datetime;
    private  Date end_datetime;
    private  int test_time;
    private String fk_account_create_id;
    private  String fk_account_update_id;
    private  Date create_time;
    private Date update_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public int getDict_test_plan_type() {
        return dict_test_plan_type;
    }

    public void setDict_test_plan_type(int dict_test_plan_type) {
        this.dict_test_plan_type = dict_test_plan_type;
    }

    public int getDict_test_plan_status() {
        return dict_test_plan_status;
    }

    public void setDict_test_plan_status(int dict_test_plan_status) {
        this.dict_test_plan_status = dict_test_plan_status;
    }

    public String getFk_exam_test_room_id() {
        return fk_exam_test_room_id;
    }

    public void setFk_exam_test_room_id(String fk_exam_test_room_id) {
        this.fk_exam_test_room_id = fk_exam_test_room_id;
    }

    public String getFk_exam_test_paper_id() {
        return fk_exam_test_paper_id;
    }

    public void setFk_exam_test_paper_id(String fk_exam_test_paper_id) {
        this.fk_exam_test_paper_id = fk_exam_test_paper_id;
    }

    public Date getStart_datetime() {
        return start_datetime;
    }

    public void setStart_datetime(Date start_datetime) {
        this.start_datetime = start_datetime;
    }

    public Date getEnd_datetime() {
        return end_datetime;
    }

    public void setEnd_datetime(Date end_datetime) {
        this.end_datetime = end_datetime;
    }

    public int getTest_time() {
        return test_time;
    }

    public void setTest_time(int test_time) {
        this.test_time = test_time;
    }

    public String getFk_account_create_id() {
        return fk_account_create_id;
    }

    public void setFk_account_create_id(String fk_account_create_id) {
        this.fk_account_create_id = fk_account_create_id;
    }

    public String getFk_account_update_id() {
        return fk_account_update_id;
    }

    public void setFk_account_update_id(String fk_account_update_id) {
        this.fk_account_update_id = fk_account_update_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
