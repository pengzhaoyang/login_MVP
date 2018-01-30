package com.example.login_mvp.view;

/**
 * Created by Administrator on 2017/7/21.
 */

public interface ILoginView {
    public void onClearText();

    public void onLoginResult(Boolean result, int code);

    public void onSetProgressBarVisibility(int visibility);
}
