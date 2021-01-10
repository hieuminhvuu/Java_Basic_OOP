package lab4;

public class Seller extends People implements IEquipped, ISee{
    public Seller(String name){
        super(name);
    }

    public void hide(String how){
        System.out.println(this.getName() + " was hidden " + how + ".");
    }

    @Override
    public void equipped(String what){
        System.out.println(this.getName() + " is quipped " + what + ".");
    }

    public void stuck(Locations where, String how){
        System.out.println(this.getName() + " stuck out motionless " + where + " " + how + ".");
    }

    public void leanedForward(){
        System.out.println(this.getName() + " leaned forward with his whole body.");
    }

    public void lean(String what,String how){
        System.out.println(this.getName() + " leaning " + what + " " + how + ".");
    }

    @Override
    public void see(String what) {
        System.out.println(this.getName() + " is seeing " + what + ".");
    }

    public void said(String what){
        System.out.println(this.getName() + " said " + what + ".");
    }
}
