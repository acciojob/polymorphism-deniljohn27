package com.driver;

public class Main {

    Product p = new Product();

    int ansValue = p.product(2,3);

    int secondAnswerValue=p.product(2,3,4);

    double thirdAnswerValue=p.product(2.1,2.9);

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