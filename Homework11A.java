import java.util.ArrayList;

public class Homework11A extends Homework11{
  public Homework11A(){
    super();
  }
  public int problem4(){
    int sum = 0;
   for(int i = 0; i < getList().size(); i++){
     sum += getList().get(i);
   }
   return sum;
  }
  @Override
  public void problem2(int n){
	  /* Same issue as with the problem2 in Homework11
	   */
    for (int i = 0; i < getList().size(); i++){
      if (getList().get(i) % n != 0){
        getList().remove(i);
        i--;
  }

}
}
}
