
package com.guan.test.bingfa;

import java.util.concurrent.BlockingQueue;

public class Producter2 implements Runnable
{

    private BlockingQueue<String> blockingQueue;

    public Producter2( BlockingQueue<String> blockingQueue )
    {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run()
    {

        for ( int i = 0; i < 20; i++ )
        {
            boolean result = blockingQueue.offer( i + "" );
            System.out.println( result );
        }

    }

}
