package com.alibaba.android.arouter.demo.testinject;

import android.support.annotation.NonNull;

import java.io.Serializable;

/**
 * Created by @author joker on 2018/7/10.
 */
public class TestSerializable implements Serializable
{
    public String name;
    public int id;

    public TestSerializable()
    {
    }

    public TestSerializable(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @NonNull
    @Override
    public String toString()
    {
        return "{" +
                "name:" + name +
                ",id:" + id +
                "}";
    }
}
