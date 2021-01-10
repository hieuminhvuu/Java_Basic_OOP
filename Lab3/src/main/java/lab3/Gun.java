package lab3;

import java.util.Objects;

public class Gun extends Weapon implements IStand {
    private String system;
    private String caliber;

    public Gun(String name, Locations location, String system, String caliber){
        super(name, location);
        this.system = system;
        this.caliber = caliber;
    }

    public String getSystem() {
        return system;
    }
    public void setSystem(String system) {
        this.system = system;
    }

    public String getCaliber() {
        return caliber;
    }
    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    @Override
    public void stand(String how){
        System.out.println(this.getName() + " is standing " + how + " " + this.getLocation());
    }

    @Override
    public String toString(){
        return this.getName() + this.getLocation() + this.getSystem() + this.getCaliber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation(), this.getSystem(), this.getCaliber());
    }

    @Override
    public boolean equals(Object X) {
        if (X == null) return false;
        if (this == X) return true;
        if (!(X instanceof Gun)) return false;
        Gun gun = (Gun) X;
        return Objects.equals(this.getName(), gun.getName()) &&
                Objects.equals(this.getLocation(), gun.getLocation()) &&
                Objects.equals(this.getSystem(), gun.getSystem()) &&
                Objects.equals(this.getCaliber(), gun.getCaliber());
    }
}
