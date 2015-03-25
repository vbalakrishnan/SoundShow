package com.itamecodes.soundshow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "mobile/src/main/AndroidManifest.xml", emulateSdk = 18)
public class MainActivityTest {

    @Test
    public void shouldHaveApplicationName() throws Exception{
        String app_name=new MainActivity().getResources().getString(R.string.app_name);
        assertThat(app_name, equalTo("SoundShow"));
    }
    @Test
    public void testSomething() throws Exception {
        assertTrue(Robolectric.buildActivity(MainActivity.class).create().get() != null);
    }
    @Test
    public void checkJUnitWork() {
        // failing test gives much better feedback
        // to show that all works correctly ;)
        assertThat(true, is(true));
    }
}