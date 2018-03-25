package com.example.bharat.cryptomanager.main;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bharat.cryptomanager.R;
import com.example.bharat.cryptomanager.basecomponent.BaseActivity;
import com.example.bharat.cryptomanager.databinding.ActivityMainBinding;
import com.example.bharat.cryptomanager.home.HomeFragment;
import com.example.bharat.cryptomanager.pricelist.ExchangeRateFragment;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements PriceListContract.View {


    @Inject
    PriceListContract.Presenter presenter;

    private Activity activity;
    private ActivityMainBinding binding;
    private TitlePagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        binding = DataBindingUtil.setContentView(activity, R.layout.activity_main);
        getActivityComponent().inject(this);
        //((App) getApplication()).getApplicationComponent().inject(this);
        presenter.onAttach(this);
        presenter.getKoinexData();

        setupViewPager();
    }

    private void setupViewPager() {
        pagerAdapter = new TitlePagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(HomeFragment.newInstance(), getString(R.string.label_list), R.drawable.selector_home);
        pagerAdapter.addFragment(ExchangeRateFragment.newInstance(), getString(R.string.label_exchange), R.drawable.selector_home);
        binding.vpHome.setAdapter(pagerAdapter);
        setupTabIcons();
    }


    private void setupTabIcons() {
        binding.tlHome.setTabGravity(TabLayout.GRAVITY_FILL);
        for (int idx = 0; idx < pagerAdapter.getCount(); idx++) {
            TabLayout.Tab tab = binding.tlHome.newTab();
            binding.tlHome.addTab(tab);
            View tabView = LayoutInflater.from(this).inflate(R.layout.tab_row_layout_with_icon, null);
            TextView tvTitle = tabView.findViewById(R.id.tab_text);
            tvTitle.setAllCaps(true);
            ImageView ivIcon = tabView.findViewById(R.id.iv_tab_icon);
            tvTitle.setText(pagerAdapter.getPageTitle(idx));
            ivIcon.setImageResource(pagerAdapter.getPageTitleIcon(idx));
            ivIcon.setVisibility(View.VISIBLE);
            tab.setCustomView(tabView);
        }

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void openActivityOnTokenExpire() {

    }

    @Override
    public void onError(int resId) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showMessage(int resId) {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }

    @Override
    public void hideKeyboard() {

    }
}
