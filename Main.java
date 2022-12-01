import java.util.Scanner;
public class CircleArea {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int radius,centralAngle;
        double PI=3.14,area;
        System.out.print("Dairenin yari capi:");
        radius=input.nextInt();
        System.out.print("Dairenin merkez acisi:");
        centralAngle=input.nextInt();
        area=(PI*(radius*radius)*centralAngle)/360;
        System.out.print("Alan: "+area);
    }
}
