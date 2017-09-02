
package com.guan.test.bingfa;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import org.junit.Test;

public class CyclicBarrierTest
{
    @Test
    public void test001()
    {

        CyclicBarrier cyclicBarrier = new CyclicBarrier( 2,
                new BarrierRunnable() );

        new Thread( new DetailRunnable( "深圳", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "湖南", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "四川", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "重庆", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "广电", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "背景", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "上海", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "拉萨", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "西藏", cyclicBarrier ) ).start();
        new Thread( new DetailRunnable( "常德", cyclicBarrier ) ).start();

    }

    class BarrierRunnable implements Runnable
    {

        @Override
        public void run()
        {
            System.out.println( "所以省份统计完成，开始全国汇总" );

        }

    }

    class DetailRunnable implements Runnable
    {

        private String provicence;
        private CyclicBarrier cyclicBarrier;

        public DetailRunnable( String provicence,CyclicBarrier cyclicBarrier )
        {
            super();
            this.provicence = provicence;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run()
        {
            // System.out.println( "开始统计：" + this.provicence );

            System.out.println( "统计完成：" + this.provicence );
            try
            {
                this.cyclicBarrier.await();
            } catch ( InterruptedException e )
            {
                e.printStackTrace();
            } catch ( BrokenBarrierException e )
            {
                e.printStackTrace();
            }

        }

    }
}
