package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("cricket")
public abstract class Cricket {
	public String bowling() {
		return "Bowler is bowling";
	}
	public String fielding() {
		return "Fielder is fielding";
	}
	/*Here the IOC Container Dynamically Creating In memory Proxy Class to give us Cricket bat object and we get that
		cricket bat object using abstract method of that target class and the return name must be Dependant class type
	*/
	@Lookup //This annotation is used to create Proxy class
	public abstract CricketBat getBat();
	
	public String batting() {
		CricketBat cbat = getBat();
		return "Batter is batting and total runs are: "+cbat.bat();
	}
}
/* Proxy class can be look like this
	
	public class Cricket$$SpringCGLIB$$0 implements ApplicationContextAware{
		private ApplicationContext applicationcontext;
		public void setApplicationContext(ApplicationContext applicationcontext){
					this.applicationcontext = applicationcontext;
		}
		
	(Cricket class is abstract class and abstract class object can not be created so its sub class object is created)
	
	(Here now abstract method of the abstract class created with same name same return type only difference 
	is this method will not be declared as abstract method)
	
	public CricketBat getBat(){
	CricketBat cricketBat = applicationcontext.getBean("cBat",CricketBat.class);
										or
	CricketBat cricketBat = applicationcontext.getBean(CricketBat.class);
	
	return cricketBat;
		
	}

	
	}
	
	When the application terminated this class will be destroyed

	And all of this logic is genrated by IOC Container Dynamically 
*/













