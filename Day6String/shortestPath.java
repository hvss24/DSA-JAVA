package Day6String;
public class shortestPath{
    public static void ShortestDirection(String dir){
        int countE = 0;
        int countW = 0;
        int countN = 0;
        int countS = 0;
        // checks for direction.
        for(int i=0; i<dir.length(); i++){
            if(dir.charAt(i) == 'E'){
                countE++;
            }
            else if(dir.charAt(i) == 'W'){
                countW++;
            }
            else if(dir.charAt(i) == 'N'){
                countN++;
            }
            else if(dir.charAt(i) == 'S'){
                countS++;
            }
            else{
                System.out.println("Wrong Direction Input");
                return;
            }
        }
        //calculate  net x-direction
        int x = countE - countW;
        int y = countN - countS;
        double shortestPath = Math.sqrt(x*x + y*y);
        System.out.println("Shortest Path : "+shortestPath);
    }
    public static void main(String args[]){
        String dir = "NS";
        ShortestDirection(dir);
    }
}