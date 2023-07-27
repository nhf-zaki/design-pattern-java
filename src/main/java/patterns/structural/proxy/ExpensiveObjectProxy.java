package patterns.structural.proxy;

public class ExpensiveObjectProxy implements IExpensiveObject {
    private static IExpensiveObject object;
    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
