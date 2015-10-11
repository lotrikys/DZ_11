package org.itstep.pastukhov.dz_11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lotrik on 11.10.15.
 */
public class BaseExample extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<Base> objects = new ArrayList<>();


    public BaseExample (Context _context, ArrayList<Base> _objects) {
        context = _context;
        objects = _objects;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null){
            view = layoutInflater.inflate(R.layout.base_list, parent, false);
        }

        Base base = getBase(position);

        ((TextView)view.findViewById(R.id.base_id)).setText(base.id + "");
        ((TextView)view.findViewById(R.id.base_text)).setText(base.text);
        ((ImageView)view.findViewById(R.id.base_img)).setImageResource(base.image);
        return view;
    }

    Base getBase (int position){
        return ((Base)getItem(position));
    }
}
