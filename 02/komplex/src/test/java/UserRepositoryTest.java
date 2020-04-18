import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;

class UserRepositoryTest {
    UserRepository userRepository = new UserRepository();

    @Test
    public void SaveTest() {
        //mock
        User user = mock(User.class);
        //when
        when(user.getName()).thenReturn("Andrew");
        userRepository.save(user);
        //assert
        assertEquals(userRepository.findAll().get(0), user);
        assertEquals(userRepository.findAll().size(), 1);
    }

    @Test
    public void GetByNeptunkodTest(){
        //mock
        User user = mock(User.class);
        //when
        when(user.getNeptunkod()).thenReturn("ZBTTG4");
        userRepository.save(user);
        //assert
        assertEquals(userRepository.getByNeptunKod("ZBTTG4"), user);
        assertEquals(userRepository.getByNeptunKod(""), null);
    }

    @Test
    public void FindByEnabledIsTrueTest() {
        //mock
        User user = mock(User.class);
        User user1 = mock(User.class);
        //when
        when(user.isEnabled()).thenReturn(true);
        when(user1.isEnabled()).thenReturn(false);
        userRepository.save(user);
        userRepository.save(user1);
        //assert
        assertEquals(userRepository.findByEnabledIsTrue().get(0), user);
        assertEquals(userRepository.findByEnabledIsTrue().size(), 1);
    }
}