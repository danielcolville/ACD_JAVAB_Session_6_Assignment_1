package session6;

public class IntArray {
	public static void main(String [] args) {
		int[] test=new int[10];
		System.out.println("The numbers in array are:");
		for(int i=0;i<test.length;i++) {
			System.out.print(i*i+",");
			test[i]=i*i;
		}
		System.out.println("\nThe even numbers are:");
		for(int i:test) {
			if(i%2==0) {
				System.out.print(i+",");
			}
		}
	}
}
