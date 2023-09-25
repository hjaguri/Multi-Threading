public class ThreadPriorities extends Thread  {

    @Override
    public void run() {
        super.run();
        System.out.println("Internal");
        System.out.println(Thread.currentThread().getPriority());

    }

    public static void main(String []args){

        //main thread priorities jvm provide by 5
        System.out.println(Thread.currentThread().getPriority());
        //priority are inherited from the parent thread and by default priority of main thread is 5
        ThreadPriorities tp=new ThreadPriorities();
        //tp.setPriority();
        tp.start();
    //if you are set priority not between 1 to 10 then it will throw the exception  -->illigal argument Exception
     //if multiple thread priorities is same then it is totaly depend upon JVM
        //Priority depend on the platform (window does not support priority)

    }
}

//* JVM provide the priorities to each thread and according to these priorities JVM allocate the process.
//* Priorities provide in the form of integer value which range from 1 to 10 only.
// 1->MIN_Priorities
//5->NORM Priorities
//10->MAX Priorities
//0  , smallest of 1 , and greater than 10 this is not a  Priorities.
