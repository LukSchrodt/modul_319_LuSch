public class Pilot extends Human{
    private String licence;

    public Pilot(String firstName, String lastName, String gender, String licence) {
        super(firstName, lastName, gender);
        this.licence = licence;
    }

    @Override
    public void changeName(String newFirstName, String newLastName) {
        super.changeName(newFirstName, newLastName);
    }
}
