//hi
/*
 width, height 는 static으로 선언되어야 하고, 
kind , number 는 그냥 인스턴스 변수 였죠
Card 클래스의 객체를 2개 만들어서 그중하나만
static 변수를 바꿔 줬을때, 다른 하나도 바뀌는지 확인
 */
class Card{
  String		kind;						//무늬
	int				number;					//숫자
	static int	width		=	100;		//폭
	static int 	height	=	250;		//높이
}
public class CardExam {
	public static void main(String[] args) {
		Card card_1 = new Card();
		Card card_2 = new Card();//카드 객체 두개
		card_1.kind = "Diamond";		//무늬 지정
		card_1.number = 2;				//숫자 지정
		card_2.kind = "Heart";		//무늬 지정
		card_2.number = 9;				//숫자 지정
		
		System.out.println("카드1의 무늬 : "+card_1.kind+" , 숫자 : "+card_1.number+" , 폭 : "+card_1.width+" , 높이 : "+card_1.height+" ");
		System.out.println("카드2의 무늬 : "+card_2.kind+" , 숫자 : "+card_2.number+" , 폭 : "+card_2.width+" , 높이 : "+card_2.height+" ");
		
		System.out.println("----------------------");
		card_1.number = 7;				//숫자 수정
		card_2.kind = "Spade";		//무늬 수정
		
		System.out.println("카드1의 무늬 : "+card_1.kind+" , 숫자 : "+card_1.number+" , 폭 : "+card_1.width+" , 높이 : "+card_1.height+" ");
		System.out.println("카드2의 무늬 : "+card_2.kind+" , 숫자 : "+card_2.number+" , 폭 : "+card_2.width+" , 높이 : "+card_2.height+" ");
		
		System.out.println("----------------------");
		card_1.width = 777;				//카드1의 static 변수 변경
		
		System.out.println("카드1의 무늬 : "+card_1.kind+" , 숫자 : "+card_1.number+" , 폭 : "+card_1.width+" , 높이 : "+card_1.height+" ");
		System.out.println("카드2의 무늬 : "+card_2.kind+" , 숫자 : "+card_2.number+" , 폭 : "+card_2.width+" , 높이 : "+card_2.height+" ");
		
		System.out.println("----------------------");
		card_2.height= 321;				//카드2의 static 변수 변경
		
		System.out.println("카드1의 무늬 : "+card_1.kind+" , 숫자 : "+card_1.number+" , 폭 : "+card_1.width+" , 높이 : "+card_1.height+" ");
		System.out.println("카드2의 무늬 : "+card_2.kind+" , 숫자 : "+card_2.number+" , 폭 : "+card_2.width+" , 높이 : "+card_2.height+" ");
		
		System.out.println("----------------------");

	}
}
