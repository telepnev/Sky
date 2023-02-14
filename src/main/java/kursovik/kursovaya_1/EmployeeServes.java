package kursovik.kursovaya_1;

public class EmployeeServes {
    private int size;

    private final Employee[] employees = new Employee[10];


    public void addEmployee(String firstName, String midleName, String lastName, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя нанять сотрудника, фирма не резиновая");
        }
        Employee newEmployee = new Employee(firstName, midleName, lastName, department, salary);
        employees[size++] = newEmployee;
    }

    public  int getCurrentSize() {
        return size;
    }

    public static void getListEmployee(Employee[] employees){
        for (Employee emp : employees) {
            if(emp != null) {
                System.out.println(emp.getFirstName() + emp.getMidleName()
                        + emp.getLastName() + emp.getDepartment() + emp.getSalary() + emp.getId());
            }
        }
    }
}
