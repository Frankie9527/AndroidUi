package org.android.base.utils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import org.android.base.R;

/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：
 **/
public class GlideUtils {

    public static void loadPic(String str, ImageView img) {
        Glide.with(img.getContext()).
                load(str).
                centerCrop().placeholder(R.mipmap.error).into(img);
    }



    public static void loadCircular(final ImageView img,int url) {
        Glide.with(img.getContext()).load(url).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(img);
    }



}
