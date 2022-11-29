public class Menu {
    DroppableObject dropObj1 = new DroppableObject();
    DroppableObject dropObj2 = new DroppableObject();
    DroppableObject dropObj3 = new DroppableObject();
    DroppableObject[] dropObjList = {dropObj1, dropObj2, dropObj3};
    DroppableObject[] objectsForContainer = {dropObj1, dropObj3};
    Owner owner = new Owner(dropObjList);
    Container container = new Container(objectsForContainer);
    Container[] containers = {container};
    Flight flight = new Flight(containers);

    public void menu(){
        System.out.println("Owner: "+ owner);
    }
}
