import java.util.Date;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        RawProduct rawProduct = new RawProduct("Daging Mentah", true, new Date());
        RawProduct rawProduct2 = new RawProduct("Daging Segar", true, new Date());
        RawProduct rawProduct3 = new RawProduct("Daging Fresh", true, new Date());
        System.out.println(rawProduct);
        System.out.println(rawProduct2);
        System.out.println(rawProduct3);
    }
    
}