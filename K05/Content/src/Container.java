import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Container implements ContainerInterface {
    private List<DroppableObject> droppableObject;
    public Container(List<DroppableObject> droppableObject){
        this.droppableObject=droppableObject;
    }
    public Container(){}

    @Override
    public void add(DroppableObject dropObj) {
        droppableObject.add(dropObj);
    }

    @Override
    public Integer length(Container cont) {
        return cont.droppableObject.size();
    }
}
