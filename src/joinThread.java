//join method -> Join method is used if a thread want to wait for another thread to complete its task,then we should use join() method.
//public class joinThread extends Thread{
//    public void run(){
//        try{
//            for(int i=0;i<5;i++){
//                System.out.println(Thread.currentThread().getName() + " " +i+" ");
//                Thread.sleep(1000);
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//    public static void main(String[] args) throws InterruptedException {
//
//        joinThread jt=new joinThread();
//        jt.start();
//        jt.join();
//        try{
//            for(int i=0;i<5;i++){
//                System.out.println("main " + i);
//                Thread.sleep(1000);
//
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//    }
//}
// three type of method
//1.public final void join() throw InterruptedException
//2.public final synchronized void join(long millisecond) throw InterruptedException
//3.public final synchronized  void join(long ms , int ns)throw InterruptedException



class joinThread extends Thread{
   static Thread mainThread;

    @Override
    public void run() {
        try{
            mainThread.join();
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName() + " ");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        mainThread=Thread.currentThread();
        joinThread jt=new joinThread();
        jt.start();
        try{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName() + " ");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}