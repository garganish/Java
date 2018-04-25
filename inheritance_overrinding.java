class anish
{
    /*public void show()
    {
        System.out.println("show method of parent class");
    }*///here if we give higher level to parent as compared to child then it gives an error.
    //final method can't be Override.
     //final class can't be extended.
      void show()
    {
        System.out.println("show method of parent class");
    }
}
class akshit extends anish
{
    void show()
    {
        System.out.println("show method of akshit class");
    }
}
class two extends akshit
{
    void show()
    {
        System.out.println("show method of two class");
    }
}
class usefs
{
    public static void main(String[] args)
    {
        /*two t=new two();
        t.show();
        akshit ak=new akshit();
        ak.show();
        anish an=new anish();
        an.show();*/
        
        anish ob;//this is called dynamic method dispatch or polymorphism
        ob=new akshit();
        ob.show();
        ob=new anish();
        ob.show();
        ob=new two();
        ob.show();
        /*usefs obj=new usefs();
         ob=obj.getInstance();
        ob.show();*/
        ob=getInstance();
        ob.show();
        call(new two());
        call(new akshit());
    }
    /*public anish getInstance()
        {
            return new akshit();
        }*/
        public static anish getInstance()
        {
            return new anish();
        }
        public static void call(anish an)
        {
            an.show();
        }
}