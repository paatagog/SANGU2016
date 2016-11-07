package ge.sangu.nikoloz.homework;

/**
 * Created by Nikoloz on 11/7/2016.
 */
public class Davaleba5_Students implements Davaleba5_Human {
    private String name;
    private int age;

    @Override
    public void LeaveCountry() {
        System.out.println(this.name +" Whith age: " +this.age + " Has Left Country");
    }

    @Override
    public void EnterCountry() {
        System.out.println(this.name +" Whith age: " +this.age + " Has Left Country");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
