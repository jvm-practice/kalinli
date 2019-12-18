package com.maxwit;

import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTest {

    @Test
    public void shoudStingwithtrue() {
        assertTrue(true);
    }

    @Test
    public void Test() {
        Junit junit = new Junit();
        assertEquals("Hi Junit",junit.hiUnit());
    }
}
