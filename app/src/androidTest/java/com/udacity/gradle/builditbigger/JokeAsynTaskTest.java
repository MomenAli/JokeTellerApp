package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;
import android.util.Pair;

import com.example.momenali.javajokelib.Jokes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.testng.Assert.assertEquals;

/**
 * Created by Momen Ali on 1/4/2018.
 */
@RunWith(AndroidJUnit4.class)
public class JokeAsynTaskTest {
    String backendResult;
    Context instrumentationCtx;

    /* how to get the context in unit test
    *  I found this subject in Stack Overflow site */
    @Before
    public void setup() {
        instrumentationCtx = InstrumentationRegistry.getContext();
    }

    @Test
    public void getJokeFromBackendTest() throws InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                backendResult = result;
            }
        };
        endpointsAsyncTask.execute(new Pair<Context, String>(instrumentationCtx, "Momen"));

        Thread.sleep(2000);
        assert TextUtils.isEmpty(backendResult);
        boolean found = false;
       for (int i = 0; i < Jokes.getNumberOfJokes();i++){
           if (Jokes.getJokeNumber(i).equals(backendResult)){
               found = true;
               break;
           }

        }
        assertEquals(found , true);
    }
}
