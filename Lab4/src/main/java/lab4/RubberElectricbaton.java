package lab4;

public class RubberElectricbaton extends PoliceUtensil {
    private String Style;

    public RubberElectricbaton(String name, Locations location){
        super(name, location);
    }

    public String getStyle() {
        return Style;
    }
    public void setStyle(String style) throws RubberElectricbatonStyleException {
        if(style!="a lot of style") throw new RubberElectricbatonStyleException();
        Style = style;
        System.out.println("Set rubber electricbaton's style is " + style);
    }

    @Override
    public void exhibit(String how){
        System.out.println(this.getName() + " is on display " + how + " " + this.getLocation());
    }
}
