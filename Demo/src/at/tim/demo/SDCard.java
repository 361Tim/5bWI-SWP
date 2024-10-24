package at.tim.demo;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private int usedSpace;
    private List<Picture> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getUsedSpace() {
        return usedSpace;
    }

    public void addPicture(Picture picture) {
        if (usedSpace + picture.getSize() <= capacity) {
            files.add(picture);
            usedSpace += picture.getSize();
            System.out.println("Picture added: " + picture.getName());
        } else {
            System.out.print("SDCard is full, can't add more pictures.");
        }
    }

    public List<String> getPictures() {
        List<String> pictureNames = new ArrayList<>();
        for (Picture picture : files) {
            pictureNames.add(picture.getName());
        }
        return pictureNames;
    }

    public int getFreeSpace() {
        return capacity - usedSpace;
    }

    public void getAllFiles() {
        for (Picture picture : files) {
            System.out.println("Name: " + picture.getName() + ", Size: " + picture.getSize());
        }
    }

}
