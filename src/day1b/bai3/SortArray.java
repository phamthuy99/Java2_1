package day1b.bai3;

public class SortArray {
    // cho phép sắp xếp tất cả các đối tượng implement comparator
    public<T extends MyComparator<T>>  void printArray(T[] arr){
        System.out.println("Array: ");
        for (int i = 0; i< arr.length ; i++){
            System.out.println(arr[i] + "\t");
        }
        System.out.println();
    }
    public <T extends MyComparator<T>> void sorted(T[] arr){
        for (int i = 0 ; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i].compare(arr[j]) > 0){
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
