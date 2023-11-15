package RMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person {

    Scanner s = new Scanner(System.in);
    ArrayList<Customer> customerArray = new ArrayList<>();
    String password;

    Customer(int id, String name, String address, String email, String password, long phNo) {
        super(id, name, address, email, phNo);
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public final void setPassword(String password) {
        this.password = password;
    }

    public void addCustomer() {
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
            System.out.print("Enter Password:");
            String password = s.nextLine();
            System.out.print("Enter Phone Number:");
            long phNo = Long.parseLong(s.nextLine());
            customerArray.add(new Customer(id, name, address, email, password, phNo));
        }
    }

    public void showCustomers() {
        for (Customer cu : customerArray) {
            System.out.println(cu);
        }
    }

    public void removeCustomer() {
        System.out.print("Enter ID of Customer to remove:");
        int id = Integer.parseInt(s.nextLine());
        for (Customer c : customerArray) {
            if (c.getId() == id) {
                customerArray.remove(c);
                break;
            }
        }
    }

    public void updateCustomer() {
        System.out.print("Enter Customer ID to Update:");
        int id = Integer.parseInt(s.nextLine());
        for (Customer c : customerArray) {
            if (c.getId() == id) {
                String exit = "Y";
                do {
                    System.out.print("1.Update Username\n2.Update Password\n"
                            + "3.Update Address\n4.Update Phone Number\n5.Update Email\nEnter:");
                    int inp = Integer.parseInt(s.nextLine());
                    switch (inp) {
                        case 1:
                            System.out.print("Enter new Username:");
                            String name = s.nextLine();
                            c.setName(name);
                            break;
                        case 2:
                            System.out.print("Enter new Salary:");
                            String password = s.nextLine();
                            c.setPassword(password);
                            break;
                        case 3:
                            System.out.print("Enter new Address:");
                            String address = s.nextLine();
                            c.setAddress(address);
                            break;
                        case 4:
                            System.out.print("Enter new Phone Number:");
                            long phNo = Long.parseLong(s.nextLine());
                            c.setPhNo(phNo);
                            break;
                        case 5:
                            System.out.print("Enter Email:");
                            String email = s.nextLine();
                            c.setEmail(email);
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
        return ", " + "Password: " + password + '}';
    }

}
