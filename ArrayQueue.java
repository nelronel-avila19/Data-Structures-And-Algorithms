
public class ArrayQueue {

       private int capacity ;
       private int top = 0;
       private String storage[];
        
      
    public ArrayQueue(int size){
        capacity=size;
        storage= new String[capacity];
        
    }
    public void show(){
        for(int i=capacity-1; i>=0; i++){
            System.out.println("Queue[" + i + "] =" + storage[i]);
        }
       System.out.println();
    }
        
        private boolean isEmpty(){
            if (storage[0] == null){
                System.out.println("The Queue is Empty!");
                System.out.println();
                return true;
            }
            return false;
        }
        
        private boolean isFull(){
            if(top == capacity){
                System.out.println("The Queue is Full!");
                return true;
            }
            return false;
        }
        
        public void enqueue(String value){
            if (isFull ()) {
                System.out.println("ADD FAILED!");
                System.out.println();
            }else{
                System.out.print("... Trying to enqueue[" + top +"]...");
                storage[top]=value;
                top--;
                System.out.println(value + " was succesfully added.");
                System.out.println();
            }
        }
        public void dequeue(){
            if(isEmpty()){
                System.out.print("REMOVE FAILED!");
                System.out.println();
            }else{
                System.out.println("... trying to dequeue[" + (top-1) + "] ...");
                storage[top]=null;
                top++;
                System.out.println(storage[top] + " was succesfully removed.");
                System.out.println();
            }
        }
        
        public void peek(){
            if(storage[top]==(storage[0])){
                System.out.println("PEEK TOP " + storage[top]);
                System.out.println();
            }else{
                System.out.println("PEEK TOP " + storage[top-1]);
                System.out.println();
            }
        }
        
        public static void main(String [] args){
        
            ArrayQueue storage=new ArrayQueue(10);
          
            
            System.out.println("STORAGE CAPACITY = " + storage.capacity);
            System.out.println();
           
            storage.isEmpty();
            storage.dequeue();
            storage.peek();
            storage.enqueue("one");
            storage.show();
            storage.peek();
            storage.enqueue("two");
            storage.show();
            storage.peek();
            storage.enqueue("three");
            storage.show();
            storage.peek();
            storage.enqueue("four");
            storage.show();
            storage.peek();
            storage.enqueue("five");
            storage.show();
            storage.dequeue();
            storage.enqueue("six");
            storage.enqueue("seven");
            storage.enqueue("eight");
            storage.enqueue("nine");
            storage.enqueue("ten");
            storage.show();
            storage.dequeue();         
            storage.enqueue("eleven");
            storage.enqueue("twelve");
            storage.show();
               
           
        }
}