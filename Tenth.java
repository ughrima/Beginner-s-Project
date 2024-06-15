import java.util.Arrays;

public class Tenth {

    // Bubble sort
    public static void bubbleSort(int[] arr, int n){
        int flag;
        for(int i=0;i<n-1;i++){
            flag=0;
            for(int j=0;j<n-1-i;j++){

                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag++;
                }
               }
               if(flag==0) break; 
        } 
    }


    //  Selection Sort

    public static void selectionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]) min=j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
    }
}
    

     // Quick Sort
     public static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, h);
        }
    }
     public static int  partition(int[] arr, int l, int h){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
        while (i < h && arr[i] <= pivot) {
            i++;
        }
        while (arr[j] > pivot) {
            j--;
        }
        if (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[l];
    arr[l] = arr[j];
    arr[j] = temp;
    return j;
     }
     

    // Merge Sort
    public static void mergeSort(int[] arr, int l, int h){
        if(l<h){
           int mid=(l+h)/2;
           mergeSort(arr,l,mid);
           mergeSort(arr,mid+1, h);
           merge(arr,l,mid,h);
        }
    }
    public static void merge(int[] arr, int l, int m,int h){
        int n1=m-l+1;
        int n2=h-m;
        
        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+j+1];
        }
        
        int i=0, j=0,k=l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }




    public static void main(String[] args) {
        int[] arr ={53, 27, 85, 14, 67, 32, 91, 45, 60, 78, 29, 84, 11, 22, 49};

        System.out.println("Original unsorted array: "+ Arrays.toString(arr));

        System.out.println("Sorting...");

        // Bubble Sort
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        long startTime = System.nanoTime();
        bubbleSort(arr1, arr1.length);
        long endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;
        System.out.println("Bubble Sort : " + Arrays.toString(arr1));
        System.out.println("Time taken by Bubble Sort: " + bubbleSortTime + " nanoseconds");

        // Selection Sort
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        startTime = System.nanoTime();
        selectionSort(arr4, arr4.length);
        endTime = System.nanoTime();
        long selectionSortTime = endTime - startTime;
        System.out.println("Selection Sort : " + Arrays.toString(arr4));
        System.out.println("Time taken by Selection Sort: " + selectionSortTime + " nanoseconds");

        // Quick Sort
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        startTime = System.nanoTime();
        quickSort(arr2, 0, arr2.length - 1);
        endTime = System.nanoTime();
        long quickSortTime = endTime - startTime;
        System.out.println("Quick Sort : " + Arrays.toString(arr2));
        System.out.println("Time taken by Quick Sort: " + quickSortTime + " nanoseconds");

        // Merge Sort
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        startTime = System.nanoTime();
        mergeSort(arr3, 0, arr3.length - 1);
        endTime = System.nanoTime();
        long mergeSortTime = endTime - startTime;
        System.out.println("Merge Sort : " + Arrays.toString(arr3));
        System.out.println("Time taken by Merge Sort: " + mergeSortTime + " nanoseconds");
    }
}
