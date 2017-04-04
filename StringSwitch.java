package control.switchcondition;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("나라 이름을 입력 :");
		String nation = input.next();
		
		switch( nation ) {
		case "한국" :
		case "일본" :
		case "중국" :
			System.out.printf("%s은(는) 아시아 입니다.\n", nation);
			break;
		case "남아프리카" : case "수단" : case "모로코" :
			System.out.printf("%s은(는) 아프리카 입니다.\n", nation);
			break;
		case "미국" : case "멕시코" : case "브라질" :
			System.out.printf("%s은(는) 아메리카 입니다.\n", nation);
			break;
		case "스위스" : case "영국" : case "독일" :
			System.out.printf("%s은(는) 유렵 입니다.\n", nation);
			break;
		default :
			System.out.printf("나라 이름을 잘못 입력하셨습니다.");
		}

	}

}
