class Variable{
    int id;
    String name;
    int bal;
    static int min_bal;
    public static void main(String[] args) {
        Variable v1= new Variable();
        v1.id=101;
        System.out.println(v1.id);
        System.out.println(v1.name);
        v1.min_bal=9000;
        Variable v2= new Variable();
        System.out.println(v2.min_bal);
        System.out.println(v2.id);
        Variable v3= new Variable();
        System.out.println(v3.min_bal);
        System.out.println(Variable.min_bal);  
    }
}
