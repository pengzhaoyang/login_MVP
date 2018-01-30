package com.example.login_mvp.presenter;

/**
 * Created by Administrator on 2017/7/21.
 */

public interface ILoginPresenter {
    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);
}
