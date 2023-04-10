public class MyProfile {
    private String name = "";
    private int age = -1;

    public MyProfile(String name) {
        this.name = name;
    }

    public MyProfile(int age) {
        this.age = age;
    }

    public MyProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyProfile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
