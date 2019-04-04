package org.android.base;


import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：
 **/
public abstract class BaseRecyclerAdapter<D,T extends BaseViewHolder>  extends RecyclerView.Adapter<T> {
  protected   List<D> list =new ArrayList<>();


    @Override
    public int getItemCount() {
        return list.size();
    }
    public void setData(List<D> data){
        list.addAll(data);
        notifyDataSetChanged();
    }
    public void setDataInEnd(D data){
        list.add(data);
        notifyDataSetChanged();
    }
}
