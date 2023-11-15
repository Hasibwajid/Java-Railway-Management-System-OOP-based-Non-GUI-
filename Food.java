package RMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {

    Scanner s = new Scanner(System.in);
    ArrayList<Food> foodArray = new ArrayList<>();
    String name, type;
    int id, price;

    Food(int id, String name, String type, int price) {
        setId(id);
        setName(name);
        setType(type);
        setPrice(price);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{ " + "Id:" + id + ", Name: " + name + ", Type:" + type + ", Price:" + price + '}';
    }

    public void addFood() {
        System.out.print("How many do you want to add?:");
        int inp = s.nextInt();
        s.nextLine();
        for (int i = 0; i < inp; i++) {
            System.out.print("Enter Id:");
            int id = Integer.parseInt(s.nextLine());
            System.out.print("Enter Name:");
            String name = s.nextLine();
            System.out.print("Enter Type:");
            String type = s.nextLine();
            System.out.print("Enter Price:");
            int price = Integer.parseInt(s.nextLine());
            foodArray.add(new Food(id, name, type, price));
        }
    }

    public void showFoods() {
        for (Food fo : foodArray) {
            System.out.println(fo);
        }
    }

    public void removeFood() {
        System.out.print("Enter ID of Food to remove:");
        int id = Integer.parseInt(s.nextLine());
        for (Food f : foodArray) {
            if (f.getId() == id) {
                foodArray.remove(f);
                break;
            }
        }
    }

    public void updateFood() {
        System.out.print("Enter Food ID to Update:");
        int id = Integer.parseInt(s.nextLine());
        for (Food f : foodArray) {
            if (f.getId() == id) {
                String exit = "Y";
                do {
                    System.out.print("1.Update Name\n2.Update Price\n"
                            + "3.Update Type\nEnter:");
                    int inp = Integer.parseInt(s.nextLine());
                    switch (inp) {
                        case 1:
                            System.out.print("Enter new Name:");
                            String name = s.nextLine();
                            f.setName(name);
                            break;
                        case 2:
                            System.out.print("Enter new Price:");
                            int price = Integer.parseInt(s.nextLine());
                            f.setPrice(price);
                            break;
                        case 3:
                            System.out.print("Enter Type:");
                            String type = s.nextLine();
                            f.setType(type);
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

}
