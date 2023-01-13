package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();

        p.product(2,3);
        p.product(2,3,4);
        p.product(2.1,2.9);
    }


}
class Product{
    public int product(int x, int y) {
        int ans=x*y;
        return ans;
    }
    public int product(int x, int y, int z) {

        int secondAnswer=x*y*z;
        return secondAnswer;
    }

    public double product(double x, double y) {
        double thirdAnswer=x*y;
        return thirdAnswer;
    }
}