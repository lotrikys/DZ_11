package org.itstep.pastukhov.dz_11;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lotrik on 10.10.15.
 */
public class FragmentSimpleAdapter extends Fragment {
    final String ATTRIBUTE_NAME_TEXT = "text";
    final String ATTRIBUTE_NAME_ID = "id";
    final String ATTRIBUTE_NAME_IMAGE = "image";
    ListView list_simple;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View rootView = inflater.inflate(R.layout.fragment_simple_adapter, container, false);

        String[] texts = { " sometext 1", " sometext 2", " sometext 3",
                " sometext 4", " sometext 5" };
        int img = R.drawable.ic_launcher;
        ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(
                texts.length);
        Map<String, Object> m;
        for (int i = 0; i < texts.length; i++) {
            m = new HashMap<String, Object>();
            m.put(ATTRIBUTE_NAME_TEXT, texts[i]);
            m.put(ATTRIBUTE_NAME_IMAGE, img);
            m.put(ATTRIBUTE_NAME_ID, i);
            data.add(m);
        }
        list_simple = (ListView)rootView.findViewById(R.id.simple_list);

        String[] from = { ATTRIBUTE_NAME_TEXT, ATTRIBUTE_NAME_ID,
                ATTRIBUTE_NAME_IMAGE };
        int[] to = { R.id.simple_text, R.id.simple_id, R.id.simple_img };
        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), data, R.layout.simple_list,
                from, to);
        list_simple.setAdapter(simpleAdapter);
        return rootView;
    }
}
