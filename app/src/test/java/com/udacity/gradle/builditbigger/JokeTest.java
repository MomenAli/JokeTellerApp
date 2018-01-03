package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;
import android.text.TextUtils;
import android.util.Pair;

import com.example.momenali.javajokelib.Jokes;

import dalvik.annotation.TestTarget;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Momen Ali on 1/3/2018.
 */


public class JokeTest {
    String backendResult;
    Context instrumentationCtx;

    /* how to get the context in unit test
    *  I found this subject in Stack Overflow site */
   /* @Before
    public void setup() {

    }
*/
    @Test
    public void getJokeFromBackendTest() throws InterruptedException {
        /*EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String result) {
                backendResult = result;
            }
        };
        instrumentationCtx = InstrumentationRegistry.getContext();
        endpointsAsyncTask.execute( new Pair<Context, String>(instrumentationCtx, "Momen"));

        Thread.sleep(2000);*/
        backendResult = Jokes.getJoke();

        assert TextUtils.isEmpty(backendResult);
    }
}
