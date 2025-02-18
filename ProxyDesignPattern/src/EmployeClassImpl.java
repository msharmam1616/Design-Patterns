import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class EmployeClassImpl implements Employee{

    Map<Integer,User> userMap = new HashMap<>();

    @Override
    public void createUser(String role, int id) {
        userMap.put(id, new User(role, id));
    }

    @Override
    public User getUser(String role, int id) throws UserNotFoundException {
        User foundUser= userMap.get(id);
        if(foundUser == null){
            throw new UserNotFoundException("User with id " + id + " Not found!");
        }
        return foundUser;
    }

    @Override
    public void deleteUser(String role, int id) throws UserNotFoundException {
        User foundUser= userMap.get(id);
        if(foundUser == null) {
            throw new UserNotFoundException("User with id " + id + " Not found!");
        }
        userMap.remove(id);
        System.out.println("User with id " + id + " Deleted!");
    }
}
