import Data.*;

import java.io.File;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Hashtable;
import java.util.Scanner;

public class CollectionManager {
    private String userCommand = "";
    private String[] splitedUserCommand = new String[2];

    public CollectionManager () {
        executeCommand();
    }
    public void executeCommand() {
        Scanner commandReader = new Scanner(System.in);
        //splitedUserCommand[0] is command, splitedUserCommand[1] is parameter
        String command = commandReader.nextLine();
        while (!command.equals("exit")) {
            splitedUserCommand = command.trim().split(" ", 2);
            try {
                switch (splitedUserCommand[0]) {
                    case "":
                        break;
                    case "help":
                        help();
                        break;
                    case "update":
                        update(splitedUserCommand[1]);
                        break;

                    default:
                        System.out.println("Unidentified command. Type \'help\' for help. :(");
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Argument missing.");
            }
        }
    }
    void help() {
        System.out.println("help : вывести справку по доступным командам\n" +
                "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                "insert null {element} : добавить новый элемент с заданным ключом\n" +
                "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                "remove_key null : удалить элемент из коллекции по его ключу\n" +
                "clear : очистить коллекцию\n" +
                "save : сохранить коллекцию в файл\n" +
                "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                "exit : завершить программу (без сохранения в файл)\n" +
                "remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный\n" +
                "replace_if_greater null {element} : заменить значение по ключу, если новое значение больше старого\n" +
                "remove_greater_key null : удалить из коллекции все элементы, ключ которых превышает заданный\n" +
                "remove_all_by_melee_weapon meleeWeapon : удалить из коллекции все элементы, значение поля meleeWeapon которого эквивалентно заданному\n" +
                "sum_of_health : вывести сумму значений поля health для всех элементов коллекции\n" +
                "print_field_descending_weapon_type : вывести значения поля weaponType всех элементов в порядке убывания");
    }
    void update(String id) {
        if (FileParser.collection.get(Long.parseLong(id))!=null) {
            setData(FileParser.collection.get(Long.parseLong(id)));
        } else {
            System.out.println("can't find ");
        }
    }
    private void setData(SpaceMarine s) {
        Scanner commandReader = new Scanner(System.in);

        String name = "";
        Coordinates coordinates = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime = null;
        Integer health = Integer.parseInt(null);
        AstartesCategory astartesCategory = null;
        Weapon weaponType = null;
        MeleeWeapon meleeWeapon = null;
        Chapter chapter = null;


        while (name == "") {
            System.out.println("name (can't be empty): ");
            name = commandReader.nextLine();
        }
        while (coordinates == null) {
            System.out.println("coordinates (can't be empty, format \"x y\", x integer, y long: ");
            String[] c = commandReader.nextLine().trim().split(" ",2);
            try {
                coordinates = new Coordinates(Integer.parseInt(c[0]), Long.parseLong(c[1]));
            } catch (NumberFormatException ex) {
                System.out.println("Wrong number format");
                coordinates = null;
            }
        }
        while (dateTime == null) {
            try {
                dateTime = LocalDateTime.parse(commandReader.nextLine().trim(), formatter);
            } catch (DateTimeParseException ex) {
                System.out.println("Wrong date format");
                dateTime = null;
            }
        }
        while (health == null) {
            System.out.println("height (can't be empty, larger than 0): ");
            try{
                health = (Integer.parseInt(commandReader.nextLine().trim()));
            } catch (NumberFormatException ex) {
                System.out.println("Wrong number format");
                health = null;
            }
        }
        while (astartesCategory == null) {
            System.out.println("Astartes category (should be DREADNOUGHT, AGGRESSOR, ASSAULT, TACTICAL): ");
            try{
                astartesCategory = AstartesCategory.valueOf(commandReader.nextLine().trim().toUpperCase());
            } catch(IllegalArgumentException ex) {
                System.out.println("Wrong astartes category format");
                astartesCategory = null;
            }
        }
        while (weaponType == null) {
            System.out.println("Weapon type (should be MELTAGUN, COMBI_FLAMER, PLASMA_GUN, FLAMER): ");
            try{
                weaponType = weaponType.valueOf(commandReader.nextLine().trim().toUpperCase());
            } catch(IllegalArgumentException ex) {
                System.out.println("Wrong weapon type format");
                weaponType = null;
            }
        }
        while (meleeWeapon == null) {
            System.out.println("Weapon type (should be POWER_SWORD, MANREAPER, LIGHTING_CLAW, POWER_BLADE, POWER_FIST): ");
            try{
                meleeWeapon = meleeWeapon.valueOf(commandReader.nextLine().trim().toUpperCase());
            } catch(IllegalArgumentException ex) {
                System.out.println("Wrong weapon type format");
                meleeWeapon = null;
            }
        }
        while (chapter == null) {
            System.out.println("Chapter (can't be empty, format \\\"name world\\\", name : string, world : string) : ");
            String[] c = commandReader.nextLine().trim().split(" ",2);
            chapter = new Chapter(c[0], c[1]);
        }

        FileParser.collection.put(s.getId(),new SpaceMarine(s.getId(),name,coordinates,dateTime,health,astartesCategory,weaponType,meleeWeapon,chapter));
    }
}
