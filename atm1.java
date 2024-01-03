import java.util.Scanner;
class ATM{
    float balance;
    int pin = 5674;
    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==pin)
        {
            menu();

        }
        else{
            System.out.println("Enter valid pin");
        }
    }
    
     public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt==4){
            //System.out.println("Enter from 1 to 3 to perform operations");
             return;
        }
        else{
            System.out.println("Enter a valid number");
        }
         /*void checkBalance(){
            SSystem.out.println("Balance: " + balance);
        }*/
    }
    public void checkBalance(){
            System.out.println("Balance: " + balance);
            menu();
        }
    public void withdrawMoney(){
            System.out.println("Enter amount to withdraw");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if(amount>balance){
                System.out.println("Insufficient Balance");
            }
            else{
                balance = balance - amount;
                System.out.println("Money Withdrawl Successful");
            }
            menu();

        }
    public void depositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited Successfully");
    }
  
}
 public class atm1 {
 public static void main(String[]args){
    ATM ob = new ATM();
    ob.checkpin();

 }
}
