package org.android.live.view;

import java.util.List;

/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：
 **/
public interface LiveInteracteView {
    void onFansMsgArrive(String str);
    void initFansMsgs(List<String> list);
    void closeUi();
}
