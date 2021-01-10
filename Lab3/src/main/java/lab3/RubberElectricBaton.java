package lab3;

import java.util.Objects;

public class RubberElectricBaton extends PoliceUtensil {
    private String style;

    public RubberElectricBaton(String name, Locations location, String style){
        super(name, location);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
    public void setStyle(String name) {
        this.style = name;
    }

    @Override
    public void exhibit(String how){
        System.out.println(this.getName() + " is on display " + how + " " + this.getLocation());
    }

    @Override
    public String toString(){
        return this.getName() + this.getLocation() + this.getStyle();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation(), this.getStyle());
    }

    @Override
    public boolean equals(Object X) {
        if (X == null) return false;
        if (this == X) return true;
        if (!(X instanceof Gun)) return false;
        RubberElectricBaton rubberelectricbaton = (RubberElectricBaton) X;
        return Objects.equals(this.getName(), rubberelectricbaton.getName()) &&
                Objects.equals(this.getLocation(), rubberelectricbaton.getLocation()) &&
                Objects.equals(this.getStyle(), rubberelectricbaton.getStyle());
    }
}
