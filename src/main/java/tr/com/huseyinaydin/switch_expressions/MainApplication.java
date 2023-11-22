package tr.com.huseyinaydin.switch_expressions;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java 21.
 *
 */

public class MainApplication {

    public enum SingleUsePlastic {
        SPOON, FORK, BOTTLE, CUP
    }

    public int calculateDamageToPlanet(SingleUsePlastic plastic) {
        return switch (plastic) {
            case BOTTLE -> 100; //şişeyse 100 hasar point ):
            case FORK, CUP -> 20; //çatal yahut bardak 20 hasar point ):
            case SPOON -> { //kaşıksa 30 hasar point ):
                int temp = 10;
                yield 30;
            }
            default -> 0; //hiç biri değilse 0 hasar point (:
        };
    }

    public static void main(String[] args) {
        MainApplication obj = new MainApplication();
        System.out.println(obj.calculateDamageToPlanet(SingleUsePlastic.SPOON));
    }
}