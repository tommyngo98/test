public class Hello {
    public int testVar = 10;

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.testMethod();
    }

    public void testMethod() {
        System.out.println(testVar);
    }
}