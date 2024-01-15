package com.GarbageCollectors;

public class DemoClass {
    private int data;
    public DemoClass(int data){
        this.data=data;
    }

    public void processData(){
        System.out.println("The given Data is :"+data);
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing Myclass object with data :"+data);
        }finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        DemoClass demoClass=new DemoClass(42);

        demoClass.processData();

        demoClass=null;

        System.gc();


    }
}
