package com.creaturelove.serializer;

import junit.framework.TestCase;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class JdkSerializerTest
    extends TestCase
{
    public void testSerializer() throws IOException {
        Serializer s = new JdkSerializer();
        String sd = "make";

        System.out.println(s.deserialize(s.serialize(sd), String.class));
    }
}
