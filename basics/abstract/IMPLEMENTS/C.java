interface A{
void m1();
}
interface B{
    void m2();
}
class C implements A,B
{
    public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m2 method");
    }
public static void main(String[] args) {
    C I=new C();
    I.m1();
    I.m2();
}
}