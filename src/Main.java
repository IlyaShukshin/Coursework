import java.io.PrintStream;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] employee) {

        employees[1] = new Employee("Широков Антон Александрович", 1, 75_000);
        employees[2] = new Employee("Аксёнов Вадим Павлович", 2, 80_000);
        employees[3] = new Employee("Назаров Илья Николаевич", 2, 73_000);
        employees[4] = new Employee("Баева Марина Андреевна", 3, 83_000);
        employees[5] = new Employee("Захаров Евгений Сергеевич", 3, 90_000);
        employees[6] = new Employee("Волков Сергей Петрович", 4, 95_000);
        employees[7] = new Employee("Ильин Дмитрий Иванович", 4, 102_000);
        employees[8] = new Employee("Кузина Светлана Александровна", 5, 98_000);
        employees[9] = new Employee("Карпов Вадим Вячеславович", 5, 105_000);
    }
}