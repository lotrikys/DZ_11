package org.itstep.pastukhov.dz_11;

import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * Created by lotrik on 10.10.15.
 */
public class DrawerItemClickListener implements ListView.OnItemClickListener {


    FragmentBaseAdapter fragmentBaseAdapter;
    FragmentSimpleAdapter fragmentSimpleAdapter;


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectItem(position);

    }

    private void selectItem(int position) {

        if (position == 0) {

            fragmentBaseAdapter = new FragmentBaseAdapter();
            FragmentTransaction fragmentTransaction = MainActivity.fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragmentBaseAdapter).commit();

            MainActivity.listView.setItemChecked(position, true);
            MainActivity.drawerLayout.closeDrawer(MainActivity.listView);
        } else {

            fragmentSimpleAdapter = new FragmentSimpleAdapter();
            FragmentTransaction fragmentTransaction = MainActivity.fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragmentSimpleAdapter).commit();

            MainActivity.listView.setItemChecked(position, true);
            MainActivity.drawerLayout.closeDrawer(MainActivity.listView);
        }
    }

}
