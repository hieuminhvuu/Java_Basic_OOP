package lab3;

import java.util.Objects;

public class Disguise extends Thing implements IExhibit{
    public Disguise(String name, Locations location){
        super(name, location);
    }
    @Override
    public void exhibit(String how){
        System.out.println(this.getName() + " is on display " + how + this.getLocation());
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
        Disguise disguise = (Disguise) X;
        return Objects.equals(this.getName(), disguise.getName()) &&
                Objects.equals(this.getLocation(), disguise.getLocation());
    }

}
