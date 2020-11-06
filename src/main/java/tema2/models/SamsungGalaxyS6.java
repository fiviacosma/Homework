package tema2.models;

import tema2.phone_application.Phone;

public class SamsungGalaxyS6 extends Phone {

    private final String MANUFACTURER = "Samsung";
    private final String SAMSUNG_MODEL = "GalaxyS6";
    private final int BATTERY_LIFE = 48;

    private String color;
    private String material;
    private String name;

    public SamsungGalaxyS6(String name) {
        super();
        this.name = name;

    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setMaterial(String material) {
        this.material = material;
    }

}
