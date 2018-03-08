public class SeqExp extends Expr {
    public final Expr exp1;
    public final Expr exp2;
    public SeqExp(Expr exp1, Expr exp2) {
	   this.exp1=exp1;
      this.exp2=exp2;
    }
    
    public Value eval(Env e) throws EvalError {
      exp1.eval(e);
	   return exp2.eval(e);
    }
    
    public String toString() {
	   return exp2.toString();
    }
}
