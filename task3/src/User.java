public class User {

    private String name, lastName, email, password, typeOfAccount;

    public User(String email) {
        this.email = email;
        this.password = null;
        this.name = null;
        this.lastName = null;
        this.typeOfAccount = "Guest";
    }

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.lastName = surname;
        this.email = email;
        this.password = password;
        this.typeOfAccount = "Normal Account";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String surname) {
        this.lastName = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public void isRegistered() {
        if (typeOfAccount == "Guest") {
            System.out.println("User with this email: " + "'" + email + "'" + " is registered as a guest");
        } else {
            System.out.println("User with this email: " + "'" + email + "'"  + " is registered as a normal account");
        }
    }

    void upgradeToNormal() {
        if (typeOfAccount == "Guest") {
            this.password = "newPass";
            this.name = "newName";
            this.lastName = "newSurname";
            this.typeOfAccount = "Normal account";
        } else {
            System.out.println("You are already registered");
        }
    }

}