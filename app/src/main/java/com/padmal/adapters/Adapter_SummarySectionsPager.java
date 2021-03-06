package com.padmal.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.padmal.accountsystemv12.Frag_ExpenseSummary;
import com.padmal.accountsystemv12.Frag_IncomeSummary;

public class Adapter_SummarySectionsPager extends FragmentPagerAdapter{

    public Adapter_SummarySectionsPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        // getItem is called to instantiate the fragment for the given page
        switch (position) {
            case 0:
                return Frag_ExpenseSummary.newInstance();
            case 1:
                return Frag_IncomeSummary.newInstance();
        } return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages
        return 2;
    }
}
