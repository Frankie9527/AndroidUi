package org.android.live.model;

import org.android.live.view.LiveInteracteView;

import java.util.ArrayList;
import java.util.List;

/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：
 **/
public class LiveInteracteModel {

   private LiveInteracteView view;
    public void init(LiveInteracteView view){
        this.view=view;
        initFansMsg();
        initGift();
    }


    public void  initFansMsg(){
        List<String> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add("this is "+i+" item");
        }
        view.initFansMsgs(list);
    }
    private void initGift() {
    }

}
