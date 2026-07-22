import java.util.Scanner;

public class EmployeeAttendanceRanking {

    static class Employee {
        int id;
        int attendance;

        Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }
    }

    static void sortEmployees(Employee[] employees) {

        int n = employees.length;

        for (int i = 0; i < n - 1; i++) {

            int maxIdx = i;

            for (int j = i + 1; j < n; j++) {

                if (employees[j].attendance > employees[maxIdx].attendance) {

                    maxIdx = j;

                } else if (employees[j].attendance == employees[maxIdx].attendance) {

                    if (employees[j].id < employees[maxIdx].id) {

                        maxIdx = j;
                    }
                }
            }

            Employee temp = employees[maxIdx];
            employees[maxIdx] = employees[i];
            employees[i] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] employeeIds = new int[n];
        for (int i = 0; i < n; i++) {
            employeeIds[i] = sc.nextInt();
        }

        int[] attendance = new int[n];
        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        sortEmployees(employees);

        System.out.print("[");
        for (int i = 0; i < k; i++) {

            System.out.print(employees[i].id);

            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
