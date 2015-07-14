public class SSub extends SSuper{
	public void add(){
		val += 2;
	}
	public static void main(String[] args){
		//SSub s = new SSub();
		//((SSuper) s).add();
		//SSuper s = new SSuper();
		//((SSub) s).add();
		SSub s = new SSub();
		s.super.add();
		System.out.println(s.val);
	}
}
		