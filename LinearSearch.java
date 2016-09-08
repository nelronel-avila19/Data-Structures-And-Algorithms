import java.util.Scanner;
import java.util.Random;
/*Pwede rin po "import.java.util.*"

Name: 	Ronnel D. Avila
Course: BSIS-2
Date: 	09/08/16
*/
public class LinearSearch{
  public static void main (String [] args){
    Scanner input= new Scanner(System.in);
    Random rand= new Random();
   
    int arraySize;
    int []array;
    String name;
    int search, set=0, b=0;
    
    System.out.print("What is your name? : ");
    name =input.nextLine();
    
     System.out.print("So my dear "+name+", can you please indicate the array size you do want: ");
     arraySize=input.nextInt();
      System.out.println("...loading arrays\n");
     array=new int[arraySize];
     for(int i=0; i<arraySize; i++){
     System.out.print((array[i]=rand.nextInt(100))+"\t");
     set+=1;
     
     if(set==10){
      System.out.print("\n");
     }
     }
     System.out.print("\n\nWhat number do you want search?: ");
     search=input.nextInt();
     
     for(int a=0; a<arraySize; a++){
       
       if(search==array[a]){
        System.out.print(name+", the number "+search+" that you are searching is FOUND!");
        System.out.print("      Location: index no."+a+" Program TERMINATED!");
       }
       
     }
     if( b>1){
     System.out.println();}
     else{
      System.out.print(name+", the number "+search+" that you are searching is NOT FOUND!"+   "\nProgram TERMINATED!");
     }
   
     
     }
  }
