public class LetValExp extends Expr {
    public final String str;
    public final Expr exp1;
    public final Expr exp2;
    
    public LetValExp(String str, Expr exp1, Expr exp2) {
      this.str = str;
	   this.exp1=exp1;
      this.exp2=exp2;
    }
    
    public Value eval(Env e) throws EvalError {
      Value x = exp1.eval(e);
      Env e2 = e.addBinding(str, x);
	   return exp2.eval(e2);
    }
    
    public String toString() {
	   return exp2.toString();
    }
}
