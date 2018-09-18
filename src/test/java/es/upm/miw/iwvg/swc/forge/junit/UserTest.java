package es.upm.miw.iwvg.swc.forge.junit;

import es.upm.miw.iwvg.swc.forge.junit.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(12, "Vanesa", "Paniego");
    }

    @Test
    void testUserFullName() {
        Assertions.assertEquals("Vanesa Paniego", user.getName() + " " + user.getFamilyName());
    }

    @Test
    void testUserInitials() {
        Assertions.assertEquals("V.", user.initials());
    }

    @Test
    void testUserNumber() {
        Assertions.assertEquals(12, user.getNumber());
    }

    @Test
    void testUserName() {
        Assertions.assertEquals("Vanesa", user.getName());
    }

    @Test
    void testUserFamilyName() {
        Assertions.assertEquals("Paniego", user.getFamilyName());
    }

}
