package practiceforoop;

public class Chief extends Employee implements Salary{
    public Chief(String name){
        super(name);
        System.out.println("Created Chef - " + name + "\n");
    }
    
    public void doWork(){
        System.out.println("I manage staff. I work hard.\n");
    }
    
    public int getSalary(){
        System.out.print("I work hard, so I have big salary: ");
        return 100000;
    }
    
}
