public class User {
    private String name, surname, email, pass, guestEmail;

    public User(String name, String surname, String email, String pass)
    {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.pass=pass;
    }

    public User(String guestEmail)
    {
        this.guestEmail=guestEmail;
    }

}
