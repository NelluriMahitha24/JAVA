package ABSTRACT;
abstract class E{
    public void m1(){System.out.println("opened account");}
    public abstract int m2();
}
class F extends E{
    public int m2(){
        return 100;
    }
}
class Test1{
    public static void main(String[] args) {
        F f=new F();
        f.m1();
        System.out.println(f.m2());
    }
}