package hashCode2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {

	public static GlobalData readFile(String filePath) throws FileNotFoundException{
		 
		Scanner scanner= new Scanner(new File(filePath));
		 
		GlobalData gd = new GlobalData();
		
			//Read global informations
		    gd.nbRows = scanner.nextInt();
		    gd.rowSize = scanner.nextInt();
		    gd.nbUnavaible = scanner.nextInt();
		    gd.nbGroup = scanner.nextInt();
		    gd.nbServer = scanner.nextInt();
		    
		    //Create rows objects
		    gd.listRows = new ArrayList<>();
		    for(int i = 0; i<gd.nbRows; i++){
		    	gd.listRows.add(new Row(gd.rowSize));
		    }
		    
		    //Read unavaible slot
		    for(int i=0; i<gd.nbUnavaible; i++){
		    	int rowIdx = scanner.nextInt();
			    int slotIdx = scanner.nextInt();
			    
			    gd.listRows.get(rowIdx).slotsUnavaible.add(slotIdx);
		    }
		    
		    //Read list servers
		    gd.listServers = new ArrayList<>();
		    for(int i=0; i<gd.nbServer; i++){
		    	int size = scanner.nextInt();
			    int capacite = scanner.nextInt();
			    
			    gd.listServers.add(new Server(size, capacite));
		    }

		    
		scanner.close();
		return gd;
	}
	
}
