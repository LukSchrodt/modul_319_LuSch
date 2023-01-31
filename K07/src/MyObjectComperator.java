import java.util.Comparator;
class MyObjectComperator implements Comparator<MyObject> {
    @Override
    public int compare(MyObject o1, MyObject o2) {

        if (o1.number == o2.number){
            return 0;
        }else if(o1.number < o2.number){
            return 1;
        }else {
            return -1;
        }
    }
}
