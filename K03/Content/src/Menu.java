import java.util.Scanner;

public class Menu {
    final DroppableObject dropableObject = new DroppableObject();
    final ObjectData objectData = new ObjectData();
    final ExceptionHandler exh = new ExceptionHandler();

    //Constructor
    public Menu(){}

    public void input () {
        do {
            DroppableObject chosenObject;
            System.out.println("Chose an Object you want to drop by the selector:");
            for (DroppableObject o : objectData.getObjectList()) {
                System.out.println("Name: " + o.name + "\t Max fall speed: " + o.maxFallSpeed + "\t Selector: " + o.selector);
            }
            switch (exh.selectorInput()) {
                case "c" -> chosenObject = objectData.getObjectList()[2];
                case "h2" -> chosenObject = objectData.getObjectList()[1];
                case "h1" -> chosenObject = objectData.getObjectList()[0];
                case "s" -> chosenObject = objectData.getObjectList()[3];
                default -> {
                    chosenObject = null;
                    System.exit(0);
                }
            }
            System.out.println("Chosen Object: " + chosenObject.name);
            System.out.print("Enter a drop height you want(In m): ");
            double distance = exh.doubleInput();
            double[] dropData = dropableObject.calculateDrop(chosenObject.maxFallSpeed, distance);
            System.out.println("Speed(in m/s): " + dropData[0] + "\nTime(in s): " + dropData[2] + "\nTime till max speed(in s)" + dropData[1]);
            System.out.println("\n\nPress q to quit or c to continue: ");
        }while (exh.quitOrContinueInput());
    }
}
