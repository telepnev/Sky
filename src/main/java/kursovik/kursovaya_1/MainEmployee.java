package kursovik.kursovaya_1;

public class MainEmployee {

    public static void main(String[] args) {
        EmployeeServes serves = new EmployeeServes();
        serves.addEmployee("Евгений", "Сергеевич", "Телепнев", 1, 167000);
        serves.addEmployee("Петр", "Сергеевич", "Сидоров", 2, 22000);
        serves.addEmployee("Сергей", "Петрович", "Петров", 3, 32000);
        serves.addEmployee("Анна", "Константиович", "Иванов", 5, 43000);
        serves.addEmployee("Ольга", "Иванович", "Попов", 4, 33000);
        serves.addEmployee("Константин", "Петрович", "Синицын", 4, 13000);
        serves.addEmployee("Татьяна", "Евгеньевич", "Голицын", 1, 38000);
        serves.addEmployee("Афанасий", "Сергеевич", "Теплицин", 2, 31000);
        serves.addEmployee("Дмитрий", "Дмитрьевич", "Афанасьев", 3, 14000);
        serves.getFioEmployee();
        serves.printEmployeeList();
        serves.getAmountSalaryPerMonth();
        serves.getAverageSalary();
        serves.getMaximumSalary();
        serves.getMinimumSalary();

    }
}
