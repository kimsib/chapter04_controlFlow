package ch04_1_if;

public class SwichExample {
	public static void main(String[] args) {

		int month = 3;

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("겨울입니다.");
			break;
		}

	}
}
