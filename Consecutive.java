package com.stackroute;

public class Consecutive {
    public String checkConsecutive(String s) {
        int l = s.length();
        String[] q = s.split(",", 0);
        int[] result = new int[l];
        int i = 0;
        try {
            for (String x : q) {
                result[i] = Integer.parseInt(x);
                System.out.println(result[i]);
                i++;

            }
        }catch(Exception e){
            return "invalid string";
        }


        for (i = 0; i < result.length; i++) {
            if ((result[i + 1] - result[i]) == 1) {

            } else {
                return "false";

            }
        }
        return "true";
    }
}
