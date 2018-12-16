package net.myProject.nextMove.springannotationassignment.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import net.myProject.nextMove.springannotationassignment.interfaces.FortuneWheel;

public class KabadiWheel implements FortuneWheel {
	
	@Value("classpath:fortunes.txt")
	private Resource fortuneResource;
	
	private List<String> fortuneList = new ArrayList<String>();
	
	private void postConstructOfBean() throws IOException{
		InputStream inputStream = this.fortuneResource.getInputStream();
		
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String fortune = null;
		
		while((fortune = bufferedReader.readLine()) != null)
		{
			this.fortuneList.add(fortune);
		}
	}

	@Override
	public String runTheWheel() {	
		Random random = new Random();	
		return this.fortuneList.get(random.nextInt(this.fortuneList.size()));
	}

}
