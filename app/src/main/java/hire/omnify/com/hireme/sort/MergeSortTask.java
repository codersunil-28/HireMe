package hire.omnify.com.hireme.sort;

import android.os.AsyncTask;

import hire.omnify.com.hireme.service.SortingService;

/**
 * Created by sunilkumar on 25/01/18.
 */

public class MergeSortTask extends AsyncTask<int[], Void, int[]> {


    @Override
    protected int[] doInBackground(int[]... ints) {

        int[] data = ints[0];

        MyMergeSort mms = new MyMergeSort();
        int[] sortedDataByMS = mms.sort(data);


        return sortedDataByMS;
    }

    @Override
    protected void onPostExecute(int[] ints) {

        SortingService.putMergeSortedList(ints);
    }
}