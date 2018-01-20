package hire.omnify.com.hireme.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hire.omnify.com.hireme.R;
import hire.omnify.com.hireme.data.NumberAssets;

/**
 * Created by sunilkumar on 20/01/18.
 */

public class TwentySortedNumbersFragment extends Fragment {

    public TwentySortedNumbersFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_twenty_sorted_number,container,false);

        TextView textView = (TextView) rootView.findViewById(R.id.text_view_sorted_number);

        textView.setText(NumberAssets.getSortedNumArray().get(0).toString());

        return rootView;
    }

}
