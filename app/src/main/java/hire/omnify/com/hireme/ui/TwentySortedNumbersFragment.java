package hire.omnify.com.hireme.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import hire.omnify.com.hireme.R;

/**
 * Created by sunilkumar on 20/01/18.
 */

public class TwentySortedNumbersFragment extends Fragment  {

    private String[] list = new String[20];
    int[] quickSortedData;
    int[] mergeSortedData;

    public TwentySortedNumbersFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_twenty_sorted_number,container,false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        populateList();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        return rootView;
    }

    private void populateList() {

        for (int idx = 1; idx <= 20; idx++){
            Log.i("Sorted quickSortedData","size " + quickSortedData.length);

            list[idx] = (String.valueOf(quickSortedData[idx]) + "     " + String.valueOf(mergeSortedData[idx]));
        }

        Log.i("Sorted ArraySize*** : ","size " + list.length);
    }



}
