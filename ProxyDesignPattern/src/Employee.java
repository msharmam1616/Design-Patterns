public interface Employee {
    void createUser(String role, int id) throws UnauthorizedException;
    User getUser(String role,int id) throws UnauthorizedException, UserNotFoundException;
    void deleteUser(String role, int id) throws UnauthorizedException, UserNotFoundException;
}
