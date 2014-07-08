/*
 * Name - Gunjan Gugale
 * Assignment #3-2
 * Josephus problem implementation
 * COSC 600
 */

import java.util.*;

public class Josephus 
{
	static Scanner username = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String[] iarray = null;
		Queue<Integer> q = new LinkedList<Integer>();
		
		//Get the number of soldiers from user
		System.out.println("How many soldiers? ");
		int size = username.nextInt();	
		
		iarray = new String[size+1];  
		
		//Get the names of soldiers from user
		System.out.println("Name the soldiers : ");
		//Add the names in a queue
		for (int i=0; i<= size; i++)
		{
			String nameentered = username.nextLine();
			iarray[i] = nameentered;
			q.add(i);			
		}
		q.remove();		
		
		//Get the eliminating position from user
		System.out.println("Enter the position :  ");
		int position = username.nextInt();	
		
		System.out.println("Eliminating order : ");	
		while (!q.isEmpty())
		{
		//Remove elements before position and add them to the queue(at the end)
			for (int i=0; i< position-1; i++)
			{
				int temp = q.remove();
				q.add(temp);				
			}
		//Remove element at position
			int eliminated = q.remove();
			if(!q.isEmpty())
				System.out.println(iarray[eliminated] + "(" + eliminated + ")");
			else 
		//when the queue becomes empty, the last element removed is the survivor
				System.out.println("The survivor is " + iarray[eliminated] + "(" + eliminated + ")");			
		}		
	}
}
