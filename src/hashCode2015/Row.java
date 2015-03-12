package hashCode2015;

import java.util.ArrayList;
import java.util.List;

public class Row {
	int size;
	int lastIndex = 0;
	public List<Integer> slotsUnavaible;
	public List<FreeBlock> listFreeBlock;
	
	
	public Row(int size) {
		super();
		this.size = size;
		this.slotsUnavaible = new ArrayList<>();
	}
	
	
	
}
