public class AppExp extends Expr{

    
    public final String id;
    public final Expr exp1;
    
    public AppExp(String _value, Expr exp1) {
	   id = _value;
      this.exp1=exp1;
    }
    
    public Value eval(Env e) throws EvalError {
      Value f = e.lookup(id);
      if (f instanceof FunVal){
         Value a = exp1.eval(e);
         FunVal fun=(FunVal)f;
         Env e1=fun.env;
         return fun.exp1.eval(e1.addBinding(fun.str,exp1.eval(e)));
         //Env e2 = ((FunVal)f).env.addBinding(((FunVal)f).str, (FunVal)f.exp1.eval(e));
         //return ((FunVal)f).exp1.eval(e2);
      }
         
      else
         throw new EvalError("error");
     
    }
    
    public String toString() {
	   return id;   
   }

}