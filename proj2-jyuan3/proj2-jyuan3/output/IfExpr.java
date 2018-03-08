
public class IfExpr extends Expr {

    public final Expr exp1,exp2, exp3;

    
    public IfExpr(Expr e1,Expr e2, Expr e3)
    {
        exp1 = e1;
        exp2 = e2;
        exp3 = e3;
    }
   
    public Value eval(Env e) throws EvalError {
    Value x;
    Value e1 = exp1.eval(e);
    
    if (e1 instanceof BoolVal){
         if (((BoolVal)e1).BoolV)
            x = exp2.eval(e);
         else
            x = exp3.eval(e);

         }
    else
         throw new EvalError("error");
         
    return x;
    }
    
    public String toString() {
	   return "IfExp";
    }


}