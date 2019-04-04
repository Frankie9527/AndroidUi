package org.android.live.ui.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.android.base.BaseRecyclerAdapter;
import org.android.base.BaseViewHolder;

import org.android.base.utils.GlideUtils;
import org.android.live.R;
import org.android.live.databinding.FragmentLiveInteracteFansHeadItemBinding;



/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：
 **/
public class FransHeadsAdapter extends BaseRecyclerAdapter<String,BaseViewHolder<FragmentLiveInteracteFansHeadItemBinding>> {
    @NonNull
    @Override
    public BaseViewHolder<FragmentLiveInteracteFansHeadItemBinding> onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        FragmentLiveInteracteFansHeadItemBinding binding= DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.fragment_live_interacte_fans_head_item,
                viewGroup, false);
        BaseViewHolder holder = new BaseViewHolder(binding.getRoot());
        holder.setBind(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<FragmentLiveInteracteFansHeadItemBinding> holder, int i) {
        GlideUtils.loadCircular(holder.binding.imgFansHead,R.mipmap.ic_bg);
    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
