package RMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Train {

    Scanner s = new Scanner(System.in);
    ArrayList<Train> trainArray = new ArrayList<>();
    String name, colour;
    int comparts, id, capacity, engine;

    Train(int id, String name, int comparts, int capacity, String colour, int engine) {
        setId(id);
        setName(name);
        setComparts(comparts);
        setCapacity(capacity);
        setColour(colour);
        setEngine(engine);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getComparts() {
        return comparts;
    }

    public void setComparts(int comparts) {
        this.comparts = comparts;
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

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void addTrain() {
        System.out.print("How many do you want to add?:");
        int inp = s.nextInt();
        s.nextLine();
        for (int i = 0; i < inp; i++) {
            System.out.print("Enter ID:");
            int id = Integer.parseInt(s.nextLine());
            System.out.print("Enter Name:");
            String name = s.nextLine();
            System.out.print("Enter No. of Compartments:");
            int comparts = Integer.parseInt(s.nextLine());
            System.out.print("Enter Capacity:");
            int capacity = Integer.parseInt(s.nextLine());
            System.out.print("Enter Colour:");
            String colour = s.nextLine();
            System.out.print("Enter Engine No.:");
            int engine = Integer.parseInt(s.nextLine());
            trainArray.add(new Train(id, name, comparts, capacity, colour, engine));
        }
    }

    public void updateTrain() {
        System.out.print("Enter Train ID to Update:");
        int id = Integer.parseInt(s.nextLine());
        for (Train tr : trainArray) {
            if (tr.getId() == id) {
                String exit = "Y";
                do {
                    System.out.print("1.Update Name\n2.Update Capacity\n"
                            + "\n3.Update Engine No.\nEnter:");
                    int inp = Integer.parseInt(s.nextLine());
                    switch (inp) {
                        case 1:
                            System.out.print("Enter new Name:");
                            String name = s.nextLine();
                            tr.setName(name);
                            break;
                        case 2:
                            System.out.print("Enter new Capacity:");
                            int capacity = Integer.parseInt(s.nextLine());
                            tr.setCapacity(capacity);
                            System.out.print("Enter new Number of Compartments:");
                            int comparts = Integer.parseInt(s.nextLine());
                            tr.setComparts(comparts);
                            break;
                        case 3:
                            System.out.print("Enter new Engine Number:");
                            int engine = Integer.parseInt(s.nextLine());
                            tr.setEngine(engine);
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

    public void showTrains() {
        for (Train tr : trainArray) {
            System.out.println(tr);
        }
    }

    public void removeTrain() {
        System.out.print("Enter ID of Train to remove:");
        int id = Integer.parseInt(s.nextLine());
        for (Train tr : trainArray) {
            if (tr.getId() == id) {
                trainArray.remove(tr);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Train{" + "Id:" + id + ", Name:" + name + ", Colour:" + colour + ", Comparts:" + comparts + ", Capacity:" + capacity + ", Engine No.:" + engine + '}';
    }

}
