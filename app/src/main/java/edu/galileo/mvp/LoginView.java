package edu.galileo.mvp;

/**
 * Created by nuhkoca on 2/14/18.
 */

public interface LoginView {
    void showProgress(boolean showProgress);

    void setUsernameError(int messageResId);

    void setPasswordError(int messageResId);

    void successAction();
}
