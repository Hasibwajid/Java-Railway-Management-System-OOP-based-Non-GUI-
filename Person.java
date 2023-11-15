package RMS;

import java.util.ArrayList;

public class Person {

    int id;
    String name, address, email;
    long phNo;

    Person(int id, String name, String address, String email, long phNo) {
        setId(id);setName(name);setAddress(address);setEmail(email);
        setPhNo(phNo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "{" + "Id: " + id + ", Name: " + name + ", Address: " + address + ", Email: " + email + ", PhNo: " + phNo;
    }

}
