package basics;

public record PersonRecord(String name, Integer age, Double height ) {

    public PersonRecord( String name, Integer age, Double height ) {
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Constructor initialized");
    }

    public String toString() {
        return  "Person with " + name + " with age: " + age + " and with height equals to " + height;
    }
}
