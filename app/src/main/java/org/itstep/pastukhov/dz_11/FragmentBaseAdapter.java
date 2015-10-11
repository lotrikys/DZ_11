package org.itstep.pastukhov.dz_11;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by lotrik on 10.10.15.
 */
public class FragmentBaseAdapter extends Fragment {
    ListView list_base;
    ArrayList<Base> bases = new ArrayList<>();
    BaseExample baseExample;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_base_adapter, container, false);
        for (int i=1; i<=20; i++){
            bases.add(new Base(i, " Element", R.drawable.ic_launcher));
        }

        baseExample = new BaseExample(getActivity(), bases);
        list_base = (ListView)rootView.findViewById(R.id.base_list);
        list_base.setAdapter(baseExample);

        return rootView;
    }
}
