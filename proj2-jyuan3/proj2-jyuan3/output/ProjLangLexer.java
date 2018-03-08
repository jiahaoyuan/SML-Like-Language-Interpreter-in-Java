// $ANTLR 3.5.2 /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g 2017-12-05 21:55:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:4:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:6:2: ( '0' .. '9' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:7:5: ( ( DIGIT )+ )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:7:7: ( DIGIT )+
			{
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:7:7: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:8:4: ( 'if' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:8:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:9:6: ( 'then' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:9:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:10:6: ( 'else' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:10:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:11:5: ( 'let' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:11:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:12:5: ( 'val' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:12:7: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:13:7: ( '=' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:13:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:14:4: ( 'in' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:14:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:15:5: ( 'end' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:15:8: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:16:9: ( 'fun' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:16:11: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:17:6: ( '(' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:17:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:18:6: ( ')' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:18:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:19:7: ( 'while' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:19:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:20:4: ( 'do' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:20:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "LBRA"
	public final void mLBRA() throws RecognitionException {
		try {
			int _type = LBRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:21:6: ( '{' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:21:8: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRA"

	// $ANTLR start "RBRA"
	public final void mRBRA() throws RecognitionException {
		try {
			int _type = RBRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:22:6: ( '}' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:22:8: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRA"

	// $ANTLR start "SCOLON"
	public final void mSCOLON() throws RecognitionException {
		try {
			int _type = SCOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:23:8: ( ';' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:23:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCOLON"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:24:8: ( ':=' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:24:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:25:10: ( '<' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:25:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:26:7: ( ( '+' | '-' | '|' ) )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:27:7: ( ( '*' | '/' | '&' ) )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULOP"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:28:6: ( 'true' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:28:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:29:7: ( 'false' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:29:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:30:5: ( 'for' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:30:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:31:5: ( '!' )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:31:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:32:4: ( LETTER ( LETTER | DIGIT )* )
			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:32:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:32:13: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:8: ( NUM | IF | THEN | ELSE | LET | VAL | EQUAL | IN | END | FUNCTION | LPAR | RPAR | WHILE | DO | LBRA | RBRA | SCOLON | ASSIGN | LESSTHAN | ADDOP | MULOP | TRUE | FALSE | FOR | NOT | ID )
		int alt3=26;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:10: NUM
				{
				mNUM(); 

				}
				break;
			case 2 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:14: IF
				{
				mIF(); 

				}
				break;
			case 3 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:17: THEN
				{
				mTHEN(); 

				}
				break;
			case 4 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:22: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:27: LET
				{
				mLET(); 

				}
				break;
			case 6 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:31: VAL
				{
				mVAL(); 

				}
				break;
			case 7 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:35: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 8 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:41: IN
				{
				mIN(); 

				}
				break;
			case 9 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:44: END
				{
				mEND(); 

				}
				break;
			case 10 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:48: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 11 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:57: LPAR
				{
				mLPAR(); 

				}
				break;
			case 12 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:62: RPAR
				{
				mRPAR(); 

				}
				break;
			case 13 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:67: WHILE
				{
				mWHILE(); 

				}
				break;
			case 14 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:73: DO
				{
				mDO(); 

				}
				break;
			case 15 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:76: LBRA
				{
				mLBRA(); 

				}
				break;
			case 16 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:81: RBRA
				{
				mRBRA(); 

				}
				break;
			case 17 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:86: SCOLON
				{
				mSCOLON(); 

				}
				break;
			case 18 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:93: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 19 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:100: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 20 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:109: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 21 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:115: MULOP
				{
				mMULOP(); 

				}
				break;
			case 22 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:121: TRUE
				{
				mTRUE(); 

				}
				break;
			case 23 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:126: FALSE
				{
				mFALSE(); 

				}
				break;
			case 24 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:132: FOR
				{
				mFOR(); 

				}
				break;
			case 25 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:136: NOT
				{
				mNOT(); 

				}
				break;
			case 26 :
				// /Users/jiahaoyuan/Documents/Villanova/Subjects/CSC_8310/Project Due 31 Oct/proj1-jyuan3/ProjLang.g:1:140: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\2\uffff\5\25\1\uffff\1\25\2\uffff\2\25\11\uffff\1\43\1\44\12\25\1\57"+
		"\2\uffff\3\25\1\63\1\64\1\65\1\66\1\25\1\70\1\25\1\uffff\1\72\1\73\1\74"+
		"\4\uffff\1\25\1\uffff\1\25\3\uffff\1\77\1\100\2\uffff";
	static final String DFA3_eofS =
		"\101\uffff";
	static final String DFA3_minS =
		"\1\41\1\uffff\1\146\1\150\1\154\1\145\1\141\1\uffff\1\141\2\uffff\1\150"+
		"\1\157\11\uffff\2\60\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154\1"+
		"\162\1\151\1\60\2\uffff\1\156\2\145\4\60\1\163\1\60\1\154\1\uffff\3\60"+
		"\4\uffff\1\145\1\uffff\1\145\3\uffff\2\60\2\uffff";
	static final String DFA3_maxS =
		"\1\175\1\uffff\1\156\1\162\1\156\1\145\1\141\1\uffff\1\165\2\uffff\1\150"+
		"\1\157\11\uffff\2\172\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154"+
		"\1\162\1\151\1\172\2\uffff\1\156\2\145\4\172\1\163\1\172\1\154\1\uffff"+
		"\3\172\4\uffff\1\145\1\uffff\1\145\3\uffff\2\172\2\uffff";
	static final String DFA3_acceptS =
		"\1\uffff\1\1\5\uffff\1\7\1\uffff\1\13\1\14\2\uffff\1\17\1\20\1\21\1\22"+
		"\1\23\1\24\1\25\1\31\1\32\15\uffff\1\2\1\10\12\uffff\1\16\3\uffff\1\11"+
		"\1\5\1\6\1\12\1\uffff\1\30\1\uffff\1\3\1\26\1\4\2\uffff\1\27\1\15";
	static final String DFA3_specialS =
		"\101\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\24\4\uffff\1\23\1\uffff\1\11\1\12\1\23\1\22\1\uffff\1\22\1\uffff\1"+
			"\23\12\1\1\20\1\17\1\21\1\7\3\uffff\32\25\6\uffff\3\25\1\14\1\4\1\10"+
			"\2\25\1\2\2\25\1\5\7\25\1\3\1\25\1\6\1\13\3\25\1\15\1\22\1\16",
			"",
			"\1\26\7\uffff\1\27",
			"\1\30\11\uffff\1\31",
			"\1\32\1\uffff\1\33",
			"\1\34",
			"\1\35",
			"",
			"\1\37\15\uffff\1\40\5\uffff\1\36",
			"",
			"",
			"\1\41",
			"\1\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\67",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\71",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"",
			"",
			"\1\75",
			"",
			"\1\76",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( NUM | IF | THEN | ELSE | LET | VAL | EQUAL | IN | END | FUNCTION | LPAR | RPAR | WHILE | DO | LBRA | RBRA | SCOLON | ASSIGN | LESSTHAN | ADDOP | MULOP | TRUE | FALSE | FOR | NOT | ID );";
		}
	}

}
