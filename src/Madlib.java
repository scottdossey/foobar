/* 
 * This is my first Java Program
 */
import java.util.Scanner;

public class Madlib
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a name?");              
        String name = input.nextLine();
        
        System.out.println("Give me an adverb?");              
        String adverb = input.nextLine();
        
        System.out.println("Give me an adjective?");              
        String adjective = input.nextLine();
        
        System.out.println("Give me an noun?");              
        String noun = input.nextLine();
        
        System.out.println("Give me another noun?");              
        String nounTwo = input.nextLine();
        
        System.out.println("Give me a number?");                  
        String number = input.nextLine();
        
        System.out.println("Give me another name!");              
        String yourName = input.nextLine();
        
        System.out.printf("Dear %s\n", name);
        
        //Does the same thing:
        //System.out.print("You are "+adverb+" "+adjective+" and I want to be your "+ noun+"!");        
        System.out.printf("You are %s %s and I want to be your %s! ", adverb, adjective, noun);
        
        System.out.printf("I want to go to the %s with you in %s days.\n", nounTwo, number);
        System.out.printf("Sincerely, %s\n", yourName);
    }
}
