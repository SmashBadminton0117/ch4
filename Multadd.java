public class calculation {
	
	public static double multAdd(double a, double b, double c) {
		return a * b + c;
	}
	
	public static double expSum(double x, double e) {
		return multAdd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
	}
	
	public static void main(String[] args) {
		//multiple addition
		double calculate = multAdd(1.0, 2.0, 3.0);
		System.out.println("multAdd = " + calculate);
		
		double angle = Math.PI / 4;
		System.out.println("Sin + Cos expression = " 
			+ (Math.sin(angle) + Math.cos(angle) / 2));
		
		System.out.println("Log10 + Log20 = " 
			+ (Math.log(10) + Math.log(20)));
		
		System.out.println("Exponent sum = " + expSum(1.0, 1.0));
	}
}
