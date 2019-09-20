package com.stackroute;

public class StringException {
    public boolean main() throws Exception {

        try {throw new Exception("error"); }

        catch (Exception e){
            System.out.println(e);}

        finally  { System.out.println("I was here"); }
        throw new Exception();

    }
}
