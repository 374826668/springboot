package com.springboot.springboot.bean;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/14
 * Time: 14:55
 */

import java.util.Date;

/**
 * 描述：用户
 *
 * @author Li.peng
 * @create 2018-09-14 14:55
 */
public class User {
    private int id;
    private String name;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
