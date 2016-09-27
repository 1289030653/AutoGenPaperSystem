package cn.edu.zjnu.AutoGenPaperSystem.model;

/**
 * Created by zseapeng on 2016/9/27.
 */
public class SearchAll {
    private int grade_id;
    private int sub_id;
    private int char_id;
    private int types_id;
    private int know_id;

    public SearchAll() {
    }

    public SearchAll(int grade_id, int sub_id, int char_id, int types_id, int know_id) {
        this.grade_id = grade_id;
        this.sub_id = sub_id;
        this.char_id = char_id;
        this.types_id = types_id;
        this.know_id = know_id;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public int getChar_id() {
        return char_id;
    }

    public void setChar_id(int char_id) {
        this.char_id = char_id;
    }

    public int getTypes_id() {
        return types_id;
    }

    public void setTypes_id(int types_id) {
        this.types_id = types_id;
    }

    public int getKnow_id() {
        return know_id;
    }

    public void setKnow_id(int know_id) {
        this.know_id = know_id;
    }
}