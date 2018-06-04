package lesson8.hw8_2;

import java.util.Date;

public class Course {
    Date startDate;
    String name;
    int hoursDuration;
    String teatcherName;
    Student[] students;

    public Course(Date startDate, String name, int hoursDuration, String teatcherName, Student[] students) {
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teatcherName = teatcherName;
        this.students = students;
    }
}
