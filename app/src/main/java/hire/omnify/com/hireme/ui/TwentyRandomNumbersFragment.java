package hire.omnify.com.hireme.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hire.omnify.com.hireme.R;

/**
 * Created by sunilkumar on 20/01/18.
 */

public class TwentyRandomNumbersFragment extends Fragment {

    public TwentyRandomNumbersFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_twenty_random_numbers,container,false);

        TextView textView = (TextView) rootView.findViewById(R.id.text_view_random_number);

        textView.setText("");

        return rootView;
    }
}
