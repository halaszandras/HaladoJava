import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserControllerTest {
    UserService userService = mock(UserService.class);
    NeptunCodeGenerator neptunCodeGenerator = mock(NeptunCodeGenerator.class);
    UserController userController = new UserController(userService, neptunCodeGenerator);

    @Test
    void UserControllerSaveTest() {
        //mock
        UserDto userDto = mock(UserDto.class);
        userController.save(userDto);
        //verify
        verify(userService, times(1)).save(Mockito.any(User.class));
    }
}