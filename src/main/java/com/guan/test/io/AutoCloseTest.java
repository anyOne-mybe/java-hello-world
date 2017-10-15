
package com.guan.test.io;

import java.io.File;
import java.util.StringJoiner;

import org.junit.Test;

public class AutoCloseTest
{

    @Test
    public void test001()
    {

        try (MyFileInputStream inputStream = new MyFileInputStream(
                new File( "D:\\ADFADF.txt" ) ))
        {
            System.out.println( String.join( "a", "b", "c" ) );

            StringJoiner joiner = new StringJoiner( "," );
            joiner.add( "四川" );
            joiner.add( "四川2" );
            joiner.add( "四川3" );
            joiner.add( "四川4" );

            System.out.println( joiner.toString() );

        } catch ( Exception e )
        {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
