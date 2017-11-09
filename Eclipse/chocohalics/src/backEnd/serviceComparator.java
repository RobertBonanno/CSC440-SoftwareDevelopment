package chocoholics;
import java.util.*;
public class serviceComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		service s1 = (service) o1;
		service s2 = (service) o2;
		
		if(s1.getServiceName() == s2.getServiceName())
			return 1;
		return 0;
	}

}
