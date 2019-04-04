package org.android.base;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BaseViewHolder<T extends ViewDataBinding>  extends RecyclerView.ViewHolder {
    public T binding;
    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void setBind(T binding) {
        this.binding = binding;
    }
    public T getBinding(){
        return binding;
    }

}
