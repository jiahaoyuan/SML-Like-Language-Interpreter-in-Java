// $ANTLR 3.5.2 /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g 2017-12-05 21:55:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "ASSIGN", "DIGIT", "DO", 
		"ELSE", "END", "EQUAL", "FALSE", "FOR", "FUNCTION", "ID", "IF", "IN", 
		"LBRA", "LESSTHAN", "LET", "LETTER", "LPAR", "MULOP", "NOT", "NUM", "RBRA", 
		"RPAR", "SCOLON", "THEN", "TRUE", "VAL", "WHILE"
	};
	public static final int EOF=-1;
	public static final int ADDOP=4;
	public static final int ASSIGN=5;
	public static final int DIGIT=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int END=9;
	public static final int EQUAL=10;
	public static final int FALSE=11;
	public static final int FOR=12;
	public static final int FUNCTION=13;
	public static final int ID=14;
	public static final int IF=15;
	public static final int IN=16;
	public static final int LBRA=17;
	public static final int LESSTHAN=18;
	public static final int LET=19;
	public static final int LETTER=20;
	public static final int LPAR=21;
	public static final int MULOP=22;
	public static final int NOT=23;
	public static final int NUM=24;
	public static final int RBRA=25;
	public static final int RPAR=26;
	public static final int SCOLON=27;
	public static final int THEN=28;
	public static final int TRUE=29;
	public static final int VAL=30;
	public static final int WHILE=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g"; }



	// $ANTLR start "input"
	// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:38:1: input returns [Expr value] : e= expr SCOLON EOF ;
	public final Expr input() throws RecognitionException {
		Expr value = null;


		Expr e =null;

		try {
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:38:27: (e= expr SCOLON EOF )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:38:29: e= expr SCOLON EOF
			{
			pushFollow(FOLLOW_expr_in_input269);
			e=expr();
			state._fsp--;

			match(input,SCOLON,FOLLOW_SCOLON_in_input271); 
			match(input,EOF,FOLLOW_EOF_in_input273); 
			value = e;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:40:1: expr returns [Expr value] : ( IF e1= expr THEN e2= expr ELSE e3= expr | LET VAL ID EQUAL e2= expr IN e3= expr END | LET FUNCTION t1= ID LPAR t2= ID RPAR EQUAL e3= expr IN e4= expr END | WHILE e1= expr DO e2= expr | LBRA e1= expr ( SCOLON e2= expr )* RBRA | NOT e1= expr |t3= ID ASSIGN e2= expr |e1= relexpr );
	public final Expr expr() throws RecognitionException {
		Expr value = null;


		Token t1=null;
		Token t2=null;
		Token t3=null;
		Token ID1=null;
		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;
		Expr e4 =null;

		try {
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:40:26: ( IF e1= expr THEN e2= expr ELSE e3= expr | LET VAL ID EQUAL e2= expr IN e3= expr END | LET FUNCTION t1= ID LPAR t2= ID RPAR EQUAL e3= expr IN e4= expr END | WHILE e1= expr DO e2= expr | LBRA e1= expr ( SCOLON e2= expr )* RBRA | NOT e1= expr |t3= ID ASSIGN e2= expr |e1= relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUNCTION) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LBRA:
				{
				alt2=5;
				}
				break;
			case NOT:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ASSIGN) ) {
					alt2=7;
				}
				else if ( (LA2_6==ADDOP||(LA2_6 >= DO && LA2_6 <= EQUAL)||LA2_6==IN||LA2_6==LESSTHAN||(LA2_6 >= LPAR && LA2_6 <= MULOP)||(LA2_6 >= RBRA && LA2_6 <= THEN)) ) {
					alt2=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LPAR:
			case NUM:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:40:28: IF e1= expr THEN e2= expr ELSE e3= expr
					{
					match(input,IF,FOLLOW_IF_in_expr287); 
					pushFollow(FOLLOW_expr_in_expr291);
					e1=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr293); 
					pushFollow(FOLLOW_expr_in_expr297);
					e2=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr299); 
					pushFollow(FOLLOW_expr_in_expr303);
					e3=expr();
					state._fsp--;

					value = new IfExpr(e1, e2, e3);
					}
					break;
				case 2 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:41:4: LET VAL ID EQUAL e2= expr IN e3= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr310); 
					match(input,VAL,FOLLOW_VAL_in_expr312); 
					ID1=(Token)match(input,ID,FOLLOW_ID_in_expr314); 
					match(input,EQUAL,FOLLOW_EQUAL_in_expr316); 
					pushFollow(FOLLOW_expr_in_expr320);
					e2=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr322); 
					pushFollow(FOLLOW_expr_in_expr326);
					e3=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr328); 
					value = new LetValExp((ID1!=null?ID1.getText():null), e2, e3);
					}
					break;
				case 3 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:42:4: LET FUNCTION t1= ID LPAR t2= ID RPAR EQUAL e3= expr IN e4= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr335); 
					match(input,FUNCTION,FOLLOW_FUNCTION_in_expr337); 
					t1=(Token)match(input,ID,FOLLOW_ID_in_expr341); 
					match(input,LPAR,FOLLOW_LPAR_in_expr343); 
					t2=(Token)match(input,ID,FOLLOW_ID_in_expr347); 
					match(input,RPAR,FOLLOW_RPAR_in_expr349); 
					match(input,EQUAL,FOLLOW_EQUAL_in_expr351); 
					pushFollow(FOLLOW_expr_in_expr355);
					e3=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr357); 
					pushFollow(FOLLOW_expr_in_expr361);
					e4=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr363); 
					value = new LetFunExp((t1!=null?t1.getText():null),(t2!=null?t2.getText():null),e3, e4 );
					}
					break;
				case 4 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:43:4: WHILE e1= expr DO e2= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr370); 
					pushFollow(FOLLOW_expr_in_expr374);
					e1=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr376); 
					pushFollow(FOLLOW_expr_in_expr380);
					e2=expr();
					state._fsp--;

					value = new WhileExp(e1, e2);
					}
					break;
				case 5 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:44:4: LBRA e1= expr ( SCOLON e2= expr )* RBRA
					{
					match(input,LBRA,FOLLOW_LBRA_in_expr387); 
					pushFollow(FOLLOW_expr_in_expr391);
					e1=expr();
					state._fsp--;

					value =e1;
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:44:36: ( SCOLON e2= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SCOLON) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:44:37: SCOLON e2= expr
							{
							match(input,SCOLON,FOLLOW_SCOLON_in_expr395); 
							pushFollow(FOLLOW_expr_in_expr399);
							e2=expr();
							state._fsp--;

							value = new SeqExp(value, e2);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RBRA,FOLLOW_RBRA_in_expr404); 
					}
					break;
				case 6 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:45:4: NOT e1= expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr410); 
					pushFollow(FOLLOW_expr_in_expr414);
					e1=expr();
					state._fsp--;

					value = new NotExp(e1);
					}
					break;
				case 7 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:46:4: t3= ID ASSIGN e2= expr
					{
					t3=(Token)match(input,ID,FOLLOW_ID_in_expr423); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr425); 
					pushFollow(FOLLOW_expr_in_expr429);
					e2=expr();
					state._fsp--;

					value = new AssnExp((t3!=null?t3.getText():null), e2);
					}
					break;
				case 8 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:47:4: e1= relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr438);
					e1=relexpr();
					state._fsp--;

					value = e1;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:51:1: relexpr returns [Expr value] : e1= arithexpr ( LESSTHAN e2= arithexpr | EQUAL e3= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr value = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:51:29: (e1= arithexpr ( LESSTHAN e2= arithexpr | EQUAL e3= arithexpr )? )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:51:31: e1= arithexpr ( LESSTHAN e2= arithexpr | EQUAL e3= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr457);
			e1=arithexpr();
			state._fsp--;

			value = e1;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:51:66: ( LESSTHAN e2= arithexpr | EQUAL e3= arithexpr )?
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==LESSTHAN) ) {
				alt3=1;
			}
			else if ( (LA3_0==EQUAL) ) {
				alt3=2;
			}
			switch (alt3) {
				case 1 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:51:67: LESSTHAN e2= arithexpr
					{
					match(input,LESSTHAN,FOLLOW_LESSTHAN_in_relexpr462); 
					pushFollow(FOLLOW_arithexpr_in_relexpr466);
					e2=arithexpr();
					state._fsp--;

					value = new BinExp(BinOp.LT, value, e2);
					}
					break;
				case 2 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:51:142: EQUAL e3= arithexpr
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_relexpr472); 
					pushFollow(FOLLOW_arithexpr_in_relexpr476);
					e3=arithexpr();
					state._fsp--;

					value = new BinExp(BinOp.EQ, value, e3);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:53:1: arithexpr returns [Expr value] : e1= term ( ADDOP e2= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr value = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:53:31: (e1= term ( ADDOP e2= term )* )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:53:33: e1= term ( ADDOP e2= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr492);
			e1=term();
			state._fsp--;

			value = e1;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:53:62: ( ADDOP e2= term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADDOP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:53:63: ADDOP e2= term
					{
					match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr496); 
					pushFollow(FOLLOW_term_in_arithexpr500);
					e2=term();
					state._fsp--;

					value = new BinExp(BinOp.PLUS, value, e2);
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:56:1: term returns [Expr value] : e1= factor ( MULOP e2= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr value = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:56:26: (e1= factor ( MULOP e2= factor )* )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:56:27: e1= factor ( MULOP e2= factor )*
			{
			pushFollow(FOLLOW_factor_in_term518);
			e1=factor();
			state._fsp--;

			value = e1;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:56:58: ( MULOP e2= factor )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:56:59: MULOP e2= factor
					{
					match(input,MULOP,FOLLOW_MULOP_in_term522); 
					pushFollow(FOLLOW_factor_in_term526);
					e2=factor();
					state._fsp--;

					value = new BinExp(BinOp.TIMES, value, e2);
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:58:1: factor returns [Expr value] : ( NUM | TRUE | FALSE | ID | ID LPAR e1= expr RPAR | LPAR e1= expr RPAR );
	public final Expr factor() throws RecognitionException {
		Expr value = null;


		Token NUM2=null;
		Token ID3=null;
		Token ID4=null;
		Expr e1 =null;

		try {
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:58:29: ( NUM | TRUE | FALSE | ID | ID LPAR e1= expr RPAR | LPAR e1= expr RPAR )
			int alt6=6;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt6=1;
				}
				break;
			case TRUE:
				{
				alt6=2;
				}
				break;
			case FALSE:
				{
				alt6=3;
				}
				break;
			case ID:
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4==LPAR) ) {
					alt6=5;
				}
				else if ( (LA6_4==ADDOP||(LA6_4 >= DO && LA6_4 <= EQUAL)||LA6_4==IN||LA6_4==LESSTHAN||LA6_4==MULOP||(LA6_4 >= RBRA && LA6_4 <= THEN)) ) {
					alt6=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAR:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:58:31: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_factor543); 
					value = new IntConst(Integer.parseInt((NUM2!=null?NUM2.getText():null)));
					}
					break;
				case 2 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:59:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor549); 
					value = new BoolConst(true);
					}
					break;
				case 3 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:60:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor556); 
					value = new BoolConst(false);
					}
					break;
				case 4 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:61:4: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_factor563); 
					value = new VarExp((ID3!=null?ID3.getText():null));
					}
					break;
				case 5 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:62:4: ID LPAR e1= expr RPAR
					{
					ID4=(Token)match(input,ID,FOLLOW_ID_in_factor570); 
					match(input,LPAR,FOLLOW_LPAR_in_factor572); 
					pushFollow(FOLLOW_expr_in_factor576);
					e1=expr();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_factor578); 
					value = new AppExp((ID4!=null?ID4.getText():null), e1);
					}
					break;
				case 6 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:63:4: LPAR e1= expr RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_factor585); 
					pushFollow(FOLLOW_expr_in_factor589);
					e1=expr();
					state._fsp--;

					value =e1;
					match(input,RPAR,FOLLOW_RPAR_in_factor592); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input269 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_SCOLON_in_input271 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_input273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr287 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr291 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_THEN_in_expr293 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr297 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ELSE_in_expr299 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr310 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_VAL_in_expr312 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr314 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQUAL_in_expr316 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr320 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr322 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr326 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr335 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FUNCTION_in_expr337 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr341 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LPAR_in_expr343 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr347 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAR_in_expr349 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQUAL_in_expr351 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr355 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr357 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr361 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr370 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr374 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DO_in_expr376 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRA_in_expr387 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr391 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_SCOLON_in_expr395 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr399 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_RBRA_in_expr404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr410 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr423 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_expr425 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_expr429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr457 = new BitSet(new long[]{0x0000000000040402L});
	public static final BitSet FOLLOW_LESSTHAN_in_relexpr462 = new BitSet(new long[]{0x0000000021204800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_in_relexpr472 = new BitSet(new long[]{0x0000000021204800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr492 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr496 = new BitSet(new long[]{0x0000000021204800L});
	public static final BitSet FOLLOW_term_in_arithexpr500 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term518 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_MULOP_in_term522 = new BitSet(new long[]{0x0000000021204800L});
	public static final BitSet FOLLOW_factor_in_term526 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_NUM_in_factor543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor570 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LPAR_in_factor572 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_factor576 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAR_in_factor578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_factor585 = new BitSet(new long[]{0x00000000A1AAC800L});
	public static final BitSet FOLLOW_expr_in_factor589 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAR_in_factor592 = new BitSet(new long[]{0x0000000000000002L});
}
