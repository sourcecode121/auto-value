package com.example.autovalue;

import com.google.auto.value.AutoValue;

/**
 * Created by Anand on 05/10/2016.
 */
@AutoValue
public abstract class User {
    public abstract String firstName();
    public abstract String lastName();
    public abstract int age();
    public abstract boolean isRegistered();

    public abstract Builder toBuilder();

    public User with(int age) {
        return toBuilder().age(age).build();
    }

    public static Builder builder() {
        return new AutoValue_User.Builder()
                    .isRegistered(false);   // default value
    }

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder firstName(String firstName);
        public abstract Builder lastName(String lastName);
        public abstract Builder age(int age);
        public abstract Builder isRegistered(boolean isRegistered);
        public abstract User build();
    }
}
