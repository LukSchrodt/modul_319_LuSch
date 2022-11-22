public class DroppableObject {
    String name;
    double maxFallSpeed;
    String selector;
    static double fallSpeed = 9.81;

    //Constructor
    public DroppableObject(String name, double maxFallSpeed, String selector) {
        this.name = name;
        this.maxFallSpeed = maxFallSpeed;
        this.selector = selector;
    }
    //Empty constructor
    public DroppableObject(){}

    public double[] calculateDrop(double maxFallSpeed, double distance){
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

        return new double[]{dropSpeed, dropTime, timeTillMaxSpeed};
    }
}
