package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ByteArrayTest {
    private ByteArray q1=new ByteArray();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1() throws IOException {

        String content= "writing something just for formality";

        String content1= "writing different text";
        String fileExtension=".txt";
        String fileName="hi";
        String actual="";
        actual = q1.filesFolder(fileExtension,fileName);
        assertEquals("return true after reading file",content,actual);
        assertNotEquals("return false after reading file",content1,actual);
    }
}