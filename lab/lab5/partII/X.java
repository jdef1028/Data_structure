public class X{
    public int x;
    protected boolean f;
    public X(){
		x = 0;
		f = false;
    }
    public X(int obj){
		x = obj;
		f = false;
    }

    public int addone(int xx){
        return x+xx;
    }
    public static void main(String[] args){
		X xa = new X();
    	System.out.println(xa.addone(2));
		Y ya = new Y();
		System.out.println(ya.addone(1));
	    
    }
}
	
