import java.sql.DataTruncation;

public class thirdLecture {
    thirdLecture(){}; //default constructor
    thirdLecture(Runnable rb){}
    //First four constructor is related to simple thread
    thirdLecture (String name){} //jvm provide name by default and if you want to put the name of the thread so you can use this const.
    thirdLecture(Runnable r  , String name){}
    thirdLecture(ThreadGroup tg , Runnable target){};
    thirdLecture(ThreadGroup tg  , String name){};
    thirdLecture(ThreadGroup tg , Runnable r , String name){}
    thirdLecture(ThreadGroup tg , Runnable r , String name , long stackSize){}
// constructor is related to simple Group thread

    //Basic Method
    //1 .  run() , start() , currentThread()->it is a static method , isAlive()->it give boolean value   (  --> There are four simple method)
    //2. setname(String name) , getName()  -> (it is used for name for set and get)  (Naming method)
    //3. isDaemon() , setDaemon(boolean b) ->we can set boolean value  (Daemon method)
    //4. getPriority() , setPriority(int priority) ->give int value     (priority method)
    //5. sleep()->in sleep method we can pass time   , yield() , join() ,( suspend() , stop() , destroy() , resume() )->deprecate method     (preventing method)
    //6. interrupted() , isinterrupted() , interrupted() --->(interrupted method)
    //7.class object{    wait() , notify() , notifyAll()} --->inter-thread communication
}
