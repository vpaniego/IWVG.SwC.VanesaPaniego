package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User user;

    @BeforeEach
    void before(){
        user = new User(12, "Pepe", "Lopez");
    }

    @Test
    void testUserNotNull(){

        Assertions.assertNotNull(user);
    }

    @Test
    void testUserFamilyName(){
        Assertions.assertNotEquals("Sanchez", user.getFamilyName());
    }
}
