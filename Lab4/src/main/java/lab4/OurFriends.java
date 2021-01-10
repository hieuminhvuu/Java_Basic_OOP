package lab4;

public class OurFriends extends People{
    public OurFriends(String name){
        super(name);
    }
    public OurFriends(String name, String gender, Locations location){
        super(name, gender, location);
    }

    public void reach(String what){
        if(what == null) throw new ReachException();
        System.out.println(this.getName() + " reached " + what +"." );
    }

    public void turnInto(String what){
        System.out.println(this.getName() + " turned into " + what +"." );
    }
}
