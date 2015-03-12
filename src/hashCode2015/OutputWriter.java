package hashCode2015;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class OutputWriter {

	public static void writeFile(String filename, List<String> listLign) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter (new File(filename));
		
		for(String lign: listLign){
			pw.println(lign);
		}
		pw.close();
	}
	
}
