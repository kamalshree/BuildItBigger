package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Log;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by kamalshree on 9/7/2018.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EndpointsAsyncTaskTestUnit extends AndroidTestCase {
    String TAG = EndpointsAsyncTask.class.getSimpleName();
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);



    @Test
    public void IsNotEmpty() throws Exception {

        EndpointsAsyncTaskTest asyncTest =  new EndpointsAsyncTaskTest();
        asyncTest.execute(InstrumentationRegistry.getContext());
        String joke = asyncTest.get(10, TimeUnit.SECONDS);
        Assert.assertTrue(!joke.equals(""));
    }

    @Test
    public void testResponse() {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.tv_jokes)).check(matches(isDisplayed()));
    }

}
