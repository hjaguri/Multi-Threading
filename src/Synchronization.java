// Synchronization in Java is a mechanism that ensures that only one thread can access a shared resource at a time.
// This is done to prevent data corruption and to ensure that the program runs correctly.


//Synchronization achieve in two-way : 1.Process Synchronization 2.Thread Synchronization


//Thread-Synchronization is  also two-way 1.Mutual Exclusive 2.Cooperation(inter-thread communication in java).
//Mutual Exclusive can be three-way : 1.by synchronization method , by synchronization block , static synchronization
//Cooperation : can be achieved by following methods of objects class: 1.wait() , 2.notify() , 3.notify all()

public class Synchronization  extends Thread{
    static driver d;
    int seat;
    @Override
    public void run() {
        d.bookseat(seat);
    }

    public static void main(String[] args) {
        d=new driver();
        Synchronization mukul=new Synchronization();
        mukul.seat=7;
        mukul.start();

        Synchronization saurabh=new Synchronization();
        saurabh.seat=10;
        saurabh.start();

        Synchronization ankit =new Synchronization();
        ankit.seat=3;
        ankit.start();
    }
}

class driver {
    static int totoalseat = 10;

    synchronized void bookseat(int seat) { //synchronized method



            if (totoalseat >= seat) {
                System.out.println("Suucessfully");
                totoalseat = totoalseat - seat;
                System.out.println("only seat avaiable : " + totoalseat);
            } else {
                System.out.println("All seat are fulled");
            }
synchronized (this){//synchornized block
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());}

    }

}
 // if you have create any object they have one lock , they can be divided in two part
//1. synchronization , non-synchronization
//only those   things we can access if they are synchronization
//we can only understand in this way mean when one thread is inside the synchronization method then other thread nothing to do for that thread.
//2.advantage : Data consistency,Faster response times,Efficient use of resources , Avoids memory errors:
//3.dis-advantage : Slower execution , Wasted storage

