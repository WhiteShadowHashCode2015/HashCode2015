package hashCode2015;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class OutputWriter {

	public static void writeFile(String filename, GlobalData gd) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter (new File(filename));
		
		for(Server server: gd.listServers){
			if(server.used){
				pw.print(server.row);
				pw.print(' ');
				pw.print(server.slot);
				pw.print(' ');
				pw.print(server.group);
				pw.println();
			}
			else{
				pw.println('x');
			}
		}
		pw.close();
	}
	
}
