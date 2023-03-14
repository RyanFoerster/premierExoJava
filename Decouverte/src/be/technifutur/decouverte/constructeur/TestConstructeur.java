package be.technifutur.decouverte.constructeur;

public class TestConstructeur {
    public static void main(String[] args) {
        C test = new C();
        System.out.println("v1 : " + test.v1);
        System.out.println("v2 : " + test.v2);
        System.out.println("v3 : " + test.v3);
    }
    public static void type(A a){
        System.out.println("Type : " + a);
    }
    public static void type(B b){
        System.out.println("Type : " + b);
    }
    public static void type(C c){
        System.out.println("Type : " + c);
    }
}


abstract class A{
    // Initialisateur d'instance
    {
        System.out.println("v1 : " + this.v1);
    }
    A() {
        super();
        System.out.println("A.A");
        TestConstructeur.type(this);
        System.out.println(this.getClass().getName());
        System.out.println("v1 : " + this.v1);
        System.out.println("v2 : " + this.getv2());
        v1 = 10;
    }

    abstract int getv2();

    int v1 = 5;
}

class B extends A{
    int v2 = v1 + 2;

    B(int v2){
        super();
        System.out.println("B.B");
        TestConstructeur.type(this);
        System.out.println("v1 : " + this.v1);
        System.out.println("v2 : " + this.v2);
        this.v2 = v2;
    }

    @Override
    int getv2() {
        return this.v2;
    }
}

class C extends B{
    int v3;

    C(int v){
        super(v);
        System.out.println("C.C");
        TestConstructeur.type(this);
        System.out.println("v1 : " + this.v1);
        System.out.println("v2 : " + this.v2);
        System.out.println("v3 : " + this.v3);
    }

    C(){
        this(5);
    }
}