package org.android.live.ui.fragment;


import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import org.android.base.LazyFragment;
import org.android.base.utils.GlideUtils;
import org.android.base.utils.SoftKeyBoardListener;
import org.android.live.R;
import org.android.live.databinding.FragmentLiveInteracteBinding;
import org.android.live.model.LiveInteracteModel;
import org.android.live.model.LiveUserActionHandlers;
import org.android.live.ui.adapter.FansMsgListAdapter;
import org.android.live.ui.adapter.FransHeadsAdapter;
import org.android.live.view.LiveInteracteView;

import java.util.List;

/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：直播互动fragment
 **/
public class LiveInteracteFragment extends LazyFragment<FragmentLiveInteracteBinding> implements LiveInteracteView {
    FansMsgListAdapter fansMsgListAdapter;
    FransHeadsAdapter fransHeadsAdapter;
    LiveInteracteModel model;

    @Override
    public int setFragmentView() {
        return R.layout.fragment_live_interacte;
    }

    @Override
    public void initViews() {
        softKeyboardListnenr();
        binding.recyclerFansMsg.setLayoutManager(new LinearLayoutManager(getContext()));
        fansMsgListAdapter = new FansMsgListAdapter();
        binding.recyclerFansMsg.setAdapter(fansMsgListAdapter);

        binding.recyclerFansHeads.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        fransHeadsAdapter = new FransHeadsAdapter();
        binding.recyclerFansHeads.setAdapter(fransHeadsAdapter);
    }

    @Override
    public void onFirstUserVisible() {
        model = new LiveInteracteModel();
        model.init(this);
        binding.includeBottom.setHandler(new LiveUserActionHandlers(binding, this));
        GlideUtils.loadCircular(binding.imgAnchorHead, R.mipmap.ic_bg);
    }

    @Override
    public void onFansMsgArrive(final String str) {
        binding.recyclerFansMsg.post(new Runnable() {
            @Override
            public void run() {
                binding.recyclerFansMsg.scrollToPosition(fansMsgListAdapter.getItemCount() - 1);
                fansMsgListAdapter.setDataInEnd(str);
            }
        });
    }

    @Override
    public void initFansMsgs(List<String> list) {
        fansMsgListAdapter.setData(list);
    }

    @Override
    public void closeUi() {
        getActivity().finish();
    }

    /**
     * 软键盘显示与隐藏的监听
     */
    private void softKeyboardListnenr() {
        SoftKeyBoardListener.setListener(getActivity(), new SoftKeyBoardListener.OnSoftKeyBoardChangeListener() {
            @Override
            public void keyBoardShow(int height) {/*软键盘显示：执行隐藏title动画，并修改listview高度和装载礼物容器的高度*/

            }

            @Override
            public void keyBoardHide(int height) {/*软键盘隐藏：隐藏聊天输入框并显示聊天按钮，执行显示title动画，并修改listview高度和装载礼物容器的高度*/
                binding.includeBottom.imgShowInput.setVisibility(View.VISIBLE);
                binding.includeBottom.llInputParent.setVisibility(View.GONE);

            }
        });
    }
}
