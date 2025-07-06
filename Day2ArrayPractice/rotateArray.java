public class rotateArray {
    public static void printRotatedArray(int arr[],int key){
        if(arr.length == 0){
            System.out.println("Empty Array.");
            return;
        }
        else if(key<0 || key>arr.length-1){
            System.out.println("Invalid key.");
            return;
        }
        // key is the index from where array is rotated
        for(int i=key ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }// it will print from key to last element.
        for(int i = 0 ; i<key ; i++){
            System.out.print(arr[i]+" ");
        }// it will print from 0 index to key-1.
        System.out.println();
    } 
    public static void main(String args[]){
        int arr[] = {2};
        int key = -1;
        printRotatedArray(arr, key);
    }
}
