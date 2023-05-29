package in.ashokit.runner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	

	public Engine() {
		System.out.println("Engine::constructor");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("this is init() method");
	}
	@PreDestroy
     public void destroy()
     
     {
    	 System.out.println("this is destroy() method");
     }
}
