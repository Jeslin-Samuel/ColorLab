package edu.temple.colorlab;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ColorAdapter extends BaseAdapter {
    String colors[];
    Context context;

    public ColorAdapter(Context context, String[] colors)
    {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount()
    {
        return colors.length;
    }

    @Override
    public Object getItem(int i)
    {
        return colors[i];
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        return null;
    }
}
