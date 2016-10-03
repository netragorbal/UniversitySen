package com.engclg;

public class EnggClgDemo {
	public static void main(String[] args) {
		
		EnggClg[] C = new CS[3];
		EnggClg[] E = new EC[3];
		
		C[0] = new CS(60,70,5,3,"java");
		C[1] = new CS(75,80,6,2,"CORE");
		C[2] = new CS(90,90,5,3,"JAVA");
		
		for(int i=0;i<C.length;i++)
		{
			C[i].attendence();
			C[i].total_marks();
			C[i].display();
		}
		
		E[0] = new EC(85,50,6,4,"DIGITAL");
		E[1] = new EC(75,80,5,4,"ELECTRO");
		E[2] = new EC(90,75,6,3,"TELE");
		
		for(int i=0;i<E.length;i++)
		{
			E[i].attendence();
			E[i].total_marks();
			E[i].display();
		}
	}

}
