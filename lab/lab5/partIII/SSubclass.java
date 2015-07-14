public class SSubclass extends SSuperclass implements IInterface{
	public static void main(String[] args){
		System.out.println(IInterface.val);
		System.out.println(SSuperclass.val);
	}
}