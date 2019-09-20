package com.stackroute;


    import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class NegativeArrayTest {
        private NegativeArray q1= new NegativeArray();
        @Before
        public void setUp() throws Exception {
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test(expected = NullPointerException.class)
        public void testcase1()
        {

            q1.nullPointer();
        }
        @Test(expected = NegativeArraySizeException.class)
        public void testcase2()
        {

            q1.negativeArraySize();
        }

        @Test(expected = ArrayIndexOutOfBoundsException.class)
        public void testcase3()
        {

            q1.outOfBound();
        }
    }

