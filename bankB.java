import java.util.ArrayList;

public class bankB implements Bank{

    public ArrayList<Account> B;

    public bankB () {
        B = new ArrayList<>() ;
    }

 
    public void addBank(Account acc){

        B.add(acc);
    }

    public boolean authorizeATM(int card){
        boolean isTrue = false;
        boolean isIt = false;
        for(Account acc : B){
            if (card == acc.getCardNum()) {
                isTrue = true;
                if (card == acc.getCardNum() ){
                    System.out.println("card is authorized");
                    isIt = true;
                    break;
                }if(isIt == false) {
                    System.out.println("card is expired");
                }
            }
        }

        if(isTrue == false){
            System.out.println("card is not supported by ATM");
        }
        System.out.println(isTrue && isIt);
        return (isTrue && isIt);
    }
   
    public double withdraw(String passCode,double amount){
        doubleamount2= 0;
        for(Account acc : B){
            if (passCode.compareTo(acc.getPassword()) > 0) {
                if(amount <= acc.getBalance()) {
                    System.out.println(acc.getBalance());
                    amount2 = acc.getBalance() - amount;
                    acc.setBalance(amount2);
                    System.out.print("Your remaining balance is:  ");
                    System.out.println(acc.getBalance());
                    return amount2;
                }

            }
        }
        return amount2;
    }

}
© 2021 GitHub, Inc.