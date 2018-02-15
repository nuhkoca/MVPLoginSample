package edu.galileo.mvp;

/**
 * Created by nuhkoca on 2/14/18.
 */

public interface LoginModel {
    interface OnLoginFinishedListener {
        void onCanceled();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener onLoginFinishedListener);
}
