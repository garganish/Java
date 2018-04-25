class demo
{
	 int value;
	 void show()
	 {
	     System.out.println("show method of demo class");
	     System.out.println("the value :"+value+"  "+this.value);
	     //this give the reffrence tothe class it is associated with.i.e in first case with d1 and then with d2.
	 }
}
class first
{
	public static void main(String[] args)
	{
		demo obj,obj1;
		obj = new demo();
		obj1 = new demo();
		obj.value  = 42343;
		obj.show();
		obj1.show();
		
	}
}