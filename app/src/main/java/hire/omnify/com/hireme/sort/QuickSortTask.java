package hire.omnify.com.hireme.sort;

import android.os.AsyncTask;

import hire.omnify.com.hireme.service.SortingService;

/**
 * Created by sunilkumar on 25/01/18.
 */

public class QuickSortTask extends AsyncTask<int[], Void, int[]> {


    @Override
    protected int[] doInBackground(int[]... ints) {


        int[] data = ints[0];

        MyQuickSort sorter = new MyQuickSort();
        int[] sortedDataByQS = sorter.sort(data);
        return sortedDataByQS;
    }

    @Override
    protected void onPostExecute(int[] ints) {

        SortingService.putQuickSortedList(ints);

    }
}
