//Name: Li Hang Biao
//Lab: 11A


class WordList {
	protected WordNode first = new WordNode(null);
	protected WordNode tail = first;
	
	public WordList () {
	}

    public void append(Word data){ //based from the lecture slide LinkList, 
		WordNode ln = new WordNode(data);
		tail.next = ln;
		tail = ln;
	}
	
	public String[] printIt(int length) { //This function is used to make a array to input for Gui
		WordNode word = first.next; //word is used to check through the list
		int i = 0; //Use to tell array where to put the the word
		String[] arr = new String[length]; //create the array base on the input length
		while (word != null) {		
			arr[i] = word.data + ""; //Pass 
			i+=1;
			word = word.next; //Next word
		}	
		
		return arr;

	}
}