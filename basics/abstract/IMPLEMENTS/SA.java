package IMPLEMENTS;
interface Account{
    public int getbal();
    public void closeacc();
}
class SA implements Account{
    public int getbal(){
        return 100;
    }
    public void closeacc(){
        System.out.println("account closed");
    }
    public static void main(String[] args) {
        SA s=new SA();
        System.out.println(s.getbal());
        s.closeacc();
    }
}
