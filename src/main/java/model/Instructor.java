package model;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Administrator {
    private String name;
    private String address;
    private String email;
    private int phoneNo;
    private List<Course> taughtCourses;

    //Constructor
    public Instructor(String name, String address, String email, int phoneNo) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
        this.taughtCourses = new ArrayList<Course>();
    }
}
