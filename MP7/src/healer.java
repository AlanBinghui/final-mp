
public class healer extends gameObject{
  private boolean unhealed = true;
	public healer(final int x, final int y) {
	   super(x,y);
	   this.intro = "you find it, the only healer lives in the forest";
   }
   public void behavior() {
	   if (unhealed) {
	   System.out.println(intro);
	   changeinhp = 10;
	   unhealed = false;
	   } else {
		   System.out.println("I have already cured you");
		   changeinhp = 0;
	   }
   }
}
