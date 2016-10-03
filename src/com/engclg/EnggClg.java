package com.engclg;

public class EnggClg {

		int min_attendence;
		int final_marks;
		int noOfSub;
		int noOfLabs;
		final int noOfStud=120;
		
		
		EnggClg(){}
		
		EnggClg (int min_attendence,int final_marks,int noOfSub,int noOfLabs)
		{
			
			this.min_attendence=min_attendence;
			this.final_marks=final_marks;
			this.noOfSub=noOfSub;
			this.noOfLabs=noOfLabs;
			
		}
		
		void attendence(){}
		
		void total_marks(){}
		
		void display(){}
		
		
		
}

class CS extends EnggClg {
		
		String CsWorkshop;
		static int roll_noCs=0;
		
		CS(){}
		
		CS(int min_attendnce,int final_marks,int noOfSub,int noOfLabs,String CsWorkshop)
		{
			super(min_attendnce,final_marks,noOfSub,noOfLabs);
			this.CsWorkshop=CsWorkshop;
			
			
		}
		
		void attendence()
		{
			if(min_attendence<85)
				System.out.println("INELLIGIBLE ATTENDENCE");
			else
				System.out.println("ELLIGIBLE ATENDENCE");
		}
		
		void total_marks()
		{
			if(final_marks>75)
				System.out.println("S grade student");
			else
				System.out.println("A grade student");
		}
		
		void display()
		{
			roll_noCs++;
			System.out.println("Roll No= "+roll_noCs);
			System.out.println("Attendnce= "+min_attendence);
			System.out.println("Total marks= "+final_marks);
			System.out.println("Subjects= "+noOfSub);
			System.out.println("LABS= "+noOfLabs);
			System.out.println("WORKSHOP= "+CsWorkshop);
			System.out.println("NO. of Students= "+noOfStud);
		}
}

class EC extends EnggClg {
	
	String EcWorkshop;
	static int roll_noEc=0;
	
	EC(){}
	
	EC(int min_attendnce,int final_marks,int noOfSub,int noOfLabs,String EcWorkshop)
	{
		super(min_attendnce,final_marks,noOfSub,noOfLabs);
		this.EcWorkshop=EcWorkshop;
		
	}
	
	void attendence()
	{
		if(min_attendence<75)
			System.out.println("INELLIGIBLE ATTENDENCE");
		else
			System.out.println("ELLIGIBLE ATENDENCE");
	}
	
	void total_marks()
	{
		if(final_marks>65)
			System.out.println("S grade student");
		else
			System.out.println("A grade student");
	}
	
	void display()
	{
		roll_noEc++;
		System.out.println("Roll No= "+roll_noEc);
		System.out.println("Attendnce= "+min_attendence);
		System.out.println("Total marks= "+final_marks);
		System.out.println("Subjects= "+noOfSub);
		System.out.println("LABS= "+noOfLabs);
		System.out.println("WORKSHOP= "+EcWorkshop);
	}
	
}

