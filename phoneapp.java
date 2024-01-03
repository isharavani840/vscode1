
import java.util.Scanner;
  interface Telephone{
    void powerOn();
    void dial(Integer phonenumber);
    void answer();
    boolean callPhone(Integer phoneNumber);
    
}
class Deskphone implements Telephone{

     boolean isRinging;
     Integer myNumber;
    public Deskphone(Integer myNumber){
        this.myNumber = myNumber;
    }
    public void powerOn(){
       System.out.println("Desk phone is always powered");
    }
    public void dial(Integer phoneNumber){
       System.out.println("Now ringing" + phoneNumber + "on deskphone");
    }
    public void answer(){
       if(isRinging==true){
        System.out.println("Answering the desk phone");
       }
       else{
        System.out.println("Phone is not ringing");
       }
    }
    public boolean callPhone(Integer phoneNumber){
    
        
        if(phoneNumber == myNumber){
           System.out.println("Phone ringing");
           isRinging = true;
        }else{
            System.out.println("Wrong number");
            isRinging = false;
        }
        return isRinging;
    }
   
}
public class phoneapp{

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter phone number of 6 digits");
    Integer phoneNumber = sc.nextInt();
    Deskphone myphone = new Deskphone(123456);
    myphone.powerOn();
    myphone.callPhone(phoneNumber);
    myphone.answer();
 }
}
