package com.Ann.Score;

public class Student {
    String name;
    int english;
    int math;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int english, int math) {
        this(name);
        this.english = english;
        this.math = math;
    }

    public Student() {
        this("Ann wang", -1, -1);
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAerage());
        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }

    public int getAerage() {
        return (english + math) / 2;
    }
  }
}
