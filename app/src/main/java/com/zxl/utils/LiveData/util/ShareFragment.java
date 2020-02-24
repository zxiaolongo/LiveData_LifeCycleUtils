package com.zxl.utils.LiveData.util;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zxl.utils.R;
import com.zxl.utils.ToastUtils;

public class ShareFragment extends Fragment {
    private DemoViewModel mDemoViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_share, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDemoViewModel.getDemoData().setTag1(mDemoViewModel.getDemoData().getTag1()+1);
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mDemoViewModel = ViewModelProviders.of(getActivity()).get(DemoViewModel.class);
        mDemoViewModel.getDemoData().observe(this, new Observer<DemoData>() {
            @Override
            public void onChanged(@Nullable DemoData demoData) {
                String s = demoData == null?"null":demoData.getTag1()+"";
                ToastUtils.showToast("demoData:"+s);
            }
        });
    }

}
