
package com.guan.test.bingfa;

import java.util.concurrent.Exchanger;

import org.junit.Test;

public class ExchangeTest
{

    @Test
    public void test001()
    {

        Exchanger<String> exchanger = new Exchanger<>();
        new Thread( new ExchangeRunnable( "Java", exchanger ) ).start();
        new Thread( new ExchangeRunnable( "入门到放弃", exchanger ) ).start();

    }

    class ExchangeRunnable implements Runnable
    {
        private String vaule;
        private Exchanger<String> exchanger;

        public ExchangeRunnable( String vaule,Exchanger<String> exchanger )
        {
            super();
            this.vaule = vaule;
            this.exchanger = exchanger;
        }

        @Override
        public void run()
        {
            System.out.println( Thread.currentThread().getName()
                    + " : first value is : " + this.vaule );
            try
            {
                this.vaule = this.exchanger.exchange( this.vaule );
            } catch ( InterruptedException e )
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println( Thread.currentThread().getName()
                    + " : after value is : " + this.vaule );

        }

    }
}
