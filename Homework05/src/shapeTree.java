//written by Mia Dia
import java.util.*;
import java.lang.*;
import java.io.*;
public class shapeTree {

	public static void main(String[] args) {
		p("Welcome to the shape tree tester!\nReading from file");
		
		LinkedBST shapTree = new LinkedBST();
		try
		{
			Scanner fileScanner = new Scanner(new File("shape"));
			while(fileScanner.hasNextLine())
			{
				String currLine = fileScanner.nextLine();
				//p(currLine+" "+fileScanner.hasNextLine());
				String[] splitLine = currLine.split("\t");
				boolean error = true;
				shap s = null;
				if(splitLine.length == 3)
				{	
					if(splitLine[0].equalsIgnoreCase("rectangle"))
					{
						s = new rectangle(Integer.parseInt(splitLine[1]),Integer.parseInt(splitLine[2]));
						error = false;
						p("Rectangle\t"+splitLine[1]+"\t"+splitLine[2]);
					}
					else if(splitLine[0].equalsIgnoreCase("right triangle"))
					{
						s = new rTriangle(Integer.parseInt(splitLine[1]),Integer.parseInt(splitLine[2]));
						error = false;
						p("Right Triangle\t"+splitLine[1]+"\t"+splitLine[2]);
					}
					
				}
				if(splitLine.length == 2)
				{
					if(splitLine[0].equalsIgnoreCase("circle"))
					{
						s = new circle(Integer.parseInt(splitLine[1]));
						error = false;
						p("Circle\t"+splitLine[1]);
					}
					
				}
				if(!error)
					{
					
					shapTree.add(s);
					}
				else
				{
					p("Not properly formatted line. Yes you should check for these.\nNot intentionally causing a kerfuffle");
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	p("--------------------------------------------------------");
	p("\n\nPrinting the pre-order traversal");
	shapTree.printPreorder();
	
	p("\n\nPrinting the in-order traversal");
	shapTree.printInorder();
	
	
	p("\n\nPrinting the post-order traversal");
	shapTree.printPostorder();
	
	p(shapTree.search(new circle(9))+"");
	
	p("\n\nDeleting Circle 	9");
	shapTree.remove(new circle(9));
	
	p("\n\nPrinting the in-order traversal");
	shapTree.printInorder();
	
	shapTree.removeVal(30);
	p("\n\nPrinting the in-order traversal");
	shapTree.printInorder();
	}

	
	public static void p(String w)
	{
		System.out.println(w);
	}
}
