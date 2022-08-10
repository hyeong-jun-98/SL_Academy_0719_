// 배너에 사용할 상품용 객체 정의
class Product {
    constructor(container, src, width, height, x, y) {
        this.container = container;
        this.img = document.createElement("img");
        this.src = src;
        this.width = width;
        this.height = height;
        this.x = x; //  현재 left 값s
        this.y = y;

        this.img.src = this.src;        // img Dom 경로지정
        this.img.style.width = this.width + "px";
        this.img.style.height = this.height + "px";
        this.img.style.position = "absolute";
        this.img.style.left = this.x + "px";
        this.img.style.top = this.y + "px";

        // 생성된 돔 객체를 원하는 부모요소에 부착
        this.container.appendChild(this.img);

        // 이미지를 대상으로 마우스 이벤트 연결
        this.img.addEventListener("mouseover", function () {
            // 현재 돌아가는 루프를 잠시 멈춘다.
            flag = false;
        })

        this.img.addEventListener("mouseout", function () {
            // 현재 돌아가는 루프를 다시 실행
            flag = true;
        })
        this.img.addEventListener("click", function () {
            window.open(this.src, "_blank");
        })
    }

    // 물체 이동 메서드 (생성 후에도 left 값을 변경하여 좌표에 적용할 것)
    move() {
        this.img.style.left = this.x + "px";
        if (this.x == -this.width + 5) {
            this.x = (this.width + 5) * 6;
        }
    }

}