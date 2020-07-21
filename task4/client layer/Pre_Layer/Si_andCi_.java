package Pre_Layer;
import java.util.Scanner;
public class Si_andCi_{
	public static void main(String[] args) {
		Si_andCi_ object=new Si_andCi_ ();
		@SuppressWarnings("resource")
		Scanner scanObj=new Scanner(System.in);
		System.out.format("Enter principle Amount : ");
		int Principle_Amount=scanObj.nextInt();
		System.out.format("Enter Rate of Interest : ");
		int Rate_Of_Interest=scanObj.nextInt();
		System.out.format("Time : ");
		int Time=scanObj.nextInt();
		System.out.format("Simple Interest : %d\n",object.Simple_Interest_Action(Principle_Amount,Rate_Of_Interest,Time));
		System.out.format("Compound Interest : %d",object.Compound_Interest_Action(Principle_Amount,Rate_Of_Interest,Time));
	}

	public int Simple_Interest_Action(int Principle_Amount, int Rate_Of_Interest, int Time) {
		int Simple_Interest_result=(Principle_Amount*Time*Rate_Of_Interest)/100;
		return Simple_Interest_result;
	}

	public int Compound_Interest_Action(int Principle_Amount, int Rate_Of_Interest, int Time) {
		double Compound_Interest_result=Principle_Amount*(Math.pow(1.0+Rate_Of_Interest/100.0,Time)-1.0);
		//float result=(float)Compound_Interest_result;
		return (int)Math.round(Compound_Interest_result);
	}


}