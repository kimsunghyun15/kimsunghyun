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
		
		
		String[] Study = {"국어","수학","사회","과학","영어"};
		
		 
		System.out.println(Study[0] + "의 점수를 입력해주세요:");
		kor=s.nextInt();
		//국어의 점수값 저장
		System.out.println(Study[1] + "의 점수를 입력해주세요:");
		math=s.nextInt();
		//수학의 점수값 저장
		System.out.println(Study[2] + "의 점수를 입력해주세요:");
		sic=s.nextInt();
		//사회의 점수값 저장
		System.out.println(Study[3] + "의 점수를 입력해주세요:");
		sc=s.nextInt();
		//과학의 점수값 저장
		System.out.println(Study[4] + "의 점수를 입력해주세요:");
		eng=s.nextInt();
	    //영어의 점수값 저장
		int h = (eng + kor + math + sic + sc);
		int G = (eng + kor + math + sic + sc) / 5;
		
		
		System.out.printf("총 점수는 %d이며 평균은 %d점입니다.\n",h,G); //값 넣어줘야함 
		
		System.out.println("평균을 입력해주세요...");
		G.nextInt();
		
		if { 
			(G >= 90)
			System.out.println("A입니다. 축하드려요!!");
		
			else if(G >= 80)
			System.out.println("B입니다. 축하드려요.");
			
			else if(G >= 70)
			System.out.println("C입니다. 축하드려요.");
			
			else if(G >= 60)
			System.out.println("D입니다. 축하드려요.");
			
			else if(G >= 50)
			System.out.println("E입니다. 축하드려요.");
			
			else(G >= 40)
			System.out.println("F입니다. 축하드려요.");
		}
		
	}
}
