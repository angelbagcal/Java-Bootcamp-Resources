import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        
        //set up scanner. 
        Scanner scnr = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String userName = scnr.nextLine();

        System.out.println();                
        //add new a line before asking next question. 
        System.out.printf("Hi %s! I'm Javabot. Where are you from?\n", userName);
        //Pick up user's home and store it. 
        String userHome = scnr.nextLine();
                        
        System.out.println();
        //add new a line before asking next question.
        System.out.printf("I hear it's beautiful at %s! I'm from a place called Oracle", userHome);
        System.out.println("How old are you?\n");
        //Pick up age and store it.
        int userAge = scnr.nextInt();
        System.out.println();


        //add new a line before asking next question.
        System.out.printf("So you're %d, cool! I'm 400 years old.", userAge);
        
        int chatBotAge = 400/userAge;
        
        System.out.printf("This means I'm %d times older than you.", chatBotAge);
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        String language = scnr.next();
        System.out.println();

        //add new a line here.
        System.out.printf("%s, that's great! Nice chatting with you %s. I have to log off now. See ya!", language, userName);

        scnr.close();
        //close scanner. 

        
    }
}
