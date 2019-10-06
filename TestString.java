package dailywork07;

public class TestString {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str="abc";
		StringBuffer sb=new StringBuffer("abc");
		Runtime runtime=Runtime.getRuntime();
		long start=System.currentTimeMillis();
		long startFreememory=runtime.freeMemory();
		for (int i=0;i<10000;i++) {
			str+=i;
			//sb.append(i);
		}
		long endFreememory=runtime.freeMemory();
		long end=System.currentTimeMillis();
		System.out.println("操作耗时："+(end-start)+"ms,"+"内存消耗："+(startFreememory-endFreememory)/1024+"KB");
		
	}

}
