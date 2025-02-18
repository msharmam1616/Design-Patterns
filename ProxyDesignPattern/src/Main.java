public class Main {
    public static void main(String[] args) {

            EmployeeClassProxy employeeProxy = new EmployeeClassProxy();

            try {
                employeeProxy.createUser("NORMAL", 1);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        try {
            employeeProxy.createUser("ADMIN", 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            employeeProxy.createUser("ADMIN", 2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            employeeProxy.getUser("NORMAL", 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            employeeProxy.deleteUser("ADMIN", 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            employeeProxy.getUser("ADMIN", 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}