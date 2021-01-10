package lab4;

public class Main {
    public static void main(String[] args) {
        Dunno Dunno = new Dunno("Dunno");
        Kozlik Kozlik = new Kozlik(("Kozlik"));
        OurFriends OurFriends = new OurFriends("Our friends");
        Gun Gun = new Gun();
        Weapon Pistol = new Gun("Pistol", Locations.ON_THE_COUNTER);
        Weapon Knives = new Weapon("Knives", Locations.ON_THE_COUNTER);
        Weapon Finks = new Weapon("Finks", Locations.ON_THE_COUNTER);
        Weapon Daggers = new Weapon("Daggers", Locations.ON_THE_COUNTER);
        Weapon Brushes = new Weapon("Brushes", Locations.ON_THE_COUNTER);
        Weapon Brassknuckles = new Weapon("Brass knuckles", Locations.ON_THE_COUNTER);
        ThiefTool Masterkeys = new ThiefTool("Masterkeys", Locations.ALONG_THE_WALLS);
        ThiefTool Steelfiles = new ThiefTool("Steelfiles", Locations.ALONG_THE_WALLS);
        ThiefTool Drills = new ThiefTool("Drills", Locations.ALONG_THE_WALLS);
        ThiefTool Pliers = new ThiefTool("Pliers", Locations.ALONG_THE_WALLS);
        ThiefTool Nippers = new ThiefTool("Nippers", Locations.ALONG_THE_WALLS);
        ThiefTool Crowbars = new ThiefTool("Crowbars", Locations.ALONG_THE_WALLS);
        ThiefTool Crowbarsforbreakinglocks = new ThiefTool("Crowbars for breaking locks", Locations.ALONG_THE_WALLS);
        ThiefTool Autogenousmachinesforcuttingfireproofcabinets = new ThiefTool("Autogenous machines for cutting fireproof cabinets", Locations.ALONG_THE_WALLS);
        ThiefTool Chests = new ThiefTool("Chests", Locations.ALONG_THE_WALLS);
        RubberElectricbaton RubberElectricbatons = new RubberElectricbaton("Rubber electric batons", Locations.IN_THE_WINDOW);
        PoliceUtensil Steelhandcuffs = new PoliceUtensil("Steel handcuffs", Locations.IN_THE_WINDOW);
        PoliceUtensil Shackles = new PoliceUtensil("Shackles", Locations.IN_THE_WINDOW);
        PoliceUtensil Incendiarybombs = new PoliceUtensil("Incendiary bombs", Locations.IN_THE_WINDOW);
        PoliceUtensil Tearbomb = new PoliceUtensil("Tear bomb", Locations.IN_THE_WINDOW);
        PoliceUtensil Otherpoliceitems = new PoliceUtensil("Other police items", Locations.IN_THE_WINDOW);
        Mask Halffacemask = new Mask("Half face mask", Locations.IN_THE_SHOWCASE);
        Mask Eyemask = new Mask("Eye mask", Locations.IN_THE_SHOWCASE);
        Mask Fullfacemask = new Mask("Full face mask", Locations.IN_THE_SHOWCASE);
        Disguise Makeup = new Disguise("Makeup", Locations.IN_THE_SHOWCASE);
        Disguise Wigs = new Disguise("Wigs", Locations.IN_THE_SHOWCASE);
        Disguise Fakebeards = new Disguise("Fake beards", Locations.IN_THE_SHOWCASE);
        Disguise Mustaches = new Disguise("Mustaches", Locations.IN_THE_SHOWCASE);
        StuffedAnimal stuffedAnimal = new StuffedAnimal("Stuffed policeman", Locations.IN_THE_RIGHT_CORNER);
        StuffedAnimal.StuffedPoliceman stuffedPoliceman = stuffedAnimal.new StuffedPoliceman("Stuffed policeman", Locations.IN_THE_RIGHT_CORNER);
        Seller Seller = new Seller("Seller");


        Dunno.hid("the letter", "back in his hat");
        Dunno.pull("the hat", "tighter over his head");
        System.out.print(Time.HALF_AN_HOUR_LATER + ", ");
        try{
            OurFriends.reach("Kruchenaya Street");
        }catch (ReachException elex){
            System.out.println(elex.getMessage());
        }
        OurFriends.turnInto("a narrow alley, twisting like a snake among tall buildings");
        IHouse Houses = new IHouse() {
            private String name;
            private Locations locations;
            @Override
            public void setName(String name){
                this.name = name;
            }
            public String getName() {
                return name;
            }
            @Override
            public void setLocation(Locations locations){
                this.locations = locations;
            }
            public Locations getLocation() {
                return locations;
            }
            @Override
            public void stand(String how) {
                System.out.println(getName() + " " + getLocation() + " standing " + how + "." );
            }
        };
        Houses.setName("The houses");
        Houses.setLocation(Locations.ON_BOTH_SIDES_OF_VALLEY);
        Houses.stand("so close together that the rays of light were lost in the upper floors, which left a mysterious twilight below, where numerous shops were located");
        Dunno.see("a sign over the door of one of the shops with the inscription \"Sale of various goods\"");
        Kozlik.see("a sign over the door of one of the shops with the inscription \"Sale of various goods\"");
        Dunno.enter("the store");
        Kozlik.enter("the store");
        Dunno.realized("what kind of goods were sold here");
        Kozlik.realized("what kind of goods were sold here");
        Gun.standing("in orderly rows,");
        Pistol.lay("in exemplary order,");
        Knives.lay("in exemplary order,");
        Finks.lay("in exemplary order,");
        Daggers.lay("in exemplary order,");
        Brushes.lay("in exemplary order,");
        Brassknuckles.lay("in exemplary order,");
        Masterkeys.exhibit("in the showcases illuminated from the inside,");
        Steelfiles.exhibit("in the showcases illuminated from the inside,");
        Drills.exhibit("in the showcases illuminated from the inside,");
        Pliers.exhibit("in the showcases illuminated from the inside,");
        Nippers.exhibit("in the showcases illuminated from the inside,");
        Crowbars.exhibit("in the showcases illuminated from the inside,");
        Crowbarsforbreakinglocks.exhibit("in the showcases illuminated from the inside,");
        Autogenousmachinesforcuttingfireproofcabinets.exhibit("in the showcases illuminated from the inside,");
        Chests.exhibit("in the showcases illuminated from the inside,");
        try{
            RubberElectricbatons.setStyle("a lot of style");
        }catch (RubberElectricbatonStyleException clex){
            System.out.println(clex.getMessage());
        }
        RubberElectricbatons.exhibit("above which there was the inscription \"Police Utensils\",");
        Steelhandcuffs.exhibit("above which there was the inscription \"Police Utensils\",");
        Shackles.exhibit("above which there was the inscription \"Police Utensils\",");
        Incendiarybombs.exhibit("above which there was the inscription \"Police Utensils\",");
        Tearbomb.exhibit("above which there was the inscription \"Police Utensils\",");
        Otherpoliceitems.exhibit("above which there was the inscription \"Police Utensils\",");
        Halffacemask.exhibit("");
        Eyemask.exhibit("");
        Fullfacemask.exhibit("");
        Makeup.exhibit("");
        Wigs.exhibit("");
        Fakebeards.exhibit("");
        Mustaches.exhibit("");
        System.out.print(stuffedPoliceman.getLocation() + ", ");
        stuffedPoliceman.equipped("full uniform, a shiny brass helmet on his head, a truncheon in his hand");
        StuffedAnimal.StuffedRobber.printLocation(Locations.IN_THE_LEFT_CORNER);
        StuffedAnimal.StuffedRobber.equipped("a huge pistol in one hand, a hidden electric torch in the other");
        StuffedAnimal.StuffedRobber.equipped("a checkered scarf was tied to his neck, a checkered cap with a wide visor was on his head, the same checkered trousers tightly fitted his legs, and a black mask covered his face");
        stuffedPoliceman.made("with such skill that they could be mistaken for real living short ones");
        StuffedAnimal.StuffedRobber.made("with such skill that they could be mistaken for real living short ones");
        System.out.print("Among these amazing exhibits, ");
        Dunno.notice("the seller", "somehow did not immediately");
        Kozlik.notice("the seller", "somehow did not immediately");
        Seller.hide("the lower half behind the counter");
        Seller.equipped("a gray sweatshirt hiding against the background of a gray wall");
        System.out.print(Time.WHILE_THERE_WAS_NO_ONE_IN_THE_STORE + ", ");
        Seller.stuck(Locations.BEHIND_COUTER, "in the manner of a spider, patiently waiting for a fly to fall into its web");
        System.out.print(Time.RIGHT_AFTER_THE_DOOR_OPENED + ", ");
        Seller.leanedForward();
        Seller.lean("his hands on the counter," , "as if about to jump out from behind him");
        Seller.see("that Dunno and Kozlik stopped in indecision");
        Seller.said(": ...");
    }
}
