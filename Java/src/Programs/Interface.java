package Programs;

import java.util.Scanner;

interface First {
    void input();
    void add();
    
}

abstract class FL implements First{
	
	
}
	

class Main implements First {

    int x, y, z;
    Scanner sc = new Scanner(System.in);

     public void input() {
        System.out.print("Enter Two Numbers :");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void add() {
        z = x + y;
    }

     void display() {
        System.out.println("\nThe sum is :" + z);
    }

    public static void main(String args[]) {
        Main t = new Main();
        t.input();
        t.add();
        t.display();
    }
}
         