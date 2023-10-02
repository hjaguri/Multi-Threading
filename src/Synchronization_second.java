//Static Keyword with Synchronization

//Suppose there are two objects of a shared class (e.g. Table) named object1 and object2.
// In case of synchronized method and synchronized block there cannot be interference between t1 and
// t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.
// But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and
// t3 acquires another lock. We don't want  interference between t1 and t3 or t2 and t4.
// Static synchronization solves this problem.


public class Synchronization_second{
    public static void main(String[] args) {
    CarSeat c1=new CarSeat();
    a1 a=new a1(c1 , 7);
    a.start();
    b1 c=new b1( c1 , 8);
    c.start();

    CarSeat c2=new CarSeat();
    a1 b=new a1(c2,6);
    b.start();
    b1 d = new b1(c2, 7);
    d.start();
    }
}

class a1 extends Thread{
    int seat;
    CarSeat c1;
    public a1(CarSeat c1 , int seat){
        this.c1=c1;
        this.seat=seat;
    }
    @Override
    public void run() {
        c1.bookseat(seat);
    }
}

class b1 extends Thread{
    int seat;
    CarSeat a1;

    public b1(CarSeat c   , int seat){
        this.seat=seat;
        this.a1=c;
    }

    @Override
    public void run() {
        a1.bookseat(seat);
    }
}



class CarSeat{
    static int totalseat=20;
   static synchronized   void bookseat(int seat){
         if(totalseat>=seat){
             System.out.println(seat + " Seat conform SuccessFully");
             totalseat=totalseat-seat;
             System.out.println("Only " + totalseat + " available ");
         }else{
             System.out.println(seat + " Seat are not available");
         }
     }

}