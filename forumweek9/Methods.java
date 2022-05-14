import java.util.Scanner;

public class Methods {

    static Scanner s = new Scanner(System.in);


    public static boolean mainMenu(){
        System.out.println("\n<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n\n");
        System.out.println("Please select one of the following options:");
        System.out.println("1. Create a New Account");
        System.out.println("2. Delete Account");
        System.out.println("3. Check an Account's Balance and Information");
        System.out.println("4. Display a List of All Registered Accounts");
        System.out.println("5. Deposit");
        System.out.println("6. Withdraw");
        System.out.println("7. Quit\n\n");

        return true;
        

    }

    public static void addAcc(Bank bank){
        while(true){
            System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
            System.out.println("Please enter your first name (Do not enter your middle name, if you have one): ");
            System.out.print("> ");
            String fName = s.next().toLowerCase();
            System.out.println();
            System.out.println("Please enter your last name: ");
            System.out.print("> ");
            String lName = s.next().toLowerCase();
            System.out.println();
            System.out.println("Do you have a middle name? (Y/N)");
            System.out.print("> ");
            String ans1 = s.next().toLowerCase();
            System.out.println();
            String ans2;
    
            if(ans1.equals("y")){
                System.out.println("Please enter your middle name: ");
                System.out.print("> ");
                String mName = s.next().toLowerCase();
                System.out.println();
                System.out.println("Is the following information correct? (Y/N): \n");
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.println("First Name           : "+ bank.capitalizeString(fName));
                System.out.println("Middle Name          : "+ bank.capitalizeString(mName));
                System.out.println("Last Name            : "+ bank.capitalizeString(lName) + '\n');
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.print("> ");
                ans2 = s.next().toLowerCase();
                System.out.println();
                if(ans2.equals("y")){
                    bank.addCustomerMiddle(fName, mName, lName);
                    System.out.println("You have successfully created a new account with this information: \n");
                    bank.printCustomerM(fName, mName, lName, bank.accountExistM(fName, mName, lName));
                    break;
                }else{
                    System.out.println("Please reenter the information.\n");
                }

            }else{
                System.out.println("Is the following information correct? (Y/N): \n");
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.println("First Name           : "+ bank.capitalizeString(fName));
                System.out.println("Last Name            : "+ bank.capitalizeString(lName) + '\n');
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.print("> ");
                ans2 = s.next().toLowerCase();
                System.out.println();

                if(ans2.equals("y")){
                    bank.addCustomer(fName, lName);
                    System.out.println("You have successfully created a new account with this information: \n");
                    bank.printCustomer(fName, lName, bank.accountExist(fName, lName));
                    break;
                }else{
                    System.out.println("Please reenter the information.\n");
                }
            }
        }
 


    }

    public static void delAcc(Bank bank){
        System.out.println("\n<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
        System.out.println("Kindly enter the desired account's information.\n");
        System.out.println("Please enter the desired account's first name (Do not enter a middle name, if it has one): ");
        System.out.print("> ");
        String fName = s.next().toLowerCase();
        System.out.println();
        System.out.println("Please enter the desired account's last name: ");
        System.out.print("> ");
        String lName = s.next().toLowerCase();
        System.out.println();
        System.out.println("Does this account have a middle name? (Y/N)");
        System.out.print("> ");
        String ans1 = s.next().toLowerCase();
        System.out.println();
        String ans2;

        if(ans1.equals("y")){
            System.out.println("Please enter the desired account's middle name: ");
            System.out.print("> ");
            String mName = s.next().toLowerCase();
            System.out.println();
            if(bank.accountExistM(fName, mName, lName).get(0) == 1){
                System.out.println("Are you sure you want to delete the following account? (Y/N): \n");
                bank.printCustomerM(fName, mName, lName, bank.accountExistM(fName, mName, lName));
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.print("> ");
                ans2 = s.next().toLowerCase();
                System.out.println();
                if(ans2.equals("y")){
                    System.out.println("You have successfully deleted the following account with the following information: \n");
                    bank.removeAccM(fName,mName, lName, bank.accountExistM(fName, mName, lName));
                }else{
                    System.out.println("Understood, thank you for your confirmation.\n");

                }
            }else{
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.println("Sorry, but that account doesn't exist. Please make sure you've entered the correct information.");
            }


        }else{
            if(bank.accountExist(fName, lName).get(0) == 1){
                System.out.println("Are you sure you want to delete the following account? (Y/N): \n");
                bank.printCustomer(fName, lName, bank.accountExist(fName, lName));
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.print("> ");
                ans2 = s.next().toLowerCase();
                System.out.println();
    
                if(ans2.equals("y")){
                    System.out.println("You have successfully deleted the account with the following information: \n");
                    bank.removeAcc(fName, lName, bank.accountExist(fName, lName));
                }else{
                    System.out.println("Understood, thank you for your confirmation.\n");

                }
            }else{
                System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                System.out.println("Sorry, but that account doesn't exist. Please make sure you've entered the correct information.");
            }

        }
    }


    public static void depositCash(Bank bank){
        
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
        System.out.println("Kindly enter the desired account's information.\n");
        System.out.println("Please enter the desired account's first name (Do not enter a middle name, if it has one): ");
        System.out.print("> ");
        String fName = s.next().toLowerCase();
        System.out.println();
        System.out.println("Please enter the desired account's last name: ");
        System.out.print("> ");
        String lName = s.next().toLowerCase();
        System.out.println();
        System.out.println("Does this account have a middle name? (Y/N)");
        System.out.print("> ");
        String ans1 = s.next().toLowerCase();
        System.out.println();
        if(ans1.equals("y")){
            System.out.println("Please enter the desired account's middle name: ");
            System.out.print("> ");
            String mName = s.next().toLowerCase();
            System.out.println();
            System.out.println("Please enter the desired amount to be added/deposited:");
            System.out.print("> ");
            double amount = s.nextDouble();
            System.out.println();
            bank.editCashM(fName, mName, lName, amount, true, bank.accountExistM(fName, mName, lName));

        }else{
            System.out.println("Please enter the desired amount to be added/deposited:");
            System.out.print("> ");
            double amount = s.nextDouble();
            System.out.println();
            bank.editCash(fName, lName, amount, true, bank.accountExist(fName, lName));  
        }
    
    }

    public static void withdrawCash(Bank bank){
            System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
            System.out.println("Kindly enter the desired account's information.\n");
            System.out.println("Please enter the desired account's first name (Do not enter a middle name, if it has one): ");
            System.out.print("> ");
            String fName = s.next().toLowerCase();
            System.out.println();
            System.out.println("Please enter the desired account's last name: ");
            System.out.print("> ");
            String lName = s.next().toLowerCase();
            System.out.println();
            System.out.println("Does this account have a middle name? (Y/N)");
            System.out.print("> ");
            String ans1 = s.next().toLowerCase();
            System.out.println();
            if(ans1.equals("y")){
                System.out.println("Please enter the desired account's middle name: ");
                System.out.print("> ");
                String mName = s.next().toLowerCase();
                System.out.println();
                System.out.println("Please enter the desired amount to be withdrawn:");
                System.out.print("> ");
                double amount = s.nextDouble();
                System.out.println();
                bank.editCashM(fName, mName, lName, amount, false, bank.accountExistM(fName, mName, lName));

            }else{
                System.out.println("Please enter the desired amount to be withdrawn:");
                System.out.print("> ");
                double amount = s.nextDouble();
                System.out.println();
                bank.editCash(fName, lName, amount, false, bank.accountExist(fName, lName));  
            }

    }

    public static void searchAcc(Bank bank){
        System.out.println("Please enter the desired account's first name (Do not enter a middle name, if it has one): ");
        System.out.print("> ");
        String fName = s.next().toLowerCase();
        System.out.println();
        System.out.println("Please enter the desired account's last name: ");
        System.out.print("> ");
        String lName = s.next().toLowerCase();
        System.out.println();
        System.out.println("Does this account have a middle name? (Y/N)");
        System.out.print("> ");
        String ans1 = s.next().toLowerCase();
        System.out.println();

        if(ans1.equals("y")){
            System.out.println("Please enter the desired account's middle name: ");
            System.out.print("> ");
            String mName = s.next().toLowerCase();
            System.out.println();
            System.out.println("The details of the account belonging to " + bank.capitalizeString(fName) + " " + bank.capitalizeString(mName) + " " + bank.capitalizeString(lName) + " is as follows: \n" );
            bank.printCustomerM(fName, mName, lName, bank.accountExistM(fName, mName, lName));
        }else{
            System.out.println("The details of the account belonging to " + bank.capitalizeString(fName) + " " + bank.capitalizeString(lName) + " is as follows: \n" );
            bank.printCustomer(fName, lName, bank.accountExist(fName, lName));
        }

    }

    public static void startUp(Bank bank, boolean test){

        do {
            mainMenu();
            System.out.print("> ");
            int userInput = s.nextInt();
            
            switch(userInput){
                case 1:
                    System.out.println("You have selected option 1 : Create a New Account.\n");
                    addAcc(bank);
                    break;
                case 2:
                    System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                    System.out.println("You have selected option 2 : Delete Account.");
                    delAcc(bank);
                    break;
                case 3:
                    System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                    System.out.println("You have selected option 3 : Check an Account's Balance and Information.\n");
                    searchAcc(bank);
                    break;
                case 4:
                    System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                    System.out.println("You have selected option 4 : Display the List of Registered Accounts.\n");
                    bank.printAllCustomerList();
                    break;
                case 5:
                    System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                    System.out.println("You have selected option 5 : Deposit.\n");
                    depositCash(bank);
                    break;
                case 6:
                    System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                    System.out.println("You have selected option 6 : Withdraw.\n");
                    withdrawCash(bank);
                    break;

                case 7:
                    System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                    System.out.println("You have selected option 7 : Quit.");
                    System.out.println("Goodbye and thank you for your patronage.\n");
                    test = false;
                    break;
                default:
                    System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>\n");
                    System.out.println("That is not an available option. ");
                }
        } while(test);
    }
}
