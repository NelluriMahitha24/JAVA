class Test {
    int a=100;
    static int b=200;
    public static void main(String[] args) {
        int c=300;
        Test t1= new Test();
        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println(Test.b);
        System.out.println(b);
        System.out.println(c);
    }
    
}
