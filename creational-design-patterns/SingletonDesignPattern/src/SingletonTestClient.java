class SingletonEager{
	
	private static SingletonEager instance=new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		return instance;
	}
	
}

//lazy
class Singleton{
	private static Singleton instance;
	private Singleton() {
		instance=null;
	}
	
	public static Singleton getInstance() {
		if(instance==null)
			instance = new Singleton();
		return instance;
	}
}

class SingletonSynchronizedMethod{
	private static SingletonSynchronizedMethod instance ;
	private SingletonSynchronizedMethod() {};
	
	public static synchronized SingletonSynchronizedMethod getInstance() {
		if(instance==null)
			instance=new SingletonSynchronizedMethod();
		
		return instance;
	}
}

class SingletonSynchronizedBlock{
	
	private static SingletonSynchronizedBlock instance ;
	private SingletonSynchronizedBlock() {};
	
	public static  SingletonSynchronizedBlock getInstance() {
		synchronized (SingletonSynchronizedBlock.class) {
			if(instance==null)
				instance=new SingletonSynchronizedBlock();
		}
			
		return instance;
	}
}


public class SingletonTestClient {

	public static void main(String[] args) {
		//Eager initialization
//		SingletonEager instance = SingletonEager.getInstance();
//		System.out.println(instance);
//		
//		SingletonEager instance1 = SingletonEager.getInstance();
//		System.out.println(instance1);
		
		//lazy initialization
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance1);
		
	}

}
