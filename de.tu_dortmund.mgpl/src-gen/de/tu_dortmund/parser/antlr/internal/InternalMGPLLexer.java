package de.tu_dortmund.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMGPLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_IDF=4;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMGPLLexer() {;} 
    public InternalMGPLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMGPLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMGPL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:11:7: ( 'game' )
            // InternalMGPL.g:11:9: 'game'
            {
            match("game"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:12:7: ( '(' )
            // InternalMGPL.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:13:7: ( ')' )
            // InternalMGPL.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:14:7: ( ';' )
            // InternalMGPL.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:15:7: ( 'int' )
            // InternalMGPL.g:15:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:16:7: ( '=' )
            // InternalMGPL.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:17:7: ( '[' )
            // InternalMGPL.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:18:7: ( ']' )
            // InternalMGPL.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:19:7: ( ',' )
            // InternalMGPL.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:20:7: ( 'animation' )
            // InternalMGPL.g:20:9: 'animation'
            {
            match("animation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:21:7: ( 'on' )
            // InternalMGPL.g:21:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:22:7: ( '{' )
            // InternalMGPL.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:23:7: ( '}' )
            // InternalMGPL.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:24:7: ( 'if' )
            // InternalMGPL.g:24:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:25:7: ( 'else' )
            // InternalMGPL.g:25:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:26:7: ( 'for' )
            // InternalMGPL.g:26:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:27:7: ( '.' )
            // InternalMGPL.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:28:7: ( '||' )
            // InternalMGPL.g:28:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:29:7: ( '&&' )
            // InternalMGPL.g:29:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:30:7: ( '==' )
            // InternalMGPL.g:30:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:31:7: ( '<' )
            // InternalMGPL.g:31:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:32:7: ( '<=' )
            // InternalMGPL.g:32:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:33:7: ( '+' )
            // InternalMGPL.g:33:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:34:7: ( '-' )
            // InternalMGPL.g:34:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:35:7: ( '*' )
            // InternalMGPL.g:35:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:36:7: ( '/' )
            // InternalMGPL.g:36:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:37:7: ( 'touches' )
            // InternalMGPL.g:37:9: 'touches'
            {
            match("touches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:38:7: ( '!' )
            // InternalMGPL.g:38:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:39:7: ( 'rectangle' )
            // InternalMGPL.g:39:9: 'rectangle'
            {
            match("rectangle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:40:7: ( 'triangle' )
            // InternalMGPL.g:40:9: 'triangle'
            {
            match("triangle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:41:7: ( 'circle' )
            // InternalMGPL.g:41:9: 'circle'
            {
            match("circle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:42:7: ( 'space' )
            // InternalMGPL.g:42:9: 'space'
            {
            match("space"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:43:7: ( 'leftarrow' )
            // InternalMGPL.g:43:9: 'leftarrow'
            {
            match("leftarrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:44:7: ( 'rightarrow' )
            // InternalMGPL.g:44:9: 'rightarrow'
            {
            match("rightarrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:45:7: ( 'uparrow' )
            // InternalMGPL.g:45:9: 'uparrow'
            {
            match("uparrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:46:7: ( 'downarrow' )
            // InternalMGPL.g:46:9: 'downarrow'
            {
            match("downarrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_IDF"
    public final void mRULE_IDF() throws RecognitionException {
        try {
            int _type = RULE_IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2222:10: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // InternalMGPL.g:2222:12: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMGPL.g:2222:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMGPL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDF"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2224:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMGPL.g:2224:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMGPL.g:2224:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMGPL.g:2224:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMGPL.g:2224:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMGPL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2226:10: ( ( '0' .. '9' )+ )
            // InternalMGPL.g:2226:12: ( '0' .. '9' )+
            {
            // InternalMGPL.g:2226:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMGPL.g:2226:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2228:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMGPL.g:2228:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMGPL.g:2228:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGPL.g:2228:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMGPL.g:2228:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMGPL.g:2228:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMGPL.g:2228:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:2228:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMGPL.g:2228:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMGPL.g:2228:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMGPL.g:2228:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2230:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMGPL.g:2230:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMGPL.g:2230:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMGPL.g:2230:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2232:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMGPL.g:2232:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMGPL.g:2232:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMGPL.g:2232:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMGPL.g:2232:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMGPL.g:2232:41: ( '\\r' )? '\\n'
                    {
                    // InternalMGPL.g:2232:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMGPL.g:2232:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2234:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMGPL.g:2234:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMGPL.g:2234:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMGPL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2236:16: ( . )
            // InternalMGPL.g:2236:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMGPL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_IDF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=44;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMGPL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMGPL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMGPL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMGPL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMGPL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMGPL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMGPL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMGPL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMGPL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMGPL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMGPL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMGPL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMGPL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMGPL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMGPL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMGPL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMGPL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMGPL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMGPL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMGPL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMGPL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMGPL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMGPL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalMGPL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalMGPL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalMGPL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalMGPL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalMGPL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalMGPL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalMGPL.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalMGPL.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalMGPL.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalMGPL.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalMGPL.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalMGPL.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalMGPL.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalMGPL.g:1:226: RULE_IDF
                {
                mRULE_IDF(); 

                }
                break;
            case 38 :
                // InternalMGPL.g:1:235: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalMGPL.g:1:243: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalMGPL.g:1:252: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // InternalMGPL.g:1:264: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // InternalMGPL.g:1:280: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // InternalMGPL.g:1:296: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalMGPL.g:1:304: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\51\3\uffff\1\51\1\61\3\uffff\2\51\2\uffff\2\51\1\uffff\2\47\1\77\3\uffff\1\105\1\51\1\uffff\7\51\1\47\2\uffff\2\47\2\uffff\1\51\1\uffff\1\51\3\uffff\1\51\1\126\5\uffff\1\51\1\130\2\uffff\2\51\13\uffff\2\51\1\uffff\7\51\4\uffff\1\51\1\145\1\uffff\1\51\1\uffff\1\51\1\150\11\51\1\162\1\uffff\1\51\1\164\1\uffff\11\51\1\uffff\1\51\1\uffff\5\51\1\u0084\10\51\1\u008d\1\uffff\4\51\1\u0092\3\51\1\uffff\1\51\1\u0097\2\51\1\uffff\1\u009a\3\51\1\uffff\1\51\1\u009f\1\uffff\1\u00a0\1\51\1\u00a2\1\u00a3\2\uffff\1\u00a4\3\uffff";
    static final String DFA13_eofS =
        "\u00a5\uffff";
    static final String DFA13_minS =
        "\1\0\1\60\3\uffff\1\60\1\75\3\uffff\2\60\2\uffff\2\60\1\uffff\1\174\1\46\1\75\3\uffff\1\52\1\60\1\uffff\7\60\1\101\2\uffff\2\0\2\uffff\1\60\1\uffff\1\60\3\uffff\2\60\5\uffff\2\60\2\uffff\2\60\13\uffff\2\60\1\uffff\7\60\4\uffff\2\60\1\uffff\1\60\1\uffff\14\60\1\uffff\2\60\1\uffff\11\60\1\uffff\1\60\1\uffff\17\60\1\uffff\10\60\1\uffff\4\60\1\uffff\4\60\1\uffff\2\60\1\uffff\4\60\2\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\3\uffff\1\172\1\75\3\uffff\2\172\2\uffff\2\172\1\uffff\1\174\1\46\1\75\3\uffff\1\57\1\172\1\uffff\10\172\2\uffff\2\uffff\2\uffff\1\172\1\uffff\1\172\3\uffff\2\172\5\uffff\2\172\2\uffff\2\172\13\uffff\2\172\1\uffff\7\172\4\uffff\2\172\1\uffff\1\172\1\uffff\14\172\1\uffff\2\172\1\uffff\11\172\1\uffff\1\172\1\uffff\17\172\1\uffff\10\172\1\uffff\4\172\1\uffff\4\172\1\uffff\2\172\1\uffff\4\172\2\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\4\2\uffff\1\7\1\10\1\11\2\uffff\1\14\1\15\2\uffff\1\21\3\uffff\1\27\1\30\1\31\2\uffff\1\34\10\uffff\1\46\1\47\2\uffff\1\53\1\54\1\uffff\1\45\1\uffff\1\2\1\3\1\4\2\uffff\1\24\1\6\1\7\1\10\1\11\2\uffff\1\14\1\15\2\uffff\1\21\1\22\1\23\1\26\1\25\1\27\1\30\1\31\1\51\1\52\1\32\2\uffff\1\34\7\uffff\1\46\1\47\1\50\1\53\2\uffff\1\16\1\uffff\1\13\14\uffff\1\5\2\uffff\1\20\11\uffff\1\1\1\uffff\1\17\17\uffff\1\40\10\uffff\1\37\4\uffff\1\33\4\uffff\1\43\2\uffff\1\36\4\uffff\1\12\1\35\1\uffff\1\41\1\44\1\42";
    static final String DFA13_specialS =
        "\1\1\43\uffff\1\0\1\2\177\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\31\1\44\3\47\1\22\1\45\1\2\1\3\1\26\1\24\1\11\1\25\1\20\1\27\12\43\1\47\1\4\1\23\1\6\3\47\32\40\1\7\1\47\1\10\1\41\1\42\1\47\1\12\1\40\1\33\1\37\1\16\1\17\1\1\1\40\1\5\2\40\1\35\2\40\1\13\2\40\1\32\1\34\1\30\1\36\5\40\1\14\1\21\1\15\uff82\47",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\50\31\52",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\57\7\52\1\56\14\52",
            "\1\60",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\65\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\66\14\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\71\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\72\13\52",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "\1\103\4\uffff\1\104",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\106\2\52\1\107\10\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\111\3\52\1\112\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\113\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\114\12\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\115\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\116\12\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\117\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\32\120\4\uffff\1\120\1\uffff\32\120",
            "",
            "",
            "\0\122",
            "\0\122",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\124\15\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\125\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\127\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\131\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\132\10\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\133\5\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\134\21\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\135\27\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\136\23\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\137\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\140\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\141\24\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\142\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\26\52\1\143\3\52",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\144\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\146\15\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\147\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\151\27\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\152\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\153\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\154\22\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\155\27\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\156\27\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\157\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\160\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\161\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\163\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\165\22\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\166\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\167\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\170\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\171\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\172\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\173\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\174\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\175\31\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\176\6\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\177\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u0080\23\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u0081\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u0082\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0083\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0085\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0086\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0087\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u0088\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u0089\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u008a\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u008b\23\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u008c\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u008e\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\26\52\1\u008f\3\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0090\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0091\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0093\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u0094\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0095\10\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0096\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0098\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u0099\14\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u009b\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u009c\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\26\52\1\u009d\3\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\26\52\1\u009e\3\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\26\52\1\u00a1\3\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_IDF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_36 = input.LA(1);

                        s = -1;
                        if ( ((LA13_36>='\u0000' && LA13_36<='\uFFFF')) ) {s = 82;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='g') ) {s = 1;}

                        else if ( (LA13_0=='(') ) {s = 2;}

                        else if ( (LA13_0==')') ) {s = 3;}

                        else if ( (LA13_0==';') ) {s = 4;}

                        else if ( (LA13_0=='i') ) {s = 5;}

                        else if ( (LA13_0=='=') ) {s = 6;}

                        else if ( (LA13_0=='[') ) {s = 7;}

                        else if ( (LA13_0==']') ) {s = 8;}

                        else if ( (LA13_0==',') ) {s = 9;}

                        else if ( (LA13_0=='a') ) {s = 10;}

                        else if ( (LA13_0=='o') ) {s = 11;}

                        else if ( (LA13_0=='{') ) {s = 12;}

                        else if ( (LA13_0=='}') ) {s = 13;}

                        else if ( (LA13_0=='e') ) {s = 14;}

                        else if ( (LA13_0=='f') ) {s = 15;}

                        else if ( (LA13_0=='.') ) {s = 16;}

                        else if ( (LA13_0=='|') ) {s = 17;}

                        else if ( (LA13_0=='&') ) {s = 18;}

                        else if ( (LA13_0=='<') ) {s = 19;}

                        else if ( (LA13_0=='+') ) {s = 20;}

                        else if ( (LA13_0=='-') ) {s = 21;}

                        else if ( (LA13_0=='*') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( (LA13_0=='t') ) {s = 24;}

                        else if ( (LA13_0=='!') ) {s = 25;}

                        else if ( (LA13_0=='r') ) {s = 26;}

                        else if ( (LA13_0=='c') ) {s = 27;}

                        else if ( (LA13_0=='s') ) {s = 28;}

                        else if ( (LA13_0=='l') ) {s = 29;}

                        else if ( (LA13_0=='u') ) {s = 30;}

                        else if ( (LA13_0=='d') ) {s = 31;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='b'||LA13_0=='h'||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='n')||(LA13_0>='p' && LA13_0<='q')||(LA13_0>='v' && LA13_0<='z')) ) {s = 32;}

                        else if ( (LA13_0=='^') ) {s = 33;}

                        else if ( (LA13_0=='_') ) {s = 34;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 35;}

                        else if ( (LA13_0=='\"') ) {s = 36;}

                        else if ( (LA13_0=='\'') ) {s = 37;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 38;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||LA13_0==':'||(LA13_0>='>' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( ((LA13_37>='\u0000' && LA13_37<='\uFFFF')) ) {s = 82;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}