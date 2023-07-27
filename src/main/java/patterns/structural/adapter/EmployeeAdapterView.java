package patterns.structural.adapter;

public class EmployeeAdapterView implements IEmployee {
    private EmployeeView viewInstance;

    public EmployeeAdapterView(EmployeeView viewInstance) {
        this.viewInstance = viewInstance;
    }

    @Override
    public String getId() {
        return viewInstance.getEn();
    }

    @Override
    public String getFirstName() {
        return viewInstance.getFirstName();
    }

    @Override
    public String getLastName() {
        return viewInstance.getLastName();
    }

    @Override
    public String getEmail() {
        return viewInstance.getEmail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterView{" +
                "viewInstance=" + viewInstance +
                '}';
    }
}
