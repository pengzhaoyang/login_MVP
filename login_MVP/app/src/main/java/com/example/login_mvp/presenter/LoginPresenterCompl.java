package com.example.login_mvp.presenter;

import android.os.Handler;
import android.os.Looper;

import com.example.login_mvp.Model.IUser;
import com.example.login_mvp.Model.UserModel;
import com.example.login_mvp.view.ILoginView;

/**
 * Created by Administrator on 2017/7/21.
 */

public class LoginPresenterCompl implements ILoginPresenter {

    private IUser user;
    Handler handler;
    ILoginView iLoginView;

    public LoginPresenterCompl(ILoginView iLoginView) {
        this.iLoginView=iLoginView;
        initUser();
        handler=new Handler(Looper.getMainLooper());
    }

    private void initUser() {
        user = new UserModel("mvp","mvp");
    }

    @Override
    public void clear() {
        iLoginView.onClearText();
    }

    @Override
    public void doLogin(String name, String passwd) {
        Boolean isLoginSuccess=true;
        final int code = user.checkUserValidity(name, passwd);
        if(code!=0)isLoginSuccess = false;
        final Boolean result=isLoginSuccess;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result,code);
            }
        },3000);
    }

    @Override
    public void setProgressBarVisiblity(int visiblity) {
        iLoginView.onSetProgressBarVisibility(visiblity);
    }
}
