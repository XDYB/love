package com.yc.love.model.bean;

/**
 * Created by mayn on 2019/5/11.
 */

public class LoveHealingDetailBean {
    /**
     * ans_sex : 1
     * content : 别让我看见你
     * id : 4
     * lovewords_id : 2
     */

    public String ans_sex;
    public String content;
    public int id;
    public int lovewords_id;

    @Override
    public String toString() {
        return "LoveHealingDetailBean{" +
                "ans_sex='" + ans_sex + '\'' +
                ", content='" + content + '\'' +
                ", id=" + id +
                ", lovewords_id=" + lovewords_id +
                '}';
    }
}
