class IronMan extends Avengers implements Smoker  {
    private int age;

    public IronMan(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("age : " + age);
    }

    @Override
    public void Attack() {
        System.out.println("빔~~");
    }

    @Override
    public void d() {
        // 완성은 여기서
    }
}
class Hulk extends Avengers {
    private int size;

    public Hulk(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("size : " + size);
    }

    @Override
    public void Attack() {
        System.out.println("퍼언치이~");
    }
}

public class Abstract {
    public static void main(String[] args) {
//        IronMan avengers = new IronMan("아이언맨", 40);
//        Hulk avengers1 = new Hulk("헐크", 100);
//        avengers.print();
//        avengers.Attack();
//        avengers1.print();
//        avengers1.Attack();
//
//        Avengers a = new Avengers("어벤져스") {
//
//            @Override
//            // 객체를 만들면서 1회용으로 class를 만드는 그런 상황이다.
//            //익명 클래스
//            public void Attack() {
//                System.out.println("맷집 +1000");
//            }
//        };
//        a.print();
//        a.Attack();
    }
}
