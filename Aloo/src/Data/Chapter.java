package Data;

/**
 * Data.Chapter with marines.
 */

public class Chapter {
    private String name;
    private String world;

    public Chapter(String name, String world){
        this.name = name;
        this.world = world;
    }

    /**
     * @return Name of the chapter.
     */
    public String getName() {
        return name;
    }

    /**
     * @return World of the chapter.
     */
    public String getWorld() {
        return world;
    }

    @Override
    public String toString() {
        return name + world ;
    }
}
