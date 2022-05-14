
import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<>();
    private int numberOfCustomers;
    private String bankName;
    

    public Bank(String bName){
        this.bankName = bName;
    }

    public void addCustomer(String f, String l){
        Account acc = new Account(0);
        Customer customer = new Customer(f, l);
        customer.setAccount(acc);
        this.customers.add(customer);
    }
    public void addCustomerMiddle(String f, String m, String l){
        Account acc2 = new Account(0);
        Customer customer2= new Customer(f, m, l);
        customer2.setAccount(acc2);
        this.customers.add(customer2);
    }

    public void setBankName(String bName){
        this.bankName = bName;
    }
    
    public String getBankName(String bName){
        return this.bankName;
    }

    public int getNumOfCustomers(){
        this.numberOfCustomers = customers.size();
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customers.get(index);
    }

    public String capitalizeString(String lower){
        String output = lower.substring(0, 1).toUpperCase()  + lower.substring(1);
        return output;
    }

    public ArrayList<Integer> accountExist(String fName, String lName){
        ArrayList<Integer> check9 = new ArrayList<Integer>();
        check9.add(0);
        Integer indexNum9;
        for(int i = 0; i < getNumOfCustomers(); i++){
            if(lName.equals(customers.get(i).getLastName()) && fName.equals(customers.get(i).getFirstName())){
                check9.set(0, 1);
                indexNum9 = i;
                check9.add(indexNum9);
                return check9;
            }   
        }
        return check9;
    }

    public ArrayList<Integer> accountExistM(String fName, String mName, String lName){
        ArrayList<Integer> check10 = new ArrayList<Integer>();
        check10.add(0);
        Integer indexNum10;
        for(int i = 0; i < getNumOfCustomers(); i++){
            if(lName.equals(customers.get(i).getLastName()) && mName.equals(customers.get(i).getMiddleName()) && fName.equals(customers.get(i).getFirstName())){
                check10.set(0, 1);
                indexNum10 = i;
                check10.add(indexNum10);
                return check10;
            }
        } 
        return check10;
    }

    public void printCustomer(String fName, String lName, ArrayList<Integer> check){
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
        if(check.get(0) == 1){
            int indexNum = check.get(1);
            System.out.println(customers.get(indexNum));
            System.out.println("First Name           : "+ capitalizeString(customers.get(indexNum).getFirstName()));
            System.out.println("Last Name            : "+ capitalizeString(customers.get(indexNum).getLastName()));
            System.out.println("Current Balance      : "+ customers.get(indexNum).getAccount().getBalance() + " credits\n");
        }else{
            System.out.println("\nSorry, but that account doesn't exist, or you've entered it incorrectly.\n");
        }
    }

    public void printCustomerM(String fName, String mName, String lName, ArrayList<Integer> check2){
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
        if(check2.get(0) == 1){
            int indexNum2 = check2.get(1);
            System.out.println(customers.get(indexNum2));
            System.out.println("First Name           : "+ capitalizeString(customers.get(indexNum2).getFirstName()));
            System.out.println("Middle Name          : "+ capitalizeString(customers.get(indexNum2).getMiddleName()));
            System.out.println("Last Name            : "+ capitalizeString(customers.get(indexNum2).getLastName()));
            System.out.println("Current Balance      : "+ customers.get(indexNum2).getAccount().getBalance() + " credits\n");
        }else{
            System.out.println("Sorry, but that account doesn't exist, or you've entered it incorrectly.\n");
        }
    }

    public void printAllCustomerList(){
        if(getNumOfCustomers() > 0){
            System.out.println("The current number of registered accounts is " + getNumOfCustomers() + "\n");
            for(int i = 0; i < getNumOfCustomers(); i++){
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.println(customers.get(i));
                System.out.println("First Name           : " + capitalizeString(customers.get(i).getFirstName()));
                if(customers.get(i).getMiddleName() != null){ 
                    System.out.println("Middle Name          : " + capitalizeString(customers.get(i).getMiddleName()));
                }
                System.out.println("Last Name            : "+ capitalizeString(customers.get(i).getLastName()) + '\n');
            }
        }else{
            System.out.println("There are currently no registered accounts in the bank. ");
        }

    }

    public void removeAcc(String fName, String lName, ArrayList<Integer> check7){
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
        if(check7.get(0) == 1){
            int indexNum7 = check7.get(1);
            System.out.println("You have successfully deleted the following account:\n");
            printCustomer(fName, lName, check7);
            customers.remove(indexNum7);

        }else{
            System.out.println("Sorry, but that account doesn't exist, or you've entered it incorrectly.\n");
        }
    }

    public void removeAccM(String fName, String mName, String lName, ArrayList<Integer> check8){
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
        if(check8.get(0) == 1){
            int indexNum8 = check8.get(1);
            System.out.println("You have successfully deleted the following account:\n");
            printCustomerM(fName, mName, lName, check8);
            customers.remove(indexNum8);

        }else{
            System.out.println("Sorry, but that account doesn't exist, or you've entered it incorrectly.\n");
        }
    }

    public boolean editCash(String fName, String lName, double amount, boolean isDeposit, ArrayList<Integer> check3){
        boolean test = false;
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");

        if(isDeposit == true){
            if(check3.get(0) == 1){
                int indexNum3 = check3.get(1);
                test = customers.get(indexNum3).getAccount().deposit(amount);
                if(test == true){
                    System.out.println("You have successfully deposited " + amount + " credits to the following account:\n");
                    printCustomer(fName, lName, check3);
                }else{
                    System.out.println("The deposit was unsuccesful. Please recheck if you've inserted the correct amount.");
                    return test;
                }
            }else{
                System.out.println("Sorry, but that account doesn't exist, or you've entered it incorrectly.\n");
            }
        }else{
            if(check3.get(0) == 1){
                int indexNum3 = check3.get(1);
                test = customers.get(indexNum3).getAccount().withdraw(amount);
                if(test == true && amount == 0){
                    System.out.println("The withdrawal was unsuccesful. No credits were withdrawn, please enter an amount larger than 0.\n");
                    return test;
                }
                if(test == true){
                    System.out.println("You have successfully withdrawn " + amount + " credits from the following account:\n");
                    printCustomer(fName, lName, check3);
                }else{
                    System.out.println("The withdrawal was unsuccesful. Please recheck if you've inserted the correct amount.");
                    return test;
                }
            }else{
                System.out.println("Sorry, but that account doesn't exist, or you've entered it incorrectly.\n");
            }
        }
        return test;
    }

    public boolean editCashM(String fName, String mName, String lName, double amount, boolean isDeposit, ArrayList<Integer> check4){
        boolean test2 = false;
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");

        if(isDeposit == true){
            if(check4.get(0) == 1){
                int indexNum4 = check4.get(1);
                test2 = customers.get(indexNum4).getAccount().deposit(amount);
                if(test2 == true){
                    System.out.println("You have successfully deposited " + amount + " credits to the following account:\n");
                    printCustomerM(fName, mName, lName, check4);
                }else{
                    System.out.println("The deposit was unsuccesful. Please recheck if you've inserted the correct amount.\n");
                    return test2;
                }
            }else{
                System.out.println("Sorry, but that account doesn't exist, or you've entered it incorrectly.\n");
            }

        }else{
            if(check4.get(0) == 1){
                int indexNum4 = check4.get(1);
                test2 = customers.get(indexNum4).getAccount().withdraw(amount);
                if (test2 == true && amount == 0){
                    System.out.println("The withdrawal was unsuccesful. No credits were withdrawn, please enter an amount larger than 0.\n");
                    return test2;
                }if(test2 == true){
                    System.out.println("You have successfully withdrawn " + amount + " credits from the following account:\n");
                    printCustomerM(fName,mName, lName, check4);
                }
                else{
                    System.out.println("The withdrawal was unsuccesful. Please recheck if you've inserted the correct amount.\n");
                    return test2;
                }
            }else{
                System.out.println("Sorry, but that account doesn't exist, or you've entered it incorrectly.\n");
            }
        }
        return test2;
    }

    public static void main(String[] args){
        //testing the methods
        Bank bank1 = new Bank("test");
        bank1.addCustomer("Mario", "Lopez");
        bank1.accountExist("Mario", "Lopez");
        bank1.addCustomerMiddle("Effie", "Mario", "Smith");
        bank1.accountExistM("Effie", "Mario", "Smith");
        bank1.editCash("Mario", "Lopez", 3000, true, bank1.accountExist( "Mario", "Lopez"));
        bank1.editCash("Mario", "Lopez", 3000, true, bank1.accountExist( "Mario", "Smith"));
        bank1.editCashM("Effie", "Mario", "Smith", 5000, true, bank1.accountExistM("Effie", "Mario", "Smith"));
        bank1.editCashM("Effie", "Mario", "Leclerc", 5000, false, bank1.accountExistM("Effie", "Mario", "Leclerc"));
        bank1.printAllCustomerList();
        bank1.removeAcc("Mario", "Lopez", bank1.accountExist("Mario", "Lopez"));
        bank1.printAllCustomerList();
    }
}


