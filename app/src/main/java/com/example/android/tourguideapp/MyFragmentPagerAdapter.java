package com.example.android.tourguideapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public MyFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }




    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ColorsFragment();
        } else if (position == 1){
            return new ColorsFragment();
        } else if (position == 2){
            return new ColorsFragment();
        } else {
            return new ColorsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        SpannableStringBuilder sampleBuilder = new SpannableStringBuilder(" "); // space added before text for convenience

        Drawable drawable;
        if (position == 0) {
            drawable = mContext.getResources().getDrawable(R.drawable.hotel);
        } else if (position == 1){
            drawable = mContext.getResources().getDrawable(R.drawable.bar);
        }  else if (position == 2){
            drawable = mContext.getResources().getDrawable(R.drawable.food);
        } else {
            drawable = mContext.getResources().getDrawable(R.drawable.pillar);
        }

        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        ImageSpan span = new ImageSpan(drawable, ImageSpan.ALIGN_BASELINE);
        sampleBuilder.setSpan(span, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sampleBuilder;

    }
}
