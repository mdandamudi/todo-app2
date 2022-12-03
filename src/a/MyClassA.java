package a;

public class MyClassA {
    public String one = "one";
    String two = "two"; // "package private"
    protected String three = "three";
    private String four = "four";

    protected String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        MyClassA myClassA = new MyClassA();
        System.out.println(myClassA.one);
        System.out.println(myClassA.two);
        System.out.println(myClassA.three);
        System.out.println(myClassA.four);
    }
}
