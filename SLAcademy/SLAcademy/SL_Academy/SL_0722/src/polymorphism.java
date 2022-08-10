class Product {
    // 다형성
    public void print() {
        System.out.println("나는 Product 입니다.");
    }
}

class Monitor extends Product {

    @Override
    // 오버라이딩이 없으면 오류가 발생한다. 불려지지 않는다.
    public void print() {
        System.out.println("나는 Monitor 입니다.");
    }

}

class Mouse extends Product {
    @Override
    public void print() {
        System.out.println("나는 Mouse 입니다.");
    }
}


public class polymorphism {
    public static void main(String[] args) {
//        // 상품이 들어갈 그릇
//        Product product = new Product();
//        // 상품들
//        Mouse mouse = new Mouse();
//        Monitor monitor = new Monitor();
//        // 그릇에 마우스가 들어간
//        Product product1 = new Monitor();

        // int []  a = {1,2,3,"4"}
//        Product[] p = {monitor, mouse};

        Product product = new Product();
        product.print();
        // 마우스의 메서드를 호출
        Product product1 = new Mouse();
        product1.print();
        // 모니터의 메서드를 호출
        Product product2 = new Monitor();
        product2.print();
    }
}
