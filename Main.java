import java.util.*;


/*This Program is using in memory space for storing Data. */

class Bank{
    public String name;
    public int balance;
    Stack<String> transaction=new Stack<String>();

    Bank(String nam){
        this.name=nam;
        this.balance=100;  /*ON OPENING ACCOUNT BANK IS GIVING 100 RUPEES TO EVERY CUSTOMER */
        this.transaction.push("You Have No Tranaction History Yet");
    }

    /*METHOD TO ADD MONEY TO ACCOUNT */
    public void addMoney(int amount){
        this.balance+=amount;
        System.out.println(this.name+" updated balance is "+this.balance);
        this.transaction.push("+"+amount+" credited");
    }
    /*METHOD TO VIEW BALANCE*/
    public void viewBalance(){
        System.out.println(this.name+" account balance is "+this.balance);
    }
    /*METHOD TO WITHDRAW MONEY FROM ACCOUNT */
    public void withDraw(int amount){
        if(this.balance<amount){
            System.out.println("You have insufficent balance");
            return;
        }
        this.balance-=amount;
        System.out.println(this.name+" updated account balance is "+this.balance);
        this.transaction.push("+"+amount+" debited");
    }
}


public class Main{
    public static void runFunction(String userName){
        Scanner inp=new Scanner(System.in);
        Bank obj1=new Bank(userName);
                    System.out.println("You are logged in succesfully\nPlease Press 1 For viewing Current balance\nPress 2 for to add money\nPress 3 to withdraw money");
                    int var=inp.nextInt();
                    if(var==1){
                        obj1.viewBalance();
                    }
                    else if(var==2){
                        System.out.println("Please Enter the amount You Want to add");
                        int amount=inp.nextInt();
                        obj1.addMoney(amount);
                    }
                    else if(var==3){
                        System.out.println("Please Enter the amount You Want to withraw");
                        int amount=inp.nextInt();
                        obj1.withDraw(amount);
                    }
                    else{
                        System.out.println("You have choosen Wrong option kindly choose option Correctly");
                    }
    }
    public static void main(String args[]) {

        HashMap<String,String> credential=new HashMap<>();
        credential.put("aryanpathak989","123");
        credential.put("Pritim","PritimSikdar@123");
        System.out.println("Hello Customer Press 1 for Existing User\nPress 2 for Creating an account");
        Scanner input=new Scanner(System.in);
        int confirm=input.nextInt();
        if(confirm==1){
                System.out.println("Please enter your username");
                String userName=input.next();
                System.out.println("Please Enter Password");
                String userPassword=input.next();
                String details=credential.get(userName);
                if(details!=null){
                    runFunction(userName);
            }
            else{
                System.out.println("Please enter correct details");
            }
           
            }

            else if(confirm==2){
                System.out.println("Please Enter your account name you want to create");
                String userName=input.next();
                System.out.println("Please Enter your password");
                String userPassword=input.next();
                credential.put(userName, userPassword);
                runFunction(userName);
            }
            else{
                System.out.println("Please choose option correctly");
            }
        }




        /*Bank obj=new Bank("Aryan");
        obj.addMoney(200);
        obj.withDraw(50);
        obj.withDraw(20);
        obj.addMoney(5000);

        System.out.println(obj.transaction);*/
    }