
// Java program to demonstrate requesting JVM to run Garbage Collector 


public class GarbageCollection
{ 
    public static void main(String[] args) throws InterruptedException 
    { 
        GarbageCollection t1 = new GarbageCollection(); 
          
        
        t1 = null;  // Nullifying the reference variable 
          
       
        System.gc();    // requesting JVM for running Garbage Collector 
        Runtime.getRuntime().gc();    // requesting JVM for running Garbage Collector 
      
    } 

    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 
} 
