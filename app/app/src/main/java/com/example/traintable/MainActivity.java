package com.example.traintable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createTabs();
    }
    private void createTabs(){
        ViewPager viewPager =  (ViewPager)findViewById(R.id.view_pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        MyFragmentAdapter pagerAdapter = new MyFragmentAdapter(fragmentManager);
        viewPager.setAdapter(pagerAdapter);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setTabsFromPagerAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.thaitrainlogo);
        tabLayout.getTabAt(1).setIcon(R.drawable.btslogo);
        tabLayout.getTabAt(2).setIcon(R.drawable.mrtlogo);
        tabLayout.getTabAt(3).setIcon(R.drawable.arllogo);
    }
}
