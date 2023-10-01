package model;

import java.math.BigDecimal;

public class Course {
    private String title;
    private int durationDays;
    private String category;
    private String introduction;
    private BigDecimal cost;
    private boolean isPublished;
    private Instructor instructor;

    //Constructor
    public Course(String title, int durationDays, String category, String introduction, Instructor instructor, BigDecimal cost) {
        this.title = title;
        this.durationDays = durationDays;

    }
}
