class All{
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
        All a1= new All();
        a1.a=10;
        System.out.println(a1.a+a1.b+a1.c);
        //510   10+200+300
        All a2= new All();
        a2.b=10;
        System.out.println(a2.a+a2.b+a2.c);
        //410    100+10+300
        All a3= new All();
        a3.c=10;
        System.out.println(a3.a+a3.b+a3.c);
        //310     100+200+10
        a1.a=10;
        System.out.println(a1.a+a1.b+a1.c);
        //220    10+200+10
        
    }
}
