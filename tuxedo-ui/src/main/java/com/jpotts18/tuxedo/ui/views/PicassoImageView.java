package com.androidkits.tuxedo.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.androidkits.tuxedo.R;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Picasso;

/**
 * Created by jpotts18 on 1/1/14.
 */

public class PicassoImageView extends ImageView {

    private int defaultImage = R.drawable.avatar;
    public String TEST_IMAGE_URL = "http://i.imgur.com/DvpvklR.png";

    public PicassoImageView(Context context) {
        this(context, null);
    }

    public PicassoImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PicassoImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initialize();
    }

    public void initialize(){
        Picasso.with(getContext()).load(TEST_IMAGE_URL).placeholder(defaultImage).into(this);
    }

}
