public class tooHot {

	public static boolean tempCheck(int temp, boolean isSummer) {

		boolean isTemp = true;

		if (isSummer)
		{
			if (temp >= 60 && temp <= 100) {
				isTemp = true;
			} else {
				isTemp = false;
			}
		}
		else{
			if (temp >= 60 && temp <= 90){
				isTemp = true;
			}else{ 
				isTemp = false;
			}
		}
		return isTemp;
		
	}
	

	
}
