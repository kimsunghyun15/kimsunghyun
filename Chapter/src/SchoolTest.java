import java.util.Scanner;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		int sic;
		int sc;
		
		
		String[] Study = {"����","����","��ȸ","����","����"};
		
		 
		System.out.println(Study[0] + "�� ������ �Է����ּ���:");
		kor=s.nextInt();
		//������ ������ ����
		System.out.println(Study[1] + "�� ������ �Է����ּ���:");
		math=s.nextInt();
		//������ ������ ����
		System.out.println(Study[2] + "�� ������ �Է����ּ���:");
		sic=s.nextInt();
		//��ȸ�� ������ ����
		System.out.println(Study[3] + "�� ������ �Է����ּ���:");
		sc=s.nextInt();
		//������ ������ ����
		System.out.println(Study[4] + "�� ������ �Է����ּ���:");
		eng=s.nextInt();
	    //������ ������ ����
		int h = (eng + kor + math + sic + sc);
		int G = (eng + kor + math + sic + sc) / 5;
		
		
		System.out.printf("�� ������ %d�̸� ����� %d���Դϴ�.\n",h,G); //�� �־������ 
		
	}
}