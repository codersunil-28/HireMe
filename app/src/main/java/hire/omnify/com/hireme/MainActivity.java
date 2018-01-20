package hire.omnify.com.hireme;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hire.omnify.com.hireme.ui.TwentyRandomNumbersFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TwentyRandomNumbersFragment twentyRandomNumbersFragment = new TwentyRandomNumbersFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.random_num_container,twentyRandomNumbersFragment)
                .commit();
    }

    public void sortRandomNumber(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}
