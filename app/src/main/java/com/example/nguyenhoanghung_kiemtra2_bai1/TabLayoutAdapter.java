package com.example.nguyenhoanghung_kiemtra2_bai1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabLayoutAdapter extends FragmentStatePagerAdapter {
    private int numPage = 3;

    public TabLayoutAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragment_SamSung();
            case 1:
                return new Fragment_Iphone();
            case 2:
                return new Fragment_Oppo();
            default:
                return new Fragment_SamSung();

        }
    }

    @Override
    public int getCount() {
        return numPage;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SAMSUNG";
            case 1:
                return "IPHONE";
            case 2:
                return "OPPO";
        }
        return super.getPageTitle(position);
    }
}
