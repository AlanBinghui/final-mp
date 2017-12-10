
public class exit extends gameObject{
     public exit(final int x, final int y) {
    	 super(x,y);
    	 this.intro = "you get to the exit,great";
     }
     public void behavior () { 
    	 System.out.println(intro);
    	 changeinhp = 0;
     }
}
