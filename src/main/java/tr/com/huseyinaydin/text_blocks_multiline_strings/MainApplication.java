package tr.com.huseyinaydin.text_blocks_multiline_strings;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java 21.
 *
 */

public class MainApplication {
    public static void main(String[] args) {
        String myJSON = "{\n" +
                "    \"ad\": \"Hüseyin\",\n" +
                "    \"kullaniciadi\": \"huseyin99\",\n" +
                "    \"rolu\": [\"user\"],\n" +
                "    \"sifre\": \"toor_\"\n" +
                "}";

        System.out.println(myJSON);

        System.out.println("--------------------------------------");

        String myJSON2 = """
                {
                    "ad": "Hüseyin",
                    "kullaniciadi": "huseyin99",
                    "rolu": ["user"],
                    "sifre": "123456789"
                }
                """;
        System.out.println(myJSON2);
    }
}