package com.tollfree;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class InputStreamWrapperTest {

    @Test
    public void testRead() throws IOException {
        // setup
        // Create stream object that contain 2 numbers
        InputStreamWrapper in = new InputStreamWrapper();
        byte[] data = "123\n 456".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        // execute
        // some operation i.e. read
        in.read(input);

        // verify
        // the numbers in file are read (i.e. not null) & assert the actual values
        assertEquals("123", in.numbers.get(0));
        assertEquals("456", in.numbers.get(1));
    }
}