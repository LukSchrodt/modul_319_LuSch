public class Owner extends Human{
    public DroppableObject[] droppableObject;

    public Owner(String fistName, String lastName, String gender, DroppableObject[] droppableObject) {
        super(fistName, lastName, gender);
        this.droppableObject = droppableObject;
    }

    @Override
    public void changeName(String newFirstName, String newLastName) {
        super.changeName(newFirstName, newLastName);
    }
}
