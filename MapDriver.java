public class MapDriver{

public static void main(String[] args){

Map<String, String> mapper = new Map<String, String>("43.07:-01.008", "Nairobi KE");

System.out.println(mapper.getCoords());
System.out.println(mapper.getName());
}
}
