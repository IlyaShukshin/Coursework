public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] employee) {
        employees[0] = new Employee("Широков Антон Александрович", 1, 75_000);
        employees[1] = new Employee("Аксёнов Вадим Павлович", 2, 80_000);
        employees[2] = new Employee("Назаров Илья Николаевич", 2, 73_000);
        employees[3] = new Employee("Баева Марина Андреевна", 3, 83_000);
        employees[4] = new Employee("Захаров Евгений Сергеевич", 3, 90_000);
        employees[5] = new Employee("Волков Сергей Петрович", 4, 95_000);
        employees[6] = new Employee("Ильин Дмитрий Иванович", 4, 102_000);
        employees[7] = new Employee("Кузина Светлана Александровна", 5, 98_000);
        employees[8] = new Employee("Карпов Вадим Вячеславович", 5, 105_000);
        employees[9] = new Employee("Сергеев Николай Александрович", 1, 65_000);
        printListEmployees();
        getSalarySum();
        getEmployeeWithMinSalary();
        getEmployeeWithMaxSalary();
        getAverageSalary();
        printEmployeesFullName();


    }

    private static void printListEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Данные сотрудника: " + employees[i]);
        }
    }

    private static int getSalarySum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на ЗП - " + sum);
        return sum;
    }


    private static Employee getEmployeeWithMinSalary() {
        Employee employeeMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + employeeMinSalary);
        return employeeMinSalary;
    }

    private static Employee getEmployeeWithMaxSalary() {
        Employee employeeMaxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + employeeMaxSalary);
        return employeeMaxSalary;
    }

    private static int getAverageSalary() {
        int averageSalary;
        averageSalary = getSalarySum() / employees.length;
        System.out.println("Среднее значение ЗП - " + averageSalary);
        return averageSalary;
    }

    private static void printEmployeesFullName() {
        for (Employee employee : employees) {
            System.out.println("ФИО сотрудника: " + employee.getFullName());
        }
    }
}
