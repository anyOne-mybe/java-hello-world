
package com.guan.test.bingfa;

import java.util.concurrent.BlockingQueue;

public class Cunsumer implements Runnable
{

    private BlockingQueue<String> blockingQueue;
    
    public Cunsumer( BlockingQueue<String> blockingQueue )
    {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run()
    {

        try
        {
            blockingQueue.take();
            System.out.println( "take value 1" );

            blockingQueue.take();
            System.out.println( "take value 1" );
        } catch ( InterruptedException e )
        {

            e.printStackTrace();
        }

    }

}
