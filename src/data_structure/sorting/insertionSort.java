package data_structure.sorting;

public class insertionSort {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = {7 , 3 , 2 , 6, 4 , 5 , 1 , -1};
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                System.out.print("arr[i] : " + arr[i]);
                System.out.println(" === arr[j] : " + arr[j]);
                count++;
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                }
            }
        }

        for(int i=0; i<arr.length-1; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(count);
    }
}
