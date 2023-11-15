package com.thiru.singleton;
//singleton
public class Login {
	
	private static Login instance=null;
	
	private Login()
	{
		
	}
	
	public static Login getInstance()
	{
		if(instance==null)
		{
			instance=new Login();
		}
		return instance;
	}
	

}
