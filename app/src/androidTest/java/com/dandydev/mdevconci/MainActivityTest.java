package com.dandydev.mdevconci;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

  @Rule public final ActivityTestRule<MainActivity> rule =
    new ActivityTestRule<>(MainActivity.class, true, true);
  
  @Test
  public void itSaysHelloWorld() {
    onView(withId(android.R.id.text1)).check(matches(withText("Hello World!")));
  }
}
