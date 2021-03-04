import java.io.*;
import java.io.FileReader;
import java.text.CollationElementIterator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Hashtable;
import java.util.List;

import Data.*;
import org.apache.commons.csv.*;

/**
 * @author MinhHieu.
 * This class to read and parse file csv.
 */

public class FileParser {
    static Hashtable<Long, SpaceMarine> collection = new Hashtable<Long, SpaceMarine>();
    public FileParser(String s) throws IOException {
        FileReader in = new FileReader(s);
        String input = "";
        int i;
        while((i=in.read())!=-1)
            input += String.valueOf((char)i);
        CSVParser p = CSVParser.parse(input,CSVFormat.DEFAULT);
        //System.out.println(input);
        List<CSVRecord> re = p.getRecords();
        //System.out.println(re.get(0).get(3));
        //System.out.println(re.get(1).get(3));
        Hashtable<Long, SpaceMarine> collection = new Hashtable<Long, SpaceMarine>();
        for (CSVRecord a: re) {
            if (a.get(0)=="id") break;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDateTime dateTime = LocalDateTime.parse(a.get(4), formatter);
            Coordinates coordinates = new Coordinates(Integer.parseInt(a.get(2)), Long.parseLong(a.get(3)));
            Chapter chapter = new Chapter(a.get(9), a.get(10));
            SpaceMarine space = new SpaceMarine(Long.parseLong(a.get(0)),a.get(1),coordinates, dateTime, Double.parseDouble(a.get(5)), AstartesCategory.valueOf(a.get(6).toUpperCase()), Weapon.valueOf(a.get(7).toUpperCase()), MeleeWeapon.valueOf(a.get(8).toUpperCase()), chapter);
            collection.put(Long.parseLong(a.get(0)),space);
        }
        CollectionManager manager = new CollectionManager();
    }
}

