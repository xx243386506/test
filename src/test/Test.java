package test;

public class Test {
    public int add(int a,int b) {
        return a+b;
 }
    public int length(int a,int b){
        return add(a,b)*2;
    }
    public static void main(String[] args){
        Test test=new Test();
        System.out.println("½á¹ûÎª£º"+ test.length(10,20)); 
    }
}
