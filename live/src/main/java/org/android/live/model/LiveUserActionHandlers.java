package org.android.live.model;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;


import org.android.live.databinding.FragmentLiveInteracteBinding;
import org.android.live.view.LiveInteracteView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：
 **/
public class LiveUserActionHandlers {
    public LiveInteracteView view;

    public LiveUserActionHandlers(FragmentLiveInteracteBinding binding, LiveInteracteView view) {
        this.binding = binding;
        this.view = view;
    }

    public FragmentLiveInteracteBinding binding;

    public void sendMsg(View view) {
        Toast.makeText(view.getContext(), "发消息", Toast.LENGTH_LONG).show();
        String str = binding.includeBottom.etContent.getText().toString().trim();
        if (!TextUtils.isEmpty(str)) {
            this.view.onFansMsgArrive(str);
            binding.includeBottom.etContent.setText("");
        }
    }

    public void showInput(final View view) {
        Toast.makeText(view.getContext(), "显示消息框", Toast.LENGTH_LONG).show();
        view.setVisibility(View.GONE);
        binding.includeBottom.llInputParent.setVisibility(View.VISIBLE);
        binding.includeBottom.llInputParent.requestFocus();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                InputMethodManager imm = (InputMethodManager)
                        view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(binding.includeBottom.etContent, InputMethodManager.SHOW_FORCED);
            }
        }, 100);
    }

    public void privateChat(View view) {
        Toast.makeText(view.getContext(), "私聊", Toast.LENGTH_LONG).show();

    }

    public void sendGift(View view) {
        Toast.makeText(view.getContext(), "送礼物", Toast.LENGTH_LONG).show();

    }

    public void closeUi(View view) {
        Toast.makeText(view.getContext(), "关闭界面", Toast.LENGTH_LONG).show();
        this.view.closeUi();
    }

    public void share(View view) {
        Toast.makeText(view.getContext(), "关闭界面", Toast.LENGTH_LONG).show();

    }


}
