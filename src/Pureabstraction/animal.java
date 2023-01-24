package Pureabstraction;

 interface animal 
{
	void eat();
	void walk();
	void talk();// declaration

}
 class human implements animal
 {
	 public void eat()
	 {
		 System.out.println("human eat colour juice");
	 }
	public void walk()
	 {
		 System.out.println("human walk daily");
	 }
	public void talk()
	 {
		 System.out.println("human talking daily");
	 }
 }
 class dog implements animal
 {
	 public void eat()
	 {
		 System.out.println("dog eat colour juice");
	 }
	public void walk()
	 {
		 System.out.println("dog walk daily");
	 }
	public void talk()
	 {
		 System.out.println("dog talking daily");
	 }
	 
 }
 class main
 {
	 public static void main (String[] args)
	 {
		animal a1 =new human();
		a1.eat();
	 }
 }
  
