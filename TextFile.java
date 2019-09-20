package com.stackroute;

import java.io.*;
import java.util.Scanner;


public class TextFile {
        public String printFileUpper(String s) throws IOException {

            FileWriter f = new FileWriter("text1.txt");
            f.write("Hi!!!");
            f.close();



            File file = new File("text1.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String str="";
            Scanner obj = new Scanner(file);

            while (obj.hasNextLine())
            {
                str=obj.nextLine();
                System.out.println(str);
                str=str.toUpperCase();
            }
            return str;

        }



    }

