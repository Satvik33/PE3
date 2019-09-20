package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlaceNames {
    public List<String> removeVowels(List<String> places){
        List<String> res = new ArrayList<>();
        ListIterator<String> i = places.listIterator();
        while(i.hasNext()){
            String v = "";
            String p = i.next();
            StringBuilder str = new StringBuilder();
            char[] c = p.toCharArray();
            for(char a : c) {
                switch (a) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        continue;
                }
                str.append(a);
            }
            v = str.toString();
            System.out.println(v);
            res.add(v);



                }
        return res;
            }

        }




