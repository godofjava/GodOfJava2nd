public class MyProfile {
    String name = "default";
    int age = 0;

    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setName("choco-chanel");
        profile.setAge(25);
        profile.printName();
        profile.printAge();
    }

    public void setName(String str) {
        name = str;
    }

    public void setAge(int value) {
        age = value;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }

    public void printAge() {
        System.out.println("My age is " + age);
    }
}