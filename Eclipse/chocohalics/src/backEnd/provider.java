package backEnd;

import java.util.ArrayList;

//import java.util.List;
public class provider extends IDHolder{

	ArrayList services = new ArrayList();
	
	private void addService(service service){
		//if(service){
			services.add(service);
		//}
	}
}
