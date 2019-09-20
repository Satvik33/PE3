package com.stackroute;

import java.io.*;
import java.util.Scanner;

public class ByteArray {
    public String filesFolder(String s1, String s2) throws IOException {

        String c = s2 + s1;
        FileWriter f = new FileWriter(c);
        f.write("writing something just for formality");
        f.close();

        File file = new File(c);
        //BufferedReader obj1 = new BufferedReader(new FileReader(file));

        String str = "";
        Scanner obj2 = new Scanner(file);

        while (obj2.hasNextLine()) {
            str = obj2.nextLine();
            System.out.println(str);

        }
        return str;
    }
}
