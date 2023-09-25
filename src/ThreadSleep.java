
//sleep is a static method

//public class ThreadSleep{
//    public static void main(String[] args) {
//        for(int i=1;i<5;i++){
//            try{
//                Thread.sleep(1000);
//                System.out.print(i + " ");
//                Thread.sleep(2000);
//            }catch (InterruptedException e){
//                System.out.println(e);
//            }
//
//
//        }
//    }
//}


public class ThreadSleep extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
                Thread.sleep(1000,9999); //if you put negitive value then they throw exception ->Illegal Argument Exception
            System.out.print(i +  " ");
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        ThreadSleep ts=new ThreadSleep();
        ts.start();

    }
}


