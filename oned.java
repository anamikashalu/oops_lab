import java.util.Scanner;
class oned
{
int x[];
void readarry()
{
x=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the element:");
for(int i=0;i<x.length;i++)
x[i]= sc.nextInt();
}
void printarray(){
System.out.println("Array elemts are:");
for(int i=0;i<x.length;i++)
System.out.println(x[i]);
}
public static void main(String args[]){
oned obj=new oned();
obj.readarry();
obj.printarray();
}

}
