package RMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Station {

    Scanner s = new Scanner(System.in);
    ArrayList<Station> stationArray = new ArrayList<>();
    String name, address;
    int id, capacity;

    Station(int id, String name, int capacity, String address) {
        setId(id);
        setName(name);
        setCapacity(capacity);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addStation() {
        System.out.print("How many do you want to add?:");
        int inp = s.nextInt();
        s.nextLine();
        for (int i = 0; i < inp; i++) {
            System.out.print("Enter ID:");
            int id = Integer.parseInt(s.nextLine());
            System.out.print("Enter Name:");
            String name = s.nextLine();
            System.out.print("Enter Capacity:");
            int capacity = Integer.parseInt(s.nextLine());
            System.out.print("Enter Address:");
            String address = s.nextLine();
            stationArray.add(new Station(id, name, capacity, address));
        }
    }

    public void showStations() {
        for (Station S : stationArray) {
            System.out.println(S);
        }
    }

    void removeStation() {
        System.out.print("Enter ID of Station to remove:");
        int id = Integer.parseInt(s.nextLine());
        for (Station st : stationArray) {
            if (st.getId() == id) {
                stationArray.remove(st);
                break;
            }
        }
    }

    void updateStation() {
        System.out.print("Enter Station ID to Update:");
        int id = Integer.parseInt(s.nextLine());
        for (Station st : stationArray) {
            if (st.getId() == id) {
                String exit = "Y";
                do {
                    System.out.print("1.Update Name\n2.Update Capacity\n"
                            + "\nEnter:");
                    int inp = Integer.parseInt(s.nextLine());
                    switch (inp) {
                        case 1:
                            System.out.print("Enter new Name:");
                            String name = s.nextLine();
                            st.setName(name);
                            break;
                        case 2:
                            System.out.print("Enter new Capacity:");
                            int capacity = Integer.parseInt(s.nextLine());
                            st.setCapacity(capacity);
                            break;
                        default:
                            System.out.print("Wrong Input.");
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
        return "Station{" + "Id:" + id + ", Name:" + name + ", Address:" + address + ", Capacity:" + capacity + '}';
    }

}
