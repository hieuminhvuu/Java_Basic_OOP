package lab4;

import java.util.Objects;

public class Weapon extends Thing{

    public Weapon(String name, Locations location){
        super(name, location);
    }

    public Weapon() {
        super();
    }

    public void lay(String how){
        System.out.println(this.getName() + " is laying " + how + " " + this.getLocation());
    }

}
