public class EmployeeClassProxy implements Employee{

    EmployeClassImpl employee;

    EmployeeClassProxy(){
        employee=new EmployeClassImpl();
    }

    @Override
    public void createUser(String role, int id) throws UnauthorizedException {
        if(role.equals("ADMIN")){
            employee.createUser("admin", id);
            System.out.println("User Created successfully!");
            return;
        }
        throw new UnauthorizedException("Unauthorized!!");
    }

    @Override
    public User getUser(String role, int id) throws UserNotFoundException, UnauthorizedException{
        if(role.equals("ADMIN") || role.equals("NORMAL")){
            return employee.getUser(role, id);
        }
        throw new UnauthorizedException("Unauthorized!!");
    }

    @Override
    public void deleteUser(String role, int id) throws UnauthorizedException, UserNotFoundException {
        if(role.equals("ADMIN")){
            employee.deleteUser(role, id);
            System.out.println("User Deleted!");
            return;
        }
        throw new UnauthorizedException("Unauthorized!!");
    }
}
