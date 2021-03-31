import java.util.Comparator;


/**
 * Compare the weapon of space marine
 */
public class WeaponComparator implements Comparator<SpaceMarine> {
    @Override
    public int compare(SpaceMarine a,SpaceMarine b) {
        return b.getWeaponType().compareTo(a.getWeaponType());
    }
}
