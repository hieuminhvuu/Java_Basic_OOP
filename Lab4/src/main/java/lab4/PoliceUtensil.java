package lab4;

import java.util.Objects;

public class PoliceUtensil extends Thing implements IExhibit{

    public PoliceUtensil(String name, Locations location){
        super(name, location);
    }

    @Override
    public void exhibit(String how){
        System.out.println(this.getName() + " is on display " + how + " " + this.getLocation());
    }
}
