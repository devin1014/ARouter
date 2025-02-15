package com.alibaba.android.arouter.demo.testinject;

import android.support.annotation.NonNull;

/**
 * @author zhilong <a href="mailto:zhilong.lzl@alibaba-inc.com">Contact me.</a>
 * @version 1.0
 * @since 2017/3/16 下午4:42
 */
public class TestObj
{
    public String name;
    public int id;

    public TestObj()
    {
    }

    public TestObj(String name, int id)
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
