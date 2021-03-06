package com.camnter.newlife.ui.fragment.easyslidingtabsfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import com.camnter.newlife.R;
import com.camnter.newlife.core.BaseFragment;

/**
 * Description：EasyFourthFragment
 * Created by：CaMnter
 * Time：2015-10-17 12:15
 */
public class EasyFourthFragment extends BaseFragment {

    private static EasyFourthFragment instance;


    @SuppressLint("ValidFragment") private EasyFourthFragment() {
    }


    public static EasyFourthFragment getInstance() {
        if (instance == null) instance = new EasyFourthFragment();
        return instance;
    }


    /**
     * Fill in layout id
     *
     * @return layout id
     */
    @Override protected int getLayoutId() {
        return R.layout.easy_fourth_fragment;
    }


    /**
     * Initialize the view in the layout
     *
     * @param self self
     * @param savedInstanceState savedInstanceState
     */
    @Override protected void initViews(View self, Bundle savedInstanceState) {

    }


    /**
     * Initialize the View of the listener
     */
    @Override protected void initListeners() {

    }


    /**
     * Initialize the Activity data
     */
    @Override protected void initData() {

    }
}
