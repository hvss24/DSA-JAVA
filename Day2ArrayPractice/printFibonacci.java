public class printFibonacci{
    //fibonacci series is series where each number is sum of two preceding numbers.
    public static void fibanacciSeries(int n){
        int first = 0;
        if(n >= 1){
            System.out.print(first+" ");
        }
        int second = 1;
        if(n >= 2){
            System.out.print(second+" ");
        }
        for(int i = 3 ; i <= n ; i++){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        fibanacciSeries(6);
    }    
}