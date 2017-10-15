
package com.guan.test.string;

import java.util.StringJoiner;
import org.junit.Test;

public class JunitDemo
{

    @Test
    public void test001()
    {

        StringJoiner sj = new StringJoiner( "p", ";", "l" );

        StringJoiner sj2 = new StringJoiner( "p" );
        sj2.setEmptyValue( "xx" );
        for ( int i = 0; i < 1; i++ )
        {
            sj.add( "哈儿" );
            sj2.add( "哈儿" );
        }

        System.out.println( sj.toString() );
        System.out.println( sj2.toString() );

        System.out.println( sj.length() );

    }

    @Test
    public void test002()
    {
        String str1 = "aaa" + 123;
        String str2 = "bbb" + "ccc";

        System.out.println( str1 + str2 );
    }
}
