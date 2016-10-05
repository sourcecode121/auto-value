package com.example.autovalue;

import com.google.auto.value.AutoValue;

/**
 * Created by Anand on 05/10/2016.
 */
@AutoValue
public abstract class User {
    public abstract String firstName();
    public abstract String lastName();

    public static User with(String firstName, String lastName) {
        return new AutoValue_User(firstName, lastName);
    }
}
