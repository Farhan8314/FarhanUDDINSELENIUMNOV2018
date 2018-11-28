package homeworknov27;

public class Computer {

public static String Brandname;
public static int computerprice;
String color;
int ram;

public Computer (int ram, String color) { //constructor

       this.color = color;
       this.ram= ram;
       System.out.println("System ram is" + ram + "color is  "+ color);
}


public static void Brandname() {
System.out.println("hp");


}
 public void color() {
	 System.out.println("the car is Blue");
	 
 }
 
}