package com.xiaohuya.test.model;

import java.math.BigDecimal;
import java.util.Date;

public class ly_exam_question {
    private String id;
    private  int dict_question_type;
    private  int dict_question_status;
    private String fk_exam_course_id;
    private BigDecimal score_default;
    private BigDecimal difficulty_value;
    private int use_time;
    private Date create_time;
    private  Date update_time;
    private int use_number;
    private String fk_picture_id;
    private String fk_file_id;
    private  String flag;
    private  String check_outline;
    private  String official_answer;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDict_question_type() {
        return dict_question_type;
    }

    public void setDict_question_type(int dict_question_type) {
        this.dict_question_type = dict_question_type;
    }

    public int getDict_question_status() {
        return dict_question_status;
    }

    public void setDict_question_status(int dict_question_status) {
        this.dict_question_status = dict_question_status;
    }

    public String getFk_exam_course_id() {
        return fk_exam_course_id;
    }

    public void setFk_exam_course_id(String fk_exam_course_id) {
        this.fk_exam_course_id = fk_exam_course_id;
    }

    public BigDecimal getScore_default() {
        return score_default;
    }

    public void setScore_default(BigDecimal score_default) {
        this.score_default = score_default;
    }

    public BigDecimal getDifficulty_value() {
        return difficulty_value;
    }

    public void setDifficulty_value(BigDecimal difficulty_value) {
        this.difficulty_value = difficulty_value;
    }

    public int getUse_time() {
        return use_time;
    }

    public void setUse_time(int use_time) {
        this.use_time = use_time;
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

    public int getUse_number() {
        return use_number;
    }

    public void setUse_number(int use_number) {
        this.use_number = use_number;
    }

    public String getFk_picture_id() {
        return fk_picture_id;
    }

    public void setFk_picture_id(String fk_picture_id) {
        this.fk_picture_id = fk_picture_id;
    }

    public String getFk_file_id() {
        return fk_file_id;
    }

    public void setFk_file_id(String fk_file_id) {
        this.fk_file_id = fk_file_id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCheck_outline() {
        return check_outline;
    }

    public void setCheck_outline(String check_outline) {
        this.check_outline = check_outline;
    }

    public String getOfficial_answer() {
        return official_answer;
    }

    public void setOfficial_answer(String official_answer) {
        this.official_answer = official_answer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

