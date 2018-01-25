package hire.omnify.com.hireme.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import hire.omnify.com.hireme.SecondActivity;
import hire.omnify.com.hireme.sort.MergeSortTask;
import hire.omnify.com.hireme.sort.QuickSortTask;

/**
 * Created by sunilkumar on 22/01/18.
 */

public class SortingService extends Service {


    int[] arrayOfRandomNum;
    private static int[] quickSortedData;
    private static int[] mergeSortedData;

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }


    public static void putQuickSortedList(int[] quick) {
         quickSortedData = quick;
        Log.i("quickSortedData*** : ","size " + quickSortedData.length);
    }

    public static void putMergeSortedList(int[] merge) {

        mergeSortedData = merge;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();

        arrayOfRandomNum = intent.getIntArrayExtra("arrayOfRandomNum");

        QuickSortTask quickSortTask = new QuickSortTask();
        quickSortTask.execute(arrayOfRandomNum);


        MergeSortTask mergeSortTask = new MergeSortTask();
        mergeSortTask.execute(arrayOfRandomNum);

        Intent dialogIntent = new Intent(this, SecondActivity.class);
        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(dialogIntent);

        stopSelf();
        return START_NOT_STICKY;
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }

}
