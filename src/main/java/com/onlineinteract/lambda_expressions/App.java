package com.onlineinteract.lambda_expressions;

import com.onlineinteract.lambda_expressions.basic.FileFilterExample;
import com.onlineinteract.lambda_expressions.basic.ThreadLambda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Lambda examples!\n" );
        ThreadLambda.main(args);
        Thread.sleep(1000);
        System.out.println();
        FileFilterExample.main(args);
    }
}
