package com.company;

/**
 * This is a good class
 */

public class cwh107_ADJ2_methods_tags {
    /**
     *
     * @param args these are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello this is a method and this is the most beautiful method of this class
     * @param i this is the first number to add
     * @param j this is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated this method is deprecated please use + Operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i+j;
        return c;
    }
}
