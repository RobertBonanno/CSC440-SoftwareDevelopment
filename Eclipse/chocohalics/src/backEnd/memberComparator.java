package chocoholics;
import java.util.*;
public class memberComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		member m1 = (member) o1;
		member m2 = (member) o2;
		
		if(m1.getName() == m2.getName())
			return 1;
		return 0;
	}
}
