import java.util.List;

public class InsertionSort {
    void insertionSort(List<MyObject> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            MyObject key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j).number > key.number) {
                arr.set(j+1,arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
    }

    void insertionSortReverse(List<MyObject> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            MyObject key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j).number < key.number) {
                arr.set(j+1,arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
    }
}
