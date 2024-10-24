package at.tim.demo;

public class Lens {
    private String focallenght;
    private Producer producer;

    public Lens(String focallenght, Producer producer) {
        this.focallenght = focallenght;
        this.producer = producer;
    }

    public String getFocallenght() {
        return focallenght;
    }

    public void setFocallenght(String focallenght) {
        this.focallenght = focallenght;
    }

    public Producer getProducer() {
        return producer;
    }
}
