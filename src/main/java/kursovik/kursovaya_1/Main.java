package kursovik.kursovaya_1;

import java.util.Arrays;

public class Main {
    private static Employee[] empArrays;

    public static void main(String[] args) {
        empArrays = new Employee[10];

        Employee employee = new Employee("Иван", "Иванов", "Иванович", 1, 7800);
        Employee employee1 = new Employee("Евгений", "Сергеевич", "Телепнев", 2, 5000);
        Employee employee2 = new Employee("Петр", "Петрович", "Петров", 2, 1800);
        Employee employee3 = new Employee("Сидор", "Сидорович", "Сидоренко", 1, 4000);

        empArrays[0] = employee;
        empArrays[1] = employee1;
        empArrays[2] = employee2;
        empArrays[3] = employee3;

        printEmployeeList(empArrays);
        System.out.println();
        getAmountSalaryPerMonth();
        System.out.println();
        getAverageSalary();
        System.out.println();
        getMaximumSalary();
        System.out.println();
        getFioEmployee(empArrays);
        System.out.println();
        getMinimumSalary(empArrays);

    }


    public static void getFioEmployee(Employee[] employees) {
        for (Employee empl : employees) {
            if (empl != null) {
                System.out.println("Фамилия : " + empl.getLastName() + ", Имя : " + empl.getFirstName() + ", Отчество : " + empl.getMidleName());
            }
        }

    }

    public static void printEmployeeList(Employee[] empArrays) {
        for (int i = 0; i < empArrays.length; i++)
            if (empArrays[i] != null) {
                System.out.println(empArrays[i]);
            }
    }

    public static void getAmountSalaryPerMonth() {
        int sum = 0;
        for (Employee empl : empArrays) {
            if (empl != null) {
                sum += empl.getSalary();
            }
        }
        System.out.println("Сумма зарплат всех сотрудников за месяц состовляет =  " + sum);
    }

    public static void getAverageSalary() {
        int sum = 0;
        for (Employee empl : empArrays) {
            if (empl != null) {
                sum += empl.getSalary() / getSize(empArrays);
            }
        }
        System.out.println("Средняя зарплата сотрудников за месяц состовляет =  " + sum);
    }

    public static void getMaximumSalary() {
        int maxSalary = -1;
        String man = null;
        for (Employee empl : empArrays) {
            if (empl != null) {
                if (empl.getSalary() > maxSalary) {
                    maxSalary = empl.getSalary();
                    man = empl.getFirstName() + " " + empl.getMidleName() + " " + empl.getLastName();
                }
            }
        }
        System.out.println("Максимальная зарплата состовляет = " + maxSalary + " у сотрудника " + man);

    }

    public static void getMinimumSalary(Employee[] empArrays) {
        long minSalary = 1000000000L ;
        String man = null;
        for (Employee empl : empArrays) {
            if (empl != null) {
                if (empl.getSalary() < minSalary) {
                    minSalary = empl.getSalary();
                    man = empl.getFirstName() + " " + empl.getMidleName() + " " + empl.getLastName();
                }
            }
        }
        System.out.println("Минимальная зарплата состовляет = " + minSalary + " у сотрудника " + man);
    }


    public static int getSize(Employee[] empArrays) {
        int size = 0;
        int count = 0;
        for (Employee epl : empArrays) {
            if (epl != null) {
                size++;
            }
        }
        return size;
    }
}
