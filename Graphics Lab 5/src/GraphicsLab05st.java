// GraphicsLab05st.java
// This is the student, starting file of Lab10GRFX05 which draws 3 flags.
// Students need to create 10 more flags.  They will not know which flags these are ahead of time.
// Each of flag will be worth 10 points.  There will also be 2 bonus flags worth 5 points each.

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class GraphicsLab05st extends Applet
{
	static int numDots;
	static Random rand;
	
	public void init()
	{
		numDots = 1000000;  // number of dots drawn for each flag
		rand = new Random();
	}
	
	public void paint(Graphics g)
	{	
		titlePage(g,"Kyle Lancaster",5);
		flagOfLibya(g, numDots);
		flagOfMonaco(g, numDots);	
		flagOfItaly(g, numDots);
		flagofIreland(g, numDots);
		flagOfFrance (g, numDots);
		flagofBelguim (g, numDots);
		flagofRomania (g,  numDots);
		flagofGermany (g,  numDots);
		flagofAustria (g, numDots);
		flagofRussia (g, numDots);
		flagofLatvia (g,  numDots);
		flagofHolland (g, numDots);

	}
	
	public static void titlePage(Graphics g, String name, int period)
	{
		g.setColor(Color.black);
		g.fillRect(0,0,1000,650);
		g.setColor(Color.black);
		g.fillRect(100,100,800,450);		
		g.setColor(Color.white);
		Font title = new Font("Algerian",Font.BOLD,48);
		g.setFont(title);
		g.drawString("ISIS HIT LIST",225,240);
		g.setColor(Color.white);
		g.drawString("by: "+name,225,340);
		g.setColor(Color.black);
		g.drawString("Period: "+period,225,440);		
		delay(3000);                      // Wait 3 second before showing first flag.
	}
	
	public static void showName(Graphics g, String name)
	{
		g.setColor(Color.white);
		g.fillRect(25,50,30*(name.length()+3),70);		
		g.setColor(Color.black);
		Font countryName = new Font("Algerian",Font.BOLD,48);
		g.setFont(countryName);
		g.drawString(name,50,100);
		delay(2000);                      // Wait 2 second before showing next flag.
	}	
	
	public static void delay(int n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();	
	}
	
	public static void flagOfLibya (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			g.setColor(Color.green);  	   // The Libyan flag is the simplest in the world.
											   // It is a solid green rectangle.
			g.fillRect(x,y,3,3);
		}
		showName(g,"Libya");		
	}
	
	public static void flagOfMonaco (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 325)                       // top stripe 
				g.setColor(Color.red);  
			else				    		   // bottom stripe 
				g.setColor(Color.white);   
			
			g.fillRect(x,y,3,3);
		}
		showName(g,"Monaco");			
	}	
	
	public static void flagOfItaly (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.green);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Italy");		
	}
	
	public static void flagofIreland (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.green);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.yellow);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Ireland");
	
	
	
}
	public static void flagOfFrance (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.blue);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"France");
}
	public static void flagofBelguim (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.black);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.red);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.yellow);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Belgium");
}
	public static void flagofRomania (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.blue);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.yellow);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Romania");
}
	public static void flagofGermany (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 217)                       // left stripe 
				g.setColor(Color.black);  
				
			if (y >= 217 && y < 436)		   // middle stripe requires compound condition
				g.setColor(Color.red);   
			
			if (y >= 436)                      // right stripe 
				g.setColor(Color.yellow);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Germany");
}
	public static void flagofAustria (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 217)                       // left stripe 
				g.setColor(Color.red);  
				
			if (y >= 217 && y < 436)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (y >= 436)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Austria");
}
	public static void flagofRussia (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 217)                       // left stripe 
				g.setColor(Color.white);  
				
			if (y >= 217 && y < 436)		   // middle stripe requires compound condition
				g.setColor(Color.blue);   
			
			if (y >= 436)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Russia");
}
	public static void flagofLatvia (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 217)                       // left stripe 
				g.setColor(Color.MAGENTA);  
				
			if (y >= 217 && y < 436)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (y >= 436)                      // right stripe 
				g.setColor(Color.MAGENTA);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Latvia");
}
	public static void flagofHolland (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 217)                       // left stripe 
				g.setColor(Color.red);  
				
			if (y >= 217 && y < 436)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (y >= 436)                      // right stripe 
				g.setColor(Color.blue);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Holland");
}
}