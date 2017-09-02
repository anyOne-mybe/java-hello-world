
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
            blockingQueue.put( "str1" );
            System.out.println( "put value 1" );
            Thread.sleep( 1000 );
            blockingQueue.put( "str2" );
            System.out.println( "put value 2" );
            Thread.sleep( 1000 );
            blockingQueue.put( "str3" );
            System.out.println( "put value 3" );
            Thread.sleep( 1000 );
        } catch ( InterruptedException e )
        {

            e.printStackTrace();
        }

    }

}
