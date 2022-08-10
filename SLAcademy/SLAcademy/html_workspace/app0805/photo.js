/*
현실의 사진 및 부가정보를 가진 단위를 객체화 시켜보자
이점 -> 이미지 경로뿐만 아니라, 훨씬 더 많은 정보를 담아낼 수 있다.
참고) 2015년도 발표된 자바 스크립트에서는 클래스를 지원한다.
*/

class Photo {
	constructor() {
		// 멤버변수 영역
		this.img = document.createElement("img");	// img dom
		this.src = src;	// 경로
		this.title = title;	// 사진 제목
		this.addr = addr;	// 사진 주소
		this.content = content;	// 사진에 대한 설명

		this.img = this.src;	// 
		document.body.appendChild(this.img);

	}
}