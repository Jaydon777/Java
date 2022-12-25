import java.util.*;
class <T> MyStack
{
	ArrayList<T> list=new ArrayList<T>();
	T temp;
	public int getSize()
	{
		return list.size();
	}
	public T peek()
	{
		return (list.get(getSize()-1));
	}
	public void push(T element)
	{
		list.add(element);
	}
	public T pop()
	{
		temp=list.get(getSize()-1);
		list.remove(getSize()-1);
		return temp;
	}
}
