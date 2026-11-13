import java.util.Scanner;
class Operators{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numebr:");
        int num=sc.nextInt();
        String res=(num>0)?"positive":"negative";
        System.out.println(res);
    }
}