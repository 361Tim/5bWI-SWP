package at.tim.demo;

import java.util.Date;
import at.tim.demo.Picture;
import java.util.Scanner;

public class Camera {
    private double weight;
    private String color;

    public enum QUALITY {
        High, Medium, Low
    }

    private Producer producer;
    private SDCard sdCard;
    private Lens lens;

    public Camera(double weight, String color, Producer producer, SDCard sdCard, Lens lens) {
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.sdCard = sdCard;
        this.lens = lens;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Producer getProducer() {
        return producer;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void takePicture() {
        QUALITY quality = getQualityFromUser();
        int size;

        switch (quality) {
            case High:
                size = 300;
                break;
            case Medium:
                size = 200;
                break;
            case Low:
                size = 100;
                break;
            default:
                throw new IllegalArgumentException("Invalid quality: " + quality);
        }

        Picture picture = new Picture(size, "Bild_" + new Date(), new Date());
        sdCard.addPicture(picture);
    }

    private QUALITY getQualityFromUser() {
        Scanner scanner = new Scanner(System.in);
        QUALITY quality = null;

        while (quality == null) {
            System.out.print("Bitte wähle die Bildqualität (High, Medium, Low): ");
            String input = scanner.nextLine().trim();

            try {
                quality = QUALITY.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Ungültige Eingabe. Bitte versuche es erneut.");
            }
        }

        return quality;
    }
}
