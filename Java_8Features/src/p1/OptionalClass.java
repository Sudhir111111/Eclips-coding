package p1;

import java.util.Optional;

public class OptionalClass {
	public static Optional <String> getName(){
		
		String name="sudhir";
		return Optional.ofNullable(name);
	}
	
	
	
public static void main(String[] args) {
	  
	Optional<String> name = getName();
	
	System.out.println(name.orElse("null return"));
	
}



}
