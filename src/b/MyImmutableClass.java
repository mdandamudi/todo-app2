package b;

public class MyImmutableClass {
    private final String someValue;

    public MyImmutableClass(String someValue) {
        this.someValue = someValue;
    }

    public String getSomeValue() {
        return someValue;
    }
}
