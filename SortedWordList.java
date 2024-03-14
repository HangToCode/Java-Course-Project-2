//Name: Li Hang Biao
//Lab: 11A



class SortedWordList extends WordList {
	
	public SortedWordList(){
		super(); //calls for WordList
	}

	public void add(Word w){ //Take in new word from main 
		WordNode fir = first; //The first in list
		WordNode nex = fir.next; //The next word after first
		WordNode more = new WordNode(w); //add new word into wordNode
		
		if (nex == null) {//append a word is there is nothing in first.next
			append(w);
		}
		else { //Check everything again to make sure it in order
		    while(nex!= null & w.compareTo(nex.data) > 0){
			        fir = fir.next;
			        nex = fir.next;	 
			        if (nex == null) break; //Error checking
		    }
		    more.next = nex;
		    fir.next = more;
		}
	}
}
		   
		    
