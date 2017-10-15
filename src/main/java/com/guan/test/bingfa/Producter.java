
package com.guan.test.bingfa;

import java.util.concurrent.BlockingQueue;

public class Producter implements Runnable
{

    private BlockingQueue<String> blockingQueue;

    public Producter( BlockingQueue<String> blockingQueue )
    {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run()
    {

        try
        {
            int i = 0;
            while ( true )
            {
                i++;
                blockingQueue.put( "str" + i );
                System.out.println( "put value " + i );
                Thread.sleep( 100 );
            }

        } catch ( InterruptedException e )
        {

            e.printStackTrace();
        }

    }

}
