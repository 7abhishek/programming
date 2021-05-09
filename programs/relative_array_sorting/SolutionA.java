import java.util.*;

class SolutionA {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {                
        int i = 0;
        for (int o : arr2) {            
            int j = i + 1;       
            while(i < arr1.length && j < arr1.length) {
                if(arr1[i] == o) {
                    i++;
                    j = i + 1;
                    continue;
                } 
                
                if (arr1[i] != o && arr1[j] == o) {                                    
                    swap(arr1, i, j);                  
                    i++;
                }                
                j++;
            }
        }
        
        if (i < arr1.length) {
             Arrays.sort(arr1, i, arr1.length);
        }
        return arr1;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;  
    }
    
    private void show(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
