
public class WhileExp extends Expr {

    Expr exp1,exp2;
    public static Value x;
    
    public WhileExp(Expr e1,Expr e2)
    {
        exp1 = e1;
        exp2 = e2;
      
    }
   
    public Value eval(Env e) throws EvalError {
    
    Value e1 = exp1.eval(e);
    
    if (e1 instanceof BoolVal){
         while (((BoolVal)e1).BoolV)
            x = exp2.eval(e);
            e1 = exp1.eval(e);
         }
    else
         throw new EvalError("error");
         
    return x;
    }
    
    public String toString() {
	   return String.valueOf(x);
    }


}