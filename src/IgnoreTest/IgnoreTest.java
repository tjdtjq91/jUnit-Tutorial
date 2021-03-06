package IgnoreTest;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IgnoreTest {

    @Test
    public void testMath() {
        assertThat(1 + 1, is(2));
    }

    @Ignore
    @Test
    public void testMath2() {
        assertThat(1 + 2, is(5));
    }

    @Ignore("testMath3")
    @Test
    public void testMath3() {
        //...
    }
}
