package com.creaturelove;

import com.creaturelove.serializer.JdkSerializer;
import com.creaturelove.serializer.Serializer;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testSerializer() throws IOException {
        Serializer s = new JdkSerializer();
        String sd = "make";

        System.out.println(s.deserialize(s.serialize(sd), String.class));
    }
}
