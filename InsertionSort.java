class InsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int k = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > k ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = k;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] a1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:a1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(a1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:a1){    
            System.out.print(i+" ");    
        }    
    }    
}