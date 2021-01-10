package lab4;

public class Mask extends Thing implements IExhibit{
    public Mask(String name, Locations location){
        super(name, location);
    }

    @Override
    public void exhibit(String how){
        System.out.println(this.getName() + " is on display " + how + this.getLocation());
    }
}
