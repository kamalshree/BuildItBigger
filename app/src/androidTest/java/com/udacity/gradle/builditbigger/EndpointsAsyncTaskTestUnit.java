package com.udacity.gradle.builditbigger;

import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.android.jokesandroidlib.MyJokesActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by kamalshree on 9/7/2018.
 */

@RunWith(AndroidJUnit4.class)

public class EndpointsAsyncTaskTestUnit{
    String TAG = EndpointsAsyncTask.class.getSimpleName();
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);



    @Test
    public void onButtonClicked() {
        Intents.init();
        onView(withId(R.id.button)).perform(click());
        intended(hasComponent(MyJokesActivity.class.getName()));
        Intents.release();
    }
}
