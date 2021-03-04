package Data;

import java.time.LocalDateTime;

/**
 * Main character. Is stored in the collection.
 */

public class SpaceMarine {
    private long id;
    private String name;
    private Coordinates coordinates;
    private LocalDateTime localDate;
    private double health;
    private AstartesCategory astartesCategory;
    private Weapon weaponType;
    private MeleeWeapon meleeWeapon;
    private Chapter chapter;

    public SpaceMarine(long id, String name, Coordinates coordinates, LocalDateTime localDate, double health, AstartesCategory astartesCategory, Weapon weaponType, MeleeWeapon meleeWeapon,Chapter chapter ) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.localDate = localDate;
        this.health = health;
        this.astartesCategory = astartesCategory;
        this.weaponType = weaponType;
        this.meleeWeapon = meleeWeapon;
        this.chapter = chapter;
    }

    /**
     * @return ID of the marine.
     */
    public long getId() {
        return id;
    }

    /**
     * @return Name of the marine.
     */
    public String getName() {
        return name;
    }

    /**
     * @return Data.Coordinates of the marine.
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * @return Creation date of the marine.
     */
    public LocalDateTime getLocalDate() {
        return localDate;
    }

    /**
     * @return Health of the marine.
     */
    public double getHealth() {
        return health;
    }

    /**
     * @return Category of the marine.
     */
    public AstartesCategory getAstartesCategory() {
        return astartesCategory;
    }

    /**
     * @return Data.Weapon type of the marine.
     */
    public Weapon getWeaponType() {
        return weaponType;
    }

    /**
     * @return Melee weapon of the marine.
     */
    public MeleeWeapon getMeleeWeapon() {
        return meleeWeapon;
    }

    /**
     * @return Data.Chapter of the marine.
     */
    public Chapter getChapter() {
        return chapter;
    }

    @Override
    public String toString() {
        String info = "";
        info += "Солдат №" + id;
        info += "\n(добавлен " + localDate.toLocalDate() + " " + localDate.toLocalTime() + ")";
        info += "\n Имя: " + name;
        info += "\n Местоположение: " + coordinates;
        info += "\n Здоровье: " + health;
        info += "\n Категория: " + astartesCategory;
        info += "\n Дальнее оружие: " + weaponType;
        info += "\n Ближнее оружие: " + meleeWeapon;
        info += "\n Орден: " + chapter;
        return info;
    }
}

