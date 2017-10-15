
package com.guan.test.thread;

public class MyRunnable implements Runnable
{

    @Override
    public void run()
    {
        System.out.println( "into thread" );
        throw new RuntimeException();
    }

}
