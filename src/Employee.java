public class Employee {

    private String fullName;
    int department;
    int salary;
    private int id;
    private static int counter = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО - " + this.fullName + ". Отдел - " + this.department + ". Зарплата - " + this.salary;

    }
    public static void getEmployeesList(String[] args) {
        for (int i = 0; i < employees.length - 1; i++) {
            System.out.println();
            (employees[i]);
        }
    }

}
