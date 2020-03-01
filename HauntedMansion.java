import java.util.Scanner;
public class HauntedMansion{
    public static void main(String args[]){
        System.out.println("Intiating World");
        Scanner user_in = new Scanner(System.in);
        System.out.println("Welcome to the Haunted Mansion.There is \nan Exapansive Staircase\n1)Rooms on your left and right");
        System.out.println("\n\n Intially Move up the stairs.....\nType 'Upstairs'\tThen press 'Enter' ");
        System.out.println("\n\nTo move to the left room...\nType left otherwise to the right Type Right");
        int updater = 1;
        while(updater <=10 ){
        String choice = user_in.nextLine();
        if(choice.equals("upstairs")){ 
            System.out.println("You are now upstairs.");
            updater = updater + 1;
         } 
        else if(choice.equals("right"))
            { 
                System.out.println("You are now in the kitchen");
            
            } 
        else if(choice.equals("left"))
        { 
            System.out.println("You are now in the dining room");
         } 
        else if(choice.equals("Exit")){
            System.out.println("Bye Boys");
            System.exit(0);
        }
         else { 
             System.out.println("That was not valid"); 
            }
        }    }
}



