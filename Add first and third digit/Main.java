import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int f1= num/100;
      int t3= num%10;
      int sum= f1+t3;
      System.out.println(sum);
	}
}