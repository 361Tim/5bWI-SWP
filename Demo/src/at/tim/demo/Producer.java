package at.tim.demo;

public class Producer {
    private String country;
    private String name;

    public Producer(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

}
