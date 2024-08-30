class Static{
    String name="rahul gandhi";
    public void add(){
        System.out.println("hi Rahul");
    }
    public static void main(String[] args) {
        Static s1=new Static();
        s1.add();
        System.out.println(s1.name);
    }
}