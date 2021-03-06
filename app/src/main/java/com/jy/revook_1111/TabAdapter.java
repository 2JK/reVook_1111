package com.jy.revook_1111;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabAdapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public TabAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        // Returning the current tabs
        switch (position) {
            case 0:
                SearchFragment searchFragment = new SearchFragment();
                return searchFragment;
            case 1:
                ReviewFragment reviewFragment = new ReviewFragment();
                return reviewFragment;
            case 2:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 3:
                NotifyFragment notifyFragment = new NotifyFragment();
                return notifyFragment;
            case 4:
                UserInfoFragment userInfoFragment = new UserInfoFragment();
                return userInfoFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
