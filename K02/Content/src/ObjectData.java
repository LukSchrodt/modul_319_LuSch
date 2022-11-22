public class ObjectData {
    private DroppableObject[] objectList = {
            new DroppableObject("Human(Normal)", 200, "H1"),
            new DroppableObject("Human(Head Down)", 280, "H2"),
            new DroppableObject("Cat",97, "C"),
            new DroppableObject("Suitcase", 800, "S")
    };

    public DroppableObject[] getObjectList() {
        return objectList;
    }

    public void setObjectList(DroppableObject[] objectList) {
        this.objectList = objectList;
    }
}
