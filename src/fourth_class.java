public class fourth_class extends  Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Thread Run");
        System.out.println(Thread.currentThread().getName());
// if you have  one thread then you can set the name of the thread
    }

    public static void main(String[] args) {
        //it is also a thread which is know as main thread which is created by JVM
        //System.out.println("Hello");
       // System.out.println("Name of the thread : " + Thread.currentThread().getName()); // if you want to print the name of the thread
       // Thread.currentThread().setName("Hansraj"); //if you want to set a name of the thread
       // System.out.println("After the set of  name is  : "  + Thread.currentThread().getName());
       // int a =10/0; // this line throw some error but you also check this time main class name will be change



        //next part
        //So you have create 2 thread where first is main thread and second is thread 0 which is the name of the thread is by default
        fourth_class fc=new fourth_class();
        fc.setName("Vaniya"); // set the name of the thread
        fc.start();
        fourth_class dc=new fourth_class();
        dc.setName("Vani");
        dc.start();

        System.out.println(Thread.currentThread().isAlive());//this is return ture because the thread is a live
        dc.isAlive(); // this is return false because the thread is death

    }
}
