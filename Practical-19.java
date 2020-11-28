public class Exampleclass Runnable  {
    
    @override
    public void run() {
        System.out.println("Thread has ended");
        
    }
    
    public static void main(String[]  args)  {
        Exampleclass ex= new Exampleclass();
        Thread t1= new thread(ex);
        t1.start();
        System.out.println("hello");
    }
}
