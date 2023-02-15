package kursovik.kursovaya_1;

public class EmployeeServes {
    private final Employee[] employees;
    private int size;

    public EmployeeServes() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String firstName, String midleName, String lastName, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newEmployee = new Employee(firstName, midleName, lastName, department, salary);
        employees[size++] = newEmployee;
    }

    public void getFioEmployee() {
        for (Employee empl : employees) {
            if (empl != null) {
                System.out.println("Фамилия : " + empl.getLastName() + ", Имя : " + empl.getFirstName() + ", Отчество : " + empl.getMidleName());
            }
        }
    }
    public void printEmployeeList() {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
    }
    public void getAmountSalaryPerMonth() {
        int sum = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                sum += empl.getSalary();
            }
        }
        System.out.println("Сумма зарплат всех сотрудников за месяц состовляет =  " + sum);
    }
    public void getAverageSalary() {
        int sum = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                sum += empl.getSalary() / getSize();
            }
        }
        System.out.println("Средняя зарплата сотрудников за месяц состовляет =  " + sum);
    }

    private int getSize() {
        int size = 0;
        int count = 0;
        for (Employee epl : employees) {
            if (epl != null) {
                size++;
            }
        }
        return size;
    }
    public void getMaximumSalary() {
        int maxSalary = -1;
        String man = null;
        for (Employee empl : employees) {
            if (empl != null) {
                if (empl.getSalary() > maxSalary) {
                    maxSalary = empl.getSalary();
                    man = empl.getFirstName() + " " + empl.getMidleName() + " " + empl.getLastName();
                }
            }
        }
        System.out.println("Максимальная зарплата состовляет = " + maxSalary + " у сотрудника " + man);

    }

    public  void getMinimumSalary() {
        long minSalary = Long.MAX_VALUE;
        String man = null;
        for (Employee empl : employees) {
            if (empl != null) {
                if (empl.getSalary() < minSalary) {
                    minSalary = empl.getSalary();
                    man = empl.getFirstName() + " " + empl.getMidleName() + " " + empl.getLastName();
                }
            }
        }
        System.out.println("Минимальная зарплата состовляет = " + minSalary + " у сотрудника " + man);
    }

}
