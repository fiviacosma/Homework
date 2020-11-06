package tema2.models;

import tema2.phone_application.Phone;

public class Iphone12 extends Phone {

    private final String MANUFACTURER = "Iphone";
    private final String IPHONE_MODEL = "12";
    private final int BATTERY_LIFE = 50;

    private String color;
    private String material;
    private String name;

    public Iphone12(String name) {
        super();
        this.name = name;
    }

//    public void Iphone12(String name) {
//        this.name = name;
//
//    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setMaterial(String material) {
        this.material = material;
    }
}
