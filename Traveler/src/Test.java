import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        int taxi=260;
        int bus=26;
        System.out.println("Money: ");
        Scanner s=new Scanner(System.in);
        int money=s.nextInt();
        System.out.println("The weather sunny-1, rain-0:");
        Scanner a=new Scanner(System.in);
        int weather=a.nextInt();
        Traveler c=new Traveler();
        if (money>=taxi){
            c.taxi();
            c.move();
        } else if (money<taxi && money>=bus) {
            c.move();
            c.bus();
        } else if (weather==1 && money<bus) {
            c.bicucle();
        }else {c.walk();}
    }
}
