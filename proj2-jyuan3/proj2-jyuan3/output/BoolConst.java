public class BoolConst extends Expr {
    public final boolean BoolConstVal;
    public BoolConst(boolean _value) {
	   BoolConstVal = _value;
    }
    
    public Value eval(Env e) throws EvalError {
	   return new BoolVal(BoolConstVal);
    }
    
    public String toString() {
	   return String.valueOf(BoolConstVal);
    }
}
