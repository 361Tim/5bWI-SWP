package at.tim.demo;

import at.tim.demo.Picture;
import at.tim.demo.SDCard;
import at.tim.demo.Producer;
import at.tim.demo.Lens;
import at.tim.demo.Camera;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Producer p = new Producer("Japan", "Nokia");
        Lens l = new Lens("50", p);
        SDCard s = new SDCard(10000);
        Camera c = new Camera(2, "black", p, s, l);

        c.takePicture();
        c.takePicture();

        System.out.println("Gespeicherte Bilder: " + s.getPictures());
        System.out.println("Freier Speicher: " + s.getFreeSpace());
        
        s.getAllFiles();

    }
}
