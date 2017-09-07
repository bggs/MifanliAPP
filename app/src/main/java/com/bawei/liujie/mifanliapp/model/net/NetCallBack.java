package com.bawei.liujie.mifanliapp.model.net;

/**
 * 类的作用:
 * author: 刘婕
 * date:2017/9/7
 */

public interface NetCallBack<T> {
    void success(T t);
    void error(int code,String str);
}
