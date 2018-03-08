public class test5{
   public static void main(String[] args) throws Exception{
   
   // VarExp
   
      VarExp var1 = new VarExp("x");
      Env emp = new EnvImp();

      IntVal IntA = new IntVal(12);
      Env xEnv = emp.addBinding("x",IntA);
      
      System.out.println(var1.eval(xEnv));
   
   // NotExp
   
      
      BoolConst b1 = new BoolConst(true);   
      NotExp Not1 = new NotExp(b1);
      System.out.println(Not1.eval(emp));
   
   // AssnExp
      IntConst IntC1 = new IntConst(34);
      AssnExp Assn1 = new AssnExp("x",IntC1);
      System.out.println("before AssnExp " +var1.eval(xEnv));
      System.out.println("AssnExp in progress "+Assn1.eval(xEnv));
      System.out.println("after AssnExp "+ var1.eval(xEnv));
      
  // IfExp
      
      BoolConst exp1 = new BoolConst(true);
      IntConst exp2 = new IntConst(2);
      IntConst exp3 = new IntConst(3);
      
      IfExpr If1 = new IfExpr(exp1, exp2, exp3);
      System.out.println(If1.eval(emp));    
      
  // WhileExpr
  
  
  // AppExp We have some error here...
   //BinOp Add = BinOp.PLUS;
   IntConst IntC3 = new IntConst(2);
   VarExp Var3 = new VarExp("x");
      BinExp xAdd2 = new BinExp(BinOp.PLUS,Var3,IntC3);//this means x+2
      
      Env emp3 = new EnvImp();
      FunVal f = new FunVal ("x", xAdd2, emp3); // this means f(x) = x+3 in emp3
      
         Env emp4 = new EnvImp();
         Env emp5 = emp4.addBinding("fx=x+2", f);
         
         IntConst five = new IntConst(5);
         AppExp func = new AppExp("fx=x+2", five);
            
            System.out.println("f(f(x)=>x+2, 5) should equal 7 " +func.eval(emp5));
   

 
   // LetValExp
      //IntC1=34
      
    Env emp2 = new EnvImp();
         BinOp Add1 = BinOp.PLUS;
         IntConst IntC5 = new IntConst(2);
         VarExp Var03 = new VarExp("x");
      BinExp xAdd02 = new BinExp(Add1,Var03,IntC5);
      
      LetValExp LVE1 = new LetValExp("x", IntC1, xAdd02);
      System.out.println("should be 34+2 "+LVE1.eval(emp2));
      
   }

}