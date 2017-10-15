
package com.guan.test.bingfa;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

public class Automic implements Runnable
{

    private AtomicReference<String> atomicString;

    public Automic( AtomicReference<String> atomicString )
    {
        this.atomicString = atomicString;
    }

    public static void main( String[] args )
    {
        AtomicReference<String> atomicString = new AtomicReference<String>(
                "abc" );

        Automic automic = new Automic( atomicString );

        for ( int i = 0; i < 100; i++ )
        {
            new Thread( automic ).start();
        }

    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep( 1000 );
            if ( this.atomicString.compareAndSet( "abc", "fuck" ) )
            {
                System.out.println( "Thread " + Thread.currentThread().getName()
                        + " change value , result is " + atomicString.get() );
            } else
            {
                System.out.println( "Thread " + Thread.currentThread().getName()
                        + " faild  , result is " + atomicString.get() );
            }
            ;
        } catch ( InterruptedException e )
        {
            e.printStackTrace();
        }

    }

}
