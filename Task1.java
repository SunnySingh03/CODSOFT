import java.util.Scanner;

class ATM{
    float balance;
    int PIN;

    public ATM(int PIN,float balance){
        this.PIN = PIN;
        this.balance = balance;
    }

    public void checkpin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin :");
        int Correctpin = sc.nextInt();
        if(Correctpin == PIN){
            menu();
        }
        else{
            System.out.println("Invalid pin");
            checkpin();
        }
        
    }

    public void menu(){
        System.out.println("Enter your choice :");
        System.out.println("Enter 1 to check the balance in the ATM.");
        System.out.println("Enter 2 to deposit the cash in the ATM.");
        System.out.println("Enter 3 to withdrawl cash from the ATM.");
        System.out.println("Enter 4 to exit from the ATM.");

        Scanner sc = new Scanner(System.in);
        int Choice = sc.nextInt();

        if(Choice==1){
            checkbalance();
        }
        else if (Choice==2){
            depositcash();
        }
        else if(Choice==3){
            withdrawlcash();
        }
        else if(Choice==4){
            System.out.println("Thankyou for using the ATM, Have a nice day.");
        }
        else{
            System.out.println("Enter the valid choice.");
            menu();
        }
    }

    public void checkbalance(){
        System.out.println("The current balance in your account is :"+balance);
        menu();
    }
    public void depositcash(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit in the ATM.");
        float amount = sc.nextFloat();
        balance = balance+amount;
        System.out.println("Cash deposited successfully,Available balance is:"+balance);
        menu();
    }
    public void withdrawlcash(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the amount to withdraw from the ATM.");
        float amount = sc.nextFloat();
        if(amount>balance){
            System.out.println("Unable to withdraw cash due insufficient balance in your account .");
        }
        else{
            balance = balance - amount;
            System.out.println("Cash withrawl successfully,Available balance is:"+balance);
        }
        menu();
    }
}
public class Task1{
    public static void main(String[] args) {
        ATM SBI = new ATM(9753,3000);
        SBI.checkpin();
    }
}


