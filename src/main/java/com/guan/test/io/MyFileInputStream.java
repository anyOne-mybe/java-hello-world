
package com.guan.test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream extends FileInputStream
{

    public MyFileInputStream( File file ) throws FileNotFoundException
    {
        super( file );
        // TODO Auto-generated constructor stub
    }

    @Override
    public void close() throws IOException
    {
        System.out.println( "into auto close " );
        super.close();
    }

}
