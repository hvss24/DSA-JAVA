public class staircasemethod {

    public static void searchInMatrix(int matrix[][],int key){
        int m = matrix.length-1;
        int n = 0;
        while(m>=0 && n<matrix[0].length){
            //condition logic -- loop exits if m<0 as m is increasing each time
            //so we use that condition for m so that m cannot overflow.Similar for n.
            int current = matrix[m][n];
            if(key == current){
                System.out.println("Element found at index :("+m+","+n+")");
                return;
                //use of return instead break -- we use return here because after key
                //found , we have to return from all methods . we don't want that anything
                //executes after that . break just returns from the loop . so, if we use break
                // we will get elemnt position and not found both in case of element is present.
            }
            else if(key > current){
                n = n+1;
            }
            else if(key < current){
                m = m-1;;
            }
        }
        System.out.println("Key not found");    
    }
    public static void main(String args[]){
        int matrix [][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 10;
        searchInMatrix(matrix, key);
    }
}