package b;

import a.MyClassA;

public class MyClassC extends MyClassA {
    public static void main(String[] args) {
        MyClassC myClassC = new MyClassC(); // myClassC is a child instance of MyClassA
        System.out.println(myClassC.one);
        //System.out.println(myClassC.two);
        System.out.println(myClassC.three);
        //System.out.println(myClassC.four);
        System.out.println(myClassC.hello());
    }
}
