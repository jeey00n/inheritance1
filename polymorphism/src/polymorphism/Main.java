package polymorphism;

public class Main {

	public static void main(String[] args) {
		// //Super클래스의 인스턴스 생성
		// Super base = new Super();
		// //Sub클래스의 인스턴스 생성
		// Sub drive = new Sub();
		//
		// //상위 클래스 타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있다.
		// //상위클래스 이름 = new 하위생성자();
		// Super ob1 = new Sub();
		//
		// //하위 클래스 타입의 변수에 상위 클래스 타입의
		// //인스턴스 주소를 대입하는 것은 강제 형변환을 통해서만 가능하다.
		// //문제가 발생할 수 있다. - 예외가 발생합니다.
		//
		// Sub ob2 = (Sub)(new Super());
		// //빨간 줄이 그어지는 것은 오류(에러)고
		// //예외는 실행하다가 튕기는 것을 말한다.

		// 상위 클래스 타입의 변수에 하위 클래스 타입의 주소를 대입할 수 있다.
		// obj는 기본적으로 Super의 것만 호출할 수 있다.
		// Super obj=new Sub();
		// obj.display();
		// ※※※)오버라이딩 안된건 Super것을 부르는데, 오버라이딩 돼 있는 건 Sub을 부른다.
		// 문법이니까 그냥 외우자.

		// 오버라이딩 된 메소드는 변수를 선언할 때 사용한 자료형이 아니라
		// 인스턴스를 만들어서 대입할 때 사용한 자료형의 것을 호출한다.
		Super obj = new Super();
		obj.display(); // Super의 display

		obj = new Sub(); // obj가 상위의 것이니까 된다.
		obj.display(); // Sub의 display
		// 같은 코드인데 서로 다른 내용을 수행한다. 이것이 다형성이다.
		//예시로 폰에서 설정-언어를 누를 때, 똑같은 방식으로 쓰지만 다양한 언어가 출력되는 것 등.
		
		//1. 상속관계 만듦
		//2. 오버라이딩을 만듦
		//1+2->다형성

	}

}
