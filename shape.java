
import java.util.Scanner;
class Shape{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int ch=0;
		do{
			
			System.out.print("choose a shape to calculate the area:\n1)square \n2)rectangle \n3)circle \n4)exit ");  
			ch=sc.nextInt();
		
			switch(ch){
			
				case 1:System.out.println("enter the side of square= ");
						int a=sc.nextInt();
						System.out.println("AREA OF SQUARE= "+area(a));
						break;
				case 2:System.out.println("enter the length of rectangle= ");
					   int l=sc.nextInt();
				       System.out.println("enter the breadth of rectangle= ");
				       int b=sc.nextInt();
				       System.out.println("AREA OF RECTANGLE= "+area(l,b));
				       break;
			    case 3:System.out.println("enter the radius of circle= ");
				       double r=sc.nextDouble();
				       System.out.println("AREA OF CIRCLE= "+area(r));
				       break;
		        case 4 :System.out.println("EXIT");
						System.exit(0);
				        break;
			
			    default:System.out.println("invalid");
				        break;
				   
		    }
		}while(ch!=4);
	}
	public static int area(int a){
	return a*a;
	}
	public static int area(int l,int b){
	return l*b;
	}
	public static double area(double r){
	return Math.PI * Math.pow(r,2);
	}
}