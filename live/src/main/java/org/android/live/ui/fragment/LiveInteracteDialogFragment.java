package org.android.live.ui.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.android.live.R;

/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/4
 * describe：
 **/
public class LiveInteracteDialogFragment extends DialogFragment {
    ViewPager vp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_live_main, container, false);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getActivity(), R.style.MainDialog) {/*设置MainDialogFragment的样式，这里的代码最好还是用我的，大家不要改动*/
            @Override
            public void onBackPressed() {
                super.onBackPressed();
                getActivity().finish();
            }
        };
        return dialog;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vp = view.findViewById(R.id.vp);
        vp.setAdapter(new LivePagerAdapter(getChildFragmentManager()));
        vp.postDelayed(new Runnable() {
            @Override
            public void run() {
                vp.setCurrentItem(2, true);
            }
        }, 5000);
    }

    public class LivePagerAdapter extends FragmentStatePagerAdapter {

        private LivePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            if (i == 0) {
                return new TransparentFragment();
            }
            return new LiveInteracteFragment();
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
