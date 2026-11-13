class User{
    void name(){
        System.out.println("fuc 1");
    }
}
class User1 extends User{
    void name(){
        System.out.println("func 2");
    }
}
class Overload{
    public static void main(String[] args){
        User us=new User();
        us.name();
        User1 us1=new User1();
        us1.name();
    }
}