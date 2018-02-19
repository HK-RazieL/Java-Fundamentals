package p05_say_hello_extended;

public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
