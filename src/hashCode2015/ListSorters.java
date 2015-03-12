package hashCode2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorters {
	
	//Info: to create a copy of a list without copy object in:
	//List<Server>listServ = new ArrayList<>(gd.listServers);

	public static void sortServerByCapacityAsc(List<Server> listServ){
		Collections.sort(listServ, new Comparator<Server>() {
			@Override
			public int compare(Server s1, Server s2) {
				//Du plus petit au plus grand
				return s1.capacity - s2.capacity;
			}		    	
		});
	}
	
	public static void sortServerByQualityDesc(List<Server> listServ){
		Collections.sort(listServ, new Comparator<Server>() {
			@Override
			public int compare(Server s1, Server s2) {
				//Du plus grand au plus petit
				//Quality = capacity/size
				float qualityS1 = (s1.capacity/(float)s1.size);
				float qualityS2 = (s2.capacity/(float)s2.size);
				if (qualityS1 < qualityS2) return 1;
				if (qualityS1 > qualityS2) return -1;
				return 0;
			}		    	
		});
	}
}
