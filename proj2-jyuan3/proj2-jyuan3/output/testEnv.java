  public class testEnv{
   public static void main(String[] args) throws Exception {
  

      Expr arg1 = new IntConst(3);
     
      IntVal x1 = new IntVal(10);
      IntVal x2 = new IntVal(20);
      Env emptyEnv = new EnvImp();
      Env newEnv = emptyEnv.addBinding("b1", x1);
      System.out.println("b1 = " + newEnv.lookup("b1"));
      
      newEnv = newEnv.addBinding("b2", x2);
      System.out.println("b2 = " + newEnv.lookup("b2"));
      
      System.out.println("b1 = " + newEnv.lookup("b1"));
      newEnv = newEnv.updateBinding("b1", x2);
      System.out.println("b1 = " + newEnv.lookup("b1"));
      
      System.out.println(newEnv);
      
      
      Expr var1 = new VarExp("b1");
      System.out.println(var1.eval(newEnv));
 
      }
}      