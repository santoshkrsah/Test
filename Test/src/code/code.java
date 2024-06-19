package code;
//loop code
class code {
	public static void main(String[] args) {
		
		int d=10;
		double tp=800;
		double pad=tp*(1-d/100.0d);
		if (pad>500) {
			pad=pad*(1-5/100.0d);
		}
		System.out.println("final payment ammount="+pad);
	}
	
}
	
