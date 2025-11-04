package jeuCodeSecret;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateCode());
	}
	
	public static int generateCode() {
		int num = (int) (Math.random() * 10000);
		return Integer.parseInt(String.format("%04d", num));
	}

}
