package com.example.mishr.utily;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mishr on 05/09/2017.
 */

public class GrideViewAdapterClass extends BaseAdapter {
    private Context mContext;
    private  int[] images;  //paramters we have to pass
    private   String[] images_text; //paramters we have to pass

    public GrideViewAdapterClass(Context mContext, int[] images, String[] images_text) {  //Order must be maintained in MainActvity
        this.mContext = mContext;
        this.images = images;
        this.images_text = images_text;
    }


    @Override
    public int getCount() {
        return images_text.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater)mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null){
            gridViewAndroid = new View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.gridview_layout,null);
            TextView txtAndroid = (TextView)gridViewAndroid.findViewById(R.id.gridview_textview);
            ImageView imageAndroid = (ImageView)gridViewAndroid.findViewById(R.id.gridview_imageview);
            txtAndroid.setText(images_text[i]);
            imageAndroid.setImageResource(images[i]);
        }
        else {
            gridViewAndroid = (View) view;
        }

        return gridViewAndroid;
    }
}
