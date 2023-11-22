package tr.com.huseyinaydin.record_default_constructor;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java 21.
 *
 */

public class MainApplication {

    public record Person(String name, Integer age) {
        public Person(String name, Integer age) {
            if (name != null && age > 0) {
                this.name = name;
                this.age = age;
            } else {
                throw new IllegalArgumentException("Geçersiz değerler.");
            }
        }
    }

    public static void main(String[] args) {
        var person1 = new Person("Hüseyin", 35);
        var person2 = new Person("Sami", 44);

        System.out.println("Obje\t\t: " + person1);
        System.out.println("Eşitlik?\t\t: " + person1.equals(person2));
        System.out.println("Adı\t\t: " + person1.name());
        System.out.println("Yaşı:\t\t\t: " + person1.age());
        System.out.println("HashCode\t: " + person1.hashCode());

        System.out.println("--------------------------------------");

        System.out.println("Obje\t\t: " + person2);
        System.out.println("Eşitlik?\t\t: " + person2.equals(person1));
        System.out.println("Adı\t\t: " + person2.name());
        System.out.println("Yaşı:\t\t\t: " + person2.age());
        System.out.println("HashCode\t: " + person2.hashCode());
    }
}
