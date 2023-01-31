public class Human {
    private String fistName;
    private String lastName;
    private String gender;

    public Human(String fistName, String lastName, String gender) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void changeName(String newFirstName, String newLastName){
        fistName = newFirstName;
        lastName = newLastName;
    }
}
