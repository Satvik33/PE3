
package com.stackroute;
import org.junit.*;
import java.io.File;
import java.io.FileWriter;
import static org.junit.Assert.*;
    public class TextFileTest {
        private static TextFile fileHandling;
        @BeforeClass
        public static void setUp() throws Exception {
            fileHandling =new TextFile();
        }
        @AfterClass
        public static void tearDown() throws Exception {
            fileHandling = null;
        }
        @Test
        public void textReadFile() throws Exception{

            assertEquals("HI!!!",fileHandling.printFileUpper("text1.txt"));
        }
    }

