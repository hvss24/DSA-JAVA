package Day9String;
public class uppercaseFirstLetter{
    public static String upperCaseFirstLetter(String Sentence){
            //char is a primitive data type in Java, and primitive types do not have 
            //methods associated with them. Methods, such as toUpperCase(), can only be
            //invoked on objects.To convert a char to its uppercase equivalent, the
            //static method Character.toUpperCase() should be used. 
            StringBuilder Senetence2 = new StringBuilder("");
            char ch = Character.toUpperCase(Sentence.charAt(0));
            Senetence2.append(ch);
            
            for(int i=1; i<Sentence.length(); i++){
                if(Sentence.charAt(i) == ' ' && i+1<Sentence.length()){//after the space change the letter to uppercase.
                    Senetence2.append(Sentence.charAt(i));
                    i++;
                    Senetence2.append(Character.toUpperCase(Sentence.charAt(i)));
                }
                else{//other words remains same.
                    Senetence2.append(Sentence.charAt(i));
                }
            }
            return Senetence2.toString();

    }
    public static void main(String[] args) {
        String Sentence = "hello WORLD.";
        System.out.println(upperCaseFirstLetter(Sentence));   
    }
}
