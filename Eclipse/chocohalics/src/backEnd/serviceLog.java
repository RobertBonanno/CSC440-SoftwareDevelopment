package chocoholics;
import java.util.ArrayList;
public class serviceLog {

	ArrayList servicesLog = new ArrayList();
	serviceComparator useMe = new serviceComparator();
	logMethods<service> util = new logMethods(); 
	
	/**
	 * tests if service being added exists in list using "listed" method, 
	 * adds service to servicesLog if service not found.
	 * @param service item to be added
	 */
	public void addService(service service){
		if(util.listed(service, servicesLog, useMe)){}
	}
	
	public void modify(service service, String name){
		int location = util.locate(service, servicesLog, useMe);
		if (location == -1) return;
		else{
			((service)servicesLog.get(location)).setServiceName(name);
		}
	}
		
	public void modify(service service, double fee){
		int location = util.locate(service, servicesLog, useMe);
		if (location == -1) return;
		else{
			((service)servicesLog.get(location)).setServiceFee(fee);
		}
	}
	
	public void modifyDescription(service service, String descript){
		int location = util.locate(service, servicesLog, useMe);
		if (location == -1) return;
		else{
			((service)servicesLog.get(location)).setServiceDescrp(descript);
		}
	}
	
	
	//public void addService(Service service){
		//if(listed(service)){}
		//else {
			//servicesLog.add(service);
		//}
	//}
	
/*	public void modify(Service service, String name){
		int location = locate(service);
		if (location == -1) return;
		else{
			((Service)servicesLog.get(location)).setServiceName(name);
		}
	}
	
	public void modify(Service service, double fee){
		int location = locate(service);
		if (location == -1) return;
		else{
			((Service)servicesLog.get(location)).setServiceFee(fee);
		}
	}
	
	public void modifyDescription(Service service, String descript){
		int location = locate(service);
		if (location == -1) return;
		else{
			((Service)servicesLog.get(location)).setServiceDescrp(descript);
		}
	}
	*/
	/**
	 * returns true if service being added already exists in servicesLog
	 * @param service to be added
	 * @return if item is found to exist in servicesLog, true is returned, 
	 * 		   else false is returned
	 */
	
	

	
	/*
	private boolean listed(Service service){
		boolean inList = false;
		int x = servicesLog.size();
		
		if(x == 0) return inList;
		
		
		Service temp = new Service();
		
		for(int i = 0; i < x; i++){
			temp = (Service) servicesLog.get(i);
			if (useMe.compare(temp, service)>0){
				inList = true;
				break;
			}
		}
		
		return inList;
	}
	
	private int locate(Service service){
		boolean trigger = false;
		int location = 0;
		int x = servicesLog.size();
		
		if(x == 0) return -1;
		
		
		Service temp = new Service();
		
		while(location < x ){
			
			temp = (Service) servicesLog.get(location);
			if (useMe.compare(temp, service)>0){
				trigger = true;
				break;
			}
			location++;
		}
		if(!trigger) return -1;
		
		return location;
	}
	*/
}


//for(Service temp :servicesLog.get(index))