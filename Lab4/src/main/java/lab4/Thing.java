package lab4;

public abstract class Thing {
    private String name;
    private Locations location;


    public Thing(String name, Locations location){
        this.name = name;
        this.location = location;
    }

    public Thing(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }
    public Locations getLocation() {
        return location;
    }
}
