import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] origin = new int[]{1, 1, 2, 2, 2, 8};
		int piece;
		for(int i = 0 ; i < origin.length ; i++){
			piece = sc.nextInt();
			System.out.print(origin[i] - piece + " ");
		}
	}
}