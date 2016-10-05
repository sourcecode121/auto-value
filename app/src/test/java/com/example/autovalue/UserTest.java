package com.example.autovalue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anand on 06/10/2016.
 */
public class UserTest {

    private User user1;
    private User user2;

    @Before
    public void setUp() throws Exception {
        user1 = User.with("first", "last");
        user2 = User.with("first", "last");
    }

    @Test
    public void shouldCheckValueTypes() throws Exception {

        assertEquals(user1, user2);
    }
}