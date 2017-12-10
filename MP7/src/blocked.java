
public class blocked extends gameObject {
   public blocked(final int x, final int y) {
	   super(x,y);
	   this.intro = "not this way, no entry ,a failed step";
	   
   }
   public void behavior() {
	   System.out.println(intro);
	   System.out.println("since you are a little bit too curious, I have to tell you, curiosity kills the cat");
	   changeinhp = -1;
   }
}
