
package com.guan.test.bingfa;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.junit.Test;

public class BlockingQueueTest
{

    @Test
    public void test001() throws InterruptedException
    {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>( 10 );

        Producter producter = new Producter( blockingQueue );

        Cunsumer cunsumer = new Cunsumer( blockingQueue );

        new Thread( producter ).start();

        new Thread( cunsumer ).start();

        Thread.sleep( 100000 );
    }

    @Test
    public void test002() throws InterruptedException
    {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>( 10 );

        Producter2 producter2 = new Producter2( blockingQueue );

        new Thread( producter2 ).start();

        Thread.sleep( 100000 );
    }
}
