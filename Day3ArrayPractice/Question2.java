package Day3ArrayPractice;

public class Question2 {
    public static int sumOfSecondRow(int matrix[][]){
        int sum = 0;
            if(matrix.length<2){
                return 0;
            }
            for(int j = 0; j<matrix[1].length; j++){
                sum += matrix[1][j];
            }
            return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("Sum of numbers in the second row is : "+sumOfSecondRow(matrix));
    }
}
