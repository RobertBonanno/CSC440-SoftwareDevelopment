package backEnd;

import java.util.ArrayList;

public abstract class DataStore<T> {

	ArrayList<T> summaryList;
	
	public DataStore(){
		summaryList = new ArrayList<T>();
	}
	
	public T search(T item){
		
		return null;
	}
	
	public abstract void sort();
	
	/**
	 * Attempts to add 
	 * @param item
	 */
	public void add(T item) {
		if(!summaryList.contains(item))
			summaryList.add(item);
	}
	
	
	/**
	 * Removes the passed in item from the summary list. If the item is not in the list then nothing happens.
	 * @param item should be the same type as the dataStore class type.
	 * @return Returns the removed element from thesummaryList
	 */
	public T remove(T item) {
		if(summaryList.isEmpty())
			return null;
		
		if(summaryList.contains(item))
			summaryList.remove(item);
		
		return null;
	}
	
	/**
	 * Writes the contents of summaryList to a text file
	 */
	public abstract void writeToDisk();
	
	
	/**
	 * Returns all of the items in the summaryList
	 * 
	 * @return A string with each item separated by a new line
	 */
	public String toString(){
		String toReturn = "";
		for(T item : summaryList)
			toReturn+= item.toString()+"\n";
		return toReturn;
	}
	
	
}
