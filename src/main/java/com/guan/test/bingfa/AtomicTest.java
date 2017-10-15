
package com.guan.test.bingfa;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class AtomicTest
{
    @Test
    public void test001()
    {
        AtomicInteger atomicInteger = new AtomicInteger( 100 );
        int value = atomicInteger.getAndIncrement();
        System.out.println( value );
        System.out.println( atomicInteger.get() );
    }

}
