
package com.guan.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class ThreadDemo
{

    @Test
    public void test001()
    {

        MyRunnable runnable = new MyRunnable();

        try
        {
            ExecutorService executorService = Executors.newFixedThreadPool( 5 );
            executorService.execute( runnable );

        } catch ( Exception e )
        {// 线程中的异常必须在run方法里面抓，否则会直接抛出到控制台
            System.out.println( "catch exception" );
        }
    }
}
