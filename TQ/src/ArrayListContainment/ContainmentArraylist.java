package ArrayListContainment;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainmentArraylist {

	public static void main(String[] args) {
		ArrayList<Student1> s=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the How Many Students");
		int d=sc.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the id + name + Dept ");
			int id1=sc.nextInt();
			String name1=sc.next();
			String dept1=sc.next();
			ArrayList<Integer> s1=new ArrayList<>();
			for(int j=0;j<5;j++)
			{
				
				System.out.println("Enter The Marks");
				int m1=sc.nextInt();
				s1.add(m1);
				
			}
			s.add(new Student1(id1,name1,dept1,s1));
				
		}
		
		for(Student1 n:s )
		{
			int sum=0;
			for(Integer i:n.marks)
			{
				sum+=i;
			}
			double percent=sum/n.marks.size();
			if(percent>65)
			{
				System.out.println(n.name+" "+percent);
			}
			
			
		}

	}

}
