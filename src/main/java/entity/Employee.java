package entity;

public class Employee {

    private Integer id;

    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    public static void main(String[] args) {
        try {
            System.out.println(Employee.class.getClassLoader().loadClass("com.test.String"));;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
