import java.util.*;
class User{
    void name(int a){
        System.out.println("function1");
    }
    void name(){
        System.out.println("function2");
    }
    void name(int a,int b){
        System.out.println("function3");
    }
    void name(double a){
        System.out.println("function4");
    }
}
class Override{
    public static void main(String[] args){
        User us=new User();
        us.name();
        us.name(10);
        us.name(10,20);
        us.name(2.45);
    }
}