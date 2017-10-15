
package com.guan.test.rabbitMQ;

import java.io.IOException;

import org.junit.Test;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Demo
{

    @Test
    public void test001() throws Exception
    {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost( "localhost" );
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare( "queueName", false, false, false, null );
        String msg = "hello world";
        channel.basicPublish( "", "queueName", null, msg.getBytes() );
        channel.close();
        connection.close();
    }

    @Test
    public void test002() throws Exception
    {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost( "localhost" );
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare( "queueName", false, false, false, null );

        Consumer consumer = new DefaultConsumer( channel )
        {
            @Override
            public void handleDelivery( String consumerTag, Envelope envelope,
                    AMQP.BasicProperties properties, byte[] body )
                    throws IOException
            {
                String message = new String( body, "UTF-8" );
                System.out.println( " [x] Received '" + message + "'" );
            }
        };
        channel.basicConsume( "queueName", true, consumer );

        channel.close();
        connection.close();
    }
}
