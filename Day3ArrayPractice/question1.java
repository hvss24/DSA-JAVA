package Day3ArrayPractice;

public class question1 {
    public static int numberof7(int matrix[][]){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        System.out.println("Number of 7's in the matrix is : "+numberof7(matrix));    
    }    
}

