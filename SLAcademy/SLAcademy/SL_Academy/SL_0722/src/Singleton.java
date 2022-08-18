
class Me {  //

    // static이 붙어야 하는 상황이 맞는건지
    // 나는 하나니까 static을 붙인다.
    private static String name;
    private int age;
    private String address;

    private static final Me ME = new Me("양형준", 25, "인천 연수구");

    // 객체를 외부에서 만들지 못하게, 수정 불가능하게
    public static Me getMe() {
        return ME;
    }
    // 여기까지가 싱글톤에서의 차이점

    Me() {

    }

    public Me(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Phone {
    private static String name;
    private static String number;

    private static final Phone PHONE = new Phone("iPhone 14 Pro Max", "010-4444-4444");
//    public static final Phone PHONE  =  new Phone("iPhone 14 Pro Max", "010-4444-4444");
//  두 개의 차이 : public 으로도 작성은 해도 된다. 어차피 상수이기 때문에 건들지는 못하기 때문,

    public static Phone getPhone() {
        return PHONE;
    }

    private Phone(String name, String number) {   // 생성자도 변경못하게
        this.name = name;
        this.number = number;
    }

}

class Person {
    private String name;
    private int age;
    private String identity;

    public Person() {
    }

    public Person(String name, int age, String identity) {
        this.name = name;
        this.age = age;
        this.identity = identity;
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void print() {
        System.out.print(name + " ");
        System.out.print(age + " ");
        System.out.println(identity);
    }

}

public class Singleton {

    public static void main(String[] args) {

        Person person1 = new Person("홍길동", 20, "학생");
        Person person2 = new Person("김길동", 30, "군인");

        person1.print();
        person2.print();

    }
}
