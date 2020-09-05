package Strings;

import com.sun.source.util.SimpleTreeVisitor;

public class practice4 {
    public static void main(String[] args) {

        String email = "cybertek@gmial.com";
        email = email.replace("a", "e");
        System.out.println(email);

        System.out.println("=================================");
        String word = "java";
        word = word.replace("a", "e");

        System.out.println(word);
        System.out.println("=================================");
        String sentence = "I like to  learn Java, Java is cool, Java is fun";
        sentence= sentence.replace("a, Java", "a, C#");
        sentence= sentence.replace("Java", "Python");

        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";

        s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);

        s1=s1.replace("MIT","Cybertek");

        System.out.println(s1);
        System.out.println("=================================");
        String s2 = " I like to leaRn Java, we aRe enjoying Java";

        s2=s2.replace("R","r");//" I like to learn Java"
        s2=s2.replace(" I","I");//"I like to learn Java"
        System.out.println(s2);

        System.out.println("===============================");

        String s3 = "I like to drink tea and tea";
        s3=s3.replaceFirst("tea", "cola");

        System.out.println(s3);

        System.out.println("=================================");

        String s4 = "I like to Watch Game of thrones, and Walking dead";
        s4= s4.replace(", and Walking dead", "");
        System.out.println(s4);

        System.out.println("=================================");






    }
}
