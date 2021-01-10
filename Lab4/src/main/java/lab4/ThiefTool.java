package lab4;

import java.util.Objects;

public class ThiefTool extends Thing implements IExhibit{
    public ThiefTool(String name, Locations location){
        super(name, location);
    }

    @Override
    public void exhibit(String how){
        System.out.println(this.getName() + " is on display " + how + " " + this.getLocation());
    }
}
