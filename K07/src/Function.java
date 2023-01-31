import java.util.*;

public class Function {
    MyObject myObject0 = new MyObject("hans", 25, "Egli");
    MyObject myObject1 = new MyObject("peter", 42, "Barsch");
    MyObject myObject2 = new MyObject("johan", 12, "Lachs");
    MyObject myObject3 = new MyObject("günther", 666, "Forelle");
    MyObject myObject4 = new MyObject("bruno", 412, "Hecht");
    MyObject myObject5 = new MyObject("chrigel", 7, "Rotfeder");

    List<MyObject> objectList = Arrays.asList(myObject0, myObject1, myObject2, myObject3, myObject4, myObject5);

    public void function() {
        InsertionSort insertionSort = new InsertionSort();

        //insertionSort.insertionSort(objectList);
        //insertionSort.insertionSortReverse(objectList);
        objectList.sort(new MyObjectComperator());


        for(MyObject object : objectList){
            System.out.println(object.name);
            System.out.println(object.number);
            System.out.println(object.text);
            System.out.println("\n");

        }
    }
}
