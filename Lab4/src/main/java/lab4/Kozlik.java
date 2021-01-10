package lab4;

public class Kozlik extends People implements ISee, IEnter,IRealized,INotice{
    public Kozlik(String name){
        super(name);
    }
    public Kozlik(String name, String gender, Locations location){
        super(name, gender, location);
    }
    @Override
    public void see(String what){
        System.out.println(this.getName() + " saw " + what + ".");
    }

    public void hid(String what, String how){
        System.out.println(this.getName() + "hid" + what + how);
    }

    public void pull(String what, String how){
        System.out.println(this.getName() + "pulled" + what + how);
    }

    @Override
    public void enter(String where){
        System.out.println(this.getName() + " entered " + where +"." );
    }

    @Override
    public void realized (String what){
        System.out.println(this.getName() + " realized " + what + ".");
    }

    @Override
    public void notice(String what, String how){
        System.out.println(this.getName() + " " + how + " notice " + what +".");
    }

}
