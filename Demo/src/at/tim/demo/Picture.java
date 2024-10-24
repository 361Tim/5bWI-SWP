package at.tim.demo;

import java.util.Date;
import java.util.Scanner;

public class Picture {
    private int size;
    private String name;
    private Date date;

    public Picture(int size, String name, Date date) {
        this.size = size;
        this.name = name;
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

}
