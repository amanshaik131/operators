// Write a program to initialize your marks for 3 subjects and print the highest marks

class Exercise3
  {
    public static void main(String args[])
    {
      int m1=10,m2=45,m3=80;
    
        if((m1>=m2)&&(m1>=m3))
        {
          System.out.println("the highest marks is "+ m1);
        }
        else if((m2>=m1)&&(m2>=m3))
        {
          System.out.println("the highest marks is "+ m2);
        }
        else 
        {
          System.out.println("the highest marks is "+ m3);
        }
      }



}