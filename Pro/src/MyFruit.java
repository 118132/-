public class MyFruit implements Cloneable
{
	protected String kind;
	public void Display(){
		System.out.println(kind);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Object obj=null;
		// TODO: Implement this method
		obj=super.clone();
		return obj;
	}
}
