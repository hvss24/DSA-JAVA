public class secondLargest {
    public static void find2ndlargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];    
            }
        }
        if(largest == Integer.MIN_VALUE){
            System.out.println("Empty array.");
            System.out.println("Largest not exist.");
        }else{
            System.out.println("Largest number is : "+largest);

        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.print("Second largest not exist.");
        }else{
        System.out.println(" Second Largest number is : "+secondLargest);
        }       
    }
    public static void main(String args[]){
        int arr[] = {};
        find2ndlargest(arr);
    }
}
