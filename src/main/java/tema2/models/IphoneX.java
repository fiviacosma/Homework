package tema2.models;

import tema2.phone_application.Phone;

public class IphoneX extends Phone {

    private final String MANUFACTURER = "Iphone";
    private final String IPHONE_MODEL = "X";
    private final int BATTERY_LIFE = 38;

    private String color;
    private String material;
    private String name;

    public IphoneX(String name) {
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
