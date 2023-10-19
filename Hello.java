public class Hello<T> {
    public int testVar = 110;
    public T item;

    public Hello(T item) {
        this.item = item;
    }

    public void testMethod() {
        System.out.println(testVar);
        System.out.println(item);
    }
}