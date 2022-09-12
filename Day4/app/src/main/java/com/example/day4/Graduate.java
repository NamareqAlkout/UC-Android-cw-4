package com.example.day4;

public class Graduate {

    private String studentname;
    private int studentage;
    private int studentpicture;

    public Graduate(String studentname, int studentage, int studentpicture) {
        this.studentname = studentname;
        this.studentage = studentage;
        this.studentpicture = studentpicture;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentpicture() {
        return studentpicture;
    }

    public void setStudentpicture(int studentpicture) {
        this.studentpicture = studentpicture;
    }
}
