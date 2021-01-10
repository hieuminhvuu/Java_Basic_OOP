package lab4;

public abstract class People {
    private String name;
    private String gender;
    private Locations location;

    public People(String name){
        this.name = name;
    }
    public People(String name, String gender, Locations location){
        this.name = name;
    }
    public String getGender() {
        return name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getLocation() {
        return name;
    }
    public void setLocation(Locations location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}