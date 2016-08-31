public class ArrayQueue {
  
  private int capacity;
  private int head = 0;
  private int tail = 0;
  private int[] storage;
  
  public ArrayQueue(int size) {
    capacity = size;
    storage = new int[capacity]; 
  } 

  public void show() {
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ i +"] = " + storage[adjust(head+i)]);         
    }
    System.out.println();
    System.out.println("STORAGE STATUS: ");
    System.out.println("Size : " + capacity );
    System.out.println("Empty: " + (capacity-tail) + " left");
    peekHead();
    peekTail();
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (tail == 0) {
      System.out.println("Storage is EMPTY!");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (tail == capacity) {
      System.out.println("Storage is FULL.");
      return true;
    }
    return false;
  }

  public void enqueue(int value) {    
    System.out.println("...trying to enqueue " + value + " ...");
    if (isFull()) {      
      System.out.println("ADD FAILED.");
      System.out.println();
    } else {
      storage[adjust(head+tail)] = value;
      tail++;
      System.out.println( value + "was successfully added.");
      System.out.println();  
    }     
  }

  public int dequeue() {
    System.out.println("...trying to dequeue " + storage[head] + " ...");
    if (isEmpty()) {      
      System.out.println("REMOVE FAILED.");
      System.out.println();
      return -1;
    } else {
      int temp = storage[head];
      storage[head] = 0;
      head = adjust(head+1);
      tail--;
      System.out.println( temp + " was successfully removed.");
      System.out.println();
      return temp;      
    }    
  }

  private final int adjust(int i) {
    return (i + capacity) % capacity;
  }

  public int peekHead() {
    System.out.println("Head : " + storage[head]);
    if (isEmpty()) {      
      return -1;
    }
    return 0;
  }

  public int peekTail() {
    if (isEmpty()) {
      System.out.println("Tail : " + storage[adjust(capacity)]); 
      return -1;
    } else if (isFull()) {
      System.out.println("Tail : " + storage[adjust(tail)]); 
      return 0;
    } else if (tail <= capacity) {
      System.out.println("Tail : " + storage[capacity-1]);
      return 0;
    } else if (tail >= capacity) {
      System.out.println("Tail : " + storage[adjust(tail+1)]);
      return 0;
    } else if (!isEmpty() && !isFull()) {
      System.out.println("Tail : " + storage[capacity-1]);
      return 0;
    } else {
      System.out.println("Tail : " + storage[adjust(tail)]);
      return 0;
    }
  }


  public static void main(String[] args) {
    ArrayQueue storage = new ArrayQueue(10);
    storage.enqueue(1);   
    storage.enqueue(2);    
    storage.enqueue(3);    
    storage.enqueue(4);    
    storage.enqueue(5);
    storage.enqueue(6); 
    storage.enqueue(7); 
    storage.enqueue(8); 
    storage.enqueue(9);    
    storage.enqueue(10); 
    storage.show();
    storage.enqueue(11);    
    storage.dequeue();
    storage.show();
    storage.enqueue(12); 
    storage.show(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.show();
  }  

}