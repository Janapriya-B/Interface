package Programs;

import java.util.Scanner;

interface First {
    void input();
    void add();
    void findanddisplay();
    
}

/*abstract class FL implements First{
	
	public void input()
	{
		
	}
	
	
}*/
	

class Main implements First {

    int x, y, z, a, b;
    Scanner sc = new Scanner(System.in);

     public void input() {
        System.out.print("Enter Two Numbers :");
        x = sc.nextInt();
        y = sc.nextInt();
        a= sc.nextInt();
        b= sc.nextInt();
    }

    public void add() {
        z = x + y;
    }
    public void findanddisplay() {
    	System.out.println("Enter an integer");
    	if(a>b)
    	{
    		System.out.println("The largest number is:" + a);
    	}
    	else
    	{
    		System.out.println("The largest number is:" + b);
    	}
    		
    	
    }
     void display() {
        System.out.println("\nThe sum is :" + z);
    }

    public static void main(String args[]) {
        Main t = new Main();
        t.input();
        t.add();
        t.display();
        t.findanddisplay();
    }
}
         