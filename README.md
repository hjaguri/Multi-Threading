# Multi-Threading
difference between yield , sleep , join 
These thread are temporary stop the  thread exection 
**1.purpose** 
    sleep : if any thread does not want to perfrom any operation for particular time.
    yield : it stop the current executing thread and provide chance to another thread of same or higher priority to execute.
    join : if a thread want to wait for thread to complete the task .
**2.Example**
  sleep : timmer , ppt , blinking blub
  yield : shopping 
  join : Licence department
  **3.Invoke**
  sleep : it invoke the automatically after provide the time period and if thread is interrupted.
  yield : automatically invoke by thread scheduler
  join : automatically invoke after complation of the another thread task and after completion of time period and thread is interrupted
  **Method**
  sleep : sleep(long ms)**(native method)** , sleep(long ms , int ns)
  yield : yield()**(native method)**;
  join : join() , join(long ms) , join(long ms , int ns)
  **Method overloading**
  sleep : Yes we can overload the sleep method
  yield : No
  join : Yes
  **Exception**
  sleep : they throw the exception that is interrrupted Exception
  yield : No 
  join : They throw the exception that is interrupted Exception
**Final method**
sleep : The sleep is not final method
yield : The yield is not final method
join : The join is final method
**Static Method**
sleep : The sleep is static method 
Yield : This yield method is static 
join : Join is not static 
