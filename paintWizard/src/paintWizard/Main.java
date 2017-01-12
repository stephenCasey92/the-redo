package paintWizard;

public class Main {

	public static void main(String[] args) {
		
		
		PaintWizard Tins = new PaintWizard();
		//ArrayList <Paint> paints = new ArrayList <Paint> ();
		
		Paint CheapoMax = new Paint ("CheapoMax" ,20, 19.99, 10);
		Paint AverageJoes = new Paint ("AverageJoes", 15, 17.99, 11); // Adding different paints
		Paint DuluxouriousPaints = new Paint ("DuluxouriousPaints", 10, 25.00, 20);
		
		Tins.addPaint(CheapoMax);
		Tins.addPaint(AverageJoes);
		Tins.addPaint(DuluxouriousPaints);
		
		Tins.cheapestPaint();
		
		
	}

}
