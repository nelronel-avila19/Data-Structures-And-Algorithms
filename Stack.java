
public class Stack {

       private int capacity ;
       private int top = 0;
       private String storage[];
        
      
    public Stack(int size){
        capacity=size;
        storage= new String[capacity];
        
    }
    public void show(){
        for(int i=capacity-1; i>=0; i--){
            System.out.println("Stack[" + i + "] =" + storage[i]);
        }
       System.out.println();
    }
        
        private boolean isEmpty(){
            if (storage[0] == null){
                System.out.println("The Stack is Empty!");
                System.out.println();
                return true;
            }
            return false;
        }
        
        private boolean isFull(){
            if(top == capacity){
                System.out.println("The Stack is Full!");
                return true;
            }
            return false;
        }
        
        public void push(String value){
            if (isFull ()) {
                System.out.println("ADD FAILED!");
                System.out.println();
            }else{
                System.out.print("... Trying to push on stack[" + top +"]...");
                storage[top]=value;
                top++;
                System.out.println(value + " was succesfully added.");
                System.out.println();
            }
        }
        public void pop(){
            if(isEmpty()){
                System.out.print("REMOVE FAILED!");
                System.out.println();
            }else{
                System.out.println("... trying to pop stack[" + (top-1) + "] ...");
                storage[top]=null;
                top--;
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
        
            Stack storage=new Stack(10);
          
            
            System.out.println("STORAGE CAPACITY = " + storage.capacity);
            System.out.println();
           
            storage.isEmpty();
            storage.pop();
            storage.peek();
            storage.push("one");
            storage.show();
            storage.peek();
            storage.push("two");
            storage.show();
            storage.peek();
            storage.push("three");
            storage.show();
            storage.peek();
            storage.push("four");
            storage.show();
            storage.peek();
            storage.push("five");
            storage.show();
            storage.pop();
            storage.push("six");
            storage.push("seven");
            storage.push("eight");
            storage.push("nine");
            storage.push("ten");
            storage.show();
            storage.pop();         
            storage.push("eleven");
            storage.push("twelve");
            storage.show();
               
           
        }
}