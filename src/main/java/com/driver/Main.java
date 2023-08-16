package com.driver;

public class Main {

    public static class product{
        public int product(int x, int y) { return x*y;}
        public int product(int x, int y, int z) { return x*y*z;}
        public double product(double x, double y) {return x*y;}

    }

    public static void main(String[] args){
        product prod = new product();
        prod.product(5,10);
        prod.product(5,10,5);
        prod.product(5.2,5.6);
    }

}