public class VarExp extends Expr {
    public final String id;
    public VarExp(String _value) {
	   id = _value;
    }
    
    public Value eval(Env e) throws EvalError {
	   return e.lookup(id);
    }
    
    public String toString() {
	   return id;
    }
}
