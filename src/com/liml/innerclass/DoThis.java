package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/25.
 */
public class DoThis {
    private String name;
    public DoThis(String name){
        this.name = name;
    }
    public void f(){
        System.out.println(this.name);
    }
    class Inner{
        public DoThis outer(){
            return DoThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args){
        DoThis dt = new DoThis("Tom");

        DoThis.Inner inner = dt.inner();
        inner.outer().f();

        DoThis.Inner inner2 = dt.new Inner();
        inner2.outer().f();
    }
}
