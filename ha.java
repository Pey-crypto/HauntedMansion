import java.util.Scanner;
class room{
    public void move (int update){
        System.out.println("Moving up");
        update = update+1;
        System.out.println("You are on Floor "+update);
    }
}
class check extends room{
    public int jam(int update){
    if (update <= 0){
        System.out.println("Not permitted");
        return update; 
        
    }
    else{
        System.out.println("Check completed");
    }
    return update;
}
}

class movement extends room{
    public void move(int update){
        System.out.println("Moving Down");
        update = update -1;
        check fix = new check();
        fix.jam(update);
        System.out.println("You are on the Floor"+update);

    }
}
 
class Moving extends room{
    public void move(){
        System.out.println("Moving Left");
    }
}
class Mow extends room{
    public void move(){
        System.out.println("Moving Right");
    }
}


class ha{
    public static void main(String args[]){
        int update = 1;
        while(update <= 10){
            System.out.println("Enter your move");
            Scanner in = new Scanner(System.in);
            String num1 = in.nextLine();
            if(num1.equals("Up")){
                room phase1 = new room();
                phase1.move(update);
            }
            else if(num1.equals("Down")){
                movement phase2 = new movement();
                phase2.move(update);
            }
            else if(num1.equals("Left")){
                Moving phase3 = new Moving();
                phase3.move();
            }
            else if(num1.equals("Right")){
                Mow phase4 =new Mow();
                phase4.move();
            }
            else if(num1.equals("Exit")){
                System.exit(1);
            }
            else{
                System.out.println("Wrong Move.....Try Again");
            }
    }
}
}