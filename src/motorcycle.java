public class Motorcycle {

    private String color;
    private String gear;
    private Integer speed;
    private Frame frame;
    private Style style;

    public Motorcycle(String color, String gear, Integer speed, Material frameMaterial, Manufacturer manufacturerStyle) {
        this.color = color;
        this.gear = gear;
        this.frame = new Frame(frameMaterial);
        this.style = new Style(manufacturerStyle);
    }

    public String getColor () {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String getGear () {
        return gear;
    }
    public void setGear (String gear) {
        this.gear = gear;
    }
    public Integer getSpeed () {
        return speed;
    }
    public void setSpeed (Integer speed) {
        this.speed = speed;
    }
    public Material getFrame () {
        return frame.getMaterial();
    }
    public Manufacturer getManufacturer () {
        return style.getManufacturer();
    }

    public void start() {
        System.out.println("Motorcycle engine started");
    }
    public void stop() {
        System.out.println("Motorcycle engine stopped");
    }


    }


