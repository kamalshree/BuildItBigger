package com.udacity.gradle.builditbigger.backend;

import com.android.jokesjavalib.MyJokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = new MyJokes().getMyJokeList();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}