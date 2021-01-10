package lab3;

public class Main {
    public static void main(String[] args) {
        Gun Guns = new Gun("Guns", Locations.ON_SPECIAL_WOODEN_STAND, "unknow", "unknow");

        Weapon Pistol = new Gun("Pistol", Locations.ON_THE_COUNTER, "unknow", "unknow");
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

        PoliceUtensil Rubberelectricbatons = new RubberElectricBaton("Rubber electric batons", Locations.IN_THE_WINDOW, "unknow");
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

        Guns.stand("in orderly rows,");
        System.out.println("");
        Pistol.lay("in exemplary order,");
        Knives.lay("in exemplary order,");
        Finks.lay("in exemplary order,");
        Daggers.lay("in exemplary order,");
        Brushes.lay("in exemplary order,");
        Brassknuckles.lay("in exemplary order,");
        System.out.println("");
        Masterkeys.exhibit("in the showcases illuminated from the inside,");
        Steelfiles.exhibit("in the showcases illuminated from the inside,");
        Drills.exhibit("in the showcases illuminated from the inside,");
        Pliers.exhibit("in the showcases illuminated from the inside,");
        Nippers.exhibit("in the showcases illuminated from the inside,");
        Crowbars.exhibit("in the showcases illuminated from the inside,");
        Crowbarsforbreakinglocks.exhibit("in the showcases illuminated from the inside,");
        Autogenousmachinesforcuttingfireproofcabinets.exhibit("in the showcases illuminated from the inside,");
        Chests.exhibit("in the showcases illuminated from the inside,");
        System.out.println("");
        Rubberelectricbatons.exhibit("above which there was the inscription \"Police Utensils\",");
        Steelhandcuffs.exhibit("above which there was the inscription \"Police Utensils\",");
        Shackles.exhibit("above which there was the inscription \"Police Utensils\",");
        Incendiarybombs.exhibit("above which there was the inscription \"Police Utensils\",");
        Tearbomb.exhibit("above which there was the inscription \"Police Utensils\",");
        Otherpoliceitems.exhibit("above which there was the inscription \"Police Utensils\",");
        System.out.println("");
        Halffacemask.exhibit("");
        Eyemask.exhibit("");
        Fullfacemask.exhibit("");
        Makeup.exhibit("");
        Wigs.exhibit("");
        Fakebeards.exhibit("");
        Mustaches.exhibit("");
        System.out.println("");
    }
}
