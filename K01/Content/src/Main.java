import java.util.Scanner;

public class Main {
    final static double fallSpeed = 9.81;
    public static Scanner sc = new Scanner(System.in);
    public static DropableObject[] objectList = {
            new DropableObject("Human(Normal)", 200, "H1"),
            new DropableObject("Human(Head Down)", 280, "H2"),
            new DropableObject("Cat",97, "C")
    };

    public static void main(String[] args) {
        do {
            DropableObject chosenObject;
            System.out.println("Chose an Object you want to drop by the selector:");
            for (DropableObject o : objectList) {
                System.out.println("Name: " + o.name + "\t Max fall speed: " + o.maxFallSpeed + "\t Selector: " + o.selector);
            }
            switch (sc.nextLine().toLowerCase()) {
                case "c":
                    chosenObject = objectList[2];
                    break;
                case "h2":
                    chosenObject = objectList[1];
                    break;
                case "h1":
                    chosenObject = objectList[0];
                    break;
                default:
                    chosenObject = objectList[0];
            }
            System.out.println("Chosen Object: " + chosenObject.name);
            System.out.print("Enter a drop height you want(In m): ");
            double distance = sc.nextDouble();
            double dropSpeed = calculateDropSpeed(chosenObject.maxFallSpeed, distance);
            double dropTime = calculateDropTime(chosenObject.maxFallSpeed, distance);
            System.out.println("Speed: " + dropSpeed + "\nTime: " + dropTime);

            System.out.println("\n\nPress q to quit or c to continue: ");
            sc = new Scanner(System.in);
        }while (!sc.nextLine().equalsIgnoreCase("q"));
    }

    public static double calculateDropSpeed(double maxFallSpeed, double distance){
        double dropSpeed;
        double dropTime;
        double timeTillMaxSpeed = maxFallSpeed/fallSpeed;
        double dropTimeWithNoLimit = Math.sqrt(distance/fallSpeed*2);
        double distancePassedTillMaxSpeed = ((timeTillMaxSpeed*timeTillMaxSpeed)*fallSpeed*0.5);
        if(dropTimeWithNoLimit > timeTillMaxSpeed){
            dropTime = timeTillMaxSpeed + (distance-distancePassedTillMaxSpeed)/maxFallSpeed;
            dropSpeed = maxFallSpeed;
        }else {
            dropTime = dropTimeWithNoLimit;
            dropSpeed = dropTime*fallSpeed;
        }
        return dropSpeed;
    }
    public static double calculateDropTime(double maxFallSpeed, double distance){
        double dropSpeed;
        double dropTime;
        double timeTillMaxSpeed = maxFallSpeed/fallSpeed;
        double dropTimeWithNoLimit = Math.sqrt(distance/fallSpeed*2);
        double distancePassedTillMaxSpeed = ((timeTillMaxSpeed*timeTillMaxSpeed)*fallSpeed*0.5);
        if(dropTimeWithNoLimit > timeTillMaxSpeed){
            dropTime = timeTillMaxSpeed + (distance-distancePassedTillMaxSpeed)/maxFallSpeed;
            dropSpeed = maxFallSpeed;
        }else {
            dropTime = dropTimeWithNoLimit;
            dropSpeed = dropTime*fallSpeed;
        }
        return dropTime;
    }
}