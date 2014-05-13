package com.siteadi;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context resminKucukGorunusu;

    public ImageAdapter(Context c) {
    	resminKucukGorunusu = c;
    }

	public int getCount() {
        return resimler.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int sirasi, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(resminKucukGorunusu);
            imageView.setLayoutParams(new GridView.LayoutParams(120, 120));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(20, 20, 20, 20);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(resimler[sirasi]);
        return imageView;
    }

    // references to our images
    private Integer[] resimler = {
            R.drawable.resim1, R.drawable.resim2, R.drawable.resim3, 
            R.drawable.resim4, R.drawable.resim5, R.drawable.resim6, 
            R.drawable.resim7, R.drawable.resim8, R.drawable.resim9, 
            R.drawable.resim10, R.drawable.resim11, R.drawable.resim12, 
            R.drawable.resim13, R.drawable.resim14, R.drawable.resim15, 
            R.drawable.resim16, R.drawable.resim17, R.drawable.resim18 
    };


}