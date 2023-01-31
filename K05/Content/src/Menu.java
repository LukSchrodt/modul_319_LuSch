import java.util.ArrayList;
import java.util.List;

public class Menu {
    public void menu(){
        DroppableObject dropObj1 = new DroppableObject("Tisch");
        DroppableObject dropObj2 = new DroppableObject("Katze");
        DroppableObject dropObj3 = new DroppableObject("Feldchötzli");
        DroppableObject[] dropObjList = {dropObj1, dropObj2, dropObj3};
        List<DroppableObject> objectsForContainer = new ArrayList<DroppableObject>();
        objectsForContainer.add(dropObj1);
        objectsForContainer.add(dropObj2);
        Owner owner = new Owner("Hans", "von Bergen", "Male", dropObjList);
        Container container = new Container(objectsForContainer);
        container.add(dropObj3);
        Container[] containers = {container};
        Airplain airplain = new Airplain();
        Airplain airplain2 = new Airplain();
        Airplain[] airplains = {airplain, airplain2};
        Pilot pilot = new Pilot("Jon", "Doe", "Male", "1234-5678-9999-1234");
        pilot.changeName("Josef", "Werner");
        airplain.setFlight(new Flight(containers, pilot));
        Airport airport = new Airport(airplains);
    }
}