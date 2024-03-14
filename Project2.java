//Name: Li Hang Biao
//Lab: 11A


import java.util.StringTokenizer;


public class Project2 {
	/**reads the file where the words are stored  
	 * 
	 */
	public static String filename = "src/input.txt";
	public static int arrLength = 0; //This is used to store the length of the array
	
	public static void main(String[] args){
		/** generate empty lists
		 */
		
		SortedWordList theInput = new SortedWordList(); //calls out the sortedWordList
	    TextFileInput input = new TextFileInput(filename); 
		String line = input.readLine(); //Take the first line from the input
		while (line != null ) { //If the next line isn't a null, continues
			StringTokenizer tok = new StringTokenizer(line, " "); 
			while(tok.hasMoreTokens()) {
				String holder = tok.nextToken(); //temporary hold the next token
				Word t = new Word(holder);
					theInput.add(t); 
					arrLength++;
			}
			line = input.readLine();
		} //end of while loop
		input.close(); //end reading from file
			
		
		String[] arr = theInput.printIt(arrLength); //this takes out the array string from sortedWordList
		WordGui gui = new WordGui(arr); // This pass the array to WordGui where it will print out the sorted version 
	
	}
}