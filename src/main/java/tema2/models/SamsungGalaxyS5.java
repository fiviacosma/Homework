package tema2.models;

public class SamsungGalaxyS5 {

    private final String MANUFACTURER = "Samsung";
    private final String SAMSUNG_MODEL = "GalaxyS5";
    private final int BATTERY_LIFE = 42;

    private String color;
    private String material;
    private String name;

    public SamsungGalaxyS5(String name) {
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
