package org.android.live.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;

import org.android.live.R;
import org.android.live.ui.fragment.LiveInteracteDialogFragment;


/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：Activity
 **/
public class BeautyLiveActivity extends BaseMovieActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initData();

    }

    private void initView() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_beauty_live);
        video_player = findViewById(R.id.video_player);
        new LiveInteracteDialogFragment().show(getSupportFragmentManager(), "show");
    }


}
