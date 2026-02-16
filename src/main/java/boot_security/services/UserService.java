package boot_security.services;

import boot_security.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user, List<Long> roleIds);
    void updateUser(User user, List<Long> roleIds);
    void deleteUser(Long id);
    User findByUsername(String username);
}
