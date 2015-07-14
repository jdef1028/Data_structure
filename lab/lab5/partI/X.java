/* class for lab5*/
/* Xiaolin LI*/
/* Jul 2nd, 2015*/
public class X {
    public int x;
    public static void main(String[] args){
	X[] xa = new X[4];
	for (X item: xa){
	    item = new X();
	    item.x = -1;
	}
	Y[] ya = new Y[4];
	for (Y item: ya){
	    item = new Y();
	    item.y = 0;
	}
	//ya = (Y[]) xa;
	//xa = ya;
	ya = (Y[]) xa;
	//for (Y item: ya){
	//  System.out.print(item.y);
	//}
    }
    
    
}
