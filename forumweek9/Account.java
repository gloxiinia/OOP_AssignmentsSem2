
public class Account {
    private double balance;

    public Account(){
        this.balance = 0;
    }

    public Account (double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return this.balance;
    }

    //amt = amount?
    public boolean deposit(double amt){
        boolean check = true;
        if(amt >= 0){
            this.balance +=  amt;
        }else{
            check = false;
        }
        return check;
    }

    public boolean withdraw(double amt){
        boolean check = true;
        if(amt >= 0 && this.balance >= amt){
            this.balance -= amt;
        }else{
            check = false;
        }
        return check;
    }

    public static void main(String[] args){
        //testing the class
        Account test = new Account(0);
        System.out.println(test.getBalance());
        System.out.print(test.deposit(200));
        System.out.print('\n');
        System.out.println(test.getBalance());
    }
}
