package paintWizard;
import java.util.ArrayList;
import java.util.Scanner;

public class PaintWizard {

	ArrayList <Paint> paints = new ArrayList <Paint> ();
	
	public void addPaint(Paint p){
		paints.add(p);
		}
		
		public void cheapestPaint(){
			Scanner s = new Scanner(System.in);
	
			System.out.println("Enter room size:");
			int roomSize = s.nextInt(); // metres squared (use nextInt to use numbers)
			s.close();
			for (Paint p : paints){
				double tinsRequired = roomSize/p.Spread;
				double Cost = tinsRequired*p.Price;
				System.out.println((p.Name)+" £"+Cost);
			}
			for (Paint p : paints){
				double Coverage  = p.Spread * p.Volume;
				double tinsRequired = roomSize/Coverage;
				double fullTinsRequired = Math.ceil(roomSize/Coverage);
				double wastage = fullTinsRequired - tinsRequired;
				double wastageLitres = wastage * p.Volume;
				System.out.println((p.Name)+" Would waste:" +wastageLitres+ "litres");
				
			}
			
		
		
		
	}
}
