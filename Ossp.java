import java.util.Scanner;
public class Ossp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("이름을 입력하세요.: ");
		String name = in.next();
		System.out.println("학번을 입력하세요.: ");
		int studentNumber = in.nextInt();
		System.out.println("학과를 입력하세요.: ");
		String major = in.next();

		System.out.println("<출력>");
		System.out.println("이름: "+name);
		System.out.println("학번: "+studentNumber);
		System.out.println("학과: "+major);
		
	}

}