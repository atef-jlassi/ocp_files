package a.chapter.one;
import java.util.Random;
public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random(); // DOES NOT COMPILE IF WE REMOVE IMPORTS
        System.out.println(r.nextInt(10));
    }
}
