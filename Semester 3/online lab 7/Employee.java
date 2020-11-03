/**
 * Employee
 */
public class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (id > 0) ? (this.id = id) : (this.id = 0);
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    public Employee(String name, int id) {
        setId(id);
        setName(name);
    }

}