package lab4;

public class Gun extends Weapon {
    public Gun(String name, Locations location) {
        super(name, location);
    }

    public Gun() {
        super();
    }

    public void standing(String how) {
        class Guns {
            String name;
            Locations locations;
            String system;
            String caliber;

            Guns(String name, Locations locations, String system, String caliber) {
                this.name = name;
                this.locations = locations;
                this.system = system;
                this.caliber = caliber;
            }

            public void print() {
                System.out.println(this.name + " is standing " + how + " " + this.locations);
            }
        }
        Guns guns = new Guns("Guns", Locations.ON_SPECIAL_WOODEN_STAND, "null", "null");
        guns.print();
    }
}