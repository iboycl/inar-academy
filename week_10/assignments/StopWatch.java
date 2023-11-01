package week_10.assignments;


//UML Class Diagram
/***************************************************
 *               StopWatch                         *
 * ------------------------------------------------*
 * startTime: long                                 *
 * endTime: long                                   *
 * +StopWatch()                                    *
 * +start() : void                                 *
 * +stop() : void                                  *
 * +getElapsedTime() long                          *
 ***************************************************/
public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch(){
        startTime = System.currentTimeMillis();
    }


    void start(){
        startTime = System.currentTimeMillis();
    }

    void stop(){
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime(){
        return endTime - startTime;
    }
}
