import java.util.Scanner;
class Loan{
    double calculateInterest(double p){
        return(p*5/100);
    }
   double calculateInterest(double p,int y){
        return(p*y*7/100);
    } 
    double calculateInterest(double p,){
        System.out.println(amount);
        System.out.println(description);
    } 
}
class Bankaccount{
    public static void main(String[] args){
    Account ac=new Account(); 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an deposite ammount");
    int a=sc.nextInt();
    System.out.println("enter description");
    sc.nextLine();
    String description=sc.nextLine();
    double b=a; 
    ac.deposit(a);
    ac.deposit(b);
    ac.deposit(a,description); 
    }
}