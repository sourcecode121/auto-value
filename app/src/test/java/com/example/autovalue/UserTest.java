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
    private User user3;
    private User user4;

    @Before
    public void setUp() throws Exception {
        user1 = User.builder()
                .firstName("first")
                .lastName("last")
                .age(40)
                .isRegistered(true)
                .build();
        user2 = User.builder()
                .firstName("first")
                .lastName("last")
                .age(40)
                .isRegistered(true)
                .build();
    }

    @Test
    public void shouldCheckValueTypes() throws Exception {

        assertEquals(user1, user2);
    }

    @Test
    public void shouldCreateAndVerifyNewObjects() throws Exception {
        user3 = user1.toBuilder().age(44).build();
        user4 = user2.with(44);

        assertEquals(user3, user4);
    }
}