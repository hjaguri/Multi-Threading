//Interrupted : - In Java, interrupting a thread means to send it a signal to stop what it is doing and do something else

//interrupt method is used to interrupt an executing thread
//interrupt method will only work when the thread is in sleeping or waiting state (sleep or wait method ).
//if a thread is not in a waiting state then calling an interrupt() method will perform normal behaviour
//it will throw the exception interrupted exception
//syntax : public void interrupt(){}
public class Threadinterrupt extends Thread{
    @Override
    public void run() {

      //  System.out.println("Check the thread is interrupted : " + Thread.interrupted());//true --> // this method also change the status of interrupt method from true to false
        System.out.println(Thread.currentThread().isInterrupted()); //it always give true
        for(int i=0;i<5;i++){try{
            sleep(1000);
            System.out.println(i);
          //  System.out.println(Thread.currentThread().isInterrupted());
         //   System.out.println("Check the thread is interrupted : " + Thread.interrupted()); ->give false
        }
        catch (Exception e){
            System.out.println(e);
        }
        }
    }

    public static void main(String[] args) {
        Threadinterrupt ti=new Threadinterrupt();
        ti.start();
        ti.interrupt();
    }
}

//difference Between interrupt and isInterrupt
//1.interrupt method is used to check weather a thread is interrupted or not.
//isInterrupt method is used to check weather a thread is interrupted  or not.
//2.interrupt method clears the interrupt status from true to false if thread is interrupted
//isInterrupted method does not clear the interrupted status
//3.interrupted method is change the result
//isInterrupted method will produce same result if called twice.
//4.Syntax : public static boolean interrupted(){};
//           public static boolean isInterrupted(){};
