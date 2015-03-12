package hashCode2015;

import java.util.List;

public class HashCode2015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello White Shadow");
		
		
		try {
			//GlobalData gd = InputReader.readFile("dc.in");
			GlobalData gd = InputReader.readFile("testInput.in");
			
			
			System.out.println("nbRows: " + gd.nbRows);
		    System.out.println("rowSize: " + gd.rowSize);
		    System.out.println("nbUnavaible: " + gd.nbUnavaible);
		    System.out.println("nbGroup: " + gd.nbGroup);
		    System.out.println("nbServer: " + gd.nbServer);
		    
		    // Do your work hear
			
			//OutputWriter.writeFile("output.txt", listLign);
			System.out.println("Fini");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
