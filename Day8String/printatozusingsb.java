package Day8String;
public class printatozusingsb{
public static void main(String args[]){
    StringBuilder str = new StringBuilder("");
    for(char ch='a'; ch<='z' ; ch++){
        str.append(ch);
    }
    System.out.println(str.length());
}
}