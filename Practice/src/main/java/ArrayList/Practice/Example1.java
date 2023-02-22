package ArrayList.Practice;

import java.util.*;

public class Example1 {

	public static void main(String[] args) 
	{
		
ArrayList<String> al=new ArrayList<>();
al.add("A");
al.add("B");
al.add("C");
al.add("D");
al.add("E");
System.out.println(al);

System.out.println("For Loop: ");
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}

System.out.println("Enhanced For Loop: ");
for(String ar:al)
{
	System.out.println(ar);
}
al.add(1,"l");
System.out.println(al);
al.remove(0);
al.remove("B");

ArrayList<String> all=new ArrayList<>();
all.addAll(al);

System.out.println("Methods: ");
System.out.println(al);
System.out.println(all);
System.out.println(al.set(2, "K"));
System.out.println(al.indexOf("E"));
System.out.println(al.equals(all));
System.out.println(al.lastIndexOf("D"));
System.out.println(al.lastIndexOf("E"));
System.out.println(al.isEmpty());
System.out.println(al.subList(1, 3));
System.out.println(al.clone());
System.out.println(al.contains("C"));
	}

}
