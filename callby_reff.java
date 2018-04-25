class demo
{
  void change(int value)
   {
       value+=100;
   }
   static void change1(test d)
   {
       d.value+=100;
   }
   /*static test show()
   {
       test t=new test();
       t.value=900;
       t.name="anish is good";
       return t;
   }*/
    test show()
   {
       test t=new test();
       t.value=900;
       t.name="anish is good";
       return t;
   }
   public static void main(String[] args)
   {
       int value=90;
       demo d=new demo();
       //System.out.println("the value is:"+value);
       d.change(value);
       System.out.println("the value is:"+value+"\n");
       test tes=new test();
       tes.value=100;
       System.out.println("the value is:"+tes.value+"\n");
       change1(tes);
       System.out.println("the value is:"+tes.value+"\n");
        
        //test res=show();
        test res=d.show();
        System.out.println("the value :"+res.value+"the name: "+res.name);
   }
}
class test
{
    public int value;
    public String name;
}