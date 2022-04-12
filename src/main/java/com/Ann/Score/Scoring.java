package com.Ann.Score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("Ann",96,75));
        students.add(new Student("Jerry",77,68));
        students.add(new GraduateStudent("Tiffany",60,79,83));
        for (Student s : students){
            s.print();
        }
    }
}
