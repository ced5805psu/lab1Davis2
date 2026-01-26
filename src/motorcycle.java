/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Conner Davis
 * Date Developed: 1-20-2026
 * Last Date Changed: 1-26-2026
 * Revision:

 */

public class Motorcycle {
    /**
     * The color of the bike
     */
    private String color;

    /**
     * How many gears the bike has
     */
    private String gear;

    /**
     * The speed of the bike
     */
    private Integer speed;

    /**
     * The frame material of the bike
     */
    private Frame frame;

    /**
     * The manufacturer of the bike
     */
    private Style style;

    public Motorcycle(String color, String gear, Integer speed, Material frameMaterial, Manufacturer manufacturerStyle) {
        this.color = color;
        this.gear = gear;
        this.speed = speed;
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
        System.out.println("Motorcycle engine started!");
    }
    public void stop() {
        System.out.println("Motorcycle engine stopped.");
    }
    public void wheelie() {
        System.out.println("The motorcycle did a wheelie!");
    }
    }


