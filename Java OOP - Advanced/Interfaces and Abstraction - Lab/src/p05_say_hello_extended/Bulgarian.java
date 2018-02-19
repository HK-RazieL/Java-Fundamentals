package p05_say_hello_extended;

public class Bulgarian extends BasePerson implements Person{
    Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
