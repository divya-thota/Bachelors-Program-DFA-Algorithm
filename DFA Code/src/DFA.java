public class DFA {

	public int Input(String input) {
		int counter = 0;
		for( int i=0; i<input.length(); i++ ) {
		    if( input.charAt(i) == 'a' ) 
		        counter++;
		 } 
		return counter;
	}

}
