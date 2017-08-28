
package com.guan.test.normal.bingfa;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

public class HelloWorld
{

    @Test
    /**
     * 锁分段技术实现
     */
    public void test001()
    {
        int capacity = 16;
        float loadFactor = 0.75f;
        int concurrencyLevel = 16;// 并发发的线程数保持一致比较好
        ConcurrentHashMap<String, String> cHashMap = new ConcurrentHashMap<>(
                capacity, loadFactor, concurrencyLevel );

        String key = "helloKey";
        String value = "asdfa";

        cHashMap.put( key, value );

        cHashMap.replace( key, "asdfa", "aaa" );

        System.out.println( cHashMap.get( key ) );
    }

    @Test
    public void test002()
    {
        // 获取cpu数量
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println( count );
    }

}
