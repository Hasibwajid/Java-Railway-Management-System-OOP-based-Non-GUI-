package RMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Person {

    Scanner s = new Scanner(System.in);
    ArrayList<Employee> employeeArray = new ArrayList<>();
    int salary;

    Employee(int id, String name, String address, String email, long phNo, int salary) {
        super(id, name, address, email, phNo);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public final void setSalary(int salary) {
        this.salary = salary;
    }

    public void addEmployee() {
        System.out.print("How many do you want to add?:");
        int inp = s.nextInt();
        s.nextLine();
        for (int i = 0; i < inp; i++) {
            System.out.print("Enter ID:");
            int id = Integer.parseInt(s.nextLine());
            System.out.print("Enter Name:");
            String name = s.nextLine();
            System.out.print("Enter Address:");
            String address = s.nextLine();
            System.out.print("Enter Email:");
            String email = s.nextLine();
            System.out.print("Enter Phone Number:");
            long phNo = Long.parseLong(s.nextLine());
            System.out.print("Enter Salary:");
            int salary = Integer.parseInt(s.nextLine());
            employeeArray.add(new Employee(id, name, address, email, phNo, salary));
        }
    }

    public void showEmployees() {
        for (Employee em : employeeArray) {
            System.out.println(em);
        }
    }

    public void removeEmployee() {
        System.out.print("Enter ID of Employee to remove:");
        int id = Integer.parseInt(s.nextLine());
        for (Employee e : employeeArray) {
            if (e.getId() == id) {
                employeeArray.remove(e);
                break;
            }
        }
    }

    public void updateEmployee() {
        System.out.print("Enter Employee ID to Update:");
        int id = Integer.parseInt(s.nextLine());
        for (Employee e : employeeArray) {
            if (e.getId() == id) {
                String exit = "Y";
                do {
                    System.out.print("1.Update Name\n2.Update Salary\n"
                            + "3.Update Address\n4.Update Phone Number\n5.Update Email\nEnter:");
                    int inp = Integer.parseInt(s.nextLine());
                    switch (inp) {
                        case 1:
                            System.out.print("Enter new Name:");
                            String name = s.nextLine();
                            e.setName(name);
                            break;
                        case 2:
                            System.out.print("Enter new Salary:");
                            int salary = Integer.parseInt(s.nextLine());
                            e.setSalary(salary);
                            break;
                        case 3:
                            System.out.print("Enter new Address:");
                            String address = s.nextLine();
                            e.setAddress(address);
                            break;
                        case 4:
                            System.out.print("Enter new Phone Number:");
                            long phNo = Long.parseLong(s.nextLine());
                            e.setPhNo(phNo);
                            break;
                        case 5:
                            System.out.print("Enter Email:");
                            String email = s.nextLine();
                            e.setEmail(email);
                            break;
                        default:
                            System.out.print("Wrong Input.");
                            break;
                    }
                    System.out.print("Stop Updating?(Y/N): ");
                    exit = s.nextLine().toUpperCase();
                } while (exit.equals("N"));
                break;
            }

        }
    }

    @Override
    public String toString() {
        return ", " + "Salary: " + salary + '}';
    }

}
