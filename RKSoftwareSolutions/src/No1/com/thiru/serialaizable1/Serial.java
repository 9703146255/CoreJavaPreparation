package No1.com.thiru.serialaizable1;

import java.io.Serializable;
/*
 SERIALAIZATION
 ==============
 */
public class Serial implements Serializable
{
	private static final long serialVersionUID = 11L;
			transient int a;
			static int b;
			String name;
			int age;
			
			// parameteraized constructor
			public Serial(String name, int age, int a, int b)
			{
			this.name = name;
			this.age = age;
			this.a = a;
			this.b = b;

			}
	
			
			
			
			
			
			
			
			
			
			
			
			
	}
