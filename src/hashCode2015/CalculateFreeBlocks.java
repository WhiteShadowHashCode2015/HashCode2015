package hashCode2015;

import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;

public class CalculateFreeBlocks {

	public static void calculateFreeBlocks(List<Row> listRows){
		for(int i=0; i<listRows.size(); i++){
			calculateFreeBlocksRow(listRows.get(i));
		}
	}
	
	
	public static void calculateFreeBlocksRow(Row row){
		row.listFreeBlock = new ArrayList<>();
		
		int curIdx = 0;
		for(int i=0; i<row.slotsUnavaible.size(); i++){
			int size = row.slotsUnavaible.get(i)-curIdx;
			if(size == 0){
				curIdx++;
			}
			else{
				row.listFreeBlock.add(new FreeBlock(curIdx, size));
				curIdx+=size+1;
			}
		}
		if(curIdx < row.size){
			row.listFreeBlock.add(new FreeBlock(curIdx, row.size-curIdx));
		}
	}
	
}
