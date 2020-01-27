package de.tu_dortmund.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tu_dortmund.services.MGPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMGPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDF", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'('", "')'", "';'", "'int'", "'='", "'['", "']'", "','", "'animation'", "'on'", "'{'", "'}'", "'if'", "'else'", "'for'", "'.'", "'||'", "'&&'", "'=='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'touches'", "'!'", "'rectangle'", "'triangle'", "'circle'", "'space'", "'leftarrow'", "'rightarrow'", "'uparrow'", "'downarrow'"
    };
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


        public InternalMGPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMGPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMGPLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMGPL.g"; }



     	private MGPLGrammarAccess grammarAccess;

        public InternalMGPLParser(TokenStream input, MGPLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MGPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMGPL.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMGPL.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMGPL.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMGPL.g:72:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_declarations_5_0= ruleDecl ) )* ( (lv_init_6_0= ruleStmtBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_init_6_0 = null;

        EObject lv_blocks_7_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:78:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_declarations_5_0= ruleDecl ) )* ( (lv_init_6_0= ruleStmtBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )* ) )
            // InternalMGPL.g:79:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_declarations_5_0= ruleDecl ) )* ( (lv_init_6_0= ruleStmtBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )* )
            {
            // InternalMGPL.g:79:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_declarations_5_0= ruleDecl ) )* ( (lv_init_6_0= ruleStmtBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )* )
            // InternalMGPL.g:80:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_declarations_5_0= ruleDecl ) )* ( (lv_init_6_0= ruleStmtBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getGameKeyword_0());
              		
            }
            // InternalMGPL.g:84:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:85:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:85:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:86:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProgramRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.tu_dortmund.MGPL.IDF");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMGPL.g:106:3: ( (lv_attributes_3_0= ruleAttrAssList ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_IDF) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGPL.g:107:4: (lv_attributes_3_0= ruleAttrAssList )
                    {
                    // InternalMGPL.g:107:4: (lv_attributes_3_0= ruleAttrAssList )
                    // InternalMGPL.g:108:5: lv_attributes_3_0= ruleAttrAssList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProgramAccess().getAttributesAttrAssListParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    lv_attributes_3_0=ruleAttrAssList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProgramRule());
                      					}
                      					set(
                      						current,
                      						"attributes",
                      						lv_attributes_3_0,
                      						"de.tu_dortmund.MGPL.AttrAssList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMGPL.g:129:3: ( (lv_declarations_5_0= ruleDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=40 && LA2_0<=42)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMGPL.g:130:4: (lv_declarations_5_0= ruleDecl )
            	    {
            	    // InternalMGPL.g:130:4: (lv_declarations_5_0= ruleDecl )
            	    // InternalMGPL.g:131:5: lv_declarations_5_0= ruleDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_declarations_5_0=ruleDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"declarations",
            	      						lv_declarations_5_0,
            	      						"de.tu_dortmund.MGPL.Decl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMGPL.g:148:3: ( (lv_init_6_0= ruleStmtBlock ) )
            // InternalMGPL.g:149:4: (lv_init_6_0= ruleStmtBlock )
            {
            // InternalMGPL.g:149:4: (lv_init_6_0= ruleStmtBlock )
            // InternalMGPL.g:150:5: lv_init_6_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getInitStmtBlockParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_init_6_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
              					}
              					set(
              						current,
              						"init",
              						lv_init_6_0,
              						"de.tu_dortmund.MGPL.StmtBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGPL.g:167:3: ( (lv_blocks_7_0= ruleBlock ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=21 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMGPL.g:168:4: (lv_blocks_7_0= ruleBlock )
            	    {
            	    // InternalMGPL.g:168:4: (lv_blocks_7_0= ruleBlock )
            	    // InternalMGPL.g:169:5: lv_blocks_7_0= ruleBlock
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getBlocksBlockParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_blocks_7_0=ruleBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"blocks",
            	      						lv_blocks_7_0,
            	      						"de.tu_dortmund.MGPL.Block");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDecl"
    // InternalMGPL.g:190:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalMGPL.g:190:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalMGPL.g:191:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalMGPL.g:197:1: ruleDecl returns [EObject current=null] : ( (this_ObjDecl_0= ruleObjDecl | this_ObjArrayDecl_1= ruleObjArrayDecl | this_VarDecl_2= ruleVarDecl ) otherlv_3= ';' ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_ObjDecl_0 = null;

        EObject this_ObjArrayDecl_1 = null;

        EObject this_VarDecl_2 = null;



        	enterRule();

        try {
            // InternalMGPL.g:203:2: ( ( (this_ObjDecl_0= ruleObjDecl | this_ObjArrayDecl_1= ruleObjArrayDecl | this_VarDecl_2= ruleVarDecl ) otherlv_3= ';' ) )
            // InternalMGPL.g:204:2: ( (this_ObjDecl_0= ruleObjDecl | this_ObjArrayDecl_1= ruleObjArrayDecl | this_VarDecl_2= ruleVarDecl ) otherlv_3= ';' )
            {
            // InternalMGPL.g:204:2: ( (this_ObjDecl_0= ruleObjDecl | this_ObjArrayDecl_1= ruleObjArrayDecl | this_VarDecl_2= ruleVarDecl ) otherlv_3= ';' )
            // InternalMGPL.g:205:3: (this_ObjDecl_0= ruleObjDecl | this_ObjArrayDecl_1= ruleObjArrayDecl | this_VarDecl_2= ruleVarDecl ) otherlv_3= ';'
            {
            // InternalMGPL.g:205:3: (this_ObjDecl_0= ruleObjDecl | this_ObjArrayDecl_1= ruleObjArrayDecl | this_VarDecl_2= ruleVarDecl )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_IDF) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==13) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==18) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_IDF) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==13) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==18) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==RULE_IDF) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==13) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==18) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMGPL.g:206:4: this_ObjDecl_0= ruleObjDecl
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getObjDeclParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_ObjDecl_0=ruleObjDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ObjDecl_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:215:4: this_ObjArrayDecl_1= ruleObjArrayDecl
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getObjArrayDeclParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_ObjArrayDecl_1=ruleObjArrayDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ObjArrayDecl_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMGPL.g:224:4: this_VarDecl_2= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getVarDeclParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_VarDecl_2=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_VarDecl_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDeclAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalMGPL.g:241:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalMGPL.g:241:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalMGPL.g:242:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalMGPL.g:248:1: ruleVarDecl returns [EObject current=null] : (this_ScalarVarDecl_0= ruleScalarVarDecl | this_ArrayVarDecl_1= ruleArrayVarDecl ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarVarDecl_0 = null;

        EObject this_ArrayVarDecl_1 = null;



        	enterRule();

        try {
            // InternalMGPL.g:254:2: ( (this_ScalarVarDecl_0= ruleScalarVarDecl | this_ArrayVarDecl_1= ruleArrayVarDecl ) )
            // InternalMGPL.g:255:2: (this_ScalarVarDecl_0= ruleScalarVarDecl | this_ArrayVarDecl_1= ruleArrayVarDecl )
            {
            // InternalMGPL.g:255:2: (this_ScalarVarDecl_0= ruleScalarVarDecl | this_ArrayVarDecl_1= ruleArrayVarDecl )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_IDF) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==18) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==EOF||LA5_2==15||LA5_2==17) ) {
                        alt5=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMGPL.g:256:3: this_ScalarVarDecl_0= ruleScalarVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVarDeclAccess().getScalarVarDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ScalarVarDecl_0=ruleScalarVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ScalarVarDecl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:265:3: this_ArrayVarDecl_1= ruleArrayVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVarDeclAccess().getArrayVarDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayVarDecl_1=ruleArrayVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayVarDecl_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleScalarVarDecl"
    // InternalMGPL.g:277:1: entryRuleScalarVarDecl returns [EObject current=null] : iv_ruleScalarVarDecl= ruleScalarVarDecl EOF ;
    public final EObject entryRuleScalarVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarVarDecl = null;


        try {
            // InternalMGPL.g:277:54: (iv_ruleScalarVarDecl= ruleScalarVarDecl EOF )
            // InternalMGPL.g:278:2: iv_ruleScalarVarDecl= ruleScalarVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScalarVarDecl=ruleScalarVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarVarDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarVarDecl"


    // $ANTLR start "ruleScalarVarDecl"
    // InternalMGPL.g:284:1: ruleScalarVarDecl returns [EObject current=null] : (otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) (otherlv_2= '=' ( (lv_initialization_3_0= ruleExpr ) ) )? ) ;
    public final EObject ruleScalarVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_initialization_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:290:2: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) (otherlv_2= '=' ( (lv_initialization_3_0= ruleExpr ) ) )? ) )
            // InternalMGPL.g:291:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) (otherlv_2= '=' ( (lv_initialization_3_0= ruleExpr ) ) )? )
            {
            // InternalMGPL.g:291:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) (otherlv_2= '=' ( (lv_initialization_3_0= ruleExpr ) ) )? )
            // InternalMGPL.g:292:3: otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) (otherlv_2= '=' ( (lv_initialization_3_0= ruleExpr ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getScalarVarDeclAccess().getIntKeyword_0());
              		
            }
            // InternalMGPL.g:296:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:297:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:297:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:298:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getScalarVarDeclAccess().getNameIDFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getScalarVarDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.tu_dortmund.MGPL.IDF");
              				
            }

            }


            }

            // InternalMGPL.g:314:3: (otherlv_2= '=' ( (lv_initialization_3_0= ruleExpr ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMGPL.g:315:4: otherlv_2= '=' ( (lv_initialization_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getScalarVarDeclAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalMGPL.g:319:4: ( (lv_initialization_3_0= ruleExpr ) )
                    // InternalMGPL.g:320:5: (lv_initialization_3_0= ruleExpr )
                    {
                    // InternalMGPL.g:320:5: (lv_initialization_3_0= ruleExpr )
                    // InternalMGPL.g:321:6: lv_initialization_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScalarVarDeclAccess().getInitializationExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_initialization_3_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getScalarVarDeclRule());
                      						}
                      						set(
                      							current,
                      							"initialization",
                      							lv_initialization_3_0,
                      							"de.tu_dortmund.MGPL.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarVarDecl"


    // $ANTLR start "entryRuleArrayVarDecl"
    // InternalMGPL.g:343:1: entryRuleArrayVarDecl returns [EObject current=null] : iv_ruleArrayVarDecl= ruleArrayVarDecl EOF ;
    public final EObject entryRuleArrayVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayVarDecl = null;


        try {
            // InternalMGPL.g:343:53: (iv_ruleArrayVarDecl= ruleArrayVarDecl EOF )
            // InternalMGPL.g:344:2: iv_ruleArrayVarDecl= ruleArrayVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayVarDecl=ruleArrayVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayVarDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayVarDecl"


    // $ANTLR start "ruleArrayVarDecl"
    // InternalMGPL.g:350:1: ruleArrayVarDecl returns [EObject current=null] : (otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleArrayVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMGPL.g:356:2: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalMGPL.g:357:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalMGPL.g:357:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalMGPL.g:358:3: otherlv_0= 'int' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayVarDeclAccess().getIntKeyword_0());
              		
            }
            // InternalMGPL.g:362:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:363:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:363:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:364:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getArrayVarDeclAccess().getNameIDFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArrayVarDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.tu_dortmund.MGPL.IDF");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArrayVarDeclAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalMGPL.g:384:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalMGPL.g:385:4: (lv_size_3_0= RULE_INT )
            {
            // InternalMGPL.g:385:4: (lv_size_3_0= RULE_INT )
            // InternalMGPL.g:386:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_size_3_0, grammarAccess.getArrayVarDeclAccess().getSizeINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArrayVarDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"size",
              						lv_size_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getArrayVarDeclAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayVarDecl"


    // $ANTLR start "entryRuleObjDecl"
    // InternalMGPL.g:410:1: entryRuleObjDecl returns [EObject current=null] : iv_ruleObjDecl= ruleObjDecl EOF ;
    public final EObject entryRuleObjDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjDecl = null;


        try {
            // InternalMGPL.g:410:48: (iv_ruleObjDecl= ruleObjDecl EOF )
            // InternalMGPL.g:411:2: iv_ruleObjDecl= ruleObjDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjDecl=ruleObjDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjDecl"


    // $ANTLR start "ruleObjDecl"
    // InternalMGPL.g:417:1: ruleObjDecl returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) ;
    public final EObject ruleObjDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:423:2: ( ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) )
            // InternalMGPL.g:424:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' )
            {
            // InternalMGPL.g:424:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')' )
            // InternalMGPL.g:425:3: ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttrAssList ) )? otherlv_4= ')'
            {
            // InternalMGPL.g:425:3: ( (lv_type_0_0= ruleObjType ) )
            // InternalMGPL.g:426:4: (lv_type_0_0= ruleObjType )
            {
            // InternalMGPL.g:426:4: (lv_type_0_0= ruleObjType )
            // InternalMGPL.g:427:5: lv_type_0_0= ruleObjType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjDeclAccess().getTypeObjTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleObjType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"de.tu_dortmund.MGPL.ObjType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGPL.g:444:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:445:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:445:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:446:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getObjDeclAccess().getNameIDFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.tu_dortmund.MGPL.IDF");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMGPL.g:466:3: ( (lv_attributes_3_0= ruleAttrAssList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGPL.g:467:4: (lv_attributes_3_0= ruleAttrAssList )
                    {
                    // InternalMGPL.g:467:4: (lv_attributes_3_0= ruleAttrAssList )
                    // InternalMGPL.g:468:5: lv_attributes_3_0= ruleAttrAssList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjDeclAccess().getAttributesAttrAssListParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    lv_attributes_3_0=ruleAttrAssList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjDeclRule());
                      					}
                      					set(
                      						current,
                      						"attributes",
                      						lv_attributes_3_0,
                      						"de.tu_dortmund.MGPL.AttrAssList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjDecl"


    // $ANTLR start "entryRuleObjArrayDecl"
    // InternalMGPL.g:493:1: entryRuleObjArrayDecl returns [EObject current=null] : iv_ruleObjArrayDecl= ruleObjArrayDecl EOF ;
    public final EObject entryRuleObjArrayDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjArrayDecl = null;


        try {
            // InternalMGPL.g:493:53: (iv_ruleObjArrayDecl= ruleObjArrayDecl EOF )
            // InternalMGPL.g:494:2: iv_ruleObjArrayDecl= ruleObjArrayDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjArrayDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjArrayDecl=ruleObjArrayDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjArrayDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjArrayDecl"


    // $ANTLR start "ruleObjArrayDecl"
    // InternalMGPL.g:500:1: ruleObjArrayDecl returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleObjArrayDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:506:2: ( ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalMGPL.g:507:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalMGPL.g:507:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalMGPL.g:508:3: ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            // InternalMGPL.g:508:3: ( (lv_type_0_0= ruleObjType ) )
            // InternalMGPL.g:509:4: (lv_type_0_0= ruleObjType )
            {
            // InternalMGPL.g:509:4: (lv_type_0_0= ruleObjType )
            // InternalMGPL.g:510:5: lv_type_0_0= ruleObjType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjArrayDeclAccess().getTypeObjTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleObjType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjArrayDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"de.tu_dortmund.MGPL.ObjType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGPL.g:527:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:528:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:528:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:529:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getObjArrayDeclAccess().getNameIDFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjArrayDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.tu_dortmund.MGPL.IDF");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getObjArrayDeclAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalMGPL.g:549:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalMGPL.g:550:4: (lv_size_3_0= RULE_INT )
            {
            // InternalMGPL.g:550:4: (lv_size_3_0= RULE_INT )
            // InternalMGPL.g:551:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_size_3_0, grammarAccess.getObjArrayDeclAccess().getSizeINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjArrayDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"size",
              						lv_size_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getObjArrayDeclAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjArrayDecl"


    // $ANTLR start "entryRuleAttrAssList"
    // InternalMGPL.g:575:1: entryRuleAttrAssList returns [EObject current=null] : iv_ruleAttrAssList= ruleAttrAssList EOF ;
    public final EObject entryRuleAttrAssList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAssList = null;


        try {
            // InternalMGPL.g:575:52: (iv_ruleAttrAssList= ruleAttrAssList EOF )
            // InternalMGPL.g:576:2: iv_ruleAttrAssList= ruleAttrAssList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttrAssListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttrAssList=ruleAttrAssList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttrAssList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttrAssList"


    // $ANTLR start "ruleAttrAssList"
    // InternalMGPL.g:582:1: ruleAttrAssList returns [EObject current=null] : ( ( (lv_assignments_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAttrAss ) ) )* ) ;
    public final EObject ruleAttrAssList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignments_0_0 = null;

        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:588:2: ( ( ( (lv_assignments_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAttrAss ) ) )* ) )
            // InternalMGPL.g:589:2: ( ( (lv_assignments_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAttrAss ) ) )* )
            {
            // InternalMGPL.g:589:2: ( ( (lv_assignments_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAttrAss ) ) )* )
            // InternalMGPL.g:590:3: ( (lv_assignments_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAttrAss ) ) )*
            {
            // InternalMGPL.g:590:3: ( (lv_assignments_0_0= ruleAttrAss ) )
            // InternalMGPL.g:591:4: (lv_assignments_0_0= ruleAttrAss )
            {
            // InternalMGPL.g:591:4: (lv_assignments_0_0= ruleAttrAss )
            // InternalMGPL.g:592:5: lv_assignments_0_0= ruleAttrAss
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttrAssListAccess().getAssignmentsAttrAssParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_assignments_0_0=ruleAttrAss();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttrAssListRule());
              					}
              					add(
              						current,
              						"assignments",
              						lv_assignments_0_0,
              						"de.tu_dortmund.MGPL.AttrAss");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGPL.g:609:3: (otherlv_1= ',' ( (lv_assignments_2_0= ruleAttrAss ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMGPL.g:610:4: otherlv_1= ',' ( (lv_assignments_2_0= ruleAttrAss ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAttrAssListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMGPL.g:614:4: ( (lv_assignments_2_0= ruleAttrAss ) )
            	    // InternalMGPL.g:615:5: (lv_assignments_2_0= ruleAttrAss )
            	    {
            	    // InternalMGPL.g:615:5: (lv_assignments_2_0= ruleAttrAss )
            	    // InternalMGPL.g:616:6: lv_assignments_2_0= ruleAttrAss
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAttrAssListAccess().getAssignmentsAttrAssParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_assignments_2_0=ruleAttrAss();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAttrAssListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"assignments",
            	      							lv_assignments_2_0,
            	      							"de.tu_dortmund.MGPL.AttrAss");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttrAssList"


    // $ANTLR start "entryRuleAttrAss"
    // InternalMGPL.g:638:1: entryRuleAttrAss returns [EObject current=null] : iv_ruleAttrAss= ruleAttrAss EOF ;
    public final EObject entryRuleAttrAss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAss = null;


        try {
            // InternalMGPL.g:638:48: (iv_ruleAttrAss= ruleAttrAss EOF )
            // InternalMGPL.g:639:2: iv_ruleAttrAss= ruleAttrAss EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttrAssRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttrAss=ruleAttrAss();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttrAss; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttrAss"


    // $ANTLR start "ruleAttrAss"
    // InternalMGPL.g:645:1: ruleAttrAss returns [EObject current=null] : ( ( (lv_attributeName_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAttrAss() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:651:2: ( ( ( (lv_attributeName_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) ) )
            // InternalMGPL.g:652:2: ( ( (lv_attributeName_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )
            {
            // InternalMGPL.g:652:2: ( ( (lv_attributeName_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )
            // InternalMGPL.g:653:3: ( (lv_attributeName_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) )
            {
            // InternalMGPL.g:653:3: ( (lv_attributeName_0_0= RULE_IDF ) )
            // InternalMGPL.g:654:4: (lv_attributeName_0_0= RULE_IDF )
            {
            // InternalMGPL.g:654:4: (lv_attributeName_0_0= RULE_IDF )
            // InternalMGPL.g:655:5: lv_attributeName_0_0= RULE_IDF
            {
            lv_attributeName_0_0=(Token)match(input,RULE_IDF,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_attributeName_0_0, grammarAccess.getAttrAssAccess().getAttributeNameIDFTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttrAssRule());
              					}
              					setWithLastConsumed(
              						current,
              						"attributeName",
              						lv_attributeName_0_0,
              						"de.tu_dortmund.MGPL.IDF");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMGPL.g:675:3: ( (lv_value_2_0= ruleExpr ) )
            // InternalMGPL.g:676:4: (lv_value_2_0= ruleExpr )
            {
            // InternalMGPL.g:676:4: (lv_value_2_0= ruleExpr )
            // InternalMGPL.g:677:5: lv_value_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttrAssAccess().getValueExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttrAssRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.tu_dortmund.MGPL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttrAss"


    // $ANTLR start "entryRuleBlock"
    // InternalMGPL.g:698:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMGPL.g:698:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMGPL.g:699:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMGPL.g:705:1: ruleBlock returns [EObject current=null] : (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_AnimBlock_0 = null;

        EObject this_EventBlock_1 = null;



        	enterRule();

        try {
            // InternalMGPL.g:711:2: ( (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) )
            // InternalMGPL.g:712:2: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            {
            // InternalMGPL.g:712:2: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGPL.g:713:3: this_AnimBlock_0= ruleAnimBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AnimBlock_0=ruleAnimBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnimBlock_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:722:3: this_EventBlock_1= ruleEventBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EventBlock_1=ruleEventBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EventBlock_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAnimBlock"
    // InternalMGPL.g:734:1: entryRuleAnimBlock returns [EObject current=null] : iv_ruleAnimBlock= ruleAnimBlock EOF ;
    public final EObject entryRuleAnimBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimBlock = null;


        try {
            // InternalMGPL.g:734:50: (iv_ruleAnimBlock= ruleAnimBlock EOF )
            // InternalMGPL.g:735:2: iv_ruleAnimBlock= ruleAnimBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnimBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnimBlock=ruleAnimBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnimBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimBlock"


    // $ANTLR start "ruleAnimBlock"
    // InternalMGPL.g:741:1: ruleAnimBlock returns [EObject current=null] : (otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_target_3_0= ruleAnimTarget ) ) otherlv_4= ')' ( (lv_action_5_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleAnimBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_target_3_0 = null;

        EObject lv_action_5_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:747:2: ( (otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_target_3_0= ruleAnimTarget ) ) otherlv_4= ')' ( (lv_action_5_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:748:2: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_target_3_0= ruleAnimTarget ) ) otherlv_4= ')' ( (lv_action_5_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:748:2: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_target_3_0= ruleAnimTarget ) ) otherlv_4= ')' ( (lv_action_5_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:749:3: otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_target_3_0= ruleAnimTarget ) ) otherlv_4= ')' ( (lv_action_5_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnimBlockAccess().getAnimationKeyword_0());
              		
            }
            // InternalMGPL.g:753:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:754:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:754:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:755:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAnimBlockAccess().getNameIDFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnimBlockRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.tu_dortmund.MGPL.IDF");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMGPL.g:775:3: ( (lv_target_3_0= ruleAnimTarget ) )
            // InternalMGPL.g:776:4: (lv_target_3_0= ruleAnimTarget )
            {
            // InternalMGPL.g:776:4: (lv_target_3_0= ruleAnimTarget )
            // InternalMGPL.g:777:5: lv_target_3_0= ruleAnimTarget
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnimBlockAccess().getTargetAnimTargetParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_target_3_0=ruleAnimTarget();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnimBlockRule());
              					}
              					set(
              						current,
              						"target",
              						lv_target_3_0,
              						"de.tu_dortmund.MGPL.AnimTarget");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMGPL.g:798:3: ( (lv_action_5_0= ruleStmtBlock ) )
            // InternalMGPL.g:799:4: (lv_action_5_0= ruleStmtBlock )
            {
            // InternalMGPL.g:799:4: (lv_action_5_0= ruleStmtBlock )
            // InternalMGPL.g:800:5: lv_action_5_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnimBlockAccess().getActionStmtBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_action_5_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnimBlockRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_5_0,
              						"de.tu_dortmund.MGPL.StmtBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimBlock"


    // $ANTLR start "entryRuleAnimTarget"
    // InternalMGPL.g:821:1: entryRuleAnimTarget returns [EObject current=null] : iv_ruleAnimTarget= ruleAnimTarget EOF ;
    public final EObject entryRuleAnimTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimTarget = null;


        try {
            // InternalMGPL.g:821:51: (iv_ruleAnimTarget= ruleAnimTarget EOF )
            // InternalMGPL.g:822:2: iv_ruleAnimTarget= ruleAnimTarget EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnimTargetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnimTarget=ruleAnimTarget();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnimTarget; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimTarget"


    // $ANTLR start "ruleAnimTarget"
    // InternalMGPL.g:828:1: ruleAnimTarget returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ) ;
    public final EObject ruleAnimTarget() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:834:2: ( ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ) )
            // InternalMGPL.g:835:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) )
            {
            // InternalMGPL.g:835:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) )
            // InternalMGPL.g:836:3: ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) )
            {
            // InternalMGPL.g:836:3: ( (lv_type_0_0= ruleObjType ) )
            // InternalMGPL.g:837:4: (lv_type_0_0= ruleObjType )
            {
            // InternalMGPL.g:837:4: (lv_type_0_0= ruleObjType )
            // InternalMGPL.g:838:5: lv_type_0_0= ruleObjType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnimTargetAccess().getTypeObjTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleObjType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnimTargetRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"de.tu_dortmund.MGPL.ObjType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGPL.g:855:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:856:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:856:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:857:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAnimTargetAccess().getNameIDFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnimTargetRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.tu_dortmund.MGPL.IDF");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimTarget"


    // $ANTLR start "entryRuleEventBlock"
    // InternalMGPL.g:877:1: entryRuleEventBlock returns [EObject current=null] : iv_ruleEventBlock= ruleEventBlock EOF ;
    public final EObject entryRuleEventBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBlock = null;


        try {
            // InternalMGPL.g:877:51: (iv_ruleEventBlock= ruleEventBlock EOF )
            // InternalMGPL.g:878:2: iv_ruleEventBlock= ruleEventBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventBlock=ruleEventBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventBlock"


    // $ANTLR start "ruleEventBlock"
    // InternalMGPL.g:884:1: ruleEventBlock returns [EObject current=null] : (otherlv_0= 'on' ( (lv_key_1_0= ruleKeyStroke ) ) ( (lv_action_2_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleEventBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_key_1_0 = null;

        EObject lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:890:2: ( (otherlv_0= 'on' ( (lv_key_1_0= ruleKeyStroke ) ) ( (lv_action_2_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:891:2: (otherlv_0= 'on' ( (lv_key_1_0= ruleKeyStroke ) ) ( (lv_action_2_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:891:2: (otherlv_0= 'on' ( (lv_key_1_0= ruleKeyStroke ) ) ( (lv_action_2_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:892:3: otherlv_0= 'on' ( (lv_key_1_0= ruleKeyStroke ) ) ( (lv_action_2_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEventBlockAccess().getOnKeyword_0());
              		
            }
            // InternalMGPL.g:896:3: ( (lv_key_1_0= ruleKeyStroke ) )
            // InternalMGPL.g:897:4: (lv_key_1_0= ruleKeyStroke )
            {
            // InternalMGPL.g:897:4: (lv_key_1_0= ruleKeyStroke )
            // InternalMGPL.g:898:5: lv_key_1_0= ruleKeyStroke
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEventBlockAccess().getKeyKeyStrokeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_key_1_0=ruleKeyStroke();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEventBlockRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_1_0,
              						"de.tu_dortmund.MGPL.KeyStroke");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGPL.g:915:3: ( (lv_action_2_0= ruleStmtBlock ) )
            // InternalMGPL.g:916:4: (lv_action_2_0= ruleStmtBlock )
            {
            // InternalMGPL.g:916:4: (lv_action_2_0= ruleStmtBlock )
            // InternalMGPL.g:917:5: lv_action_2_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEventBlockAccess().getActionStmtBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_action_2_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEventBlockRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_2_0,
              						"de.tu_dortmund.MGPL.StmtBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventBlock"


    // $ANTLR start "entryRuleStmtBlock"
    // InternalMGPL.g:938:1: entryRuleStmtBlock returns [EObject current=null] : iv_ruleStmtBlock= ruleStmtBlock EOF ;
    public final EObject entryRuleStmtBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtBlock = null;


        try {
            // InternalMGPL.g:938:50: (iv_ruleStmtBlock= ruleStmtBlock EOF )
            // InternalMGPL.g:939:2: iv_ruleStmtBlock= ruleStmtBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmtBlock=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtBlock"


    // $ANTLR start "ruleStmtBlock"
    // InternalMGPL.g:945:1: ruleStmtBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_statements_2_0= ruleStmt ) )* otherlv_3= '}' ) ;
    public final EObject ruleStmtBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:951:2: ( (otherlv_0= '{' () ( (lv_statements_2_0= ruleStmt ) )* otherlv_3= '}' ) )
            // InternalMGPL.g:952:2: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStmt ) )* otherlv_3= '}' )
            {
            // InternalMGPL.g:952:2: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStmt ) )* otherlv_3= '}' )
            // InternalMGPL.g:953:3: otherlv_0= '{' () ( (lv_statements_2_0= ruleStmt ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStmtBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMGPL.g:957:3: ()
            // InternalMGPL.g:958:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStmtBlockAccess().getStmtBlockAction_1(),
              					current);
              			
            }

            }

            // InternalMGPL.g:964:3: ( (lv_statements_2_0= ruleStmt ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_IDF||LA10_0==25||LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMGPL.g:965:4: (lv_statements_2_0= ruleStmt )
            	    {
            	    // InternalMGPL.g:965:4: (lv_statements_2_0= ruleStmt )
            	    // InternalMGPL.g:966:5: lv_statements_2_0= ruleStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStmtBlockAccess().getStatementsStmtParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_statements_2_0=ruleStmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStmtBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"de.tu_dortmund.MGPL.Stmt");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStmtBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtBlock"


    // $ANTLR start "entryRuleStmt"
    // InternalMGPL.g:991:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalMGPL.g:991:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalMGPL.g:992:2: iv_ruleStmt= ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMGPL.g:998:1: ruleStmt returns [EObject current=null] : (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        EObject this_IfStmt_0 = null;

        EObject this_ForStmt_1 = null;

        EObject this_AssStmt_2 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1004:2: ( (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt ) )
            // InternalMGPL.g:1005:2: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt )
            {
            // InternalMGPL.g:1005:2: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case RULE_IDF:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMGPL.g:1006:3: this_IfStmt_0= ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStmt_0=ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStmt_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1015:3: this_ForStmt_1= ruleForStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStmt_1=ruleForStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStmt_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMGPL.g:1024:3: this_AssStmt_2= ruleAssStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssStmt_2=ruleAssStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssStmt_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleIfStmt"
    // InternalMGPL.g:1036:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalMGPL.g:1036:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalMGPL.g:1037:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalMGPL.g:1043:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStmtBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmtBlock ) ) )? ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1049:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStmtBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmtBlock ) ) )? ) )
            // InternalMGPL.g:1050:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStmtBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmtBlock ) ) )? )
            {
            // InternalMGPL.g:1050:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStmtBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmtBlock ) ) )? )
            // InternalMGPL.g:1051:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStmtBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmtBlock ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMGPL.g:1059:3: ( (lv_condition_2_0= ruleExpr ) )
            // InternalMGPL.g:1060:4: (lv_condition_2_0= ruleExpr )
            {
            // InternalMGPL.g:1060:4: (lv_condition_2_0= ruleExpr )
            // InternalMGPL.g:1061:5: lv_condition_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtAccess().getConditionExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_condition_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStmtRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"de.tu_dortmund.MGPL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalMGPL.g:1082:3: ( (lv_then_4_0= ruleStmtBlock ) )
            // InternalMGPL.g:1083:4: (lv_then_4_0= ruleStmtBlock )
            {
            // InternalMGPL.g:1083:4: (lv_then_4_0= ruleStmtBlock )
            // InternalMGPL.g:1084:5: lv_then_4_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtAccess().getThenStmtBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_then_4_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStmtRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_4_0,
              						"de.tu_dortmund.MGPL.StmtBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGPL.g:1101:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmtBlock ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) && (synpred1_InternalMGPL())) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGPL.g:1102:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmtBlock ) )
                    {
                    // InternalMGPL.g:1102:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalMGPL.g:1103:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStmtAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalMGPL.g:1109:4: ( (lv_else_6_0= ruleStmtBlock ) )
                    // InternalMGPL.g:1110:5: (lv_else_6_0= ruleStmtBlock )
                    {
                    // InternalMGPL.g:1110:5: (lv_else_6_0= ruleStmtBlock )
                    // InternalMGPL.g:1111:6: lv_else_6_0= ruleStmtBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStmtAccess().getElseStmtBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_6_0=ruleStmtBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStmtRule());
                      						}
                      						set(
                      							current,
                      							"else",
                      							lv_else_6_0,
                      							"de.tu_dortmund.MGPL.StmtBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleForStmt"
    // InternalMGPL.g:1133:1: entryRuleForStmt returns [EObject current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final EObject entryRuleForStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStmt = null;


        try {
            // InternalMGPL.g:1133:48: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalMGPL.g:1134:2: iv_ruleForStmt= ruleForStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStmt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // InternalMGPL.g:1140:1: ruleForStmt returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_step_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_body_8_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleForStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_init_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_step_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1146:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_step_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_body_8_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:1147:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_step_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_body_8_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:1147:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_step_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_body_8_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:1148:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_step_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_body_8_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStmtAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMGPL.g:1156:3: ( (lv_init_2_0= ruleAssignment ) )
            // InternalMGPL.g:1157:4: (lv_init_2_0= ruleAssignment )
            {
            // InternalMGPL.g:1157:4: (lv_init_2_0= ruleAssignment )
            // InternalMGPL.g:1158:5: lv_init_2_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStmtAccess().getInitAssignmentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_init_2_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStmtRule());
              					}
              					set(
              						current,
              						"init",
              						lv_init_2_0,
              						"de.tu_dortmund.MGPL.Assignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForStmtAccess().getSemicolonKeyword_3());
              		
            }
            // InternalMGPL.g:1179:3: ( (lv_condition_4_0= ruleExpr ) )
            // InternalMGPL.g:1180:4: (lv_condition_4_0= ruleExpr )
            {
            // InternalMGPL.g:1180:4: (lv_condition_4_0= ruleExpr )
            // InternalMGPL.g:1181:5: lv_condition_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStmtAccess().getConditionExprParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_condition_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStmtRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_4_0,
              						"de.tu_dortmund.MGPL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStmtAccess().getSemicolonKeyword_5());
              		
            }
            // InternalMGPL.g:1202:3: ( (lv_step_6_0= ruleAssignment ) )
            // InternalMGPL.g:1203:4: (lv_step_6_0= ruleAssignment )
            {
            // InternalMGPL.g:1203:4: (lv_step_6_0= ruleAssignment )
            // InternalMGPL.g:1204:5: lv_step_6_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStmtAccess().getStepAssignmentParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_step_6_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStmtRule());
              					}
              					set(
              						current,
              						"step",
              						lv_step_6_0,
              						"de.tu_dortmund.MGPL.Assignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStmtAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalMGPL.g:1225:3: ( (lv_body_8_0= ruleStmtBlock ) )
            // InternalMGPL.g:1226:4: (lv_body_8_0= ruleStmtBlock )
            {
            // InternalMGPL.g:1226:4: (lv_body_8_0= ruleStmtBlock )
            // InternalMGPL.g:1227:5: lv_body_8_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStmtAccess().getBodyStmtBlockParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_8_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStmtRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_8_0,
              						"de.tu_dortmund.MGPL.StmtBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleAssignment"
    // InternalMGPL.g:1248:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMGPL.g:1248:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMGPL.g:1249:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMGPL.g:1255:1: ruleAssignment returns [EObject current=null] : ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1261:2: ( ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) ) )
            // InternalMGPL.g:1262:2: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )
            {
            // InternalMGPL.g:1262:2: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )
            // InternalMGPL.g:1263:3: ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) )
            {
            // InternalMGPL.g:1263:3: ( (lv_var_0_0= ruleVar ) )
            // InternalMGPL.g:1264:4: (lv_var_0_0= ruleVar )
            {
            // InternalMGPL.g:1264:4: (lv_var_0_0= ruleVar )
            // InternalMGPL.g:1265:5: lv_var_0_0= ruleVar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getVarVarParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_var_0_0=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"var",
              						lv_var_0_0,
              						"de.tu_dortmund.MGPL.Var");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMGPL.g:1286:3: ( (lv_value_2_0= ruleExpr ) )
            // InternalMGPL.g:1287:4: (lv_value_2_0= ruleExpr )
            {
            // InternalMGPL.g:1287:4: (lv_value_2_0= ruleExpr )
            // InternalMGPL.g:1288:5: lv_value_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getValueExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.tu_dortmund.MGPL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssStmt"
    // InternalMGPL.g:1309:1: entryRuleAssStmt returns [EObject current=null] : iv_ruleAssStmt= ruleAssStmt EOF ;
    public final EObject entryRuleAssStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssStmt = null;


        try {
            // InternalMGPL.g:1309:48: (iv_ruleAssStmt= ruleAssStmt EOF )
            // InternalMGPL.g:1310:2: iv_ruleAssStmt= ruleAssStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssStmt=ruleAssStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssStmt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssStmt"


    // $ANTLR start "ruleAssStmt"
    // InternalMGPL.g:1316:1: ruleAssStmt returns [EObject current=null] : (this_Assignment_0= ruleAssignment otherlv_1= ';' ) ;
    public final EObject ruleAssStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1322:2: ( (this_Assignment_0= ruleAssignment otherlv_1= ';' ) )
            // InternalMGPL.g:1323:2: (this_Assignment_0= ruleAssignment otherlv_1= ';' )
            {
            // InternalMGPL.g:1323:2: (this_Assignment_0= ruleAssignment otherlv_1= ';' )
            // InternalMGPL.g:1324:3: this_Assignment_0= ruleAssignment otherlv_1= ';'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssStmtAccess().getAssignmentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Assignment_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssStmtAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssStmt"


    // $ANTLR start "entryRuleVar"
    // InternalMGPL.g:1340:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMGPL.g:1340:44: (iv_ruleVar= ruleVar EOF )
            // InternalMGPL.g:1341:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMGPL.g:1347:1: ruleVar returns [EObject current=null] : ( ( (otherlv_0= RULE_IDF ) ) | ( ( (otherlv_1= RULE_IDF ) ) ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' (otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) ) )? ) | ( ( (otherlv_7= RULE_IDF ) ) ( ( '.' )=>otherlv_8= '.' ) ( (lv_attribute_9_0= RULE_IDF ) ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_attribute_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_attribute_9_0=null;
        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1353:2: ( ( ( (otherlv_0= RULE_IDF ) ) | ( ( (otherlv_1= RULE_IDF ) ) ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' (otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) ) )? ) | ( ( (otherlv_7= RULE_IDF ) ) ( ( '.' )=>otherlv_8= '.' ) ( (lv_attribute_9_0= RULE_IDF ) ) ) ) )
            // InternalMGPL.g:1354:2: ( ( (otherlv_0= RULE_IDF ) ) | ( ( (otherlv_1= RULE_IDF ) ) ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' (otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) ) )? ) | ( ( (otherlv_7= RULE_IDF ) ) ( ( '.' )=>otherlv_8= '.' ) ( (lv_attribute_9_0= RULE_IDF ) ) ) )
            {
            // InternalMGPL.g:1354:2: ( ( (otherlv_0= RULE_IDF ) ) | ( ( (otherlv_1= RULE_IDF ) ) ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' (otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) ) )? ) | ( ( (otherlv_7= RULE_IDF ) ) ( ( '.' )=>otherlv_8= '.' ) ( (lv_attribute_9_0= RULE_IDF ) ) ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDF) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt14=3;
                    }
                    break;
                case 18:
                    {
                    alt14=2;
                    }
                    break;
                case EOF:
                case 14:
                case 15:
                case 17:
                case 19:
                case 20:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    {
                    alt14=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMGPL.g:1355:3: ( (otherlv_0= RULE_IDF ) )
                    {
                    // InternalMGPL.g:1355:3: ( (otherlv_0= RULE_IDF ) )
                    // InternalMGPL.g:1356:4: (otherlv_0= RULE_IDF )
                    {
                    // InternalMGPL.g:1356:4: (otherlv_0= RULE_IDF )
                    // InternalMGPL.g:1357:5: otherlv_0= RULE_IDF
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarRule());
                      					}
                      				
                    }
                    otherlv_0=(Token)match(input,RULE_IDF,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_0_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1369:3: ( ( (otherlv_1= RULE_IDF ) ) ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' (otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) ) )? )
                    {
                    // InternalMGPL.g:1369:3: ( ( (otherlv_1= RULE_IDF ) ) ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' (otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) ) )? )
                    // InternalMGPL.g:1370:4: ( (otherlv_1= RULE_IDF ) ) ( ( '[' )=>otherlv_2= '[' ) ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' (otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) ) )?
                    {
                    // InternalMGPL.g:1370:4: ( (otherlv_1= RULE_IDF ) )
                    // InternalMGPL.g:1371:5: (otherlv_1= RULE_IDF )
                    {
                    // InternalMGPL.g:1371:5: (otherlv_1= RULE_IDF )
                    // InternalMGPL.g:1372:6: otherlv_1= RULE_IDF
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_IDF,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_1_0_0());
                      					
                    }

                    }


                    }

                    // InternalMGPL.g:1383:4: ( ( '[' )=>otherlv_2= '[' )
                    // InternalMGPL.g:1384:5: ( '[' )=>otherlv_2= '['
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_1());
                      				
                    }

                    }

                    // InternalMGPL.g:1390:4: ( (lv_index_3_0= ruleExpr ) )
                    // InternalMGPL.g:1391:5: (lv_index_3_0= ruleExpr )
                    {
                    // InternalMGPL.g:1391:5: (lv_index_3_0= ruleExpr )
                    // InternalMGPL.g:1392:6: lv_index_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAccess().getIndexExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_index_3_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_3_0,
                      							"de.tu_dortmund.MGPL.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }
                    // InternalMGPL.g:1413:4: (otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==28) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMGPL.g:1414:5: otherlv_5= '.' ( (lv_attribute_6_0= RULE_IDF ) )
                            {
                            otherlv_5=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getVarAccess().getFullStopKeyword_1_4_0());
                              				
                            }
                            // InternalMGPL.g:1418:5: ( (lv_attribute_6_0= RULE_IDF ) )
                            // InternalMGPL.g:1419:6: (lv_attribute_6_0= RULE_IDF )
                            {
                            // InternalMGPL.g:1419:6: (lv_attribute_6_0= RULE_IDF )
                            // InternalMGPL.g:1420:7: lv_attribute_6_0= RULE_IDF
                            {
                            lv_attribute_6_0=(Token)match(input,RULE_IDF,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_attribute_6_0, grammarAccess.getVarAccess().getAttributeIDFTerminalRuleCall_1_4_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getVarRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"attribute",
                              								lv_attribute_6_0,
                              								"de.tu_dortmund.MGPL.IDF");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:1439:3: ( ( (otherlv_7= RULE_IDF ) ) ( ( '.' )=>otherlv_8= '.' ) ( (lv_attribute_9_0= RULE_IDF ) ) )
                    {
                    // InternalMGPL.g:1439:3: ( ( (otherlv_7= RULE_IDF ) ) ( ( '.' )=>otherlv_8= '.' ) ( (lv_attribute_9_0= RULE_IDF ) ) )
                    // InternalMGPL.g:1440:4: ( (otherlv_7= RULE_IDF ) ) ( ( '.' )=>otherlv_8= '.' ) ( (lv_attribute_9_0= RULE_IDF ) )
                    {
                    // InternalMGPL.g:1440:4: ( (otherlv_7= RULE_IDF ) )
                    // InternalMGPL.g:1441:5: (otherlv_7= RULE_IDF )
                    {
                    // InternalMGPL.g:1441:5: (otherlv_7= RULE_IDF )
                    // InternalMGPL.g:1442:6: otherlv_7= RULE_IDF
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_IDF,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_2_0_0());
                      					
                    }

                    }


                    }

                    // InternalMGPL.g:1453:4: ( ( '.' )=>otherlv_8= '.' )
                    // InternalMGPL.g:1454:5: ( '.' )=>otherlv_8= '.'
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getVarAccess().getFullStopKeyword_2_1());
                      				
                    }

                    }

                    // InternalMGPL.g:1460:4: ( (lv_attribute_9_0= RULE_IDF ) )
                    // InternalMGPL.g:1461:5: (lv_attribute_9_0= RULE_IDF )
                    {
                    // InternalMGPL.g:1461:5: (lv_attribute_9_0= RULE_IDF )
                    // InternalMGPL.g:1462:6: lv_attribute_9_0= RULE_IDF
                    {
                    lv_attribute_9_0=(Token)match(input,RULE_IDF,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_attribute_9_0, grammarAccess.getVarAccess().getAttributeIDFTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"attribute",
                      							lv_attribute_9_0,
                      							"de.tu_dortmund.MGPL.IDF");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleExpr"
    // InternalMGPL.g:1483:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalMGPL.g:1483:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalMGPL.g:1484:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalMGPL.g:1490:1: ruleExpr returns [EObject current=null] : this_OrExpr_0= ruleOrExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpr_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1496:2: (this_OrExpr_0= ruleOrExpr )
            // InternalMGPL.g:1497:2: this_OrExpr_0= ruleOrExpr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExprAccess().getOrExprParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrExpr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalMGPL.g:1508:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalMGPL.g:1508:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalMGPL.g:1509:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalMGPL.g:1515:1: ruleOrExpr returns [EObject current=null] : (this_BoolExpr_0= ruleBoolExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_BoolExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1521:2: ( (this_BoolExpr_0= ruleBoolExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )* ) )
            // InternalMGPL.g:1522:2: (this_BoolExpr_0= ruleBoolExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )* )
            {
            // InternalMGPL.g:1522:2: (this_BoolExpr_0= ruleBoolExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )* )
            // InternalMGPL.g:1523:3: this_BoolExpr_0= ruleBoolExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExprAccess().getBoolExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_BoolExpr_0=ruleBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BoolExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGPL.g:1531:3: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMGPL.g:1532:4: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleBoolExpr ) )
            	    {
            	    // InternalMGPL.g:1532:4: ()
            	    // InternalMGPL.g:1533:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGPL.g:1539:4: ( (lv_op_2_0= '||' ) )
            	    // InternalMGPL.g:1540:5: (lv_op_2_0= '||' )
            	    {
            	    // InternalMGPL.g:1540:5: (lv_op_2_0= '||' )
            	    // InternalMGPL.g:1541:6: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,29,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getOrExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOrExprRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      					
            	    }

            	    }


            	    }

            	    // InternalMGPL.g:1553:4: ( (lv_right_3_0= ruleBoolExpr ) )
            	    // InternalMGPL.g:1554:5: (lv_right_3_0= ruleBoolExpr )
            	    {
            	    // InternalMGPL.g:1554:5: (lv_right_3_0= ruleBoolExpr )
            	    // InternalMGPL.g:1555:6: lv_right_3_0= ruleBoolExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExprAccess().getRightBoolExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleBoolExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.tu_dortmund.MGPL.BoolExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleBoolExpr"
    // InternalMGPL.g:1577:1: entryRuleBoolExpr returns [EObject current=null] : iv_ruleBoolExpr= ruleBoolExpr EOF ;
    public final EObject entryRuleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpr = null;


        try {
            // InternalMGPL.g:1577:49: (iv_ruleBoolExpr= ruleBoolExpr EOF )
            // InternalMGPL.g:1578:2: iv_ruleBoolExpr= ruleBoolExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolExpr=ruleBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpr"


    // $ANTLR start "ruleBoolExpr"
    // InternalMGPL.g:1584:1: ruleBoolExpr returns [EObject current=null] : (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* ) ;
    public final EObject ruleBoolExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1590:2: ( (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* ) )
            // InternalMGPL.g:1591:2: (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* )
            {
            // InternalMGPL.g:1591:2: (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* )
            // InternalMGPL.g:1592:3: this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolExprAccess().getRelExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_RelExpr_0=ruleRelExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGPL.g:1600:3: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMGPL.g:1601:4: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) )
            	    {
            	    // InternalMGPL.g:1601:4: ()
            	    // InternalMGPL.g:1602:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBoolExprAccess().getBinaryExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGPL.g:1608:4: ( (lv_op_2_0= '&&' ) )
            	    // InternalMGPL.g:1609:5: (lv_op_2_0= '&&' )
            	    {
            	    // InternalMGPL.g:1609:5: (lv_op_2_0= '&&' )
            	    // InternalMGPL.g:1610:6: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,30,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getBoolExprAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getBoolExprRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	      					
            	    }

            	    }


            	    }

            	    // InternalMGPL.g:1622:4: ( (lv_right_3_0= ruleRelExpr ) )
            	    // InternalMGPL.g:1623:5: (lv_right_3_0= ruleRelExpr )
            	    {
            	    // InternalMGPL.g:1623:5: (lv_right_3_0= ruleRelExpr )
            	    // InternalMGPL.g:1624:6: lv_right_3_0= ruleRelExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolExprAccess().getRightRelExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleRelExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.tu_dortmund.MGPL.RelExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpr"


    // $ANTLR start "entryRuleRelExpr"
    // InternalMGPL.g:1646:1: entryRuleRelExpr returns [EObject current=null] : iv_ruleRelExpr= ruleRelExpr EOF ;
    public final EObject entryRuleRelExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelExpr = null;


        try {
            // InternalMGPL.g:1646:48: (iv_ruleRelExpr= ruleRelExpr EOF )
            // InternalMGPL.g:1647:2: iv_ruleRelExpr= ruleRelExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelExpr=ruleRelExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelExpr"


    // $ANTLR start "ruleRelExpr"
    // InternalMGPL.g:1653:1: ruleRelExpr returns [EObject current=null] : (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* ) ;
    public final EObject ruleRelExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_AddExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1659:2: ( (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* ) )
            // InternalMGPL.g:1660:2: (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* )
            {
            // InternalMGPL.g:1660:2: (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* )
            // InternalMGPL.g:1661:3: this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_AddExpr_0=ruleAddExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGPL.g:1669:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=33)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMGPL.g:1670:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) )
            	    {
            	    // InternalMGPL.g:1670:4: ()
            	    // InternalMGPL.g:1671:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getRelExprAccess().getBinaryExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGPL.g:1677:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) )
            	    // InternalMGPL.g:1678:5: ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) )
            	    {
            	    // InternalMGPL.g:1678:5: ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) )
            	    // InternalMGPL.g:1679:6: (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' )
            	    {
            	    // InternalMGPL.g:1679:6: (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalMGPL.g:1680:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getRelExprAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelExprRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1691:7: lv_op_2_2= '<'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getRelExprAccess().getOpLessThanSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelExprRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMGPL.g:1702:7: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getRelExprAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelExprRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMGPL.g:1715:4: ( (lv_right_3_0= ruleAddExpr ) )
            	    // InternalMGPL.g:1716:5: (lv_right_3_0= ruleAddExpr )
            	    {
            	    // InternalMGPL.g:1716:5: (lv_right_3_0= ruleAddExpr )
            	    // InternalMGPL.g:1717:6: lv_right_3_0= ruleAddExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelExprAccess().getRightAddExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleAddExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.tu_dortmund.MGPL.AddExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelExpr"


    // $ANTLR start "entryRuleAddExpr"
    // InternalMGPL.g:1739:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // InternalMGPL.g:1739:48: (iv_ruleAddExpr= ruleAddExpr EOF )
            // InternalMGPL.g:1740:2: iv_ruleAddExpr= ruleAddExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddExpr=ruleAddExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpr"


    // $ANTLR start "ruleAddExpr"
    // InternalMGPL.g:1746:1: ruleAddExpr returns [EObject current=null] : (this_MulExpr_0= ruleMulExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulExpr ) ) )* ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MulExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1752:2: ( (this_MulExpr_0= ruleMulExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulExpr ) ) )* ) )
            // InternalMGPL.g:1753:2: (this_MulExpr_0= ruleMulExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulExpr ) ) )* )
            {
            // InternalMGPL.g:1753:2: (this_MulExpr_0= ruleMulExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulExpr ) ) )* )
            // InternalMGPL.g:1754:3: this_MulExpr_0= ruleMulExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_MulExpr_0=ruleMulExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGPL.g:1762:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=34 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMGPL.g:1763:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulExpr ) )
            	    {
            	    // InternalMGPL.g:1763:4: ()
            	    // InternalMGPL.g:1764:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAddExprAccess().getBinaryExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGPL.g:1770:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalMGPL.g:1771:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalMGPL.g:1771:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalMGPL.g:1772:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalMGPL.g:1772:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==34) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==35) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalMGPL.g:1773:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getAddExprAccess().getOpPlusSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAddExprRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1784:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getAddExprAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAddExprRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMGPL.g:1797:4: ( (lv_right_3_0= ruleMulExpr ) )
            	    // InternalMGPL.g:1798:5: (lv_right_3_0= ruleMulExpr )
            	    {
            	    // InternalMGPL.g:1798:5: (lv_right_3_0= ruleMulExpr )
            	    // InternalMGPL.g:1799:6: lv_right_3_0= ruleMulExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAddExprAccess().getRightMulExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleMulExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAddExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.tu_dortmund.MGPL.MulExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpr"


    // $ANTLR start "entryRuleMulExpr"
    // InternalMGPL.g:1821:1: entryRuleMulExpr returns [EObject current=null] : iv_ruleMulExpr= ruleMulExpr EOF ;
    public final EObject entryRuleMulExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpr = null;


        try {
            // InternalMGPL.g:1821:48: (iv_ruleMulExpr= ruleMulExpr EOF )
            // InternalMGPL.g:1822:2: iv_ruleMulExpr= ruleMulExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulExpr=ruleMulExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulExpr"


    // $ANTLR start "ruleMulExpr"
    // InternalMGPL.g:1828:1: ruleMulExpr returns [EObject current=null] : (this_SimpleExpr_0= ruleSimpleExpr ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSimpleExpr ) ) )* ) ;
    public final EObject ruleMulExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_SimpleExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1834:2: ( (this_SimpleExpr_0= ruleSimpleExpr ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSimpleExpr ) ) )* ) )
            // InternalMGPL.g:1835:2: (this_SimpleExpr_0= ruleSimpleExpr ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSimpleExpr ) ) )* )
            {
            // InternalMGPL.g:1835:2: (this_SimpleExpr_0= ruleSimpleExpr ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSimpleExpr ) ) )* )
            // InternalMGPL.g:1836:3: this_SimpleExpr_0= ruleSimpleExpr ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSimpleExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulExprAccess().getSimpleExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_SimpleExpr_0=ruleSimpleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SimpleExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGPL.g:1844:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSimpleExpr ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=36 && LA22_0<=37)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMGPL.g:1845:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSimpleExpr ) )
            	    {
            	    // InternalMGPL.g:1845:4: ()
            	    // InternalMGPL.g:1846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulExprAccess().getBinaryExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGPL.g:1852:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalMGPL.g:1853:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalMGPL.g:1853:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalMGPL.g:1854:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalMGPL.g:1854:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==36) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==37) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMGPL.g:1855:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getMulExprAccess().getOpAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMulExprRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1866:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getMulExprAccess().getOpSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMulExprRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMGPL.g:1879:4: ( (lv_right_3_0= ruleSimpleExpr ) )
            	    // InternalMGPL.g:1880:5: (lv_right_3_0= ruleSimpleExpr )
            	    {
            	    // InternalMGPL.g:1880:5: (lv_right_3_0= ruleSimpleExpr )
            	    // InternalMGPL.g:1881:6: lv_right_3_0= ruleSimpleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulExprAccess().getRightSimpleExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleSimpleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.tu_dortmund.MGPL.SimpleExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulExpr"


    // $ANTLR start "entryRuleSimpleExpr"
    // InternalMGPL.g:1903:1: entryRuleSimpleExpr returns [EObject current=null] : iv_ruleSimpleExpr= ruleSimpleExpr EOF ;
    public final EObject entryRuleSimpleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpr = null;


        try {
            // InternalMGPL.g:1903:51: (iv_ruleSimpleExpr= ruleSimpleExpr EOF )
            // InternalMGPL.g:1904:2: iv_ruleSimpleExpr= ruleSimpleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleExpr=ruleSimpleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExpr"


    // $ANTLR start "ruleSimpleExpr"
    // InternalMGPL.g:1910:1: ruleSimpleExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr | this_NumberExpr_1= ruleNumberExpr | (this_VarExpr_2= ruleVarExpr ( () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) ) )? ) | (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' ) ) ;
    public final EObject ruleSimpleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_UnaryExpr_0 = null;

        EObject this_NumberExpr_1 = null;

        EObject this_VarExpr_2 = null;

        EObject lv_touchee_5_0 = null;

        EObject this_Expr_7 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1916:2: ( (this_UnaryExpr_0= ruleUnaryExpr | this_NumberExpr_1= ruleNumberExpr | (this_VarExpr_2= ruleVarExpr ( () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) ) )? ) | (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' ) ) )
            // InternalMGPL.g:1917:2: (this_UnaryExpr_0= ruleUnaryExpr | this_NumberExpr_1= ruleNumberExpr | (this_VarExpr_2= ruleVarExpr ( () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) ) )? ) | (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' ) )
            {
            // InternalMGPL.g:1917:2: (this_UnaryExpr_0= ruleUnaryExpr | this_NumberExpr_1= ruleNumberExpr | (this_VarExpr_2= ruleVarExpr ( () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) ) )? ) | (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 35:
            case 39:
                {
                alt24=1;
                }
                break;
            case RULE_INT:
                {
                alt24=2;
                }
                break;
            case RULE_IDF:
                {
                alt24=3;
                }
                break;
            case 13:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMGPL.g:1918:3: this_UnaryExpr_0= ruleUnaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleExprAccess().getUnaryExprParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpr_0=ruleUnaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryExpr_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1927:3: this_NumberExpr_1= ruleNumberExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleExprAccess().getNumberExprParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberExpr_1=ruleNumberExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberExpr_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMGPL.g:1936:3: (this_VarExpr_2= ruleVarExpr ( () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) ) )? )
                    {
                    // InternalMGPL.g:1936:3: (this_VarExpr_2= ruleVarExpr ( () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) ) )? )
                    // InternalMGPL.g:1937:4: this_VarExpr_2= ruleVarExpr ( () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleExprAccess().getVarExprParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_VarExpr_2=ruleVarExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_VarExpr_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMGPL.g:1945:4: ( () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==38) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMGPL.g:1946:5: () otherlv_4= 'touches' ( (lv_touchee_5_0= ruleVarExpr ) )
                            {
                            // InternalMGPL.g:1946:5: ()
                            // InternalMGPL.g:1947:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndSet(
                              							grammarAccess.getSimpleExprAccess().getTouchExprToucherAction_2_1_0(),
                              							current);
                              					
                            }

                            }

                            otherlv_4=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSimpleExprAccess().getTouchesKeyword_2_1_1());
                              				
                            }
                            // InternalMGPL.g:1957:5: ( (lv_touchee_5_0= ruleVarExpr ) )
                            // InternalMGPL.g:1958:6: (lv_touchee_5_0= ruleVarExpr )
                            {
                            // InternalMGPL.g:1958:6: (lv_touchee_5_0= ruleVarExpr )
                            // InternalMGPL.g:1959:7: lv_touchee_5_0= ruleVarExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleExprAccess().getToucheeVarExprParserRuleCall_2_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_touchee_5_0=ruleVarExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleExprRule());
                              							}
                              							set(
                              								current,
                              								"touchee",
                              								lv_touchee_5_0,
                              								"de.tu_dortmund.MGPL.VarExpr");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMGPL.g:1979:3: (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' )
                    {
                    // InternalMGPL.g:1979:3: (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' )
                    // InternalMGPL.g:1980:4: otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSimpleExprAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleExprAccess().getExprParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_Expr_7=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expr_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSimpleExprAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalMGPL.g:2001:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalMGPL.g:2001:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalMGPL.g:2002:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalMGPL.g:2008:1: ruleUnaryExpr returns [EObject current=null] : ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' ) ) ) ( (lv_operand_1_0= ruleSimpleExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        EObject lv_operand_1_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:2014:2: ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' ) ) ) ( (lv_operand_1_0= ruleSimpleExpr ) ) ) )
            // InternalMGPL.g:2015:2: ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' ) ) ) ( (lv_operand_1_0= ruleSimpleExpr ) ) )
            {
            // InternalMGPL.g:2015:2: ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' ) ) ) ( (lv_operand_1_0= ruleSimpleExpr ) ) )
            // InternalMGPL.g:2016:3: ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' ) ) ) ( (lv_operand_1_0= ruleSimpleExpr ) )
            {
            // InternalMGPL.g:2016:3: ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' ) ) )
            // InternalMGPL.g:2017:4: ( (lv_op_0_1= '-' | lv_op_0_2= '!' ) )
            {
            // InternalMGPL.g:2017:4: ( (lv_op_0_1= '-' | lv_op_0_2= '!' ) )
            // InternalMGPL.g:2018:5: (lv_op_0_1= '-' | lv_op_0_2= '!' )
            {
            // InternalMGPL.g:2018:5: (lv_op_0_1= '-' | lv_op_0_2= '!' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            else if ( (LA25_0==39) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMGPL.g:2019:6: lv_op_0_1= '-'
                    {
                    lv_op_0_1=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_1, grammarAccess.getUnaryExprAccess().getOpHyphenMinusKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExprRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:2030:6: lv_op_0_2= '!'
                    {
                    lv_op_0_2=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_2, grammarAccess.getUnaryExprAccess().getOpExclamationMarkKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExprRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalMGPL.g:2043:3: ( (lv_operand_1_0= ruleSimpleExpr ) )
            // InternalMGPL.g:2044:4: (lv_operand_1_0= ruleSimpleExpr )
            {
            // InternalMGPL.g:2044:4: (lv_operand_1_0= ruleSimpleExpr )
            // InternalMGPL.g:2045:5: lv_operand_1_0= ruleSimpleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExprAccess().getOperandSimpleExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_operand_1_0=ruleSimpleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryExprRule());
              					}
              					set(
              						current,
              						"operand",
              						lv_operand_1_0,
              						"de.tu_dortmund.MGPL.SimpleExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleNumberExpr"
    // InternalMGPL.g:2066:1: entryRuleNumberExpr returns [EObject current=null] : iv_ruleNumberExpr= ruleNumberExpr EOF ;
    public final EObject entryRuleNumberExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpr = null;


        try {
            // InternalMGPL.g:2066:51: (iv_ruleNumberExpr= ruleNumberExpr EOF )
            // InternalMGPL.g:2067:2: iv_ruleNumberExpr= ruleNumberExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberExpr=ruleNumberExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberExpr"


    // $ANTLR start "ruleNumberExpr"
    // InternalMGPL.g:2073:1: ruleNumberExpr returns [EObject current=null] : ( (lv_number_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberExpr() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;


        	enterRule();

        try {
            // InternalMGPL.g:2079:2: ( ( (lv_number_0_0= RULE_INT ) ) )
            // InternalMGPL.g:2080:2: ( (lv_number_0_0= RULE_INT ) )
            {
            // InternalMGPL.g:2080:2: ( (lv_number_0_0= RULE_INT ) )
            // InternalMGPL.g:2081:3: (lv_number_0_0= RULE_INT )
            {
            // InternalMGPL.g:2081:3: (lv_number_0_0= RULE_INT )
            // InternalMGPL.g:2082:4: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_number_0_0, grammarAccess.getNumberExprAccess().getNumberINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNumberExprRule());
              				}
              				setWithLastConsumed(
              					current,
              					"number",
              					lv_number_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberExpr"


    // $ANTLR start "entryRuleVarExpr"
    // InternalMGPL.g:2101:1: entryRuleVarExpr returns [EObject current=null] : iv_ruleVarExpr= ruleVarExpr EOF ;
    public final EObject entryRuleVarExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpr = null;


        try {
            // InternalMGPL.g:2101:48: (iv_ruleVarExpr= ruleVarExpr EOF )
            // InternalMGPL.g:2102:2: iv_ruleVarExpr= ruleVarExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarExpr=ruleVarExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarExpr"


    // $ANTLR start "ruleVarExpr"
    // InternalMGPL.g:2108:1: ruleVarExpr returns [EObject current=null] : ( (lv_var_0_0= ruleVar ) ) ;
    public final EObject ruleVarExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:2114:2: ( ( (lv_var_0_0= ruleVar ) ) )
            // InternalMGPL.g:2115:2: ( (lv_var_0_0= ruleVar ) )
            {
            // InternalMGPL.g:2115:2: ( (lv_var_0_0= ruleVar ) )
            // InternalMGPL.g:2116:3: (lv_var_0_0= ruleVar )
            {
            // InternalMGPL.g:2116:3: (lv_var_0_0= ruleVar )
            // InternalMGPL.g:2117:4: lv_var_0_0= ruleVar
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getVarExprAccess().getVarVarParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_var_0_0=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getVarExprRule());
              				}
              				set(
              					current,
              					"var",
              					lv_var_0_0,
              					"de.tu_dortmund.MGPL.Var");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarExpr"


    // $ANTLR start "ruleObjType"
    // InternalMGPL.g:2137:1: ruleObjType returns [Enumerator current=null] : ( (enumLiteral_0= 'rectangle' ) | (enumLiteral_1= 'triangle' ) | (enumLiteral_2= 'circle' ) ) ;
    public final Enumerator ruleObjType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMGPL.g:2143:2: ( ( (enumLiteral_0= 'rectangle' ) | (enumLiteral_1= 'triangle' ) | (enumLiteral_2= 'circle' ) ) )
            // InternalMGPL.g:2144:2: ( (enumLiteral_0= 'rectangle' ) | (enumLiteral_1= 'triangle' ) | (enumLiteral_2= 'circle' ) )
            {
            // InternalMGPL.g:2144:2: ( (enumLiteral_0= 'rectangle' ) | (enumLiteral_1= 'triangle' ) | (enumLiteral_2= 'circle' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt26=1;
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            case 42:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMGPL.g:2145:3: (enumLiteral_0= 'rectangle' )
                    {
                    // InternalMGPL.g:2145:3: (enumLiteral_0= 'rectangle' )
                    // InternalMGPL.g:2146:4: enumLiteral_0= 'rectangle'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getObjTypeAccess().getRECTANGLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getObjTypeAccess().getRECTANGLEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:2153:3: (enumLiteral_1= 'triangle' )
                    {
                    // InternalMGPL.g:2153:3: (enumLiteral_1= 'triangle' )
                    // InternalMGPL.g:2154:4: enumLiteral_1= 'triangle'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getObjTypeAccess().getTRIANGLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getObjTypeAccess().getTRIANGLEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:2161:3: (enumLiteral_2= 'circle' )
                    {
                    // InternalMGPL.g:2161:3: (enumLiteral_2= 'circle' )
                    // InternalMGPL.g:2162:4: enumLiteral_2= 'circle'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getObjTypeAccess().getCIRCLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getObjTypeAccess().getCIRCLEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjType"


    // $ANTLR start "ruleKeyStroke"
    // InternalMGPL.g:2172:1: ruleKeyStroke returns [Enumerator current=null] : ( (enumLiteral_0= 'space' ) | (enumLiteral_1= 'leftarrow' ) | (enumLiteral_2= 'rightarrow' ) | (enumLiteral_3= 'uparrow' ) | (enumLiteral_4= 'downarrow' ) ) ;
    public final Enumerator ruleKeyStroke() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMGPL.g:2178:2: ( ( (enumLiteral_0= 'space' ) | (enumLiteral_1= 'leftarrow' ) | (enumLiteral_2= 'rightarrow' ) | (enumLiteral_3= 'uparrow' ) | (enumLiteral_4= 'downarrow' ) ) )
            // InternalMGPL.g:2179:2: ( (enumLiteral_0= 'space' ) | (enumLiteral_1= 'leftarrow' ) | (enumLiteral_2= 'rightarrow' ) | (enumLiteral_3= 'uparrow' ) | (enumLiteral_4= 'downarrow' ) )
            {
            // InternalMGPL.g:2179:2: ( (enumLiteral_0= 'space' ) | (enumLiteral_1= 'leftarrow' ) | (enumLiteral_2= 'rightarrow' ) | (enumLiteral_3= 'uparrow' ) | (enumLiteral_4= 'downarrow' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt27=1;
                }
                break;
            case 44:
                {
                alt27=2;
                }
                break;
            case 45:
                {
                alt27=3;
                }
                break;
            case 46:
                {
                alt27=4;
                }
                break;
            case 47:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMGPL.g:2180:3: (enumLiteral_0= 'space' )
                    {
                    // InternalMGPL.g:2180:3: (enumLiteral_0= 'space' )
                    // InternalMGPL.g:2181:4: enumLiteral_0= 'space'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getKeyStrokeAccess().getSPACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getKeyStrokeAccess().getSPACEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:2188:3: (enumLiteral_1= 'leftarrow' )
                    {
                    // InternalMGPL.g:2188:3: (enumLiteral_1= 'leftarrow' )
                    // InternalMGPL.g:2189:4: enumLiteral_1= 'leftarrow'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getKeyStrokeAccess().getLEFT_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getKeyStrokeAccess().getLEFT_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:2196:3: (enumLiteral_2= 'rightarrow' )
                    {
                    // InternalMGPL.g:2196:3: (enumLiteral_2= 'rightarrow' )
                    // InternalMGPL.g:2197:4: enumLiteral_2= 'rightarrow'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getKeyStrokeAccess().getRIGHT_ARROWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getKeyStrokeAccess().getRIGHT_ARROWEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGPL.g:2204:3: (enumLiteral_3= 'uparrow' )
                    {
                    // InternalMGPL.g:2204:3: (enumLiteral_3= 'uparrow' )
                    // InternalMGPL.g:2205:4: enumLiteral_3= 'uparrow'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getKeyStrokeAccess().getUP_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getKeyStrokeAccess().getUP_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGPL.g:2212:3: (enumLiteral_4= 'downarrow' )
                    {
                    // InternalMGPL.g:2212:3: (enumLiteral_4= 'downarrow' )
                    // InternalMGPL.g:2213:4: enumLiteral_4= 'downarrow'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getKeyStrokeAccess().getDOWN_ARROWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getKeyStrokeAccess().getDOWN_ARROWEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyStroke"

    // $ANTLR start synpred1_InternalMGPL
    public final void synpred1_InternalMGPL_fragment() throws RecognitionException {   
        // InternalMGPL.g:1103:5: ( 'else' )
        // InternalMGPL.g:1103:6: 'else'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMGPL

    // Delegated rules

    public final boolean synpred1_InternalMGPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMGPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000070000810000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008800002030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000B000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000A000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000002L});

}