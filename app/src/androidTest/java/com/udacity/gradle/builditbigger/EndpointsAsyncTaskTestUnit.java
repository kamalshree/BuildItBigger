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
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.core.IsNot.not;

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
    public void onButtonClicked() throws InterruptedException {
        Intents.init();
        onView(withId(R.id.button)).perform(click());
        Thread.sleep(5000);
        onView(withId(R.id.tv_jokes)).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.tv_jokes), not(withText(""))));
        intended(hasComponent(MyJokesActivity.class.getName()));
        Intents.release();
    }
}
