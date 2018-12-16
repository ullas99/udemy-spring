package net.myProject.nextMove.springannotationassignment.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import net.myProject.nextMove.springannotationassignment.interfaces.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {
	
	@Value("classpath:fortunes.txt")
	private Resource fortuneResource;
	
	private List<String> fortunes = new ArrayList<String>();
	
	
	@PostConstruct
	public void postConstruct() throws IOException{
		InputStream stream = this.fortuneResource.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		
		String fortune = null;
		while((fortune = reader.readLine()) != null)
		{
			fortune = fortune.trim();
			fortunes.add(fortune);
		}
		
		reader.close();
	}

	@Override
	public String provideTodaysFortune() {
		
		Random randomNumber = new Random();
		
		return this.fortunes.get(randomNumber.nextInt(this.fortunes.size()));
	}

}
