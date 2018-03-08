public class FunVal extends Value {
    public final String str;
    public final Expr exp1;
    public final Env env;
    
    public FunVal(String str, Expr exp1, Env env) {
	   this.str = str;
      this.exp1 = exp1;
      this.env = env;
    }
    public String toString() {
	   return "function";
    }
}
