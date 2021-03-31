import java.io.IOException;

public class Main {
    static String file;
    public static void main(String[] args) throws IOException {
        try{
            file = args[0];
            FileParserCSV read = new FileParserCSV(file);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.exit(0);
        }
    }
}
