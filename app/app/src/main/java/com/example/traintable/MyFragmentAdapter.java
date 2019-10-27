package com.example.traintable;

import android.content.Intent;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyFragmentAdapter extends FragmentStatePagerAdapter {
    public MyFragmentAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public int getCount(){return 4;}
    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0: return  new Thaitrain();
            case 1: return  new Bts();
            case 2: return  new Mrt();
            case 3: return  new Apl();
            default: return new Thaitrain();
        }
    }
    @Override
    public CharSequence getPageTitle(int position){
        String[] tabs = {"ThaiTrain", "BTS", "MRT", "Airport Rail Link"};
        return tabs[position];
    }
}
