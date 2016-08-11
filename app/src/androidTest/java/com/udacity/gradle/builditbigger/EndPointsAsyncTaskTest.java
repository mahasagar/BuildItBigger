package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * Created by mahasagar on 11/8/16.
 */
public class EndPointsAsyncTaskTest extends AndroidTestCase {

    public void taskTest(){

        String taskResult = null;

        EndpointsAsyncTask task = new EndpointsAsyncTask(getContext());
        task.execute();

        try {
            taskResult = task.get();

        } catch (Exception e){
            e.printStackTrace();
        }
        assertNotNull(taskResult);
    }

}