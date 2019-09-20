package com.stackroute;

public class NegativeArray {


        public void nullPointer()
        {
            String ptr = null;
            // Checking if ptr.equals null or works fine.
            try {
                // This line of code throws NullPointerException
                // because ptr is null
                if (ptr.equals("gfg"))
                    System.out.print("Same");
                else
                    System.out.print("Not Same");
            }
            catch (NullPointerException e) {
                System.out.print("NullPointerException Error!");
                throw new NullPointerException();
            }
        }

        public void negativeArraySize()
        {
            int arrSize = -8;
            try {
                int[] myArray = new int[arrSize];
            }

            catch (NegativeArraySizeException ex)
            {
                System.out.println("array of negative size not allowed!");
                throw new NegativeArraySizeException();
            }

        }

        public void outOfBound()

        {
            int marks[] = {10, 20, 30, 40};

            try
            {
                System.out.println(marks[4]);
            }
            catch (ArrayIndexOutOfBoundsException e)

            {
                System.out.println("Wrong index number! " + e);
                throw new ArrayIndexOutOfBoundsException();
            }


        }
    }

