package org.android.base;


import org.android.base.mvp.BaseView;

public interface RefreshMoreView<T> extends BaseView {
    void  onloadheadSuccess(T t);
    void  onloadMoreSuccess(T t);

}
