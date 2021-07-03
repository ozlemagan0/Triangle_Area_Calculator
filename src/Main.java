import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double s1,s2,s3, area,u;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first side:");
        s1=input.nextDouble();

        System.out.print("Enter the second side:");
        s2=input.nextDouble();

        System.out.print("Enter the third side:");
        s3=input.nextDouble();

        u=(s1+s2+s3)/2;
        area=Math.sqrt(u*(u-s1)*(u-s2)*(u-s3));
        System.out.println("Triangle Area:" +area);
    }
}
