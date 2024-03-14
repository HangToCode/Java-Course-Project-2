//Name: Li Hang Biao
//Lab: 11A


import java.awt.*;
import javax.swing.JFrame;

public class WordGui {
	
	   public WordGui(String [] arr) {
			//const array = myList2.spilt(" ");

			//Setting up the Gui
		    JFrame textBox = new JFrame();
			textBox.setTitle("Project 2");
			textBox.setSize(500,400);
			textBox.setLocation(500,200);
			textBox.setLayout(new GridLayout(2,3));
			textBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			//Set up textboxs
		    Container content = textBox.getContentPane();
		    TextArea box1 = new TextArea(); TextArea box2 = new TextArea();
		    TextArea box3 = new TextArea(); TextArea box4 = new TextArea();
		    TextArea box5 = new TextArea(); TextArea box6 = new TextArea();
		    
		    //Disable user editing textbox
		    box1.setEditable(false); box2.setEditable(false);
		    box3.setEditable(false); box4.setEditable(false);
		    box5.setEditable(false); box4.setEditable(false);

		    
		    //Put textbox in the Gui
	        content.add(box1); content.add(box2); content.add(box3);
	        content.add(box4); content.add(box5); content.add(box6);
	        
	        // Set up AEIOU rule for the GUi
	        //single word extract from the array
	        
	        for (int i = 0; i < arr.length; i++) {
	        char letter = arr[i].charAt(0);
	        
	      	if (letter ==  'a' || letter == 'A') box1.append(arr[i] + "\n");
        	else if (letter == 'e' || letter == 'E')  box2.append(arr[i] + "\n");
        	else if (letter == 'i' || letter == 'I')  box3.append(arr[i] + "\n");
        	else if (letter == 'o' || letter == 'O')  box4.append(arr[i] + "\n");
        	else if (letter == 'u' || letter == 'U')  box5.append(arr[i] + "\n");
        	else box6.append(arr[i] + "\n"); //The rest of the words
	        }
	    	

	        

	        
	       
		    textBox.setVisible(true); // Allow user to see the GUI

		
		}
	

	}
	