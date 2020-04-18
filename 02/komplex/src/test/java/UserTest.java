import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void getNameTest() {
        //mock
        User user = mock(User.class);
        //when
        when(user.getName()).thenReturn("Andrew");
        //assert
        assertEquals(user.getName(), "Andrew");
    }

    @Test
    void isEnabledTest() {
        //mock
        User user = mock(User.class);
        //when
        when(user.isEnabled()).thenReturn(true);
        //assert
        assertEquals(user.isEnabled(), true);
    }

    @Test
    void getNeptunkodTest() {
        //mock
        User user = mock(User.class);
        //when
        when(user.getNeptunkod()).thenReturn("ZBTTG4");
        //assert
        assertEquals(user.getNeptunkod(), "ZBTTG4");
    }
}