package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringExceptionTest {
    private StringException e1 = new StringException();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = Exception.class)
    public void testcase2() throws Exception {
        e1.main();
    }
}