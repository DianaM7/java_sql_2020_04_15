package days.fourth;

public class User {
    private String name;
    private String surname;
    public User(String name, String surname){
        this(surname);
        this.name = name;


    }
    public User(String surname){
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
