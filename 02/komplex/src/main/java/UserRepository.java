import java.util.ArrayList;
import java.util.List;

public class UserRepository implements UserModify {
    private List<User> users = new ArrayList<>();
    public void save(User user) {
        System.out.printf("%s mentve%n", user.getName());
        users.add(user);
    }
    public User getByNeptunKod(String neptunkod) {
        for (User user : users) {
            if (user.getNeptunkod().equals(neptunkod)) {
                return user;
            }
        }
        return null;
    }
    public List<User> findAll() {
        return users;
    }
    public List<User> findByEnabledIsTrue() {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.isEnabled()) {
                result.add(user);
            }
        }
        return result;
    }
}
