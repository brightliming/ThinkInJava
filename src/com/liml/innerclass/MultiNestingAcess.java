package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/29.
 */
class MNA{
    private void f(){}
    class A{
        private void g(){}
        class B{
            public void h(){
                f();
                g();
            }
        }
    }
}
public class MultiNestingAcess {
    public static void main(String[] args){
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
