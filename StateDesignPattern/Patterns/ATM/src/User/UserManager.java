package src.User;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    Map<Integer, User> userMap;

    public UserManager(){
        userMap= new HashMap<>();
    }

    public User getUser(int cardNo) throws Exception{
        if(!userMap.containsKey(cardNo)) {
            throw new Exception("User not found!");
        }
        return userMap.get(cardNo);
    }

    public void updateUser(User user){
        userMap.put(user.getCardNo(), user);
    }


    public void addUser(int accountBalance, int id, int pin, int cardNo) throws Exception{
        if(userMap.containsKey(cardNo)){
            throw new Exception("User " + cardNo +" already Exists!, updating amount");
        }
        User user = new User(accountBalance ,id, pin, cardNo);
        userMap.put(cardNo, user);
        System.out.println("User added successfully!");
    }

    public void deleteUser(int cardNo) throws Exception{
        if(!userMap.containsKey(cardNo)){
            throw new Exception("User already deleted!");
        }
        userMap.remove(cardNo);
        System.out.println("User removed successfully!");
    }

}
