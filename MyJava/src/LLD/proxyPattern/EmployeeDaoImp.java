package LLD.proxyPattern;

public class EmployeeDaoImp implements EmployeeDao {

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("created a new row in the employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("deleted the row with employeeID" + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        //fetch row
        System.out.println("fetching data from DB");
        return new EmployeeDo();
    }
}
