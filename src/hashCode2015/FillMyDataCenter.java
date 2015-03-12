package hashCode2015;

import java.util.List;


public class FillMyDataCenter {
	
	/*public int nbRows;
	public int rowSize;
	public int nbUnavaible;
	public int nbGroup;
	public int nbServer;
	public List<Row> listRows;
	List<Server> listServers;*/
	
	public void execute(GlobalData data){
		Server s = null;
		Row r = null;
		int group = 0;
		
		int indexCurrentRow=1;
		int indexStartRow=0;
		
		//Je parcours ma liste de serveur
		for(int i=0; i < data.nbServer; i++){
			s=data.listServers.get(i);
			
			boolean isPlaced = s.used;
			
			//Je parcours les lignes
			
			do{
				
				
				r=data.listRows.get(indexCurrentRow);
				List<FreeBlock> freeBlocks = r.listFreeBlock;
				for(FreeBlock freeBlock : freeBlocks){
					if(freeBlock.size>=s.size){
						s.row = indexCurrentRow;
						s.slot = freeBlock.idxStart;
						freeBlock.idxStart+=s.size;
						freeBlock.size-=s.size;
						isPlaced = true;
						indexStartRow=indexCurrentRow;
						s.used=true;
						s.group = group;
						if(group==data.nbGroup-1){
							group=0;
						}else{
							group++;
						}						
						break;
					}
				}
				indexCurrentRow++;
				if(indexCurrentRow >= data.nbRows){
					indexCurrentRow=0;
				}
			}while(!isPlaced && indexCurrentRow != indexStartRow);
		}
	}

}
