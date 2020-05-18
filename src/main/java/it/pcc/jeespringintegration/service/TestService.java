package it.pcc.jeespringintegration.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
    @PostConstruct
    private void postConstruct() {
    	System.out.println(this.toString());
    }
	
	public String getText() {
		return "Text from @Service";
	}

}
