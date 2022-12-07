public class Employee {
    private String name;
    private long pps;

    public Employee(){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 5 || name.length() <= 22){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name Provided is not valid");
        }
    }

}
