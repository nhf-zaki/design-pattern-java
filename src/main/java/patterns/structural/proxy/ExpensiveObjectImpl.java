package patterns.structural.proxy;


import org.apache.log4j.Logger;

public class ExpensiveObjectImpl implements IExpensiveObject {

    private static final Logger LOGGER = Logger.getLogger(ExpensiveObjectImpl.class);
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    private void heavyInitialConfiguration() {
        LOGGER.info("Loading initial configuration...");
    }

    @Override
    public void process() {
        LOGGER.info("processing completed.");
    }
}
