public class MultiLevelInheritance {
    public static void main(String[] args) {
        new Employee(); 
        
    }
}

class Company{

    String getName() {
        return "VA Technolozies";
    }

    int getId() {
        return 123;
    }
}

class Accounts extends Company {
    
    int getAccount() {
       return 897453;
    }
}

class Employee extends Accounts {
    public Employee(){
        System.out.println("Name :- " +getName());
                System.out.println("ID :- " +getId());
                        System.out.println("Account :- " +getAccount());
    }
    
}
