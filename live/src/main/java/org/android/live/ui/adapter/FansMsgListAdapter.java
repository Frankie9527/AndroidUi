package org.android.live.ui.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.android.base.BaseRecyclerAdapter;
import org.android.base.BaseViewHolder;
import org.android.live.R;
import org.android.live.databinding.FragmentLiveInteracteRecyclerFansMsgBinding;

/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：
 **/
public class FansMsgListAdapter  extends BaseRecyclerAdapter<String,BaseViewHolder<FragmentLiveInteracteRecyclerFansMsgBinding>> {
    @NonNull
    @Override
    public BaseViewHolder<FragmentLiveInteracteRecyclerFansMsgBinding> onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        FragmentLiveInteracteRecyclerFansMsgBinding binding= DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.fragment_live_interacte_recycler_fans_msg,
                viewGroup, false);
        BaseViewHolder holder = new BaseViewHolder(binding.getRoot());
        holder.setBind(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<FragmentLiveInteracteRecyclerFansMsgBinding> holder, int i) {
        holder.getBinding().tvContent.setText(list.get(i));
    }


}
