public class Map<Index, Location>{

private Index coords;
private Location name;

public Map(Index degrees, Location place){
	coords = degrees;
	name = place;
	}
public Index getCoords(){
	return coords;
	}
public Location getName(){
	return name;
	}
								
}
