package es.upm.miw.iwvg.swc.forge.junit;

import es.upm.miw.iwvg.swc.forge.junit.User;
import org.apache.logging.log4j.LogManager;
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

    @Test
    void testMayusculasNombreCompleto(){
        Assertions.assertEquals("PEPE MOLINA", new User(21, "Pepe", "Molina").mayusculasNombreCompleto());
    }

    @Test
    void testMayusculasNombreCompleto_IllegalArgumentException_null(){
        IllegalArgumentException exceptionName = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User(2, null, "Pedro").mayusculasNombreCompleto());
        LogManager.getLogger(this.getClass()).debug(exceptionName.getMessage());
    }

    @Test
    void testMayusculasNombreCompleto_IllegalArgumentException_empty() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User(2, "pedro", "").mayusculasNombreCompleto());
        LogManager.getLogger(this.getClass()).debug(exception.getMessage());
    }

    @Test
    void testMayusculasNombreCompleto_IllegalArgumentException_blank() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User(2, " ", "pino").mayusculasNombreCompleto());
        LogManager.getLogger(this.getClass()).debug(exception.getMessage());
    }


}
