public class Main{
  public static void main(String[] args){
    try{
      Args arg = new Args("x,y", new String[]{"-x", "-y"});
      boolean x = arg.getBoolean('x');
      System.out.println("x:"+x);
      boolean y = arg.getBoolean('y');
      System.out.println("y:"+y);
    }catch (Exception e){
      System.out.println(e);
    }
  }
}