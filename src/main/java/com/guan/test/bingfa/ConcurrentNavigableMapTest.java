
package com.guan.test.bingfa;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

import org.junit.Test;

public class ConcurrentNavigableMapTest
{

    @Test
    public void test001()
    {
        ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put( "1", "value1" );
        map.put( "2", "value1" );
        map.put( "3", "value1" );
        map.put( "4", "value1" );
        map.put( "5", "value1" );

        ConcurrentNavigableMap<String, String> headMap = map.headMap( "3" );

        ConcurrentNavigableMap<String, String> tailMap = map.tailMap( "3" );

        ConcurrentNavigableMap<String, String> subMap = map.subMap( "2", "4" );

        Set<Entry<String, String>> hEntrys = subMap.entrySet();
        for ( Entry<String, String> entry : hEntrys )
        {
            System.out.println( entry.getKey() + " : " + entry.getValue() );
        }

    }
}
