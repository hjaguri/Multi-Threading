public class ThreadYield extends Thread {

    @Override
    public void run() {
        Thread.yield();
        for(int i=0;i<6;i++){
            System.out.println(Thread.currentThread().getName() + " " + i) ;
        }
    }

    public static void main(String[] args) {
        //Yield Method which stop current executing thread and give a chance to other thread for execution.
        //working in java 5 is internally it used sleep method.
        //working in java 6 Thread provide the hint to the thread scheduler, then it depend on thread scheduler to accept or ignore the hint.

        ThreadYield ty=new ThreadYield();
        ThreadYield tp=new ThreadYield();
        ty.start();
        tp.start();

        for(int i=0;i<5;i++){
            System.out.println("main thread" + " " + i);
        }
//output may be different
    }
}


//Mathod name : public static native void yield();