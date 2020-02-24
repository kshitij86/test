package com.company;

public class Main {

    @NewAnnotation
    public static void main(String[] args) {
	    Main main = new Main();
	    main.NewMethod();
    }

    public void NewMethod(){
        System.out.println("///////////////");
    }
}
