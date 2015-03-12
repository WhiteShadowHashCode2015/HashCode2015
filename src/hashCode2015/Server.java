package hashCode2015;

public class Server {

	public int capacity;
	public int size;
	public int row;
	public int slot;
	public boolean used;
	public int group;
	
	public Server(int size, int capacity){
		this.size = size;
		this.capacity = capacity;
		this.used = false;
		this.row = 0;
		this.group = 0;
	}
	
}
