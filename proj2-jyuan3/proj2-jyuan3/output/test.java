public class test{
   public static void main(String[] args) 
   throws Exception
   {
   
   Env emptyEnv = new EnvImp();
   BoolConst b1 = new BoolConst(true);
   IntConst i1 = new IntConst();
   WhileExp w1 = new WhileExp();
   
   /*
   Env emptyEnv = new EnvImp();
   
   IntConst x1 = new IntConst(12);
   Value v1 = x1.eval(emptyEnv);
   System.out.println(((IntVal)v1).IntV);
   
   IntConst y1 = new IntConst(31);
   IntConst y2 = new IntConst(41);

   BinOp p1 = BinOp.PLUS;
   BinExp plus1 = new BinExp(p1,y1, y2);
   System.out.println(plus1.eval(emptyEnv));
   
   BinOp m1 = BinOp.TIMES;
   BinExp mul = new BinExp(m1, y1, y2);
   System.out.println(mul.eval(emptyEnv));
   
   BoolConst b1 = new BoolConst(true);
   System.out.println(b1);
   
   BoolConst bool1 = new BoolConst(true);
   System.out.println(bool1);
   System.out.println(bool1.eval(emptyEnv));
   
   BinOp eq = BinOp.EQ;
   BinExp equal = new BinExp(eq, y1, y2);
   System.out.println("eq? " + equal.eval(emptyEnv));
   
   BoolConst b2 = new BoolConst(true);
   BoolConst b3 = new BoolConst(false);
   BinOp and = BinOp.AND;
   BinExp testAnd = new BinExp(and, b2, b3);
   System.out.println("AND "+ testAnd.eval(emptyEnv));
   
   BinOp or = BinOp.OR;
   BinExp testOr = new BinExp(or, b2, b3);
   System.out.println("OR "+ testOr.eval(emptyEnv));
   
   IfExpr test = new IfExpr (bool1, y1, y2);
   System.out.println(test.eval(emptyEnv));
   
   IfExpr test2 = new IfExpr (bool1, equal, y2);
   System.out.println(test2.eval(emptyEnv));
   
   
   */
   
   //BinExp error = new BinExp(m1, y1, b1);
   //System.out.println(error.eval(emptyEnv));
   
   /*
      Expr  arg1 = new IntConst(3);
     
      IntVal x = new IntVal(10);
      Env emptyEnv = new EnvImp();
      Env newEnv = emptyEnv.addBinding("bind", x);
      System.out.println(newEnv.lookup("bind"));
      
      System.out.println(arg1.eval(emptyEnv));
      
      Value a1 = arg1.eval(emptyEnv);  
      System.out.println(((IntVal)a1).value); 
      
      Expr b1= new BoolConst(true);
      b1.eval(emptyEnv);
      System.out.println(b1.toString());
    */     
      
   }
}