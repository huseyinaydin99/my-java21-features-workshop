package tr.com.huseyinaydin.record_generics;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java 21.
 *
 */

class Department {
    public Department() {
        System.out.println("class Department");
    }
}

record Person<T>(T info, String name, Integer age, double length, double weight) {
    public Person {
        System.out.println("record Person hazırlandı");
    }
}

public class MainApplication {
    public static void main(String[] args) {
        Person<Department> person = new Person<>(new Department(), "Hüseyin", 29, 1.82, 104);
        System.out.println(person);
    }
}