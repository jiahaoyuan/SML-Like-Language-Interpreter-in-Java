public class IntConst extends Expr {
    public final int IntConstVal;
    public IntConst(int _value) {
	   IntConstVal = _value;
    }
    
    public Value eval(Env e) throws EvalError {
	   return new IntVal(IntConstVal);
    }
    
    public String toString() {
	   return String.valueOf(IntConstVal);
    }
}
