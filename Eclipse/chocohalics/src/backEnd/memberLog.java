package chocoholics;

import java.util.ArrayList;

public class memberLog {

	ArrayList membersLog = new ArrayList();
	memberComparator useMe2 = new memberComparator();
	logMethods<member> util = new logMethods(); 
	
	public void addMember(member Member){
		if(util.listed(Member, membersLog, useMe2)){}
		else {
			membersLog.add(Member);
		}
	}
	
	
	
	
	
	/*
	private boolean listed(member Member){
		boolean inList = false;
		int x = membersLog.size();
		
		if(x == 0) return inList;
		
		
		member temp = new member();
		
		for(int i = 0; i < x; i++){
			temp = (member) membersLog.get(i);
			if (useMe2.compare(temp, Member)>0){
				inList = true;
				break;
			}
		}
		
		return inList;
	}*/
}
