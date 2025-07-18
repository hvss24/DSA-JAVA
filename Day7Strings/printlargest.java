public class printlargest{
    public static void largeststring(String fruits[]){
        String largest = fruits[0];
        for(int  i = 1; i<fruits.length; i++){
            if(fruits[i].compareTo(largest)>0){
                largest = fruits[i];
            }
        }
        System.out.println("Largest String by lexographical order is :"+largest);

    }
    public static void main(String args[]){
        String fruits[] = {"mango","banana","papaya", "Pomogranate","grapes",};
        largeststring(fruits);

    }
}