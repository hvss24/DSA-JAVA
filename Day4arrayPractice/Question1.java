public class Question1 {
    public static void transposeOfMatrix(int matrix[][]){
        for(int i=0; i<matrix[0].length; i++){//loop condition is such that it will
            for(int j=0; j<matrix.length; j++){//satisfy both square and non-square matrix.
                System.out.print(matrix[j][i]+"  ");  
            }
            System.out.println();
        }  
    }
    public static void main(String args[]){
        int matrix [][] = {{1,2,3,},{4,5,6}};
        transposeOfMatrix(matrix);// the function directly print transpose not changing the main matrix.
    }
}
