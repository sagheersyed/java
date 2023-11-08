package data_structure.sorting;
public class BubbleSort {

    public static int[] bubbleSorts(int arr[]) {
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr [] = {9 , 5 , 4 , 0 , -1 , 99}; // 9 > 5 true 5 , 9 
        
        int sortedArray [] = bubbleSorts(arr);
        for(int i=0; i<sortedArray.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
