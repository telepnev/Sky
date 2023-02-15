package kursovik.kursovaya_1;

public class MainEmployee {

    public static void main(String[] args) {
        EmployeeServes serves = new EmployeeServes();
        serves.addEmployee("Evgeny", "Sergeevich", "Telepnev", 1, 1000);
        serves.addEmployee("Petr", "Sergeevich", "Petrov", 2, 2000);
        serves.addEmployee("Ivan", "Sergeevich", "Ivanov", 1, 3000);
        serves.getFioEmployee();
        serves.printEmployeeList();
        serves.getAmountSalaryPerMonth();
        serves.getAverageSalary();
        serves.getMaximumSalary();
        serves.getMinimumSalary();

    }
}
