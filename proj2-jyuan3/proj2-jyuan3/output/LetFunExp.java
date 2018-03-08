public class LetFunExp extends Expr {
    public final String str1;
    public final String str2;
    public final Expr exp1;
    public final Expr exp2;
    
    public LetFunExp(String str1, String str2, Expr exp1, Expr exp2) {
      this.str1 = str1;
      this.str2 = str2;
	   this.exp1=exp1;
      this.exp2=exp2;
    }
    
    public Value eval(Env e) throws EvalError {
      Value x = new IntVal(1);
      Env newenv = e.addBinding(str1, x);
      FunVal val = new FunVal(str2, exp1, newenv);
      Env newenv2 = newenv.updateBinding(str1, val);
      return exp2.eval(newenv2);
    
 
    }
    
    public String toString() {
	   return exp2.toString();
    }
}
