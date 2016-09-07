 import java.util.Scanner;
 import java.util.Random;

 public class TotalMax{
   public int []array;
   public int sum=0;
   public int average;
   public int max=0;
   public void show(){
     int fix=0;
     System.out.println("..loading array/arrays...");
     for(int i=0; i<array.length; i++){
      System.out.print(array[i]+"\t"); 
      fix+=1;
      if (fix==10){
      System.out.println();
      fix=0;
      }
    }
      
   }
   public void getSum(){
     
     for(int a=0; a<array.length; a++){
       sum+=array[a];
     
    }
       System.out.println("\n\nSum=  "+sum);
   }
   public void getAve(){
     average=sum/array.length;
   System.out.println("\nAverage= "+average);
   }
   public void getMax(){
    for(int i=0; i<array.length;i++){
   if(array[i]>max)
     max=array[i];
   }
    System.out.println("\nMax= "+max);
   }
   public static void main (String [] args){
     Scanner input= new Scanner(System.in);
     TotalMax print=new TotalMax();
     Random rand= new Random();
     int arraySize=0;
    
     System.out.print("What is the maximum number of arrays: ");
     arraySize=input.nextInt();
     print.array=new int [arraySize];
     
     for(int a=0; a<arraySize; a++){
      print.array[a]=rand.nextInt(1000);
      
     }
     
     print.show();
     print.getSum();
     print.getAve();
     print.getMax();
     
    
    
   }
 }