package practiceforoop;

public abstract class Employee {
    private String name;
    private String officeType;
    
    public Employee(String name){
        this.name = name;
    }
    
    public abstract void doWork();
    
    public String getOffice(int index){
        Departman dep = new Departman();
        if (index == 1){
            officeType = dep.getTypeOfOffice(0);
        } else if (index == 2){
            officeType = dep.getTypeOfOffice(1);
        } else if (index == 3){
            officeType = dep.getTypeOfOffice(2);
        } else {
            System.out.println("You entered an incorrect index");
        }
        return officeType;
    }
}

