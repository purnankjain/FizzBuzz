package com.company;

public class Main {

    void fizzBuzz(){
        int i=1;
        boolean flag = false;

        for(i=1;i<101;i++){
            flag = false;
            if(i%3 == 0){
                System.out.print("Fizz");
                flag = true;
            }
            if(i%5 == 0){
                System.out.print("Buzz");
                flag = true;
            }
            if(!flag){
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // write your code here

        Main m = new Main();
        m.fizzBuzz();

    }


}
