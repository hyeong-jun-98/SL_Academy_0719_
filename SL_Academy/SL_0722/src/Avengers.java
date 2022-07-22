// 어벤져스는 추상적인 개념이다.
public abstract class Avengers {
    private String name;

    public Avengers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("name : " + name);
    }

    public void Attack() {
        System.out.println("기본공격 ㅋ");
    }
}
