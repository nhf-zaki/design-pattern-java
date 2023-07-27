package demo;

import patterns.structural.proxy.ExpensiveObjectProxy;
import patterns.structural.proxy.IExpensiveObject;

public class ProxyDemo {
    public static void main(String[] args) {
        IExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        // calling process second time would not affect settings part
        object.process();
    }
}
