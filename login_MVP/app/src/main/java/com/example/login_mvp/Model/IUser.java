package com.example.login_mvp.Model;

/**
 * Created by Administrator on 2017/7/21.
 */

public interface IUser {
    String getName();

    String getPasswd();

    int checkUserValidity(String name, String passwd);
}
