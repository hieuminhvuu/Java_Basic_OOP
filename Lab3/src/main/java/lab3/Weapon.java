package lab3;

import java.util.Objects;

public class Weapon extends Thing implements ILay{

    public Weapon(String name, Locations location){
        super(name, location);
    }

    @Override
    public void lay(String how){
        System.out.println(this.getName() + " is laying " + how + " " + this.getLocation());
    }

    @Override
    public String toString(){
        return this.getName() + this.getLocation() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation());
    }

    @Override
    public boolean equals(Object X) {
        if (X == null) return false;
        if (this == X) return true;
        if (!(X instanceof Gun)) return false;
        Weapon weapon = (Weapon) X;
        return Objects.equals(this.getName(), weapon.getName()) &&
                Objects.equals(this.getLocation(), weapon.getLocation());
    }
}
