package control;

import model.B;
import model.F;
import view.C;

public class A {
    String aa1; // "~aa1" (package)
    private String aa2; // "-aa2"
    public String aa3; // "+aa3"
    protected String aa4;

    private A a;

    public void testeA() {
        A a1 = new A();
        A a2 = new A();

    }


    public void testeB(){
        B b = new B();
        //b. ba3
    }
    public void testeC(){
        C c = new C();
        // c. ca3
    }
    public void testeE(){
        E e = new E();
        //e. aa1, aa2, aa3
    }
    public void testeF(){
        F f = new F();
        //f. aa3 aa4
    }
}
