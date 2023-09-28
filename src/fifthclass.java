//Deamon thread are those thread which is run in the background of another thread
//it provide the service to the thread
//eg : Garbge collection  , finalizer
//Method :public final void setDeamon(boolean b){}
//    public final boolean isDeamon(){return true;}

public class fifthclass  extends  Thread{

    public void run()
    {

        if(Thread.currentThread().isDaemon()){
        System.out.println("Deamon Thread");}else{
            System.out.println("Child thread");
        }
    }

    public static void main(String []args){

        System.out.println("Main thread");

        // case 1 : when ever your create a daemon thread it will start before the start method. if you write a daemon method after start method then
        //it will throw run time exception i.e illigalexceptionstateException

        //case 2 : we cannot create main thread of deamon thread it will also throw exception
        // case 3: a deamon thread also a live same as a another or parent thread
        //case 4 :deamon thread nature it inherit the property from its parent thread
        //case 5 : JVM role in Deamon thread
        //case 6 : Most of times, deamon thread has low priority but we can change its priority according to our needs.
        fifthclass f=new fifthclass();
        f.setDaemon(false); //way to create deamon thread
        f.start();

    }
}
