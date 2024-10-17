
class A{
    int a;
    static int b;
    A c;
}

class java1{
    public static void main(String args[]){
        A a = new A();
        a.a = 10;
        a.b =10;
        A.b = 20;
        a.c = new A();


        A b = new A();
        b.b = 30;
        b.a = 15;
        b.c = a.c;

        System.out.println(a.b +" "+ b.b);
    }
}