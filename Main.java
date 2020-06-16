import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] staff = new Employee[4];

        var e1 = new Employee(101, "Kian", 50_000, 2017, 3, 12);
        var e2 = new Employee(102, "Nikan", 40_000, 2018, 7, 1);
        var e3 = new Employee(103, "Shabnam", 80_000, 2019, 5, 19);
        var e4 = new Employee(104, "Kian", 100_000, 2012, 8, 20);

        staff[0] = e1;
        staff[1] = e2;
        staff[2] = e3;
        staff[3] = e4;
    }
}
