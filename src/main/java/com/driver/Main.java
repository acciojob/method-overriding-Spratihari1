package com.driver;





public class Main {

    public static void main(String[] arg){
       B obj=new B();
//        System.out.println(obj.meth());
    }

}

 class A {

    String meth(){
        return "Invoking method from class A";
    }
}

 class B extends  A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}
