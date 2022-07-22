public class consOverload {
    String name;
    int age;
    int salary;
    int idno;
    int phone;

    public consOverload(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public consOverload(int salary, int idno, int phone) {

        this("mike", 20);
        this.salary = salary;
        this.idno = idno;
        this.phone = phone;
    }

    public consOverload() {
        System.out.println("This is default constructor!!");
    }

    public void show() {
        System.out.println("NAME : " + name + " AGE: " + age + " SALARY: " + salary + " ID : " + idno + " Phone: " + phone);
    }

}
