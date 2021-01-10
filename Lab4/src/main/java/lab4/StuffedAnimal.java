package lab4;

public class StuffedAnimal extends Thing {
    public StuffedAnimal(String name, Locations location) {
        super(name, location);
    }

    public StuffedAnimal(String name) {
    }


    public class StuffedPoliceman extends StuffedAnimal implements IEquipped {
        public StuffedPoliceman(String name, Locations location) {
            super(name, location);
        }

        @Override
        public void equipped(String what) {
            System.out.println(this.getName() + " is quipped " + what + ".");
        }

        public void made(String how) {
            System.out.println(this.getName() + " was made " + how + ".");
        }
    }

    public static class StuffedRobber extends StuffedAnimal{
        private static Locations location = Locations.IN_THE_LEFT_CORNER;

        public StuffedRobber(String name){
            super(name);
        }
        public static void printLocation(Locations location){
            System.out.print(location) ;
        }
        public static void equipped(String what){
            System.out.println("StuffedRobber" + " is quipped " + what + ".");
        }

        public static void made(String how){
            System.out.println("StuffedRobber" + " was made " + how + ".");
        }

    }
}
