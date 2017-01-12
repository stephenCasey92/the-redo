
public class UniqueSumA {

	public static void main(String[] args) {
	int a = 2;
	int b = 1;
	int c = 3;
	
    int sum = a + b + c;
 
   
    
	if (a!=b&&b!=c&&c!=a){
		System.out.println("answer is: "+ sum);
		
	}else if (a==b&&b!=c&&c!=a){
		System.out.println("answer is: "+ c);
		
	}else if (a!=b&&b==c&&c!=a){
		System.out.println("answer is: "+ a);
		
	}else if (a!=b&&b!=c&&c==a){
		System.out.println("answer is: "+ b);
		
		
	}else if (a==b&&b==c&&c==a){
		System.out.println("0");
				
		
		
	}


	}

}
