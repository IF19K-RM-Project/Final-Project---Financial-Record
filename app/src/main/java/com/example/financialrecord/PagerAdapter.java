package com.example.financialrecord;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new id.my.cariberas.pengeluaranharian.Frag1_kontak();
            case 1:
                return new id.my.cariberas.pengeluaranharian.Frag2_Pesan();
            case 2:
                return new id.my.cariberas.pengeluaranharian.Frag2_Pesan();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}