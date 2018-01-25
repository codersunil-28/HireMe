package hire.omnify.com.hireme;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import hire.omnify.com.hireme.ui.TwentySortedNumbersFragment;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TwentySortedNumbersFragment twentySortedNumbersFragment = new TwentySortedNumbersFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.sorted_num_container,twentySortedNumbersFragment)
                .commit();

    }
}
