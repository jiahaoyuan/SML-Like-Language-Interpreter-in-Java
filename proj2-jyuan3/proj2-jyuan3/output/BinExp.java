public class BinExp extends Expr {
    public final BinOp op;
    public final Expr e1;
    public final Expr e2;
    public static Value x = null;
    
    public BinExp(BinOp op, Expr e1, Expr e2) {
	   this.op = op;
      this.e1 = e1;
      this.e2 = e2;
    }
    
    public Value eval(Env e) throws EvalError {
    Value v1 = e1.eval(e);
    Value v2 = e2.eval(e);
    
    
       switch(op){
         case PLUS:
            if ((v1 instanceof IntVal)&(v2 instanceof IntVal)){
               x = new IntVal(((IntVal)v1).IntV+ ((IntVal)v2).IntV);
               break;
               }
            else
               throw new EvalError("error");
         case MINUS:
            if ((v1 instanceof IntVal)&(v2 instanceof IntVal)){
               x = new IntVal(((IntVal)v1).IntV - ((IntVal)v2).IntV);
               break;
               }
            else
               throw new EvalError("error");
               
         case TIMES:
            if ((v1 instanceof IntVal)&(v2 instanceof IntVal)){
               x = new IntVal(((IntVal)v1).IntV * ((IntVal)v2).IntV);
               break;
               }
            else
               throw new EvalError("error");
               
         case DIV:
            if ((v1 instanceof IntVal)&(v2 instanceof IntVal)){
               if (((IntVal)v2).IntV!=0)
                  x = new IntVal(((IntVal)v1).IntV /((IntVal)v2).IntV);
               else
                  throw new EvalError("not zero");
               break;
               }
            else
               throw new EvalError("error");
              
               
         case EQ:
            if ((v1 instanceof IntVal)&(v2 instanceof IntVal)){
               x = new BoolVal(((IntVal)v1).IntV ==((IntVal)v2).IntV);
               break;
               }
            else
               throw new EvalError("error");
              
         case LT:
            if ((v1 instanceof IntVal)&(v2 instanceof IntVal)){
               x = new BoolVal(((IntVal)v1).IntV <((IntVal)v2).IntV);
               break;
               }
            else
               throw new EvalError("error");
               
         case AND:
            if ((v1 instanceof BoolVal)&(v2 instanceof BoolVal)){
               x = new BoolVal(((BoolVal)v1).BoolV &((BoolVal)v2).BoolV);
               break;
               }
            else
               throw new EvalError("error");
               
         case OR:
            if ((v1 instanceof BoolVal)&(v2 instanceof BoolVal)){
               x = new BoolVal(((BoolVal)v1).BoolV | ((BoolVal)v2).BoolV);
               break;
               }
            else
               throw new EvalError("error");
                                                                        
        
          }
              return x;       
   }

    
    public String toString() {
	   return String.valueOf(x);
    }
    
}
