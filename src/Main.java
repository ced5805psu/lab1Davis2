/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Conner Davis
 * Date Developed: 1-20-2026
 * Last Date Changed: 1-26-2026
 * Revision:

 */

public class Main {
    public static void main(String[] args){
        Motorcycle m1 = new Motorcycle("red", "6 Gear",90, Material.Carbon_Fiber, Manufacturer.Harley);
        System.out.println("Motorcycle color: " + m1.getColor());
        System.out.println("Motorcycle gear: " + m1.getGear());
        System.out.println("Motorcycle speed: " + m1.getSpeed());
        System.out.println("Frame material: " + m1.getFrame());
        System.out.println("Motorcycle manufacturer: " + m1.getManufacturer());
        System.out.println(" ");
        m1.start();
        m1.wheelie();

        Motorcycle m2 = new Motorcycle("blue","7 Gear",120, Material.Titanium, Manufacturer.Suzuki);
        System.out.println("Motorcycle color: " + m2.getColor());
        System.out.println("Motorcycle gear: " + m2.getGear());
        System.out.println("Motorcycle speed: " + m2.getSpeed());
        System.out.println("Frame material: " + m2.getFrame());
        System.out.println("Motorcycle manufacturer: " + m2.getManufacturer());
        System.out.println(" ");
        m2.start();
        m2.stop();

        Motorcycle m3 = new Motorcycle("green", "8 Gear", 135, Material.Aluminium, Manufacturer.Kawasaki);
        System.out.println("Motorcycle color: " + m3.getColor());
        System.out.println("Motorcycle gear: " + m3.getGear());
        System.out.println("Motorcycle speed: " + m3.getSpeed());
        System.out.println("Frame material: " + m3.getFrame());
        System.out.println("Motorcycle manufacturer: " + m3.getManufacturer());
        m3.start();
        m3.wheelie();
        m3.stop();
    }
}
