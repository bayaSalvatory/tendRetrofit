package com.tendinsights.tenddemo.model;

/**
 * Created by Rob on 4/5/17.
 */

public class ListItem {
    private String name;
    private String descr;

    public ListItem(String name, String descr) {
        this.name = name;
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
