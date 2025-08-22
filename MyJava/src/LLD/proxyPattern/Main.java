package LLD.proxyPattern;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeeDaoProxy();
            employeeDao.create("ADMIN", new EmployeeDo());
            System.out.println("Operation successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
