package com.example.bharat.cryptomanager.main;

import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;



public class TitlePagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> fragmentTitle = new ArrayList<>();
    private List<Integer> fragmentTitleIcon = new ArrayList<>();

    public TitlePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public void addFragment(Fragment fragment, String title) {
        addFragment(fragment, title, 0);
    }

    public void addFragment(Fragment fragment, String title, @DrawableRes int icon) {
        fragmentList.add(fragment);
        fragmentTitle.add(title);
        fragmentTitleIcon.add(icon);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }

    public int getPageTitleIcon(int position) {
        return fragmentTitleIcon.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
