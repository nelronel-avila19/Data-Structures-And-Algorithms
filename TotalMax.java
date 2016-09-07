 import java.util.Scanner;

 public class TotalMax{
   public int []array;
   public int sum=0;
   public float average;
   public int max=0;
   public void show(){
     System.out.println("..loading array/arrays...");
     for(int i=0; i<array.length; i++){
      System.out.print(array[i]);
      System.out.println(" ");
      
    }
      
   }
   public void getSum(){
     
     for(int a=0; a<array.length; a++){
       sum+=array[a];
     
    }
       System.out.println("Sum=  "+sum);
   }
   public void getAve(){
     average=sum/array.length;
   System.out.println("Average= "+average);
   }
   public void getMax(){
    for(int i=0; i<array.length;i++){
   if(array[i]>max)
     max=array[i];
   }
    System.out.println("Max= "+max);
   }
   public static void main (String [] args){
     Scanner input= new Scanner(System.in);
     TotalMax print=new TotalMax();
     int arraySize=0;
    
     System.out.print("What is the maximum number of arrays: ");
     arraySize=input.nextInt();
     print.array=new int [arraySize];
     
     for(int a=0; a<arraySize; a++){
       System.out.print("Enter array["+a+"]: ");
       print.array[a]=input.nextInt();
     }
     
     print.show();
     print.getSum();
     print.getAve();
     print.getMax();
         System.out.print("PROGRAM TERMINATED!");
    
   }
 }