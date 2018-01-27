package com.example.xuepeng.learncontext;

import android.app.Application;

/**
 * Created by xuepeng on 2018/1/27.
 */

public class App extends Application {
    private String data="default";

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
