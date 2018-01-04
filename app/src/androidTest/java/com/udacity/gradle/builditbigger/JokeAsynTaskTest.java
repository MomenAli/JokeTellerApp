package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.text.TextUtils;
import android.util.Pair;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Momen Ali on 1/4/2018.
 */

public class JokeAsynTaskTest {
    String backendResult;
    Context instrumentationCtx;

    /* how to get the context in unit test
    *  I found this subject in Stack Overflow site */
    @Before
    public void setup() {

    }

    @Test
    public void getJokeFromBackendTest() throws InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                backendResult = result;
            }
        };
        instrumentationCtx = InstrumentationRegistry.getContext();
        endpointsAsyncTask.execute(new Pair<Context, String>(instrumentationCtx, "Momen"));

        Thread.sleep(2000);
        assert TextUtils.isEmpty(backendResult);
    }
}
