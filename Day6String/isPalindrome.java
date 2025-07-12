package Day6String;
public class isPalindrome{
    public static void IfPalindrome(String str){
        boolean palindrome = true;
        for(int i=0; i<str.length()/2; i++){//no need to run the loop till str.length
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
               //not palindrome
               palindrome = false;
               break;//break if one case satisfy it.
            }
        }
        if(palindrome == true){//palindrome
            System.out.println("String is palindrome.");
        }else{
            System.out.println("String is not palindrome.");
        }
    }
    public static void main(String args[]){
        String str = "guru";
        IfPalindrome(str);
    }
}
