public class Main {
    public static void main(String[] args){
        Motorcycle m1 = new Motorcycle("red", "6 Gear",90, Material.Carbon_Fiber, Manufacturer.Harley);
        System.out.println(m1.getColor());

        Motorcycle m2 = new Motorcycle("blue","7 Gear",120, Material.Titanium, Manufacturer.Suzuki);
        System.out.println(m2.getColor());

        Motorcycle m3 = new Motorcycle("green", "8 Gear", 135, Material.Aluminium, Manufacturer.Kawasaki);
        System.out.println(m3.getColor());
    }
}
