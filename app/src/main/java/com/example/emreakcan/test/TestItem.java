package com.example.emreakcan.test;

/**
 * Created by EmreAkcan on 12.01.2018.
 */

public class TestItem {
    String value;
    String id;

    public TestItem(String value, String id) {
        this.value = value;
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
