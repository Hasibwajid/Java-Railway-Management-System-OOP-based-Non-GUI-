package RMS;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoRMS {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String exit;
        Train t = new Train(0, "Bullet", 30, 500, "Red", 443);
        Station st = new Station(0, "Rawalpindi", 500, "RawalPindi");
        Customer c = new Customer(0, "Mohtasim", "Jhand", "Moh@gmail.com", "@mafi", 3105678924L);
        Employee e = new Employee(0, "Mohtasim", "Jhand", "Moh@gmail.com", 3105678924L, 23000);
        Food f = new Food(0, "Biryani", "Non-Veg", 200);

        t.trainArray.add(t);st.stationArray.add(st);f.foodArray.add(f);c.customerArray.add(c);
        e.employeeArray.add(e);
        do {
            System.out.print("1.Train\t\t2.Station\n"
                    + "3.Employee\t4.Food\n5.Customer\nEnter any Number from above:");
            int input = Integer.parseInt(s.nextLine());
            switch (input) {
                case 1:
                    do {
                        System.out.print("1.Add Train\t\t2.Show Train\n"
                                + "3.Remove Train\t\t4.Update Train\nEnter any Number from above:");
                        int inp = Integer.parseInt(s.nextLine());
                        switch (inp) {
                            case 1:
                                t.addTrain();
                                break;
                            case 2:
                                t.showTrains();
                                break;
                            case 3:
                                t.removeTrain();
                                break;
                            case 4:
                                t.updateTrain();
                            default:
                                System.out.println("Wrong input. Exiting!");
                                break;
                        }
                        System.out.print("Exit to Main Menu?(Y/N)");
                        exit = s.nextLine().toUpperCase();
                    } while (exit.equals("N"));
                    break;
                case 2:
                    do {
                        System.out.print("1.Add Station\t\t2.Show Station\n"
                                + "3.Remove Train\t\t4.Update Train\nEnter any Number from above:");
                        int inp = Integer.parseInt(s.nextLine());
                        switch (inp) {
                            case 1:
                                st.addStation();
                                break;
                            case 2:
                                st.showStations();
                                break;
                            case 3:
                                st.removeStation();
                                break;
                            case 4:
                                st.updateStation();
                                break;
                            default:
                                System.out.println("Wrong input. Exiting!");
                                break;
                        }
                        System.out.print("Exit to Main Menu?(Y/N)");
                        exit = s.nextLine().toUpperCase();
                    } while (exit.equals("N"));
                    break;
                case 3:
                    do {
                        System.out.print("1.Add Employee\t\t2.Show Employee\n"
                                + "3.Remove Employee\t\t4.Update Employee\nEnter any Number from above:");
                        int inp = Integer.parseInt(s.nextLine());
                        switch (inp) {
                            case 1:
                                e.addEmployee();
                                break;
                            case 2:
                                e.showEmployees();
                                break;
                            case 3:
                                e.removeEmployee();
                                break;
                            case 4:
                                e.updateEmployee();
                                break;
                            default:
                                System.out.println("Wrong input. Exiting!");
                                break;
                        }
                        System.out.print("Exit to Main Menu?(Y/N)");
                        exit = s.nextLine().toUpperCase();
                    } while (exit.equals("N"));
                    break;
                case 4:
                    do {
                        System.out.print("1.Add Food\t\t2.ShowFood\n"
                                + "3.Remove Food\t\t4.Update Food\nEnter any Number from above:");
                        int inp = Integer.parseInt(s.nextLine());
                        switch (inp) {
                            case 1:
                                f.addFood();
                                break;
                            case 2:
                                f.showFoods();
                                break;
                            case 3:
                                f.removeFood();
                                break;
                            case 4:
                                f.updateFood();
                                break;
                            default:
                                System.out.println("Wrong input. Exiting!");
                                break;
                        }
                        System.out.print("Exit to Main Menu?(Y/N)");
                        exit = s.nextLine().toUpperCase();
                    } while (exit.equals("N"));
                    break;
                case 5:
                    do {
                        System.out.print("1.Add Customer\t\t2.Show Customer\n"
                                + "3.Remove Customer\t\t4.UpdateCustomer\nEnter any Number from above:");
                        int inp = Integer.parseInt(s.nextLine());
                        switch (inp) {
                            case 1:
                                c.addCustomer();
                                break;
                            case 2:
                                c.showCustomers();
                                break;
                            case 3:
                                c.removeCustomer();
                                break;
                            case 4:
                                c.updateCustomer();
                                break;
                            default:
                                System.out.println("Wrong input. Exiting!");
                                break;
                        }
                        System.out.print("Exit to Main Menu?(Y/N)");
                        exit = s.nextLine().toUpperCase();
                    } while (exit.equals("N"));
                    break;
                default:
                    System.out.println("Wrong input. Exiting!");
                    break;
            }
            System.out.print("Exit(Y/N)");
            exit = s.nextLine().toUpperCase();
        } while (exit.equals("N"));
    }
}
