import java.util.Scanner;
public class Ossp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���.: ");
		String name = in.next();
		System.out.println("�й��� �Է��ϼ���.: ");
		int studentNumber = in.nextInt();
		System.out.println("�а��� �Է��ϼ���.: ");
		String major = in.next();
		System.out.println("�б��� �Է��ϼ���.: ");
		String univ = in.next();
		System.out.println("�г��� �Է��ϼ���.: ");
		int grade = in.nextInt();
		
		System.out.println("<���>");
		System.out.println("�̸�: "+name);
		System.out.println("�й�: "+studentNumber);
		System.out.println("�а�: "+major);
		System.out.println("�б�: "+univ);
		System.out.println("�г�: "+grade);
	}

}
