public class List <T>{

	private int size;
	private int pos;
	private T[] datastore;

public List(int numElements){
	size = numElements;
	pos = 0;
	datastore = (T[]) new Object[size];
}

public void add(T element){
	datastore[pos] = element;
	++pos;
}

public String toString(){
	String element = " ";
	for(int i =0;  i < pos; ++ i){
	element += datastore[i]+"\t";

}
return element;
}
}
