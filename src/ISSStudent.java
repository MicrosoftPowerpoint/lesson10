public class ISSStudent implements Comparable{
private String name;
private String address;
private int id;
public ISSStudent (String n, String a, int i)
{
    name = n;
    address = a;
    id = i;
}
public int getId()
{return id;
}
public String toString()
{
    String str = "Name\t" + name ;
    str+="\nAddress:\t" + address;
    str+="\nID Number:" +id;
    return str;
}
  
    public int compareTo(Object o) {
        int difference = id - ((ISSStudent)o).getId();
               return difference; 
    
    }
    
}
