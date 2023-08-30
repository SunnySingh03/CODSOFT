import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    public  Game(){
        Random rand = new Random();
        number = rand.nextInt( 100);
        System.out.println("Guess the number between 1 to 100 range :");
    }
    public int computernumber(){
        return number;
    }
}

public class number{
    static int takeuserinput(){
        System.out.println("Enter the number you guessed:");
        Scanner sc =  new Scanner(System.in);
        int user = sc.nextInt();
        return user;
    }

    static void iscorrectnumber(int i, int j){
        if(i==j){
            System.out.println("The number guessed by the user is correct.");
        }
        else if(i>j){
            System.out.println("The number guessed by the user is greater than the number genrated by the computer.");
        }
        else{
            System.out.println("The number guessed by the user is smaller than the number genrated by the computer.");
        }
    }
    public static void main(String[] args){
        int user =0; int number = 0;int itteration = 0;
        Game gg = new Game();
        do{
            user = takeuserinput();
            number = gg.computernumber();
            iscorrectnumber(user,number);
            itteration++;
        }
        while(user!=number);
        System.out.println( "Total number of guesses made by the user to guess the correct number is:"+itteration);
    }
}