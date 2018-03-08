public class AssnExp extends Expr {
    public final String id;
    public final Expr exp1;
    public AssnExp(String _value, Expr exp1) {
	   id = _value;
      this.exp1=exp1;
    }
    
    public Value eval(Env e) throws EvalError {
      if (e.lookup(id)!=null) 
         e.updateBinding(id, exp1.eval(e));
	   return exp1.eval(e);
    }
    
    public String toString() {
	   return id;
    }
}
