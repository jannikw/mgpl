package de.tu_dortmund.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.tu_dortmund.services.MGPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMGPLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDF", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'rectangle'", "'triangle'", "'circle'", "'space'", "'leftarrow'", "'rightarrow'", "'uparrow'", "'downarrow'", "'game'", "'('", "')'", "';'", "'int'", "'='", "'['", "']'", "','", "'animation'", "'on'", "'{'", "'}'", "'if'", "'else'", "'for'", "'.'", "'touches'", "'||'", "'&&'"
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

    	public void setGrammarAccess(MGPLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMGPL.g:54:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMGPL.g:55:1: ( ruleProgram EOF )
            // InternalMGPL.g:56:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMGPL.g:63:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:67:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMGPL.g:68:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMGPL.g:68:2: ( ( rule__Program__Group__0 ) )
            // InternalMGPL.g:69:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalMGPL.g:70:3: ( rule__Program__Group__0 )
            // InternalMGPL.g:70:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDecl"
    // InternalMGPL.g:79:1: entryRuleDecl : ruleDecl EOF ;
    public final void entryRuleDecl() throws RecognitionException {
        try {
            // InternalMGPL.g:80:1: ( ruleDecl EOF )
            // InternalMGPL.g:81:1: ruleDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalMGPL.g:88:1: ruleDecl : ( ( rule__Decl__Group__0 ) ) ;
    public final void ruleDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:92:2: ( ( ( rule__Decl__Group__0 ) ) )
            // InternalMGPL.g:93:2: ( ( rule__Decl__Group__0 ) )
            {
            // InternalMGPL.g:93:2: ( ( rule__Decl__Group__0 ) )
            // InternalMGPL.g:94:3: ( rule__Decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclAccess().getGroup()); 
            }
            // InternalMGPL.g:95:3: ( rule__Decl__Group__0 )
            // InternalMGPL.g:95:4: rule__Decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalMGPL.g:104:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // InternalMGPL.g:105:1: ( ruleVarDecl EOF )
            // InternalMGPL.g:106:1: ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalMGPL.g:113:1: ruleVarDecl : ( ( rule__VarDecl__Alternatives ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:117:2: ( ( ( rule__VarDecl__Alternatives ) ) )
            // InternalMGPL.g:118:2: ( ( rule__VarDecl__Alternatives ) )
            {
            // InternalMGPL.g:118:2: ( ( rule__VarDecl__Alternatives ) )
            // InternalMGPL.g:119:3: ( rule__VarDecl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getAlternatives()); 
            }
            // InternalMGPL.g:120:3: ( rule__VarDecl__Alternatives )
            // InternalMGPL.g:120:4: rule__VarDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleScalarVarDecl"
    // InternalMGPL.g:129:1: entryRuleScalarVarDecl : ruleScalarVarDecl EOF ;
    public final void entryRuleScalarVarDecl() throws RecognitionException {
        try {
            // InternalMGPL.g:130:1: ( ruleScalarVarDecl EOF )
            // InternalMGPL.g:131:1: ruleScalarVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleScalarVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScalarVarDecl"


    // $ANTLR start "ruleScalarVarDecl"
    // InternalMGPL.g:138:1: ruleScalarVarDecl : ( ( rule__ScalarVarDecl__Group__0 ) ) ;
    public final void ruleScalarVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:142:2: ( ( ( rule__ScalarVarDecl__Group__0 ) ) )
            // InternalMGPL.g:143:2: ( ( rule__ScalarVarDecl__Group__0 ) )
            {
            // InternalMGPL.g:143:2: ( ( rule__ScalarVarDecl__Group__0 ) )
            // InternalMGPL.g:144:3: ( rule__ScalarVarDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclAccess().getGroup()); 
            }
            // InternalMGPL.g:145:3: ( rule__ScalarVarDecl__Group__0 )
            // InternalMGPL.g:145:4: rule__ScalarVarDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScalarVarDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScalarVarDecl"


    // $ANTLR start "entryRuleArrayVarDecl"
    // InternalMGPL.g:154:1: entryRuleArrayVarDecl : ruleArrayVarDecl EOF ;
    public final void entryRuleArrayVarDecl() throws RecognitionException {
        try {
            // InternalMGPL.g:155:1: ( ruleArrayVarDecl EOF )
            // InternalMGPL.g:156:1: ruleArrayVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayVarDecl"


    // $ANTLR start "ruleArrayVarDecl"
    // InternalMGPL.g:163:1: ruleArrayVarDecl : ( ( rule__ArrayVarDecl__Group__0 ) ) ;
    public final void ruleArrayVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:167:2: ( ( ( rule__ArrayVarDecl__Group__0 ) ) )
            // InternalMGPL.g:168:2: ( ( rule__ArrayVarDecl__Group__0 ) )
            {
            // InternalMGPL.g:168:2: ( ( rule__ArrayVarDecl__Group__0 ) )
            // InternalMGPL.g:169:3: ( rule__ArrayVarDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclAccess().getGroup()); 
            }
            // InternalMGPL.g:170:3: ( rule__ArrayVarDecl__Group__0 )
            // InternalMGPL.g:170:4: rule__ArrayVarDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayVarDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayVarDecl"


    // $ANTLR start "entryRuleObjDecl"
    // InternalMGPL.g:179:1: entryRuleObjDecl : ruleObjDecl EOF ;
    public final void entryRuleObjDecl() throws RecognitionException {
        try {
            // InternalMGPL.g:180:1: ( ruleObjDecl EOF )
            // InternalMGPL.g:181:1: ruleObjDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObjDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjDecl"


    // $ANTLR start "ruleObjDecl"
    // InternalMGPL.g:188:1: ruleObjDecl : ( ( rule__ObjDecl__Group__0 ) ) ;
    public final void ruleObjDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:192:2: ( ( ( rule__ObjDecl__Group__0 ) ) )
            // InternalMGPL.g:193:2: ( ( rule__ObjDecl__Group__0 ) )
            {
            // InternalMGPL.g:193:2: ( ( rule__ObjDecl__Group__0 ) )
            // InternalMGPL.g:194:3: ( rule__ObjDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getGroup()); 
            }
            // InternalMGPL.g:195:3: ( rule__ObjDecl__Group__0 )
            // InternalMGPL.g:195:4: rule__ObjDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjDecl"


    // $ANTLR start "entryRuleObjArrayDecl"
    // InternalMGPL.g:204:1: entryRuleObjArrayDecl : ruleObjArrayDecl EOF ;
    public final void entryRuleObjArrayDecl() throws RecognitionException {
        try {
            // InternalMGPL.g:205:1: ( ruleObjArrayDecl EOF )
            // InternalMGPL.g:206:1: ruleObjArrayDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObjArrayDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjArrayDecl"


    // $ANTLR start "ruleObjArrayDecl"
    // InternalMGPL.g:213:1: ruleObjArrayDecl : ( ( rule__ObjArrayDecl__Group__0 ) ) ;
    public final void ruleObjArrayDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:217:2: ( ( ( rule__ObjArrayDecl__Group__0 ) ) )
            // InternalMGPL.g:218:2: ( ( rule__ObjArrayDecl__Group__0 ) )
            {
            // InternalMGPL.g:218:2: ( ( rule__ObjArrayDecl__Group__0 ) )
            // InternalMGPL.g:219:3: ( rule__ObjArrayDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getGroup()); 
            }
            // InternalMGPL.g:220:3: ( rule__ObjArrayDecl__Group__0 )
            // InternalMGPL.g:220:4: rule__ObjArrayDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjArrayDecl"


    // $ANTLR start "entryRuleAttrAssList"
    // InternalMGPL.g:229:1: entryRuleAttrAssList : ruleAttrAssList EOF ;
    public final void entryRuleAttrAssList() throws RecognitionException {
        try {
            // InternalMGPL.g:230:1: ( ruleAttrAssList EOF )
            // InternalMGPL.g:231:1: ruleAttrAssList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttrAssList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttrAssList"


    // $ANTLR start "ruleAttrAssList"
    // InternalMGPL.g:238:1: ruleAttrAssList : ( ( rule__AttrAssList__Group__0 ) ) ;
    public final void ruleAttrAssList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:242:2: ( ( ( rule__AttrAssList__Group__0 ) ) )
            // InternalMGPL.g:243:2: ( ( rule__AttrAssList__Group__0 ) )
            {
            // InternalMGPL.g:243:2: ( ( rule__AttrAssList__Group__0 ) )
            // InternalMGPL.g:244:3: ( rule__AttrAssList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssListAccess().getGroup()); 
            }
            // InternalMGPL.g:245:3: ( rule__AttrAssList__Group__0 )
            // InternalMGPL.g:245:4: rule__AttrAssList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrAssList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttrAssList"


    // $ANTLR start "entryRuleAttrAss"
    // InternalMGPL.g:254:1: entryRuleAttrAss : ruleAttrAss EOF ;
    public final void entryRuleAttrAss() throws RecognitionException {
        try {
            // InternalMGPL.g:255:1: ( ruleAttrAss EOF )
            // InternalMGPL.g:256:1: ruleAttrAss EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttrAss();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttrAss"


    // $ANTLR start "ruleAttrAss"
    // InternalMGPL.g:263:1: ruleAttrAss : ( ( rule__AttrAss__Group__0 ) ) ;
    public final void ruleAttrAss() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:267:2: ( ( ( rule__AttrAss__Group__0 ) ) )
            // InternalMGPL.g:268:2: ( ( rule__AttrAss__Group__0 ) )
            {
            // InternalMGPL.g:268:2: ( ( rule__AttrAss__Group__0 ) )
            // InternalMGPL.g:269:3: ( rule__AttrAss__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssAccess().getGroup()); 
            }
            // InternalMGPL.g:270:3: ( rule__AttrAss__Group__0 )
            // InternalMGPL.g:270:4: rule__AttrAss__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrAss__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttrAss"


    // $ANTLR start "entryRuleBlock"
    // InternalMGPL.g:279:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMGPL.g:280:1: ( ruleBlock EOF )
            // InternalMGPL.g:281:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMGPL.g:288:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:292:2: ( ( ( rule__Block__Alternatives ) ) )
            // InternalMGPL.g:293:2: ( ( rule__Block__Alternatives ) )
            {
            // InternalMGPL.g:293:2: ( ( rule__Block__Alternatives ) )
            // InternalMGPL.g:294:3: ( rule__Block__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives()); 
            }
            // InternalMGPL.g:295:3: ( rule__Block__Alternatives )
            // InternalMGPL.g:295:4: rule__Block__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Block__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAnimBlock"
    // InternalMGPL.g:304:1: entryRuleAnimBlock : ruleAnimBlock EOF ;
    public final void entryRuleAnimBlock() throws RecognitionException {
        try {
            // InternalMGPL.g:305:1: ( ruleAnimBlock EOF )
            // InternalMGPL.g:306:1: ruleAnimBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnimBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimBlock"


    // $ANTLR start "ruleAnimBlock"
    // InternalMGPL.g:313:1: ruleAnimBlock : ( ( rule__AnimBlock__Group__0 ) ) ;
    public final void ruleAnimBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:317:2: ( ( ( rule__AnimBlock__Group__0 ) ) )
            // InternalMGPL.g:318:2: ( ( rule__AnimBlock__Group__0 ) )
            {
            // InternalMGPL.g:318:2: ( ( rule__AnimBlock__Group__0 ) )
            // InternalMGPL.g:319:3: ( rule__AnimBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getGroup()); 
            }
            // InternalMGPL.g:320:3: ( rule__AnimBlock__Group__0 )
            // InternalMGPL.g:320:4: rule__AnimBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnimBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimBlock"


    // $ANTLR start "entryRuleAnimTarget"
    // InternalMGPL.g:329:1: entryRuleAnimTarget : ruleAnimTarget EOF ;
    public final void entryRuleAnimTarget() throws RecognitionException {
        try {
            // InternalMGPL.g:330:1: ( ruleAnimTarget EOF )
            // InternalMGPL.g:331:1: ruleAnimTarget EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimTargetRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnimTarget();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimTargetRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimTarget"


    // $ANTLR start "ruleAnimTarget"
    // InternalMGPL.g:338:1: ruleAnimTarget : ( ( rule__AnimTarget__Group__0 ) ) ;
    public final void ruleAnimTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:342:2: ( ( ( rule__AnimTarget__Group__0 ) ) )
            // InternalMGPL.g:343:2: ( ( rule__AnimTarget__Group__0 ) )
            {
            // InternalMGPL.g:343:2: ( ( rule__AnimTarget__Group__0 ) )
            // InternalMGPL.g:344:3: ( rule__AnimTarget__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimTargetAccess().getGroup()); 
            }
            // InternalMGPL.g:345:3: ( rule__AnimTarget__Group__0 )
            // InternalMGPL.g:345:4: rule__AnimTarget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnimTarget__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimTargetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimTarget"


    // $ANTLR start "entryRuleEventBlock"
    // InternalMGPL.g:354:1: entryRuleEventBlock : ruleEventBlock EOF ;
    public final void entryRuleEventBlock() throws RecognitionException {
        try {
            // InternalMGPL.g:355:1: ( ruleEventBlock EOF )
            // InternalMGPL.g:356:1: ruleEventBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventBlock"


    // $ANTLR start "ruleEventBlock"
    // InternalMGPL.g:363:1: ruleEventBlock : ( ( rule__EventBlock__Group__0 ) ) ;
    public final void ruleEventBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:367:2: ( ( ( rule__EventBlock__Group__0 ) ) )
            // InternalMGPL.g:368:2: ( ( rule__EventBlock__Group__0 ) )
            {
            // InternalMGPL.g:368:2: ( ( rule__EventBlock__Group__0 ) )
            // InternalMGPL.g:369:3: ( rule__EventBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventBlockAccess().getGroup()); 
            }
            // InternalMGPL.g:370:3: ( rule__EventBlock__Group__0 )
            // InternalMGPL.g:370:4: rule__EventBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventBlock"


    // $ANTLR start "entryRuleStmtBlock"
    // InternalMGPL.g:379:1: entryRuleStmtBlock : ruleStmtBlock EOF ;
    public final void entryRuleStmtBlock() throws RecognitionException {
        try {
            // InternalMGPL.g:380:1: ( ruleStmtBlock EOF )
            // InternalMGPL.g:381:1: ruleStmtBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStmtBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStmtBlock"


    // $ANTLR start "ruleStmtBlock"
    // InternalMGPL.g:388:1: ruleStmtBlock : ( ( rule__StmtBlock__Group__0 ) ) ;
    public final void ruleStmtBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:392:2: ( ( ( rule__StmtBlock__Group__0 ) ) )
            // InternalMGPL.g:393:2: ( ( rule__StmtBlock__Group__0 ) )
            {
            // InternalMGPL.g:393:2: ( ( rule__StmtBlock__Group__0 ) )
            // InternalMGPL.g:394:3: ( rule__StmtBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtBlockAccess().getGroup()); 
            }
            // InternalMGPL.g:395:3: ( rule__StmtBlock__Group__0 )
            // InternalMGPL.g:395:4: rule__StmtBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StmtBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStmtBlock"


    // $ANTLR start "entryRuleStmt"
    // InternalMGPL.g:404:1: entryRuleStmt : ruleStmt EOF ;
    public final void entryRuleStmt() throws RecognitionException {
        try {
            // InternalMGPL.g:405:1: ( ruleStmt EOF )
            // InternalMGPL.g:406:1: ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMGPL.g:413:1: ruleStmt : ( ( rule__Stmt__Alternatives ) ) ;
    public final void ruleStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:417:2: ( ( ( rule__Stmt__Alternatives ) ) )
            // InternalMGPL.g:418:2: ( ( rule__Stmt__Alternatives ) )
            {
            // InternalMGPL.g:418:2: ( ( rule__Stmt__Alternatives ) )
            // InternalMGPL.g:419:3: ( rule__Stmt__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getAlternatives()); 
            }
            // InternalMGPL.g:420:3: ( rule__Stmt__Alternatives )
            // InternalMGPL.g:420:4: rule__Stmt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleIfStmt"
    // InternalMGPL.g:429:1: entryRuleIfStmt : ruleIfStmt EOF ;
    public final void entryRuleIfStmt() throws RecognitionException {
        try {
            // InternalMGPL.g:430:1: ( ruleIfStmt EOF )
            // InternalMGPL.g:431:1: ruleIfStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalMGPL.g:438:1: ruleIfStmt : ( ( rule__IfStmt__Group__0 ) ) ;
    public final void ruleIfStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:442:2: ( ( ( rule__IfStmt__Group__0 ) ) )
            // InternalMGPL.g:443:2: ( ( rule__IfStmt__Group__0 ) )
            {
            // InternalMGPL.g:443:2: ( ( rule__IfStmt__Group__0 ) )
            // InternalMGPL.g:444:3: ( rule__IfStmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getGroup()); 
            }
            // InternalMGPL.g:445:3: ( rule__IfStmt__Group__0 )
            // InternalMGPL.g:445:4: rule__IfStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleForStmt"
    // InternalMGPL.g:454:1: entryRuleForStmt : ruleForStmt EOF ;
    public final void entryRuleForStmt() throws RecognitionException {
        try {
            // InternalMGPL.g:455:1: ( ruleForStmt EOF )
            // InternalMGPL.g:456:1: ruleForStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // InternalMGPL.g:463:1: ruleForStmt : ( ( rule__ForStmt__Group__0 ) ) ;
    public final void ruleForStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:467:2: ( ( ( rule__ForStmt__Group__0 ) ) )
            // InternalMGPL.g:468:2: ( ( rule__ForStmt__Group__0 ) )
            {
            // InternalMGPL.g:468:2: ( ( rule__ForStmt__Group__0 ) )
            // InternalMGPL.g:469:3: ( rule__ForStmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getGroup()); 
            }
            // InternalMGPL.g:470:3: ( rule__ForStmt__Group__0 )
            // InternalMGPL.g:470:4: rule__ForStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleAssignment"
    // InternalMGPL.g:479:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMGPL.g:480:1: ( ruleAssignment EOF )
            // InternalMGPL.g:481:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMGPL.g:488:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:492:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMGPL.g:493:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMGPL.g:493:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMGPL.g:494:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalMGPL.g:495:3: ( rule__Assignment__Group__0 )
            // InternalMGPL.g:495:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssStmt"
    // InternalMGPL.g:504:1: entryRuleAssStmt : ruleAssStmt EOF ;
    public final void entryRuleAssStmt() throws RecognitionException {
        try {
            // InternalMGPL.g:505:1: ( ruleAssStmt EOF )
            // InternalMGPL.g:506:1: ruleAssStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssStmt"


    // $ANTLR start "ruleAssStmt"
    // InternalMGPL.g:513:1: ruleAssStmt : ( ( rule__AssStmt__Group__0 ) ) ;
    public final void ruleAssStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:517:2: ( ( ( rule__AssStmt__Group__0 ) ) )
            // InternalMGPL.g:518:2: ( ( rule__AssStmt__Group__0 ) )
            {
            // InternalMGPL.g:518:2: ( ( rule__AssStmt__Group__0 ) )
            // InternalMGPL.g:519:3: ( rule__AssStmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssStmtAccess().getGroup()); 
            }
            // InternalMGPL.g:520:3: ( rule__AssStmt__Group__0 )
            // InternalMGPL.g:520:4: rule__AssStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssStmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssStmt"


    // $ANTLR start "entryRuleVar"
    // InternalMGPL.g:529:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalMGPL.g:530:1: ( ruleVar EOF )
            // InternalMGPL.g:531:1: ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMGPL.g:538:1: ruleVar : ( ( rule__Var__Alternatives ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:542:2: ( ( ( rule__Var__Alternatives ) ) )
            // InternalMGPL.g:543:2: ( ( rule__Var__Alternatives ) )
            {
            // InternalMGPL.g:543:2: ( ( rule__Var__Alternatives ) )
            // InternalMGPL.g:544:3: ( rule__Var__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAlternatives()); 
            }
            // InternalMGPL.g:545:3: ( rule__Var__Alternatives )
            // InternalMGPL.g:545:4: rule__Var__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Var__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleExpr"
    // InternalMGPL.g:554:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:555:1: ( ruleExpr EOF )
            // InternalMGPL.g:556:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalMGPL.g:563:1: ruleExpr : ( ruleOrExpr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:567:2: ( ( ruleOrExpr ) )
            // InternalMGPL.g:568:2: ( ruleOrExpr )
            {
            // InternalMGPL.g:568:2: ( ruleOrExpr )
            // InternalMGPL.g:569:3: ruleOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getOrExprParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getOrExprParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalMGPL.g:579:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:580:1: ( ruleOrExpr EOF )
            // InternalMGPL.g:581:1: ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalMGPL.g:588:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:592:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // InternalMGPL.g:593:2: ( ( rule__OrExpr__Group__0 ) )
            {
            // InternalMGPL.g:593:2: ( ( rule__OrExpr__Group__0 ) )
            // InternalMGPL.g:594:3: ( rule__OrExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup()); 
            }
            // InternalMGPL.g:595:3: ( rule__OrExpr__Group__0 )
            // InternalMGPL.g:595:4: rule__OrExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleBoolExpr"
    // InternalMGPL.g:604:1: entryRuleBoolExpr : ruleBoolExpr EOF ;
    public final void entryRuleBoolExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:605:1: ( ruleBoolExpr EOF )
            // InternalMGPL.g:606:1: ruleBoolExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolExpr"


    // $ANTLR start "ruleBoolExpr"
    // InternalMGPL.g:613:1: ruleBoolExpr : ( ( rule__BoolExpr__Group__0 ) ) ;
    public final void ruleBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:617:2: ( ( ( rule__BoolExpr__Group__0 ) ) )
            // InternalMGPL.g:618:2: ( ( rule__BoolExpr__Group__0 ) )
            {
            // InternalMGPL.g:618:2: ( ( rule__BoolExpr__Group__0 ) )
            // InternalMGPL.g:619:3: ( rule__BoolExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getGroup()); 
            }
            // InternalMGPL.g:620:3: ( rule__BoolExpr__Group__0 )
            // InternalMGPL.g:620:4: rule__BoolExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolExpr"


    // $ANTLR start "entryRuleRelExpr"
    // InternalMGPL.g:629:1: entryRuleRelExpr : ruleRelExpr EOF ;
    public final void entryRuleRelExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:630:1: ( ruleRelExpr EOF )
            // InternalMGPL.g:631:1: ruleRelExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelExpr"


    // $ANTLR start "ruleRelExpr"
    // InternalMGPL.g:638:1: ruleRelExpr : ( ( rule__RelExpr__Group__0 ) ) ;
    public final void ruleRelExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:642:2: ( ( ( rule__RelExpr__Group__0 ) ) )
            // InternalMGPL.g:643:2: ( ( rule__RelExpr__Group__0 ) )
            {
            // InternalMGPL.g:643:2: ( ( rule__RelExpr__Group__0 ) )
            // InternalMGPL.g:644:3: ( rule__RelExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getGroup()); 
            }
            // InternalMGPL.g:645:3: ( rule__RelExpr__Group__0 )
            // InternalMGPL.g:645:4: rule__RelExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelExpr"


    // $ANTLR start "entryRuleAddExpr"
    // InternalMGPL.g:654:1: entryRuleAddExpr : ruleAddExpr EOF ;
    public final void entryRuleAddExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:655:1: ( ruleAddExpr EOF )
            // InternalMGPL.g:656:1: ruleAddExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddExpr"


    // $ANTLR start "ruleAddExpr"
    // InternalMGPL.g:663:1: ruleAddExpr : ( ( rule__AddExpr__Group__0 ) ) ;
    public final void ruleAddExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:667:2: ( ( ( rule__AddExpr__Group__0 ) ) )
            // InternalMGPL.g:668:2: ( ( rule__AddExpr__Group__0 ) )
            {
            // InternalMGPL.g:668:2: ( ( rule__AddExpr__Group__0 ) )
            // InternalMGPL.g:669:3: ( rule__AddExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getGroup()); 
            }
            // InternalMGPL.g:670:3: ( rule__AddExpr__Group__0 )
            // InternalMGPL.g:670:4: rule__AddExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddExpr"


    // $ANTLR start "entryRuleMulExpr"
    // InternalMGPL.g:679:1: entryRuleMulExpr : ruleMulExpr EOF ;
    public final void entryRuleMulExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:680:1: ( ruleMulExpr EOF )
            // InternalMGPL.g:681:1: ruleMulExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMulExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulExpr"


    // $ANTLR start "ruleMulExpr"
    // InternalMGPL.g:688:1: ruleMulExpr : ( ( rule__MulExpr__Group__0 ) ) ;
    public final void ruleMulExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:692:2: ( ( ( rule__MulExpr__Group__0 ) ) )
            // InternalMGPL.g:693:2: ( ( rule__MulExpr__Group__0 ) )
            {
            // InternalMGPL.g:693:2: ( ( rule__MulExpr__Group__0 ) )
            // InternalMGPL.g:694:3: ( rule__MulExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getGroup()); 
            }
            // InternalMGPL.g:695:3: ( rule__MulExpr__Group__0 )
            // InternalMGPL.g:695:4: rule__MulExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulExpr"


    // $ANTLR start "entryRuleSimpleExpr"
    // InternalMGPL.g:704:1: entryRuleSimpleExpr : ruleSimpleExpr EOF ;
    public final void entryRuleSimpleExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:705:1: ( ruleSimpleExpr EOF )
            // InternalMGPL.g:706:1: ruleSimpleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSimpleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleExpr"


    // $ANTLR start "ruleSimpleExpr"
    // InternalMGPL.g:713:1: ruleSimpleExpr : ( ( rule__SimpleExpr__Alternatives ) ) ;
    public final void ruleSimpleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:717:2: ( ( ( rule__SimpleExpr__Alternatives ) ) )
            // InternalMGPL.g:718:2: ( ( rule__SimpleExpr__Alternatives ) )
            {
            // InternalMGPL.g:718:2: ( ( rule__SimpleExpr__Alternatives ) )
            // InternalMGPL.g:719:3: ( rule__SimpleExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getAlternatives()); 
            }
            // InternalMGPL.g:720:3: ( rule__SimpleExpr__Alternatives )
            // InternalMGPL.g:720:4: rule__SimpleExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalMGPL.g:729:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:730:1: ( ruleUnaryExpr EOF )
            // InternalMGPL.g:731:1: ruleUnaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalMGPL.g:738:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Group__0 ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:742:2: ( ( ( rule__UnaryExpr__Group__0 ) ) )
            // InternalMGPL.g:743:2: ( ( rule__UnaryExpr__Group__0 ) )
            {
            // InternalMGPL.g:743:2: ( ( rule__UnaryExpr__Group__0 ) )
            // InternalMGPL.g:744:3: ( rule__UnaryExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getGroup()); 
            }
            // InternalMGPL.g:745:3: ( rule__UnaryExpr__Group__0 )
            // InternalMGPL.g:745:4: rule__UnaryExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleNumberExpr"
    // InternalMGPL.g:754:1: entryRuleNumberExpr : ruleNumberExpr EOF ;
    public final void entryRuleNumberExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:755:1: ( ruleNumberExpr EOF )
            // InternalMGPL.g:756:1: ruleNumberExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberExpr"


    // $ANTLR start "ruleNumberExpr"
    // InternalMGPL.g:763:1: ruleNumberExpr : ( ( rule__NumberExpr__NumberAssignment ) ) ;
    public final void ruleNumberExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:767:2: ( ( ( rule__NumberExpr__NumberAssignment ) ) )
            // InternalMGPL.g:768:2: ( ( rule__NumberExpr__NumberAssignment ) )
            {
            // InternalMGPL.g:768:2: ( ( rule__NumberExpr__NumberAssignment ) )
            // InternalMGPL.g:769:3: ( rule__NumberExpr__NumberAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberExprAccess().getNumberAssignment()); 
            }
            // InternalMGPL.g:770:3: ( rule__NumberExpr__NumberAssignment )
            // InternalMGPL.g:770:4: rule__NumberExpr__NumberAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberExpr__NumberAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberExprAccess().getNumberAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberExpr"


    // $ANTLR start "entryRuleVarExpr"
    // InternalMGPL.g:779:1: entryRuleVarExpr : ruleVarExpr EOF ;
    public final void entryRuleVarExpr() throws RecognitionException {
        try {
            // InternalMGPL.g:780:1: ( ruleVarExpr EOF )
            // InternalMGPL.g:781:1: ruleVarExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarExpr"


    // $ANTLR start "ruleVarExpr"
    // InternalMGPL.g:788:1: ruleVarExpr : ( ( rule__VarExpr__VarAssignment ) ) ;
    public final void ruleVarExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:792:2: ( ( ( rule__VarExpr__VarAssignment ) ) )
            // InternalMGPL.g:793:2: ( ( rule__VarExpr__VarAssignment ) )
            {
            // InternalMGPL.g:793:2: ( ( rule__VarExpr__VarAssignment ) )
            // InternalMGPL.g:794:3: ( rule__VarExpr__VarAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExprAccess().getVarAssignment()); 
            }
            // InternalMGPL.g:795:3: ( rule__VarExpr__VarAssignment )
            // InternalMGPL.g:795:4: rule__VarExpr__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__VarAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExprAccess().getVarAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarExpr"


    // $ANTLR start "ruleObjType"
    // InternalMGPL.g:804:1: ruleObjType : ( ( rule__ObjType__Alternatives ) ) ;
    public final void ruleObjType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:808:1: ( ( ( rule__ObjType__Alternatives ) ) )
            // InternalMGPL.g:809:2: ( ( rule__ObjType__Alternatives ) )
            {
            // InternalMGPL.g:809:2: ( ( rule__ObjType__Alternatives ) )
            // InternalMGPL.g:810:3: ( rule__ObjType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjTypeAccess().getAlternatives()); 
            }
            // InternalMGPL.g:811:3: ( rule__ObjType__Alternatives )
            // InternalMGPL.g:811:4: rule__ObjType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ObjType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjType"


    // $ANTLR start "ruleKeyStroke"
    // InternalMGPL.g:820:1: ruleKeyStroke : ( ( rule__KeyStroke__Alternatives ) ) ;
    public final void ruleKeyStroke() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:824:1: ( ( ( rule__KeyStroke__Alternatives ) ) )
            // InternalMGPL.g:825:2: ( ( rule__KeyStroke__Alternatives ) )
            {
            // InternalMGPL.g:825:2: ( ( rule__KeyStroke__Alternatives ) )
            // InternalMGPL.g:826:3: ( rule__KeyStroke__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStrokeAccess().getAlternatives()); 
            }
            // InternalMGPL.g:827:3: ( rule__KeyStroke__Alternatives )
            // InternalMGPL.g:827:4: rule__KeyStroke__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KeyStroke__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStrokeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyStroke"


    // $ANTLR start "rule__Decl__Alternatives_0"
    // InternalMGPL.g:835:1: rule__Decl__Alternatives_0 : ( ( ruleObjDecl ) | ( ruleObjArrayDecl ) | ( ruleVarDecl ) );
    public final void rule__Decl__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:839:1: ( ( ruleObjDecl ) | ( ruleObjArrayDecl ) | ( ruleVarDecl ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_IDF) ) {
                    int LA1_5 = input.LA(3);

                    if ( (LA1_5==29) ) {
                        alt1=1;
                    }
                    else if ( (LA1_5==34) ) {
                        alt1=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_IDF) ) {
                    int LA1_5 = input.LA(3);

                    if ( (LA1_5==29) ) {
                        alt1=1;
                    }
                    else if ( (LA1_5==34) ) {
                        alt1=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==RULE_IDF) ) {
                    int LA1_5 = input.LA(3);

                    if ( (LA1_5==29) ) {
                        alt1=1;
                    }
                    else if ( (LA1_5==34) ) {
                        alt1=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMGPL.g:840:2: ( ruleObjDecl )
                    {
                    // InternalMGPL.g:840:2: ( ruleObjDecl )
                    // InternalMGPL.g:841:3: ruleObjDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclAccess().getObjDeclParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleObjDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclAccess().getObjDeclParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:846:2: ( ruleObjArrayDecl )
                    {
                    // InternalMGPL.g:846:2: ( ruleObjArrayDecl )
                    // InternalMGPL.g:847:3: ruleObjArrayDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclAccess().getObjArrayDeclParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleObjArrayDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclAccess().getObjArrayDeclParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:852:2: ( ruleVarDecl )
                    {
                    // InternalMGPL.g:852:2: ( ruleVarDecl )
                    // InternalMGPL.g:853:3: ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclAccess().getVarDeclParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclAccess().getVarDeclParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Alternatives_0"


    // $ANTLR start "rule__VarDecl__Alternatives"
    // InternalMGPL.g:862:1: rule__VarDecl__Alternatives : ( ( ruleScalarVarDecl ) | ( ruleArrayVarDecl ) );
    public final void rule__VarDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:866:1: ( ( ruleScalarVarDecl ) | ( ruleArrayVarDecl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_IDF) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==EOF||LA2_2==31||LA2_2==33) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==34) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMGPL.g:867:2: ( ruleScalarVarDecl )
                    {
                    // InternalMGPL.g:867:2: ( ruleScalarVarDecl )
                    // InternalMGPL.g:868:3: ruleScalarVarDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclAccess().getScalarVarDeclParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleScalarVarDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclAccess().getScalarVarDeclParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:873:2: ( ruleArrayVarDecl )
                    {
                    // InternalMGPL.g:873:2: ( ruleArrayVarDecl )
                    // InternalMGPL.g:874:3: ruleArrayVarDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclAccess().getArrayVarDeclParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArrayVarDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclAccess().getArrayVarDeclParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Alternatives"


    // $ANTLR start "rule__Block__Alternatives"
    // InternalMGPL.g:883:1: rule__Block__Alternatives : ( ( ruleAnimBlock ) | ( ruleEventBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:887:1: ( ( ruleAnimBlock ) | ( ruleEventBlock ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMGPL.g:888:2: ( ruleAnimBlock )
                    {
                    // InternalMGPL.g:888:2: ( ruleAnimBlock )
                    // InternalMGPL.g:889:3: ruleAnimBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAnimBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:894:2: ( ruleEventBlock )
                    {
                    // InternalMGPL.g:894:2: ( ruleEventBlock )
                    // InternalMGPL.g:895:3: ruleEventBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEventBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Alternatives"


    // $ANTLR start "rule__Stmt__Alternatives"
    // InternalMGPL.g:904:1: rule__Stmt__Alternatives : ( ( ruleIfStmt ) | ( ruleForStmt ) | ( ruleAssStmt ) );
    public final void rule__Stmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:908:1: ( ( ruleIfStmt ) | ( ruleForStmt ) | ( ruleAssStmt ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case RULE_IDF:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMGPL.g:909:2: ( ruleIfStmt )
                    {
                    // InternalMGPL.g:909:2: ( ruleIfStmt )
                    // InternalMGPL.g:910:3: ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:915:2: ( ruleForStmt )
                    {
                    // InternalMGPL.g:915:2: ( ruleForStmt )
                    // InternalMGPL.g:916:3: ruleForStmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForStmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:921:2: ( ruleAssStmt )
                    {
                    // InternalMGPL.g:921:2: ( ruleAssStmt )
                    // InternalMGPL.g:922:3: ruleAssStmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssStmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Alternatives"


    // $ANTLR start "rule__Var__Alternatives"
    // InternalMGPL.g:931:1: rule__Var__Alternatives : ( ( ( rule__Var__VariableAssignment_0 ) ) | ( ( rule__Var__Group_1__0 ) ) | ( ( rule__Var__Group_2__0 ) ) );
    public final void rule__Var__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:935:1: ( ( ( rule__Var__VariableAssignment_0 ) ) | ( ( rule__Var__Group_1__0 ) ) | ( ( rule__Var__Group_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_IDF) ) {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt5=2;
                    }
                    break;
                case EOF:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 30:
                case 31:
                case 33:
                case 35:
                case 36:
                case 45:
                case 46:
                case 47:
                    {
                    alt5=1;
                    }
                    break;
                case 44:
                    {
                    alt5=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMGPL.g:936:2: ( ( rule__Var__VariableAssignment_0 ) )
                    {
                    // InternalMGPL.g:936:2: ( ( rule__Var__VariableAssignment_0 ) )
                    // InternalMGPL.g:937:3: ( rule__Var__VariableAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getVariableAssignment_0()); 
                    }
                    // InternalMGPL.g:938:3: ( rule__Var__VariableAssignment_0 )
                    // InternalMGPL.g:938:4: rule__Var__VariableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var__VariableAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getVariableAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:942:2: ( ( rule__Var__Group_1__0 ) )
                    {
                    // InternalMGPL.g:942:2: ( ( rule__Var__Group_1__0 ) )
                    // InternalMGPL.g:943:3: ( rule__Var__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getGroup_1()); 
                    }
                    // InternalMGPL.g:944:3: ( rule__Var__Group_1__0 )
                    // InternalMGPL.g:944:4: rule__Var__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:948:2: ( ( rule__Var__Group_2__0 ) )
                    {
                    // InternalMGPL.g:948:2: ( ( rule__Var__Group_2__0 ) )
                    // InternalMGPL.g:949:3: ( rule__Var__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAccess().getGroup_2()); 
                    }
                    // InternalMGPL.g:950:3: ( rule__Var__Group_2__0 )
                    // InternalMGPL.g:950:4: rule__Var__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Alternatives"


    // $ANTLR start "rule__RelExpr__OpAlternatives_1_1_0"
    // InternalMGPL.g:958:1: rule__RelExpr__OpAlternatives_1_1_0 : ( ( '==' ) | ( '<' ) | ( '<=' ) );
    public final void rule__RelExpr__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:962:1: ( ( '==' ) | ( '<' ) | ( '<=' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMGPL.g:963:2: ( '==' )
                    {
                    // InternalMGPL.g:963:2: ( '==' )
                    // InternalMGPL.g:964:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:969:2: ( '<' )
                    {
                    // InternalMGPL.g:969:2: ( '<' )
                    // InternalMGPL.g:970:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getOpLessThanSignKeyword_1_1_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getOpLessThanSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:975:2: ( '<=' )
                    {
                    // InternalMGPL.g:975:2: ( '<=' )
                    // InternalMGPL.g:976:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__OpAlternatives_1_1_0"


    // $ANTLR start "rule__AddExpr__OpAlternatives_1_1_0"
    // InternalMGPL.g:985:1: rule__AddExpr__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddExpr__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:989:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGPL.g:990:2: ( '+' )
                    {
                    // InternalMGPL.g:990:2: ( '+' )
                    // InternalMGPL.g:991:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExprAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExprAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:996:2: ( '-' )
                    {
                    // InternalMGPL.g:996:2: ( '-' )
                    // InternalMGPL.g:997:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExprAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExprAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__OpAlternatives_1_1_0"


    // $ANTLR start "rule__MulExpr__OpAlternatives_1_1_0"
    // InternalMGPL.g:1006:1: rule__MulExpr__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulExpr__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1010:1: ( ( '*' ) | ( '/' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMGPL.g:1011:2: ( '*' )
                    {
                    // InternalMGPL.g:1011:2: ( '*' )
                    // InternalMGPL.g:1012:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1017:2: ( '/' )
                    {
                    // InternalMGPL.g:1017:2: ( '/' )
                    // InternalMGPL.g:1018:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__OpAlternatives_1_1_0"


    // $ANTLR start "rule__SimpleExpr__Alternatives"
    // InternalMGPL.g:1027:1: rule__SimpleExpr__Alternatives : ( ( ruleUnaryExpr ) | ( ruleNumberExpr ) | ( ( rule__SimpleExpr__Group_2__0 ) ) | ( ( rule__SimpleExpr__Group_3__0 ) ) );
    public final void rule__SimpleExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1031:1: ( ( ruleUnaryExpr ) | ( ruleNumberExpr ) | ( ( rule__SimpleExpr__Group_2__0 ) ) | ( ( rule__SimpleExpr__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 16:
            case 19:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_IDF:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMGPL.g:1032:2: ( ruleUnaryExpr )
                    {
                    // InternalMGPL.g:1032:2: ( ruleUnaryExpr )
                    // InternalMGPL.g:1033:3: ruleUnaryExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExprAccess().getUnaryExprParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUnaryExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExprAccess().getUnaryExprParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1038:2: ( ruleNumberExpr )
                    {
                    // InternalMGPL.g:1038:2: ( ruleNumberExpr )
                    // InternalMGPL.g:1039:3: ruleNumberExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExprAccess().getNumberExprParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExprAccess().getNumberExprParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:1044:2: ( ( rule__SimpleExpr__Group_2__0 ) )
                    {
                    // InternalMGPL.g:1044:2: ( ( rule__SimpleExpr__Group_2__0 ) )
                    // InternalMGPL.g:1045:3: ( rule__SimpleExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExprAccess().getGroup_2()); 
                    }
                    // InternalMGPL.g:1046:3: ( rule__SimpleExpr__Group_2__0 )
                    // InternalMGPL.g:1046:4: rule__SimpleExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleExpr__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExprAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGPL.g:1050:2: ( ( rule__SimpleExpr__Group_3__0 ) )
                    {
                    // InternalMGPL.g:1050:2: ( ( rule__SimpleExpr__Group_3__0 ) )
                    // InternalMGPL.g:1051:3: ( rule__SimpleExpr__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExprAccess().getGroup_3()); 
                    }
                    // InternalMGPL.g:1052:3: ( rule__SimpleExpr__Group_3__0 )
                    // InternalMGPL.g:1052:4: rule__SimpleExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleExpr__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExprAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Alternatives"


    // $ANTLR start "rule__UnaryExpr__OpAlternatives_0_0"
    // InternalMGPL.g:1060:1: rule__UnaryExpr__OpAlternatives_0_0 : ( ( '-' ) | ( '!' ) );
    public final void rule__UnaryExpr__OpAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1064:1: ( ( '-' ) | ( '!' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGPL.g:1065:2: ( '-' )
                    {
                    // InternalMGPL.g:1065:2: ( '-' )
                    // InternalMGPL.g:1066:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExprAccess().getOpHyphenMinusKeyword_0_0_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExprAccess().getOpHyphenMinusKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1071:2: ( '!' )
                    {
                    // InternalMGPL.g:1071:2: ( '!' )
                    // InternalMGPL.g:1072:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExprAccess().getOpExclamationMarkKeyword_0_0_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExprAccess().getOpExclamationMarkKeyword_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__OpAlternatives_0_0"


    // $ANTLR start "rule__ObjType__Alternatives"
    // InternalMGPL.g:1081:1: rule__ObjType__Alternatives : ( ( ( 'rectangle' ) ) | ( ( 'triangle' ) ) | ( ( 'circle' ) ) );
    public final void rule__ObjType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1085:1: ( ( ( 'rectangle' ) ) | ( ( 'triangle' ) ) | ( ( 'circle' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMGPL.g:1086:2: ( ( 'rectangle' ) )
                    {
                    // InternalMGPL.g:1086:2: ( ( 'rectangle' ) )
                    // InternalMGPL.g:1087:3: ( 'rectangle' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjTypeAccess().getRECTANGLEEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGPL.g:1088:3: ( 'rectangle' )
                    // InternalMGPL.g:1088:4: 'rectangle'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjTypeAccess().getRECTANGLEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1092:2: ( ( 'triangle' ) )
                    {
                    // InternalMGPL.g:1092:2: ( ( 'triangle' ) )
                    // InternalMGPL.g:1093:3: ( 'triangle' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjTypeAccess().getTRIANGLEEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGPL.g:1094:3: ( 'triangle' )
                    // InternalMGPL.g:1094:4: 'triangle'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjTypeAccess().getTRIANGLEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:1098:2: ( ( 'circle' ) )
                    {
                    // InternalMGPL.g:1098:2: ( ( 'circle' ) )
                    // InternalMGPL.g:1099:3: ( 'circle' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjTypeAccess().getCIRCLEEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGPL.g:1100:3: ( 'circle' )
                    // InternalMGPL.g:1100:4: 'circle'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjTypeAccess().getCIRCLEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjType__Alternatives"


    // $ANTLR start "rule__KeyStroke__Alternatives"
    // InternalMGPL.g:1108:1: rule__KeyStroke__Alternatives : ( ( ( 'space' ) ) | ( ( 'leftarrow' ) ) | ( ( 'rightarrow' ) ) | ( ( 'uparrow' ) ) | ( ( 'downarrow' ) ) );
    public final void rule__KeyStroke__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1112:1: ( ( ( 'space' ) ) | ( ( 'leftarrow' ) ) | ( ( 'rightarrow' ) ) | ( ( 'uparrow' ) ) | ( ( 'downarrow' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            case 27:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMGPL.g:1113:2: ( ( 'space' ) )
                    {
                    // InternalMGPL.g:1113:2: ( ( 'space' ) )
                    // InternalMGPL.g:1114:3: ( 'space' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeyStrokeAccess().getSPACEEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGPL.g:1115:3: ( 'space' )
                    // InternalMGPL.g:1115:4: 'space'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeyStrokeAccess().getSPACEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1119:2: ( ( 'leftarrow' ) )
                    {
                    // InternalMGPL.g:1119:2: ( ( 'leftarrow' ) )
                    // InternalMGPL.g:1120:3: ( 'leftarrow' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeyStrokeAccess().getLEFT_ARROWEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGPL.g:1121:3: ( 'leftarrow' )
                    // InternalMGPL.g:1121:4: 'leftarrow'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeyStrokeAccess().getLEFT_ARROWEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:1125:2: ( ( 'rightarrow' ) )
                    {
                    // InternalMGPL.g:1125:2: ( ( 'rightarrow' ) )
                    // InternalMGPL.g:1126:3: ( 'rightarrow' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeyStrokeAccess().getRIGHT_ARROWEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGPL.g:1127:3: ( 'rightarrow' )
                    // InternalMGPL.g:1127:4: 'rightarrow'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeyStrokeAccess().getRIGHT_ARROWEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGPL.g:1131:2: ( ( 'uparrow' ) )
                    {
                    // InternalMGPL.g:1131:2: ( ( 'uparrow' ) )
                    // InternalMGPL.g:1132:3: ( 'uparrow' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeyStrokeAccess().getUP_ARROWEnumLiteralDeclaration_3()); 
                    }
                    // InternalMGPL.g:1133:3: ( 'uparrow' )
                    // InternalMGPL.g:1133:4: 'uparrow'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeyStrokeAccess().getUP_ARROWEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGPL.g:1137:2: ( ( 'downarrow' ) )
                    {
                    // InternalMGPL.g:1137:2: ( ( 'downarrow' ) )
                    // InternalMGPL.g:1138:3: ( 'downarrow' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeyStrokeAccess().getDOWN_ARROWEnumLiteralDeclaration_4()); 
                    }
                    // InternalMGPL.g:1139:3: ( 'downarrow' )
                    // InternalMGPL.g:1139:4: 'downarrow'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeyStrokeAccess().getDOWN_ARROWEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStroke__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMGPL.g:1147:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1151:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMGPL.g:1152:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMGPL.g:1159:1: rule__Program__Group__0__Impl : ( 'game' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1163:1: ( ( 'game' ) )
            // InternalMGPL.g:1164:1: ( 'game' )
            {
            // InternalMGPL.g:1164:1: ( 'game' )
            // InternalMGPL.g:1165:2: 'game'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGameKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGameKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMGPL.g:1174:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1178:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMGPL.g:1179:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMGPL.g:1186:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1190:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalMGPL.g:1191:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalMGPL.g:1191:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalMGPL.g:1192:2: ( rule__Program__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            }
            // InternalMGPL.g:1193:2: ( rule__Program__NameAssignment_1 )
            // InternalMGPL.g:1193:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMGPL.g:1201:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1205:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalMGPL.g:1206:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMGPL.g:1213:1: rule__Program__Group__2__Impl : ( '(' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1217:1: ( ( '(' ) )
            // InternalMGPL.g:1218:1: ( '(' )
            {
            // InternalMGPL.g:1218:1: ( '(' )
            // InternalMGPL.g:1219:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalMGPL.g:1228:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1232:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalMGPL.g:1233:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalMGPL.g:1240:1: rule__Program__Group__3__Impl : ( ( rule__Program__AttributesAssignment_3 )? ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1244:1: ( ( ( rule__Program__AttributesAssignment_3 )? ) )
            // InternalMGPL.g:1245:1: ( ( rule__Program__AttributesAssignment_3 )? )
            {
            // InternalMGPL.g:1245:1: ( ( rule__Program__AttributesAssignment_3 )? )
            // InternalMGPL.g:1246:2: ( rule__Program__AttributesAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getAttributesAssignment_3()); 
            }
            // InternalMGPL.g:1247:2: ( rule__Program__AttributesAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_IDF) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGPL.g:1247:3: rule__Program__AttributesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__AttributesAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getAttributesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalMGPL.g:1255:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1259:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalMGPL.g:1260:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalMGPL.g:1267:1: rule__Program__Group__4__Impl : ( ')' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1271:1: ( ( ')' ) )
            // InternalMGPL.g:1272:1: ( ')' )
            {
            // InternalMGPL.g:1272:1: ( ')' )
            // InternalMGPL.g:1273:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalMGPL.g:1282:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1286:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalMGPL.g:1287:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalMGPL.g:1294:1: rule__Program__Group__5__Impl : ( ( rule__Program__DeclarationsAssignment_5 )* ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1298:1: ( ( ( rule__Program__DeclarationsAssignment_5 )* ) )
            // InternalMGPL.g:1299:1: ( ( rule__Program__DeclarationsAssignment_5 )* )
            {
            // InternalMGPL.g:1299:1: ( ( rule__Program__DeclarationsAssignment_5 )* )
            // InternalMGPL.g:1300:2: ( rule__Program__DeclarationsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getDeclarationsAssignment_5()); 
            }
            // InternalMGPL.g:1301:2: ( rule__Program__DeclarationsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=20 && LA14_0<=22)||LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGPL.g:1301:3: rule__Program__DeclarationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Program__DeclarationsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getDeclarationsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // InternalMGPL.g:1309:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1313:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalMGPL.g:1314:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // InternalMGPL.g:1321:1: rule__Program__Group__6__Impl : ( ( rule__Program__InitAssignment_6 ) ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1325:1: ( ( ( rule__Program__InitAssignment_6 ) ) )
            // InternalMGPL.g:1326:1: ( ( rule__Program__InitAssignment_6 ) )
            {
            // InternalMGPL.g:1326:1: ( ( rule__Program__InitAssignment_6 ) )
            // InternalMGPL.g:1327:2: ( rule__Program__InitAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getInitAssignment_6()); 
            }
            // InternalMGPL.g:1328:2: ( rule__Program__InitAssignment_6 )
            // InternalMGPL.g:1328:3: rule__Program__InitAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Program__InitAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getInitAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Program__Group__7"
    // InternalMGPL.g:1336:1: rule__Program__Group__7 : rule__Program__Group__7__Impl ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1340:1: ( rule__Program__Group__7__Impl )
            // InternalMGPL.g:1341:2: rule__Program__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7"


    // $ANTLR start "rule__Program__Group__7__Impl"
    // InternalMGPL.g:1347:1: rule__Program__Group__7__Impl : ( ( rule__Program__BlocksAssignment_7 )* ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1351:1: ( ( ( rule__Program__BlocksAssignment_7 )* ) )
            // InternalMGPL.g:1352:1: ( ( rule__Program__BlocksAssignment_7 )* )
            {
            // InternalMGPL.g:1352:1: ( ( rule__Program__BlocksAssignment_7 )* )
            // InternalMGPL.g:1353:2: ( rule__Program__BlocksAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getBlocksAssignment_7()); 
            }
            // InternalMGPL.g:1354:2: ( rule__Program__BlocksAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=37 && LA15_0<=38)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMGPL.g:1354:3: rule__Program__BlocksAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__BlocksAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getBlocksAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7__Impl"


    // $ANTLR start "rule__Decl__Group__0"
    // InternalMGPL.g:1363:1: rule__Decl__Group__0 : rule__Decl__Group__0__Impl rule__Decl__Group__1 ;
    public final void rule__Decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1367:1: ( rule__Decl__Group__0__Impl rule__Decl__Group__1 )
            // InternalMGPL.g:1368:2: rule__Decl__Group__0__Impl rule__Decl__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Decl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__0"


    // $ANTLR start "rule__Decl__Group__0__Impl"
    // InternalMGPL.g:1375:1: rule__Decl__Group__0__Impl : ( ( rule__Decl__Alternatives_0 ) ) ;
    public final void rule__Decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1379:1: ( ( ( rule__Decl__Alternatives_0 ) ) )
            // InternalMGPL.g:1380:1: ( ( rule__Decl__Alternatives_0 ) )
            {
            // InternalMGPL.g:1380:1: ( ( rule__Decl__Alternatives_0 ) )
            // InternalMGPL.g:1381:2: ( rule__Decl__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclAccess().getAlternatives_0()); 
            }
            // InternalMGPL.g:1382:2: ( rule__Decl__Alternatives_0 )
            // InternalMGPL.g:1382:3: rule__Decl__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Decl__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__0__Impl"


    // $ANTLR start "rule__Decl__Group__1"
    // InternalMGPL.g:1390:1: rule__Decl__Group__1 : rule__Decl__Group__1__Impl ;
    public final void rule__Decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1394:1: ( rule__Decl__Group__1__Impl )
            // InternalMGPL.g:1395:2: rule__Decl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__1"


    // $ANTLR start "rule__Decl__Group__1__Impl"
    // InternalMGPL.g:1401:1: rule__Decl__Group__1__Impl : ( ';' ) ;
    public final void rule__Decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1405:1: ( ( ';' ) )
            // InternalMGPL.g:1406:1: ( ';' )
            {
            // InternalMGPL.g:1406:1: ( ';' )
            // InternalMGPL.g:1407:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclAccess().getSemicolonKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__1__Impl"


    // $ANTLR start "rule__ScalarVarDecl__Group__0"
    // InternalMGPL.g:1417:1: rule__ScalarVarDecl__Group__0 : rule__ScalarVarDecl__Group__0__Impl rule__ScalarVarDecl__Group__1 ;
    public final void rule__ScalarVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1421:1: ( rule__ScalarVarDecl__Group__0__Impl rule__ScalarVarDecl__Group__1 )
            // InternalMGPL.g:1422:2: rule__ScalarVarDecl__Group__0__Impl rule__ScalarVarDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ScalarVarDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScalarVarDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group__0"


    // $ANTLR start "rule__ScalarVarDecl__Group__0__Impl"
    // InternalMGPL.g:1429:1: rule__ScalarVarDecl__Group__0__Impl : ( 'int' ) ;
    public final void rule__ScalarVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1433:1: ( ( 'int' ) )
            // InternalMGPL.g:1434:1: ( 'int' )
            {
            // InternalMGPL.g:1434:1: ( 'int' )
            // InternalMGPL.g:1435:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclAccess().getIntKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclAccess().getIntKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group__0__Impl"


    // $ANTLR start "rule__ScalarVarDecl__Group__1"
    // InternalMGPL.g:1444:1: rule__ScalarVarDecl__Group__1 : rule__ScalarVarDecl__Group__1__Impl rule__ScalarVarDecl__Group__2 ;
    public final void rule__ScalarVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1448:1: ( rule__ScalarVarDecl__Group__1__Impl rule__ScalarVarDecl__Group__2 )
            // InternalMGPL.g:1449:2: rule__ScalarVarDecl__Group__1__Impl rule__ScalarVarDecl__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ScalarVarDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScalarVarDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group__1"


    // $ANTLR start "rule__ScalarVarDecl__Group__1__Impl"
    // InternalMGPL.g:1456:1: rule__ScalarVarDecl__Group__1__Impl : ( ( rule__ScalarVarDecl__NameAssignment_1 ) ) ;
    public final void rule__ScalarVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1460:1: ( ( ( rule__ScalarVarDecl__NameAssignment_1 ) ) )
            // InternalMGPL.g:1461:1: ( ( rule__ScalarVarDecl__NameAssignment_1 ) )
            {
            // InternalMGPL.g:1461:1: ( ( rule__ScalarVarDecl__NameAssignment_1 ) )
            // InternalMGPL.g:1462:2: ( rule__ScalarVarDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclAccess().getNameAssignment_1()); 
            }
            // InternalMGPL.g:1463:2: ( rule__ScalarVarDecl__NameAssignment_1 )
            // InternalMGPL.g:1463:3: rule__ScalarVarDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScalarVarDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group__1__Impl"


    // $ANTLR start "rule__ScalarVarDecl__Group__2"
    // InternalMGPL.g:1471:1: rule__ScalarVarDecl__Group__2 : rule__ScalarVarDecl__Group__2__Impl ;
    public final void rule__ScalarVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1475:1: ( rule__ScalarVarDecl__Group__2__Impl )
            // InternalMGPL.g:1476:2: rule__ScalarVarDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScalarVarDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group__2"


    // $ANTLR start "rule__ScalarVarDecl__Group__2__Impl"
    // InternalMGPL.g:1482:1: rule__ScalarVarDecl__Group__2__Impl : ( ( rule__ScalarVarDecl__Group_2__0 )? ) ;
    public final void rule__ScalarVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1486:1: ( ( ( rule__ScalarVarDecl__Group_2__0 )? ) )
            // InternalMGPL.g:1487:1: ( ( rule__ScalarVarDecl__Group_2__0 )? )
            {
            // InternalMGPL.g:1487:1: ( ( rule__ScalarVarDecl__Group_2__0 )? )
            // InternalMGPL.g:1488:2: ( rule__ScalarVarDecl__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclAccess().getGroup_2()); 
            }
            // InternalMGPL.g:1489:2: ( rule__ScalarVarDecl__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMGPL.g:1489:3: rule__ScalarVarDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScalarVarDecl__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group__2__Impl"


    // $ANTLR start "rule__ScalarVarDecl__Group_2__0"
    // InternalMGPL.g:1498:1: rule__ScalarVarDecl__Group_2__0 : rule__ScalarVarDecl__Group_2__0__Impl rule__ScalarVarDecl__Group_2__1 ;
    public final void rule__ScalarVarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1502:1: ( rule__ScalarVarDecl__Group_2__0__Impl rule__ScalarVarDecl__Group_2__1 )
            // InternalMGPL.g:1503:2: rule__ScalarVarDecl__Group_2__0__Impl rule__ScalarVarDecl__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__ScalarVarDecl__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScalarVarDecl__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group_2__0"


    // $ANTLR start "rule__ScalarVarDecl__Group_2__0__Impl"
    // InternalMGPL.g:1510:1: rule__ScalarVarDecl__Group_2__0__Impl : ( '=' ) ;
    public final void rule__ScalarVarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1514:1: ( ( '=' ) )
            // InternalMGPL.g:1515:1: ( '=' )
            {
            // InternalMGPL.g:1515:1: ( '=' )
            // InternalMGPL.g:1516:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclAccess().getEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group_2__0__Impl"


    // $ANTLR start "rule__ScalarVarDecl__Group_2__1"
    // InternalMGPL.g:1525:1: rule__ScalarVarDecl__Group_2__1 : rule__ScalarVarDecl__Group_2__1__Impl ;
    public final void rule__ScalarVarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1529:1: ( rule__ScalarVarDecl__Group_2__1__Impl )
            // InternalMGPL.g:1530:2: rule__ScalarVarDecl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScalarVarDecl__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group_2__1"


    // $ANTLR start "rule__ScalarVarDecl__Group_2__1__Impl"
    // InternalMGPL.g:1536:1: rule__ScalarVarDecl__Group_2__1__Impl : ( ( rule__ScalarVarDecl__InitializationAssignment_2_1 ) ) ;
    public final void rule__ScalarVarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1540:1: ( ( ( rule__ScalarVarDecl__InitializationAssignment_2_1 ) ) )
            // InternalMGPL.g:1541:1: ( ( rule__ScalarVarDecl__InitializationAssignment_2_1 ) )
            {
            // InternalMGPL.g:1541:1: ( ( rule__ScalarVarDecl__InitializationAssignment_2_1 ) )
            // InternalMGPL.g:1542:2: ( rule__ScalarVarDecl__InitializationAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclAccess().getInitializationAssignment_2_1()); 
            }
            // InternalMGPL.g:1543:2: ( rule__ScalarVarDecl__InitializationAssignment_2_1 )
            // InternalMGPL.g:1543:3: rule__ScalarVarDecl__InitializationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ScalarVarDecl__InitializationAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclAccess().getInitializationAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__Group_2__1__Impl"


    // $ANTLR start "rule__ArrayVarDecl__Group__0"
    // InternalMGPL.g:1552:1: rule__ArrayVarDecl__Group__0 : rule__ArrayVarDecl__Group__0__Impl rule__ArrayVarDecl__Group__1 ;
    public final void rule__ArrayVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1556:1: ( rule__ArrayVarDecl__Group__0__Impl rule__ArrayVarDecl__Group__1 )
            // InternalMGPL.g:1557:2: rule__ArrayVarDecl__Group__0__Impl rule__ArrayVarDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ArrayVarDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayVarDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__0"


    // $ANTLR start "rule__ArrayVarDecl__Group__0__Impl"
    // InternalMGPL.g:1564:1: rule__ArrayVarDecl__Group__0__Impl : ( 'int' ) ;
    public final void rule__ArrayVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1568:1: ( ( 'int' ) )
            // InternalMGPL.g:1569:1: ( 'int' )
            {
            // InternalMGPL.g:1569:1: ( 'int' )
            // InternalMGPL.g:1570:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclAccess().getIntKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclAccess().getIntKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__0__Impl"


    // $ANTLR start "rule__ArrayVarDecl__Group__1"
    // InternalMGPL.g:1579:1: rule__ArrayVarDecl__Group__1 : rule__ArrayVarDecl__Group__1__Impl rule__ArrayVarDecl__Group__2 ;
    public final void rule__ArrayVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1583:1: ( rule__ArrayVarDecl__Group__1__Impl rule__ArrayVarDecl__Group__2 )
            // InternalMGPL.g:1584:2: rule__ArrayVarDecl__Group__1__Impl rule__ArrayVarDecl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ArrayVarDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayVarDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__1"


    // $ANTLR start "rule__ArrayVarDecl__Group__1__Impl"
    // InternalMGPL.g:1591:1: rule__ArrayVarDecl__Group__1__Impl : ( ( rule__ArrayVarDecl__NameAssignment_1 ) ) ;
    public final void rule__ArrayVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1595:1: ( ( ( rule__ArrayVarDecl__NameAssignment_1 ) ) )
            // InternalMGPL.g:1596:1: ( ( rule__ArrayVarDecl__NameAssignment_1 ) )
            {
            // InternalMGPL.g:1596:1: ( ( rule__ArrayVarDecl__NameAssignment_1 ) )
            // InternalMGPL.g:1597:2: ( rule__ArrayVarDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclAccess().getNameAssignment_1()); 
            }
            // InternalMGPL.g:1598:2: ( rule__ArrayVarDecl__NameAssignment_1 )
            // InternalMGPL.g:1598:3: rule__ArrayVarDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayVarDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__1__Impl"


    // $ANTLR start "rule__ArrayVarDecl__Group__2"
    // InternalMGPL.g:1606:1: rule__ArrayVarDecl__Group__2 : rule__ArrayVarDecl__Group__2__Impl rule__ArrayVarDecl__Group__3 ;
    public final void rule__ArrayVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1610:1: ( rule__ArrayVarDecl__Group__2__Impl rule__ArrayVarDecl__Group__3 )
            // InternalMGPL.g:1611:2: rule__ArrayVarDecl__Group__2__Impl rule__ArrayVarDecl__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ArrayVarDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayVarDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__2"


    // $ANTLR start "rule__ArrayVarDecl__Group__2__Impl"
    // InternalMGPL.g:1618:1: rule__ArrayVarDecl__Group__2__Impl : ( '[' ) ;
    public final void rule__ArrayVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1622:1: ( ( '[' ) )
            // InternalMGPL.g:1623:1: ( '[' )
            {
            // InternalMGPL.g:1623:1: ( '[' )
            // InternalMGPL.g:1624:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__2__Impl"


    // $ANTLR start "rule__ArrayVarDecl__Group__3"
    // InternalMGPL.g:1633:1: rule__ArrayVarDecl__Group__3 : rule__ArrayVarDecl__Group__3__Impl rule__ArrayVarDecl__Group__4 ;
    public final void rule__ArrayVarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1637:1: ( rule__ArrayVarDecl__Group__3__Impl rule__ArrayVarDecl__Group__4 )
            // InternalMGPL.g:1638:2: rule__ArrayVarDecl__Group__3__Impl rule__ArrayVarDecl__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ArrayVarDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayVarDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__3"


    // $ANTLR start "rule__ArrayVarDecl__Group__3__Impl"
    // InternalMGPL.g:1645:1: rule__ArrayVarDecl__Group__3__Impl : ( ( rule__ArrayVarDecl__SizeAssignment_3 ) ) ;
    public final void rule__ArrayVarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1649:1: ( ( ( rule__ArrayVarDecl__SizeAssignment_3 ) ) )
            // InternalMGPL.g:1650:1: ( ( rule__ArrayVarDecl__SizeAssignment_3 ) )
            {
            // InternalMGPL.g:1650:1: ( ( rule__ArrayVarDecl__SizeAssignment_3 ) )
            // InternalMGPL.g:1651:2: ( rule__ArrayVarDecl__SizeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclAccess().getSizeAssignment_3()); 
            }
            // InternalMGPL.g:1652:2: ( rule__ArrayVarDecl__SizeAssignment_3 )
            // InternalMGPL.g:1652:3: rule__ArrayVarDecl__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArrayVarDecl__SizeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclAccess().getSizeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__3__Impl"


    // $ANTLR start "rule__ArrayVarDecl__Group__4"
    // InternalMGPL.g:1660:1: rule__ArrayVarDecl__Group__4 : rule__ArrayVarDecl__Group__4__Impl ;
    public final void rule__ArrayVarDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1664:1: ( rule__ArrayVarDecl__Group__4__Impl )
            // InternalMGPL.g:1665:2: rule__ArrayVarDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayVarDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__4"


    // $ANTLR start "rule__ArrayVarDecl__Group__4__Impl"
    // InternalMGPL.g:1671:1: rule__ArrayVarDecl__Group__4__Impl : ( ']' ) ;
    public final void rule__ArrayVarDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1675:1: ( ( ']' ) )
            // InternalMGPL.g:1676:1: ( ']' )
            {
            // InternalMGPL.g:1676:1: ( ']' )
            // InternalMGPL.g:1677:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__Group__4__Impl"


    // $ANTLR start "rule__ObjDecl__Group__0"
    // InternalMGPL.g:1687:1: rule__ObjDecl__Group__0 : rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1 ;
    public final void rule__ObjDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1691:1: ( rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1 )
            // InternalMGPL.g:1692:2: rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__0"


    // $ANTLR start "rule__ObjDecl__Group__0__Impl"
    // InternalMGPL.g:1699:1: rule__ObjDecl__Group__0__Impl : ( ( rule__ObjDecl__TypeAssignment_0 ) ) ;
    public final void rule__ObjDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1703:1: ( ( ( rule__ObjDecl__TypeAssignment_0 ) ) )
            // InternalMGPL.g:1704:1: ( ( rule__ObjDecl__TypeAssignment_0 ) )
            {
            // InternalMGPL.g:1704:1: ( ( rule__ObjDecl__TypeAssignment_0 ) )
            // InternalMGPL.g:1705:2: ( rule__ObjDecl__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getTypeAssignment_0()); 
            }
            // InternalMGPL.g:1706:2: ( rule__ObjDecl__TypeAssignment_0 )
            // InternalMGPL.g:1706:3: rule__ObjDecl__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjDecl__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__0__Impl"


    // $ANTLR start "rule__ObjDecl__Group__1"
    // InternalMGPL.g:1714:1: rule__ObjDecl__Group__1 : rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2 ;
    public final void rule__ObjDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1718:1: ( rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2 )
            // InternalMGPL.g:1719:2: rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ObjDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__1"


    // $ANTLR start "rule__ObjDecl__Group__1__Impl"
    // InternalMGPL.g:1726:1: rule__ObjDecl__Group__1__Impl : ( ( rule__ObjDecl__NameAssignment_1 ) ) ;
    public final void rule__ObjDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1730:1: ( ( ( rule__ObjDecl__NameAssignment_1 ) ) )
            // InternalMGPL.g:1731:1: ( ( rule__ObjDecl__NameAssignment_1 ) )
            {
            // InternalMGPL.g:1731:1: ( ( rule__ObjDecl__NameAssignment_1 ) )
            // InternalMGPL.g:1732:2: ( rule__ObjDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getNameAssignment_1()); 
            }
            // InternalMGPL.g:1733:2: ( rule__ObjDecl__NameAssignment_1 )
            // InternalMGPL.g:1733:3: rule__ObjDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__1__Impl"


    // $ANTLR start "rule__ObjDecl__Group__2"
    // InternalMGPL.g:1741:1: rule__ObjDecl__Group__2 : rule__ObjDecl__Group__2__Impl rule__ObjDecl__Group__3 ;
    public final void rule__ObjDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1745:1: ( rule__ObjDecl__Group__2__Impl rule__ObjDecl__Group__3 )
            // InternalMGPL.g:1746:2: rule__ObjDecl__Group__2__Impl rule__ObjDecl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ObjDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__2"


    // $ANTLR start "rule__ObjDecl__Group__2__Impl"
    // InternalMGPL.g:1753:1: rule__ObjDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__ObjDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1757:1: ( ( '(' ) )
            // InternalMGPL.g:1758:1: ( '(' )
            {
            // InternalMGPL.g:1758:1: ( '(' )
            // InternalMGPL.g:1759:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__2__Impl"


    // $ANTLR start "rule__ObjDecl__Group__3"
    // InternalMGPL.g:1768:1: rule__ObjDecl__Group__3 : rule__ObjDecl__Group__3__Impl rule__ObjDecl__Group__4 ;
    public final void rule__ObjDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1772:1: ( rule__ObjDecl__Group__3__Impl rule__ObjDecl__Group__4 )
            // InternalMGPL.g:1773:2: rule__ObjDecl__Group__3__Impl rule__ObjDecl__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ObjDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__3"


    // $ANTLR start "rule__ObjDecl__Group__3__Impl"
    // InternalMGPL.g:1780:1: rule__ObjDecl__Group__3__Impl : ( ( rule__ObjDecl__AttributesAssignment_3 )? ) ;
    public final void rule__ObjDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1784:1: ( ( ( rule__ObjDecl__AttributesAssignment_3 )? ) )
            // InternalMGPL.g:1785:1: ( ( rule__ObjDecl__AttributesAssignment_3 )? )
            {
            // InternalMGPL.g:1785:1: ( ( rule__ObjDecl__AttributesAssignment_3 )? )
            // InternalMGPL.g:1786:2: ( rule__ObjDecl__AttributesAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getAttributesAssignment_3()); 
            }
            // InternalMGPL.g:1787:2: ( rule__ObjDecl__AttributesAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDF) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGPL.g:1787:3: rule__ObjDecl__AttributesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjDecl__AttributesAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getAttributesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__3__Impl"


    // $ANTLR start "rule__ObjDecl__Group__4"
    // InternalMGPL.g:1795:1: rule__ObjDecl__Group__4 : rule__ObjDecl__Group__4__Impl ;
    public final void rule__ObjDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1799:1: ( rule__ObjDecl__Group__4__Impl )
            // InternalMGPL.g:1800:2: rule__ObjDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__4"


    // $ANTLR start "rule__ObjDecl__Group__4__Impl"
    // InternalMGPL.g:1806:1: rule__ObjDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__ObjDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1810:1: ( ( ')' ) )
            // InternalMGPL.g:1811:1: ( ')' )
            {
            // InternalMGPL.g:1811:1: ( ')' )
            // InternalMGPL.g:1812:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__Group__4__Impl"


    // $ANTLR start "rule__ObjArrayDecl__Group__0"
    // InternalMGPL.g:1822:1: rule__ObjArrayDecl__Group__0 : rule__ObjArrayDecl__Group__0__Impl rule__ObjArrayDecl__Group__1 ;
    public final void rule__ObjArrayDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1826:1: ( rule__ObjArrayDecl__Group__0__Impl rule__ObjArrayDecl__Group__1 )
            // InternalMGPL.g:1827:2: rule__ObjArrayDecl__Group__0__Impl rule__ObjArrayDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjArrayDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__0"


    // $ANTLR start "rule__ObjArrayDecl__Group__0__Impl"
    // InternalMGPL.g:1834:1: rule__ObjArrayDecl__Group__0__Impl : ( ( rule__ObjArrayDecl__TypeAssignment_0 ) ) ;
    public final void rule__ObjArrayDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1838:1: ( ( ( rule__ObjArrayDecl__TypeAssignment_0 ) ) )
            // InternalMGPL.g:1839:1: ( ( rule__ObjArrayDecl__TypeAssignment_0 ) )
            {
            // InternalMGPL.g:1839:1: ( ( rule__ObjArrayDecl__TypeAssignment_0 ) )
            // InternalMGPL.g:1840:2: ( rule__ObjArrayDecl__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getTypeAssignment_0()); 
            }
            // InternalMGPL.g:1841:2: ( rule__ObjArrayDecl__TypeAssignment_0 )
            // InternalMGPL.g:1841:3: rule__ObjArrayDecl__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__0__Impl"


    // $ANTLR start "rule__ObjArrayDecl__Group__1"
    // InternalMGPL.g:1849:1: rule__ObjArrayDecl__Group__1 : rule__ObjArrayDecl__Group__1__Impl rule__ObjArrayDecl__Group__2 ;
    public final void rule__ObjArrayDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1853:1: ( rule__ObjArrayDecl__Group__1__Impl rule__ObjArrayDecl__Group__2 )
            // InternalMGPL.g:1854:2: rule__ObjArrayDecl__Group__1__Impl rule__ObjArrayDecl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ObjArrayDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__1"


    // $ANTLR start "rule__ObjArrayDecl__Group__1__Impl"
    // InternalMGPL.g:1861:1: rule__ObjArrayDecl__Group__1__Impl : ( ( rule__ObjArrayDecl__NameAssignment_1 ) ) ;
    public final void rule__ObjArrayDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1865:1: ( ( ( rule__ObjArrayDecl__NameAssignment_1 ) ) )
            // InternalMGPL.g:1866:1: ( ( rule__ObjArrayDecl__NameAssignment_1 ) )
            {
            // InternalMGPL.g:1866:1: ( ( rule__ObjArrayDecl__NameAssignment_1 ) )
            // InternalMGPL.g:1867:2: ( rule__ObjArrayDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getNameAssignment_1()); 
            }
            // InternalMGPL.g:1868:2: ( rule__ObjArrayDecl__NameAssignment_1 )
            // InternalMGPL.g:1868:3: rule__ObjArrayDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__1__Impl"


    // $ANTLR start "rule__ObjArrayDecl__Group__2"
    // InternalMGPL.g:1876:1: rule__ObjArrayDecl__Group__2 : rule__ObjArrayDecl__Group__2__Impl rule__ObjArrayDecl__Group__3 ;
    public final void rule__ObjArrayDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1880:1: ( rule__ObjArrayDecl__Group__2__Impl rule__ObjArrayDecl__Group__3 )
            // InternalMGPL.g:1881:2: rule__ObjArrayDecl__Group__2__Impl rule__ObjArrayDecl__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ObjArrayDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__2"


    // $ANTLR start "rule__ObjArrayDecl__Group__2__Impl"
    // InternalMGPL.g:1888:1: rule__ObjArrayDecl__Group__2__Impl : ( '[' ) ;
    public final void rule__ObjArrayDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1892:1: ( ( '[' ) )
            // InternalMGPL.g:1893:1: ( '[' )
            {
            // InternalMGPL.g:1893:1: ( '[' )
            // InternalMGPL.g:1894:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__2__Impl"


    // $ANTLR start "rule__ObjArrayDecl__Group__3"
    // InternalMGPL.g:1903:1: rule__ObjArrayDecl__Group__3 : rule__ObjArrayDecl__Group__3__Impl rule__ObjArrayDecl__Group__4 ;
    public final void rule__ObjArrayDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1907:1: ( rule__ObjArrayDecl__Group__3__Impl rule__ObjArrayDecl__Group__4 )
            // InternalMGPL.g:1908:2: rule__ObjArrayDecl__Group__3__Impl rule__ObjArrayDecl__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ObjArrayDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__3"


    // $ANTLR start "rule__ObjArrayDecl__Group__3__Impl"
    // InternalMGPL.g:1915:1: rule__ObjArrayDecl__Group__3__Impl : ( ( rule__ObjArrayDecl__SizeAssignment_3 ) ) ;
    public final void rule__ObjArrayDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1919:1: ( ( ( rule__ObjArrayDecl__SizeAssignment_3 ) ) )
            // InternalMGPL.g:1920:1: ( ( rule__ObjArrayDecl__SizeAssignment_3 ) )
            {
            // InternalMGPL.g:1920:1: ( ( rule__ObjArrayDecl__SizeAssignment_3 ) )
            // InternalMGPL.g:1921:2: ( rule__ObjArrayDecl__SizeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getSizeAssignment_3()); 
            }
            // InternalMGPL.g:1922:2: ( rule__ObjArrayDecl__SizeAssignment_3 )
            // InternalMGPL.g:1922:3: rule__ObjArrayDecl__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__SizeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getSizeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__3__Impl"


    // $ANTLR start "rule__ObjArrayDecl__Group__4"
    // InternalMGPL.g:1930:1: rule__ObjArrayDecl__Group__4 : rule__ObjArrayDecl__Group__4__Impl ;
    public final void rule__ObjArrayDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1934:1: ( rule__ObjArrayDecl__Group__4__Impl )
            // InternalMGPL.g:1935:2: rule__ObjArrayDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjArrayDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__4"


    // $ANTLR start "rule__ObjArrayDecl__Group__4__Impl"
    // InternalMGPL.g:1941:1: rule__ObjArrayDecl__Group__4__Impl : ( ']' ) ;
    public final void rule__ObjArrayDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1945:1: ( ( ']' ) )
            // InternalMGPL.g:1946:1: ( ']' )
            {
            // InternalMGPL.g:1946:1: ( ']' )
            // InternalMGPL.g:1947:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__Group__4__Impl"


    // $ANTLR start "rule__AttrAssList__Group__0"
    // InternalMGPL.g:1957:1: rule__AttrAssList__Group__0 : rule__AttrAssList__Group__0__Impl rule__AttrAssList__Group__1 ;
    public final void rule__AttrAssList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1961:1: ( rule__AttrAssList__Group__0__Impl rule__AttrAssList__Group__1 )
            // InternalMGPL.g:1962:2: rule__AttrAssList__Group__0__Impl rule__AttrAssList__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AttrAssList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrAssList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__Group__0"


    // $ANTLR start "rule__AttrAssList__Group__0__Impl"
    // InternalMGPL.g:1969:1: rule__AttrAssList__Group__0__Impl : ( ( rule__AttrAssList__AssignmentsAssignment_0 ) ) ;
    public final void rule__AttrAssList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1973:1: ( ( ( rule__AttrAssList__AssignmentsAssignment_0 ) ) )
            // InternalMGPL.g:1974:1: ( ( rule__AttrAssList__AssignmentsAssignment_0 ) )
            {
            // InternalMGPL.g:1974:1: ( ( rule__AttrAssList__AssignmentsAssignment_0 ) )
            // InternalMGPL.g:1975:2: ( rule__AttrAssList__AssignmentsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssListAccess().getAssignmentsAssignment_0()); 
            }
            // InternalMGPL.g:1976:2: ( rule__AttrAssList__AssignmentsAssignment_0 )
            // InternalMGPL.g:1976:3: rule__AttrAssList__AssignmentsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttrAssList__AssignmentsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssListAccess().getAssignmentsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__Group__0__Impl"


    // $ANTLR start "rule__AttrAssList__Group__1"
    // InternalMGPL.g:1984:1: rule__AttrAssList__Group__1 : rule__AttrAssList__Group__1__Impl ;
    public final void rule__AttrAssList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1988:1: ( rule__AttrAssList__Group__1__Impl )
            // InternalMGPL.g:1989:2: rule__AttrAssList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrAssList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__Group__1"


    // $ANTLR start "rule__AttrAssList__Group__1__Impl"
    // InternalMGPL.g:1995:1: rule__AttrAssList__Group__1__Impl : ( ( rule__AttrAssList__Group_1__0 )* ) ;
    public final void rule__AttrAssList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:1999:1: ( ( ( rule__AttrAssList__Group_1__0 )* ) )
            // InternalMGPL.g:2000:1: ( ( rule__AttrAssList__Group_1__0 )* )
            {
            // InternalMGPL.g:2000:1: ( ( rule__AttrAssList__Group_1__0 )* )
            // InternalMGPL.g:2001:2: ( rule__AttrAssList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssListAccess().getGroup_1()); 
            }
            // InternalMGPL.g:2002:2: ( rule__AttrAssList__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMGPL.g:2002:3: rule__AttrAssList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AttrAssList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssListAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__Group__1__Impl"


    // $ANTLR start "rule__AttrAssList__Group_1__0"
    // InternalMGPL.g:2011:1: rule__AttrAssList__Group_1__0 : rule__AttrAssList__Group_1__0__Impl rule__AttrAssList__Group_1__1 ;
    public final void rule__AttrAssList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2015:1: ( rule__AttrAssList__Group_1__0__Impl rule__AttrAssList__Group_1__1 )
            // InternalMGPL.g:2016:2: rule__AttrAssList__Group_1__0__Impl rule__AttrAssList__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AttrAssList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrAssList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__Group_1__0"


    // $ANTLR start "rule__AttrAssList__Group_1__0__Impl"
    // InternalMGPL.g:2023:1: rule__AttrAssList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttrAssList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2027:1: ( ( ',' ) )
            // InternalMGPL.g:2028:1: ( ',' )
            {
            // InternalMGPL.g:2028:1: ( ',' )
            // InternalMGPL.g:2029:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssListAccess().getCommaKeyword_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssListAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__Group_1__0__Impl"


    // $ANTLR start "rule__AttrAssList__Group_1__1"
    // InternalMGPL.g:2038:1: rule__AttrAssList__Group_1__1 : rule__AttrAssList__Group_1__1__Impl ;
    public final void rule__AttrAssList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2042:1: ( rule__AttrAssList__Group_1__1__Impl )
            // InternalMGPL.g:2043:2: rule__AttrAssList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrAssList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__Group_1__1"


    // $ANTLR start "rule__AttrAssList__Group_1__1__Impl"
    // InternalMGPL.g:2049:1: rule__AttrAssList__Group_1__1__Impl : ( ( rule__AttrAssList__AssignmentsAssignment_1_1 ) ) ;
    public final void rule__AttrAssList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2053:1: ( ( ( rule__AttrAssList__AssignmentsAssignment_1_1 ) ) )
            // InternalMGPL.g:2054:1: ( ( rule__AttrAssList__AssignmentsAssignment_1_1 ) )
            {
            // InternalMGPL.g:2054:1: ( ( rule__AttrAssList__AssignmentsAssignment_1_1 ) )
            // InternalMGPL.g:2055:2: ( rule__AttrAssList__AssignmentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssListAccess().getAssignmentsAssignment_1_1()); 
            }
            // InternalMGPL.g:2056:2: ( rule__AttrAssList__AssignmentsAssignment_1_1 )
            // InternalMGPL.g:2056:3: rule__AttrAssList__AssignmentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttrAssList__AssignmentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssListAccess().getAssignmentsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__Group_1__1__Impl"


    // $ANTLR start "rule__AttrAss__Group__0"
    // InternalMGPL.g:2065:1: rule__AttrAss__Group__0 : rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1 ;
    public final void rule__AttrAss__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2069:1: ( rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1 )
            // InternalMGPL.g:2070:2: rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AttrAss__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrAss__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAss__Group__0"


    // $ANTLR start "rule__AttrAss__Group__0__Impl"
    // InternalMGPL.g:2077:1: rule__AttrAss__Group__0__Impl : ( ( rule__AttrAss__AttributeNameAssignment_0 ) ) ;
    public final void rule__AttrAss__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2081:1: ( ( ( rule__AttrAss__AttributeNameAssignment_0 ) ) )
            // InternalMGPL.g:2082:1: ( ( rule__AttrAss__AttributeNameAssignment_0 ) )
            {
            // InternalMGPL.g:2082:1: ( ( rule__AttrAss__AttributeNameAssignment_0 ) )
            // InternalMGPL.g:2083:2: ( rule__AttrAss__AttributeNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssAccess().getAttributeNameAssignment_0()); 
            }
            // InternalMGPL.g:2084:2: ( rule__AttrAss__AttributeNameAssignment_0 )
            // InternalMGPL.g:2084:3: rule__AttrAss__AttributeNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttrAss__AttributeNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssAccess().getAttributeNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAss__Group__0__Impl"


    // $ANTLR start "rule__AttrAss__Group__1"
    // InternalMGPL.g:2092:1: rule__AttrAss__Group__1 : rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2 ;
    public final void rule__AttrAss__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2096:1: ( rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2 )
            // InternalMGPL.g:2097:2: rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AttrAss__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttrAss__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAss__Group__1"


    // $ANTLR start "rule__AttrAss__Group__1__Impl"
    // InternalMGPL.g:2104:1: rule__AttrAss__Group__1__Impl : ( '=' ) ;
    public final void rule__AttrAss__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2108:1: ( ( '=' ) )
            // InternalMGPL.g:2109:1: ( '=' )
            {
            // InternalMGPL.g:2109:1: ( '=' )
            // InternalMGPL.g:2110:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAss__Group__1__Impl"


    // $ANTLR start "rule__AttrAss__Group__2"
    // InternalMGPL.g:2119:1: rule__AttrAss__Group__2 : rule__AttrAss__Group__2__Impl ;
    public final void rule__AttrAss__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2123:1: ( rule__AttrAss__Group__2__Impl )
            // InternalMGPL.g:2124:2: rule__AttrAss__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrAss__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAss__Group__2"


    // $ANTLR start "rule__AttrAss__Group__2__Impl"
    // InternalMGPL.g:2130:1: rule__AttrAss__Group__2__Impl : ( ( rule__AttrAss__ValueAssignment_2 ) ) ;
    public final void rule__AttrAss__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2134:1: ( ( ( rule__AttrAss__ValueAssignment_2 ) ) )
            // InternalMGPL.g:2135:1: ( ( rule__AttrAss__ValueAssignment_2 ) )
            {
            // InternalMGPL.g:2135:1: ( ( rule__AttrAss__ValueAssignment_2 ) )
            // InternalMGPL.g:2136:2: ( rule__AttrAss__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssAccess().getValueAssignment_2()); 
            }
            // InternalMGPL.g:2137:2: ( rule__AttrAss__ValueAssignment_2 )
            // InternalMGPL.g:2137:3: rule__AttrAss__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttrAss__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAss__Group__2__Impl"


    // $ANTLR start "rule__AnimBlock__Group__0"
    // InternalMGPL.g:2146:1: rule__AnimBlock__Group__0 : rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1 ;
    public final void rule__AnimBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2150:1: ( rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1 )
            // InternalMGPL.g:2151:2: rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AnimBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnimBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__0"


    // $ANTLR start "rule__AnimBlock__Group__0__Impl"
    // InternalMGPL.g:2158:1: rule__AnimBlock__Group__0__Impl : ( 'animation' ) ;
    public final void rule__AnimBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2162:1: ( ( 'animation' ) )
            // InternalMGPL.g:2163:1: ( 'animation' )
            {
            // InternalMGPL.g:2163:1: ( 'animation' )
            // InternalMGPL.g:2164:2: 'animation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getAnimationKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getAnimationKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__0__Impl"


    // $ANTLR start "rule__AnimBlock__Group__1"
    // InternalMGPL.g:2173:1: rule__AnimBlock__Group__1 : rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2 ;
    public final void rule__AnimBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2177:1: ( rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2 )
            // InternalMGPL.g:2178:2: rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AnimBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnimBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__1"


    // $ANTLR start "rule__AnimBlock__Group__1__Impl"
    // InternalMGPL.g:2185:1: rule__AnimBlock__Group__1__Impl : ( ( rule__AnimBlock__NameAssignment_1 ) ) ;
    public final void rule__AnimBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2189:1: ( ( ( rule__AnimBlock__NameAssignment_1 ) ) )
            // InternalMGPL.g:2190:1: ( ( rule__AnimBlock__NameAssignment_1 ) )
            {
            // InternalMGPL.g:2190:1: ( ( rule__AnimBlock__NameAssignment_1 ) )
            // InternalMGPL.g:2191:2: ( rule__AnimBlock__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getNameAssignment_1()); 
            }
            // InternalMGPL.g:2192:2: ( rule__AnimBlock__NameAssignment_1 )
            // InternalMGPL.g:2192:3: rule__AnimBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnimBlock__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__1__Impl"


    // $ANTLR start "rule__AnimBlock__Group__2"
    // InternalMGPL.g:2200:1: rule__AnimBlock__Group__2 : rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3 ;
    public final void rule__AnimBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2204:1: ( rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3 )
            // InternalMGPL.g:2205:2: rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AnimBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnimBlock__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__2"


    // $ANTLR start "rule__AnimBlock__Group__2__Impl"
    // InternalMGPL.g:2212:1: rule__AnimBlock__Group__2__Impl : ( '(' ) ;
    public final void rule__AnimBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2216:1: ( ( '(' ) )
            // InternalMGPL.g:2217:1: ( '(' )
            {
            // InternalMGPL.g:2217:1: ( '(' )
            // InternalMGPL.g:2218:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__2__Impl"


    // $ANTLR start "rule__AnimBlock__Group__3"
    // InternalMGPL.g:2227:1: rule__AnimBlock__Group__3 : rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4 ;
    public final void rule__AnimBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2231:1: ( rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4 )
            // InternalMGPL.g:2232:2: rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__AnimBlock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnimBlock__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__3"


    // $ANTLR start "rule__AnimBlock__Group__3__Impl"
    // InternalMGPL.g:2239:1: rule__AnimBlock__Group__3__Impl : ( ( rule__AnimBlock__TargetAssignment_3 ) ) ;
    public final void rule__AnimBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2243:1: ( ( ( rule__AnimBlock__TargetAssignment_3 ) ) )
            // InternalMGPL.g:2244:1: ( ( rule__AnimBlock__TargetAssignment_3 ) )
            {
            // InternalMGPL.g:2244:1: ( ( rule__AnimBlock__TargetAssignment_3 ) )
            // InternalMGPL.g:2245:2: ( rule__AnimBlock__TargetAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getTargetAssignment_3()); 
            }
            // InternalMGPL.g:2246:2: ( rule__AnimBlock__TargetAssignment_3 )
            // InternalMGPL.g:2246:3: rule__AnimBlock__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AnimBlock__TargetAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getTargetAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__3__Impl"


    // $ANTLR start "rule__AnimBlock__Group__4"
    // InternalMGPL.g:2254:1: rule__AnimBlock__Group__4 : rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5 ;
    public final void rule__AnimBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2258:1: ( rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5 )
            // InternalMGPL.g:2259:2: rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__AnimBlock__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnimBlock__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__4"


    // $ANTLR start "rule__AnimBlock__Group__4__Impl"
    // InternalMGPL.g:2266:1: rule__AnimBlock__Group__4__Impl : ( ')' ) ;
    public final void rule__AnimBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2270:1: ( ( ')' ) )
            // InternalMGPL.g:2271:1: ( ')' )
            {
            // InternalMGPL.g:2271:1: ( ')' )
            // InternalMGPL.g:2272:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__4__Impl"


    // $ANTLR start "rule__AnimBlock__Group__5"
    // InternalMGPL.g:2281:1: rule__AnimBlock__Group__5 : rule__AnimBlock__Group__5__Impl ;
    public final void rule__AnimBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2285:1: ( rule__AnimBlock__Group__5__Impl )
            // InternalMGPL.g:2286:2: rule__AnimBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnimBlock__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__5"


    // $ANTLR start "rule__AnimBlock__Group__5__Impl"
    // InternalMGPL.g:2292:1: rule__AnimBlock__Group__5__Impl : ( ( rule__AnimBlock__ActionAssignment_5 ) ) ;
    public final void rule__AnimBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2296:1: ( ( ( rule__AnimBlock__ActionAssignment_5 ) ) )
            // InternalMGPL.g:2297:1: ( ( rule__AnimBlock__ActionAssignment_5 ) )
            {
            // InternalMGPL.g:2297:1: ( ( rule__AnimBlock__ActionAssignment_5 ) )
            // InternalMGPL.g:2298:2: ( rule__AnimBlock__ActionAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getActionAssignment_5()); 
            }
            // InternalMGPL.g:2299:2: ( rule__AnimBlock__ActionAssignment_5 )
            // InternalMGPL.g:2299:3: rule__AnimBlock__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AnimBlock__ActionAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getActionAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__Group__5__Impl"


    // $ANTLR start "rule__AnimTarget__Group__0"
    // InternalMGPL.g:2308:1: rule__AnimTarget__Group__0 : rule__AnimTarget__Group__0__Impl rule__AnimTarget__Group__1 ;
    public final void rule__AnimTarget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2312:1: ( rule__AnimTarget__Group__0__Impl rule__AnimTarget__Group__1 )
            // InternalMGPL.g:2313:2: rule__AnimTarget__Group__0__Impl rule__AnimTarget__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AnimTarget__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnimTarget__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimTarget__Group__0"


    // $ANTLR start "rule__AnimTarget__Group__0__Impl"
    // InternalMGPL.g:2320:1: rule__AnimTarget__Group__0__Impl : ( ( rule__AnimTarget__TypeAssignment_0 ) ) ;
    public final void rule__AnimTarget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2324:1: ( ( ( rule__AnimTarget__TypeAssignment_0 ) ) )
            // InternalMGPL.g:2325:1: ( ( rule__AnimTarget__TypeAssignment_0 ) )
            {
            // InternalMGPL.g:2325:1: ( ( rule__AnimTarget__TypeAssignment_0 ) )
            // InternalMGPL.g:2326:2: ( rule__AnimTarget__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimTargetAccess().getTypeAssignment_0()); 
            }
            // InternalMGPL.g:2327:2: ( rule__AnimTarget__TypeAssignment_0 )
            // InternalMGPL.g:2327:3: rule__AnimTarget__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AnimTarget__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimTargetAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimTarget__Group__0__Impl"


    // $ANTLR start "rule__AnimTarget__Group__1"
    // InternalMGPL.g:2335:1: rule__AnimTarget__Group__1 : rule__AnimTarget__Group__1__Impl ;
    public final void rule__AnimTarget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2339:1: ( rule__AnimTarget__Group__1__Impl )
            // InternalMGPL.g:2340:2: rule__AnimTarget__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnimTarget__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimTarget__Group__1"


    // $ANTLR start "rule__AnimTarget__Group__1__Impl"
    // InternalMGPL.g:2346:1: rule__AnimTarget__Group__1__Impl : ( ( rule__AnimTarget__NameAssignment_1 ) ) ;
    public final void rule__AnimTarget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2350:1: ( ( ( rule__AnimTarget__NameAssignment_1 ) ) )
            // InternalMGPL.g:2351:1: ( ( rule__AnimTarget__NameAssignment_1 ) )
            {
            // InternalMGPL.g:2351:1: ( ( rule__AnimTarget__NameAssignment_1 ) )
            // InternalMGPL.g:2352:2: ( rule__AnimTarget__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimTargetAccess().getNameAssignment_1()); 
            }
            // InternalMGPL.g:2353:2: ( rule__AnimTarget__NameAssignment_1 )
            // InternalMGPL.g:2353:3: rule__AnimTarget__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnimTarget__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimTargetAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimTarget__Group__1__Impl"


    // $ANTLR start "rule__EventBlock__Group__0"
    // InternalMGPL.g:2362:1: rule__EventBlock__Group__0 : rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1 ;
    public final void rule__EventBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2366:1: ( rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1 )
            // InternalMGPL.g:2367:2: rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EventBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBlock__Group__0"


    // $ANTLR start "rule__EventBlock__Group__0__Impl"
    // InternalMGPL.g:2374:1: rule__EventBlock__Group__0__Impl : ( 'on' ) ;
    public final void rule__EventBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2378:1: ( ( 'on' ) )
            // InternalMGPL.g:2379:1: ( 'on' )
            {
            // InternalMGPL.g:2379:1: ( 'on' )
            // InternalMGPL.g:2380:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventBlockAccess().getOnKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventBlockAccess().getOnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBlock__Group__0__Impl"


    // $ANTLR start "rule__EventBlock__Group__1"
    // InternalMGPL.g:2389:1: rule__EventBlock__Group__1 : rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2 ;
    public final void rule__EventBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2393:1: ( rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2 )
            // InternalMGPL.g:2394:2: rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EventBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBlock__Group__1"


    // $ANTLR start "rule__EventBlock__Group__1__Impl"
    // InternalMGPL.g:2401:1: rule__EventBlock__Group__1__Impl : ( ( rule__EventBlock__KeyAssignment_1 ) ) ;
    public final void rule__EventBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2405:1: ( ( ( rule__EventBlock__KeyAssignment_1 ) ) )
            // InternalMGPL.g:2406:1: ( ( rule__EventBlock__KeyAssignment_1 ) )
            {
            // InternalMGPL.g:2406:1: ( ( rule__EventBlock__KeyAssignment_1 ) )
            // InternalMGPL.g:2407:2: ( rule__EventBlock__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventBlockAccess().getKeyAssignment_1()); 
            }
            // InternalMGPL.g:2408:2: ( rule__EventBlock__KeyAssignment_1 )
            // InternalMGPL.g:2408:3: rule__EventBlock__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EventBlock__KeyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventBlockAccess().getKeyAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBlock__Group__1__Impl"


    // $ANTLR start "rule__EventBlock__Group__2"
    // InternalMGPL.g:2416:1: rule__EventBlock__Group__2 : rule__EventBlock__Group__2__Impl ;
    public final void rule__EventBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2420:1: ( rule__EventBlock__Group__2__Impl )
            // InternalMGPL.g:2421:2: rule__EventBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBlock__Group__2"


    // $ANTLR start "rule__EventBlock__Group__2__Impl"
    // InternalMGPL.g:2427:1: rule__EventBlock__Group__2__Impl : ( ( rule__EventBlock__ActionAssignment_2 ) ) ;
    public final void rule__EventBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2431:1: ( ( ( rule__EventBlock__ActionAssignment_2 ) ) )
            // InternalMGPL.g:2432:1: ( ( rule__EventBlock__ActionAssignment_2 ) )
            {
            // InternalMGPL.g:2432:1: ( ( rule__EventBlock__ActionAssignment_2 ) )
            // InternalMGPL.g:2433:2: ( rule__EventBlock__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventBlockAccess().getActionAssignment_2()); 
            }
            // InternalMGPL.g:2434:2: ( rule__EventBlock__ActionAssignment_2 )
            // InternalMGPL.g:2434:3: rule__EventBlock__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventBlock__ActionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventBlockAccess().getActionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBlock__Group__2__Impl"


    // $ANTLR start "rule__StmtBlock__Group__0"
    // InternalMGPL.g:2443:1: rule__StmtBlock__Group__0 : rule__StmtBlock__Group__0__Impl rule__StmtBlock__Group__1 ;
    public final void rule__StmtBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2447:1: ( rule__StmtBlock__Group__0__Impl rule__StmtBlock__Group__1 )
            // InternalMGPL.g:2448:2: rule__StmtBlock__Group__0__Impl rule__StmtBlock__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__StmtBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StmtBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__Group__0"


    // $ANTLR start "rule__StmtBlock__Group__0__Impl"
    // InternalMGPL.g:2455:1: rule__StmtBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__StmtBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2459:1: ( ( '{' ) )
            // InternalMGPL.g:2460:1: ( '{' )
            {
            // InternalMGPL.g:2460:1: ( '{' )
            // InternalMGPL.g:2461:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtBlockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtBlockAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__Group__0__Impl"


    // $ANTLR start "rule__StmtBlock__Group__1"
    // InternalMGPL.g:2470:1: rule__StmtBlock__Group__1 : rule__StmtBlock__Group__1__Impl rule__StmtBlock__Group__2 ;
    public final void rule__StmtBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2474:1: ( rule__StmtBlock__Group__1__Impl rule__StmtBlock__Group__2 )
            // InternalMGPL.g:2475:2: rule__StmtBlock__Group__1__Impl rule__StmtBlock__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__StmtBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StmtBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__Group__1"


    // $ANTLR start "rule__StmtBlock__Group__1__Impl"
    // InternalMGPL.g:2482:1: rule__StmtBlock__Group__1__Impl : ( () ) ;
    public final void rule__StmtBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2486:1: ( ( () ) )
            // InternalMGPL.g:2487:1: ( () )
            {
            // InternalMGPL.g:2487:1: ( () )
            // InternalMGPL.g:2488:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtBlockAccess().getStmtBlockAction_1()); 
            }
            // InternalMGPL.g:2489:2: ()
            // InternalMGPL.g:2489:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtBlockAccess().getStmtBlockAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__Group__1__Impl"


    // $ANTLR start "rule__StmtBlock__Group__2"
    // InternalMGPL.g:2497:1: rule__StmtBlock__Group__2 : rule__StmtBlock__Group__2__Impl rule__StmtBlock__Group__3 ;
    public final void rule__StmtBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2501:1: ( rule__StmtBlock__Group__2__Impl rule__StmtBlock__Group__3 )
            // InternalMGPL.g:2502:2: rule__StmtBlock__Group__2__Impl rule__StmtBlock__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__StmtBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StmtBlock__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__Group__2"


    // $ANTLR start "rule__StmtBlock__Group__2__Impl"
    // InternalMGPL.g:2509:1: rule__StmtBlock__Group__2__Impl : ( ( rule__StmtBlock__StatementsAssignment_2 )* ) ;
    public final void rule__StmtBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2513:1: ( ( ( rule__StmtBlock__StatementsAssignment_2 )* ) )
            // InternalMGPL.g:2514:1: ( ( rule__StmtBlock__StatementsAssignment_2 )* )
            {
            // InternalMGPL.g:2514:1: ( ( rule__StmtBlock__StatementsAssignment_2 )* )
            // InternalMGPL.g:2515:2: ( rule__StmtBlock__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtBlockAccess().getStatementsAssignment_2()); 
            }
            // InternalMGPL.g:2516:2: ( rule__StmtBlock__StatementsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_IDF||LA19_0==41||LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMGPL.g:2516:3: rule__StmtBlock__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__StmtBlock__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtBlockAccess().getStatementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__Group__2__Impl"


    // $ANTLR start "rule__StmtBlock__Group__3"
    // InternalMGPL.g:2524:1: rule__StmtBlock__Group__3 : rule__StmtBlock__Group__3__Impl ;
    public final void rule__StmtBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2528:1: ( rule__StmtBlock__Group__3__Impl )
            // InternalMGPL.g:2529:2: rule__StmtBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StmtBlock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__Group__3"


    // $ANTLR start "rule__StmtBlock__Group__3__Impl"
    // InternalMGPL.g:2535:1: rule__StmtBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__StmtBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2539:1: ( ( '}' ) )
            // InternalMGPL.g:2540:1: ( '}' )
            {
            // InternalMGPL.g:2540:1: ( '}' )
            // InternalMGPL.g:2541:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtBlockAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__Group__3__Impl"


    // $ANTLR start "rule__IfStmt__Group__0"
    // InternalMGPL.g:2551:1: rule__IfStmt__Group__0 : rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1 ;
    public final void rule__IfStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2555:1: ( rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1 )
            // InternalMGPL.g:2556:2: rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__IfStmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__0"


    // $ANTLR start "rule__IfStmt__Group__0__Impl"
    // InternalMGPL.g:2563:1: rule__IfStmt__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2567:1: ( ( 'if' ) )
            // InternalMGPL.g:2568:1: ( 'if' )
            {
            // InternalMGPL.g:2568:1: ( 'if' )
            // InternalMGPL.g:2569:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getIfKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__0__Impl"


    // $ANTLR start "rule__IfStmt__Group__1"
    // InternalMGPL.g:2578:1: rule__IfStmt__Group__1 : rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2 ;
    public final void rule__IfStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2582:1: ( rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2 )
            // InternalMGPL.g:2583:2: rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__IfStmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__1"


    // $ANTLR start "rule__IfStmt__Group__1__Impl"
    // InternalMGPL.g:2590:1: rule__IfStmt__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2594:1: ( ( '(' ) )
            // InternalMGPL.g:2595:1: ( '(' )
            {
            // InternalMGPL.g:2595:1: ( '(' )
            // InternalMGPL.g:2596:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__1__Impl"


    // $ANTLR start "rule__IfStmt__Group__2"
    // InternalMGPL.g:2605:1: rule__IfStmt__Group__2 : rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3 ;
    public final void rule__IfStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2609:1: ( rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3 )
            // InternalMGPL.g:2610:2: rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__IfStmt__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__2"


    // $ANTLR start "rule__IfStmt__Group__2__Impl"
    // InternalMGPL.g:2617:1: rule__IfStmt__Group__2__Impl : ( ( rule__IfStmt__ConditionAssignment_2 ) ) ;
    public final void rule__IfStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2621:1: ( ( ( rule__IfStmt__ConditionAssignment_2 ) ) )
            // InternalMGPL.g:2622:1: ( ( rule__IfStmt__ConditionAssignment_2 ) )
            {
            // InternalMGPL.g:2622:1: ( ( rule__IfStmt__ConditionAssignment_2 ) )
            // InternalMGPL.g:2623:2: ( rule__IfStmt__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getConditionAssignment_2()); 
            }
            // InternalMGPL.g:2624:2: ( rule__IfStmt__ConditionAssignment_2 )
            // InternalMGPL.g:2624:3: rule__IfStmt__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getConditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__2__Impl"


    // $ANTLR start "rule__IfStmt__Group__3"
    // InternalMGPL.g:2632:1: rule__IfStmt__Group__3 : rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4 ;
    public final void rule__IfStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2636:1: ( rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4 )
            // InternalMGPL.g:2637:2: rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__IfStmt__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__3"


    // $ANTLR start "rule__IfStmt__Group__3__Impl"
    // InternalMGPL.g:2644:1: rule__IfStmt__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2648:1: ( ( ')' ) )
            // InternalMGPL.g:2649:1: ( ')' )
            {
            // InternalMGPL.g:2649:1: ( ')' )
            // InternalMGPL.g:2650:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__3__Impl"


    // $ANTLR start "rule__IfStmt__Group__4"
    // InternalMGPL.g:2659:1: rule__IfStmt__Group__4 : rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5 ;
    public final void rule__IfStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2663:1: ( rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5 )
            // InternalMGPL.g:2664:2: rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__IfStmt__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__4"


    // $ANTLR start "rule__IfStmt__Group__4__Impl"
    // InternalMGPL.g:2671:1: rule__IfStmt__Group__4__Impl : ( ( rule__IfStmt__ThenAssignment_4 ) ) ;
    public final void rule__IfStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2675:1: ( ( ( rule__IfStmt__ThenAssignment_4 ) ) )
            // InternalMGPL.g:2676:1: ( ( rule__IfStmt__ThenAssignment_4 ) )
            {
            // InternalMGPL.g:2676:1: ( ( rule__IfStmt__ThenAssignment_4 ) )
            // InternalMGPL.g:2677:2: ( rule__IfStmt__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getThenAssignment_4()); 
            }
            // InternalMGPL.g:2678:2: ( rule__IfStmt__ThenAssignment_4 )
            // InternalMGPL.g:2678:3: rule__IfStmt__ThenAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__ThenAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getThenAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__4__Impl"


    // $ANTLR start "rule__IfStmt__Group__5"
    // InternalMGPL.g:2686:1: rule__IfStmt__Group__5 : rule__IfStmt__Group__5__Impl ;
    public final void rule__IfStmt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2690:1: ( rule__IfStmt__Group__5__Impl )
            // InternalMGPL.g:2691:2: rule__IfStmt__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__5"


    // $ANTLR start "rule__IfStmt__Group__5__Impl"
    // InternalMGPL.g:2697:1: rule__IfStmt__Group__5__Impl : ( ( rule__IfStmt__Group_5__0 )? ) ;
    public final void rule__IfStmt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2701:1: ( ( ( rule__IfStmt__Group_5__0 )? ) )
            // InternalMGPL.g:2702:1: ( ( rule__IfStmt__Group_5__0 )? )
            {
            // InternalMGPL.g:2702:1: ( ( rule__IfStmt__Group_5__0 )? )
            // InternalMGPL.g:2703:2: ( rule__IfStmt__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getGroup_5()); 
            }
            // InternalMGPL.g:2704:2: ( rule__IfStmt__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMGPL.g:2704:3: rule__IfStmt__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStmt__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group__5__Impl"


    // $ANTLR start "rule__IfStmt__Group_5__0"
    // InternalMGPL.g:2713:1: rule__IfStmt__Group_5__0 : rule__IfStmt__Group_5__0__Impl rule__IfStmt__Group_5__1 ;
    public final void rule__IfStmt__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2717:1: ( rule__IfStmt__Group_5__0__Impl rule__IfStmt__Group_5__1 )
            // InternalMGPL.g:2718:2: rule__IfStmt__Group_5__0__Impl rule__IfStmt__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__IfStmt__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group_5__0"


    // $ANTLR start "rule__IfStmt__Group_5__0__Impl"
    // InternalMGPL.g:2725:1: rule__IfStmt__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__IfStmt__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2729:1: ( ( ( 'else' ) ) )
            // InternalMGPL.g:2730:1: ( ( 'else' ) )
            {
            // InternalMGPL.g:2730:1: ( ( 'else' ) )
            // InternalMGPL.g:2731:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getElseKeyword_5_0()); 
            }
            // InternalMGPL.g:2732:2: ( 'else' )
            // InternalMGPL.g:2732:3: 'else'
            {
            match(input,42,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getElseKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group_5__0__Impl"


    // $ANTLR start "rule__IfStmt__Group_5__1"
    // InternalMGPL.g:2740:1: rule__IfStmt__Group_5__1 : rule__IfStmt__Group_5__1__Impl ;
    public final void rule__IfStmt__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2744:1: ( rule__IfStmt__Group_5__1__Impl )
            // InternalMGPL.g:2745:2: rule__IfStmt__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group_5__1"


    // $ANTLR start "rule__IfStmt__Group_5__1__Impl"
    // InternalMGPL.g:2751:1: rule__IfStmt__Group_5__1__Impl : ( ( rule__IfStmt__ElseAssignment_5_1 ) ) ;
    public final void rule__IfStmt__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2755:1: ( ( ( rule__IfStmt__ElseAssignment_5_1 ) ) )
            // InternalMGPL.g:2756:1: ( ( rule__IfStmt__ElseAssignment_5_1 ) )
            {
            // InternalMGPL.g:2756:1: ( ( rule__IfStmt__ElseAssignment_5_1 ) )
            // InternalMGPL.g:2757:2: ( rule__IfStmt__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getElseAssignment_5_1()); 
            }
            // InternalMGPL.g:2758:2: ( rule__IfStmt__ElseAssignment_5_1 )
            // InternalMGPL.g:2758:3: rule__IfStmt__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStmt__ElseAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getElseAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__Group_5__1__Impl"


    // $ANTLR start "rule__ForStmt__Group__0"
    // InternalMGPL.g:2767:1: rule__ForStmt__Group__0 : rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1 ;
    public final void rule__ForStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2771:1: ( rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1 )
            // InternalMGPL.g:2772:2: rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ForStmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__0"


    // $ANTLR start "rule__ForStmt__Group__0__Impl"
    // InternalMGPL.g:2779:1: rule__ForStmt__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2783:1: ( ( 'for' ) )
            // InternalMGPL.g:2784:1: ( 'for' )
            {
            // InternalMGPL.g:2784:1: ( 'for' )
            // InternalMGPL.g:2785:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getForKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__0__Impl"


    // $ANTLR start "rule__ForStmt__Group__1"
    // InternalMGPL.g:2794:1: rule__ForStmt__Group__1 : rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2 ;
    public final void rule__ForStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2798:1: ( rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2 )
            // InternalMGPL.g:2799:2: rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ForStmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__1"


    // $ANTLR start "rule__ForStmt__Group__1__Impl"
    // InternalMGPL.g:2806:1: rule__ForStmt__Group__1__Impl : ( '(' ) ;
    public final void rule__ForStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2810:1: ( ( '(' ) )
            // InternalMGPL.g:2811:1: ( '(' )
            {
            // InternalMGPL.g:2811:1: ( '(' )
            // InternalMGPL.g:2812:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__1__Impl"


    // $ANTLR start "rule__ForStmt__Group__2"
    // InternalMGPL.g:2821:1: rule__ForStmt__Group__2 : rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3 ;
    public final void rule__ForStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2825:1: ( rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3 )
            // InternalMGPL.g:2826:2: rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ForStmt__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__2"


    // $ANTLR start "rule__ForStmt__Group__2__Impl"
    // InternalMGPL.g:2833:1: rule__ForStmt__Group__2__Impl : ( ( rule__ForStmt__InitAssignment_2 ) ) ;
    public final void rule__ForStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2837:1: ( ( ( rule__ForStmt__InitAssignment_2 ) ) )
            // InternalMGPL.g:2838:1: ( ( rule__ForStmt__InitAssignment_2 ) )
            {
            // InternalMGPL.g:2838:1: ( ( rule__ForStmt__InitAssignment_2 ) )
            // InternalMGPL.g:2839:2: ( rule__ForStmt__InitAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getInitAssignment_2()); 
            }
            // InternalMGPL.g:2840:2: ( rule__ForStmt__InitAssignment_2 )
            // InternalMGPL.g:2840:3: rule__ForStmt__InitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForStmt__InitAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getInitAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__2__Impl"


    // $ANTLR start "rule__ForStmt__Group__3"
    // InternalMGPL.g:2848:1: rule__ForStmt__Group__3 : rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4 ;
    public final void rule__ForStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2852:1: ( rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4 )
            // InternalMGPL.g:2853:2: rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ForStmt__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__3"


    // $ANTLR start "rule__ForStmt__Group__3__Impl"
    // InternalMGPL.g:2860:1: rule__ForStmt__Group__3__Impl : ( ';' ) ;
    public final void rule__ForStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2864:1: ( ( ';' ) )
            // InternalMGPL.g:2865:1: ( ';' )
            {
            // InternalMGPL.g:2865:1: ( ';' )
            // InternalMGPL.g:2866:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getSemicolonKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__3__Impl"


    // $ANTLR start "rule__ForStmt__Group__4"
    // InternalMGPL.g:2875:1: rule__ForStmt__Group__4 : rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5 ;
    public final void rule__ForStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2879:1: ( rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5 )
            // InternalMGPL.g:2880:2: rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ForStmt__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__4"


    // $ANTLR start "rule__ForStmt__Group__4__Impl"
    // InternalMGPL.g:2887:1: rule__ForStmt__Group__4__Impl : ( ( rule__ForStmt__ConditionAssignment_4 ) ) ;
    public final void rule__ForStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2891:1: ( ( ( rule__ForStmt__ConditionAssignment_4 ) ) )
            // InternalMGPL.g:2892:1: ( ( rule__ForStmt__ConditionAssignment_4 ) )
            {
            // InternalMGPL.g:2892:1: ( ( rule__ForStmt__ConditionAssignment_4 ) )
            // InternalMGPL.g:2893:2: ( rule__ForStmt__ConditionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getConditionAssignment_4()); 
            }
            // InternalMGPL.g:2894:2: ( rule__ForStmt__ConditionAssignment_4 )
            // InternalMGPL.g:2894:3: rule__ForStmt__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForStmt__ConditionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getConditionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__4__Impl"


    // $ANTLR start "rule__ForStmt__Group__5"
    // InternalMGPL.g:2902:1: rule__ForStmt__Group__5 : rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6 ;
    public final void rule__ForStmt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2906:1: ( rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6 )
            // InternalMGPL.g:2907:2: rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ForStmt__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__5"


    // $ANTLR start "rule__ForStmt__Group__5__Impl"
    // InternalMGPL.g:2914:1: rule__ForStmt__Group__5__Impl : ( ';' ) ;
    public final void rule__ForStmt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2918:1: ( ( ';' ) )
            // InternalMGPL.g:2919:1: ( ';' )
            {
            // InternalMGPL.g:2919:1: ( ';' )
            // InternalMGPL.g:2920:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getSemicolonKeyword_5()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__5__Impl"


    // $ANTLR start "rule__ForStmt__Group__6"
    // InternalMGPL.g:2929:1: rule__ForStmt__Group__6 : rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7 ;
    public final void rule__ForStmt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2933:1: ( rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7 )
            // InternalMGPL.g:2934:2: rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__ForStmt__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__6"


    // $ANTLR start "rule__ForStmt__Group__6__Impl"
    // InternalMGPL.g:2941:1: rule__ForStmt__Group__6__Impl : ( ( rule__ForStmt__StepAssignment_6 ) ) ;
    public final void rule__ForStmt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2945:1: ( ( ( rule__ForStmt__StepAssignment_6 ) ) )
            // InternalMGPL.g:2946:1: ( ( rule__ForStmt__StepAssignment_6 ) )
            {
            // InternalMGPL.g:2946:1: ( ( rule__ForStmt__StepAssignment_6 ) )
            // InternalMGPL.g:2947:2: ( rule__ForStmt__StepAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getStepAssignment_6()); 
            }
            // InternalMGPL.g:2948:2: ( rule__ForStmt__StepAssignment_6 )
            // InternalMGPL.g:2948:3: rule__ForStmt__StepAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForStmt__StepAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getStepAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__6__Impl"


    // $ANTLR start "rule__ForStmt__Group__7"
    // InternalMGPL.g:2956:1: rule__ForStmt__Group__7 : rule__ForStmt__Group__7__Impl rule__ForStmt__Group__8 ;
    public final void rule__ForStmt__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2960:1: ( rule__ForStmt__Group__7__Impl rule__ForStmt__Group__8 )
            // InternalMGPL.g:2961:2: rule__ForStmt__Group__7__Impl rule__ForStmt__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ForStmt__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__7"


    // $ANTLR start "rule__ForStmt__Group__7__Impl"
    // InternalMGPL.g:2968:1: rule__ForStmt__Group__7__Impl : ( ')' ) ;
    public final void rule__ForStmt__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2972:1: ( ( ')' ) )
            // InternalMGPL.g:2973:1: ( ')' )
            {
            // InternalMGPL.g:2973:1: ( ')' )
            // InternalMGPL.g:2974:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__7__Impl"


    // $ANTLR start "rule__ForStmt__Group__8"
    // InternalMGPL.g:2983:1: rule__ForStmt__Group__8 : rule__ForStmt__Group__8__Impl ;
    public final void rule__ForStmt__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2987:1: ( rule__ForStmt__Group__8__Impl )
            // InternalMGPL.g:2988:2: rule__ForStmt__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForStmt__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__8"


    // $ANTLR start "rule__ForStmt__Group__8__Impl"
    // InternalMGPL.g:2994:1: rule__ForStmt__Group__8__Impl : ( ( rule__ForStmt__BodyAssignment_8 ) ) ;
    public final void rule__ForStmt__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:2998:1: ( ( ( rule__ForStmt__BodyAssignment_8 ) ) )
            // InternalMGPL.g:2999:1: ( ( rule__ForStmt__BodyAssignment_8 ) )
            {
            // InternalMGPL.g:2999:1: ( ( rule__ForStmt__BodyAssignment_8 ) )
            // InternalMGPL.g:3000:2: ( rule__ForStmt__BodyAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getBodyAssignment_8()); 
            }
            // InternalMGPL.g:3001:2: ( rule__ForStmt__BodyAssignment_8 )
            // InternalMGPL.g:3001:3: rule__ForStmt__BodyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ForStmt__BodyAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getBodyAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__Group__8__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMGPL.g:3010:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3014:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGPL.g:3015:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalMGPL.g:3022:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3026:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalMGPL.g:3027:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalMGPL.g:3027:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalMGPL.g:3028:2: ( rule__Assignment__VarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            }
            // InternalMGPL.g:3029:2: ( rule__Assignment__VarAssignment_0 )
            // InternalMGPL.g:3029:3: rule__Assignment__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalMGPL.g:3037:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3041:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGPL.g:3042:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalMGPL.g:3049:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3053:1: ( ( '=' ) )
            // InternalMGPL.g:3054:1: ( '=' )
            {
            // InternalMGPL.g:3054:1: ( '=' )
            // InternalMGPL.g:3055:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalMGPL.g:3064:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3068:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGPL.g:3069:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalMGPL.g:3075:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3079:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGPL.g:3080:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGPL.g:3080:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGPL.g:3081:2: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // InternalMGPL.g:3082:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGPL.g:3082:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__AssStmt__Group__0"
    // InternalMGPL.g:3091:1: rule__AssStmt__Group__0 : rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1 ;
    public final void rule__AssStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3095:1: ( rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1 )
            // InternalMGPL.g:3096:2: rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AssStmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssStmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssStmt__Group__0"


    // $ANTLR start "rule__AssStmt__Group__0__Impl"
    // InternalMGPL.g:3103:1: rule__AssStmt__Group__0__Impl : ( ruleAssignment ) ;
    public final void rule__AssStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3107:1: ( ( ruleAssignment ) )
            // InternalMGPL.g:3108:1: ( ruleAssignment )
            {
            // InternalMGPL.g:3108:1: ( ruleAssignment )
            // InternalMGPL.g:3109:2: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssStmtAccess().getAssignmentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssStmtAccess().getAssignmentParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssStmt__Group__0__Impl"


    // $ANTLR start "rule__AssStmt__Group__1"
    // InternalMGPL.g:3118:1: rule__AssStmt__Group__1 : rule__AssStmt__Group__1__Impl ;
    public final void rule__AssStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3122:1: ( rule__AssStmt__Group__1__Impl )
            // InternalMGPL.g:3123:2: rule__AssStmt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssStmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssStmt__Group__1"


    // $ANTLR start "rule__AssStmt__Group__1__Impl"
    // InternalMGPL.g:3129:1: rule__AssStmt__Group__1__Impl : ( ';' ) ;
    public final void rule__AssStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3133:1: ( ( ';' ) )
            // InternalMGPL.g:3134:1: ( ';' )
            {
            // InternalMGPL.g:3134:1: ( ';' )
            // InternalMGPL.g:3135:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssStmtAccess().getSemicolonKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssStmtAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssStmt__Group__1__Impl"


    // $ANTLR start "rule__Var__Group_1__0"
    // InternalMGPL.g:3145:1: rule__Var__Group_1__0 : rule__Var__Group_1__0__Impl rule__Var__Group_1__1 ;
    public final void rule__Var__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3149:1: ( rule__Var__Group_1__0__Impl rule__Var__Group_1__1 )
            // InternalMGPL.g:3150:2: rule__Var__Group_1__0__Impl rule__Var__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Var__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__0"


    // $ANTLR start "rule__Var__Group_1__0__Impl"
    // InternalMGPL.g:3157:1: rule__Var__Group_1__0__Impl : ( ( rule__Var__VariableAssignment_1_0 ) ) ;
    public final void rule__Var__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3161:1: ( ( ( rule__Var__VariableAssignment_1_0 ) ) )
            // InternalMGPL.g:3162:1: ( ( rule__Var__VariableAssignment_1_0 ) )
            {
            // InternalMGPL.g:3162:1: ( ( rule__Var__VariableAssignment_1_0 ) )
            // InternalMGPL.g:3163:2: ( rule__Var__VariableAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVariableAssignment_1_0()); 
            }
            // InternalMGPL.g:3164:2: ( rule__Var__VariableAssignment_1_0 )
            // InternalMGPL.g:3164:3: rule__Var__VariableAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Var__VariableAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVariableAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__0__Impl"


    // $ANTLR start "rule__Var__Group_1__1"
    // InternalMGPL.g:3172:1: rule__Var__Group_1__1 : rule__Var__Group_1__1__Impl rule__Var__Group_1__2 ;
    public final void rule__Var__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3176:1: ( rule__Var__Group_1__1__Impl rule__Var__Group_1__2 )
            // InternalMGPL.g:3177:2: rule__Var__Group_1__1__Impl rule__Var__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Var__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__1"


    // $ANTLR start "rule__Var__Group_1__1__Impl"
    // InternalMGPL.g:3184:1: rule__Var__Group_1__1__Impl : ( ( '[' ) ) ;
    public final void rule__Var__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3188:1: ( ( ( '[' ) ) )
            // InternalMGPL.g:3189:1: ( ( '[' ) )
            {
            // InternalMGPL.g:3189:1: ( ( '[' ) )
            // InternalMGPL.g:3190:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_1()); 
            }
            // InternalMGPL.g:3191:2: ( '[' )
            // InternalMGPL.g:3191:3: '['
            {
            match(input,34,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__1__Impl"


    // $ANTLR start "rule__Var__Group_1__2"
    // InternalMGPL.g:3199:1: rule__Var__Group_1__2 : rule__Var__Group_1__2__Impl rule__Var__Group_1__3 ;
    public final void rule__Var__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3203:1: ( rule__Var__Group_1__2__Impl rule__Var__Group_1__3 )
            // InternalMGPL.g:3204:2: rule__Var__Group_1__2__Impl rule__Var__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Var__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__2"


    // $ANTLR start "rule__Var__Group_1__2__Impl"
    // InternalMGPL.g:3211:1: rule__Var__Group_1__2__Impl : ( ( rule__Var__IndexAssignment_1_2 ) ) ;
    public final void rule__Var__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3215:1: ( ( ( rule__Var__IndexAssignment_1_2 ) ) )
            // InternalMGPL.g:3216:1: ( ( rule__Var__IndexAssignment_1_2 ) )
            {
            // InternalMGPL.g:3216:1: ( ( rule__Var__IndexAssignment_1_2 ) )
            // InternalMGPL.g:3217:2: ( rule__Var__IndexAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getIndexAssignment_1_2()); 
            }
            // InternalMGPL.g:3218:2: ( rule__Var__IndexAssignment_1_2 )
            // InternalMGPL.g:3218:3: rule__Var__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var__IndexAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getIndexAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__2__Impl"


    // $ANTLR start "rule__Var__Group_1__3"
    // InternalMGPL.g:3226:1: rule__Var__Group_1__3 : rule__Var__Group_1__3__Impl rule__Var__Group_1__4 ;
    public final void rule__Var__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3230:1: ( rule__Var__Group_1__3__Impl rule__Var__Group_1__4 )
            // InternalMGPL.g:3231:2: rule__Var__Group_1__3__Impl rule__Var__Group_1__4
            {
            pushFollow(FOLLOW_25);
            rule__Var__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__3"


    // $ANTLR start "rule__Var__Group_1__3__Impl"
    // InternalMGPL.g:3238:1: rule__Var__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Var__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3242:1: ( ( ']' ) )
            // InternalMGPL.g:3243:1: ( ']' )
            {
            // InternalMGPL.g:3243:1: ( ']' )
            // InternalMGPL.g:3244:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__3__Impl"


    // $ANTLR start "rule__Var__Group_1__4"
    // InternalMGPL.g:3253:1: rule__Var__Group_1__4 : rule__Var__Group_1__4__Impl ;
    public final void rule__Var__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3257:1: ( rule__Var__Group_1__4__Impl )
            // InternalMGPL.g:3258:2: rule__Var__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__4"


    // $ANTLR start "rule__Var__Group_1__4__Impl"
    // InternalMGPL.g:3264:1: rule__Var__Group_1__4__Impl : ( ( rule__Var__Group_1_4__0 )? ) ;
    public final void rule__Var__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3268:1: ( ( ( rule__Var__Group_1_4__0 )? ) )
            // InternalMGPL.g:3269:1: ( ( rule__Var__Group_1_4__0 )? )
            {
            // InternalMGPL.g:3269:1: ( ( rule__Var__Group_1_4__0 )? )
            // InternalMGPL.g:3270:2: ( rule__Var__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getGroup_1_4()); 
            }
            // InternalMGPL.g:3271:2: ( rule__Var__Group_1_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMGPL.g:3271:3: rule__Var__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getGroup_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__4__Impl"


    // $ANTLR start "rule__Var__Group_1_4__0"
    // InternalMGPL.g:3280:1: rule__Var__Group_1_4__0 : rule__Var__Group_1_4__0__Impl rule__Var__Group_1_4__1 ;
    public final void rule__Var__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3284:1: ( rule__Var__Group_1_4__0__Impl rule__Var__Group_1_4__1 )
            // InternalMGPL.g:3285:2: rule__Var__Group_1_4__0__Impl rule__Var__Group_1_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Var__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1_4__0"


    // $ANTLR start "rule__Var__Group_1_4__0__Impl"
    // InternalMGPL.g:3292:1: rule__Var__Group_1_4__0__Impl : ( '.' ) ;
    public final void rule__Var__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3296:1: ( ( '.' ) )
            // InternalMGPL.g:3297:1: ( '.' )
            {
            // InternalMGPL.g:3297:1: ( '.' )
            // InternalMGPL.g:3298:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getFullStopKeyword_1_4_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getFullStopKeyword_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1_4__0__Impl"


    // $ANTLR start "rule__Var__Group_1_4__1"
    // InternalMGPL.g:3307:1: rule__Var__Group_1_4__1 : rule__Var__Group_1_4__1__Impl ;
    public final void rule__Var__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3311:1: ( rule__Var__Group_1_4__1__Impl )
            // InternalMGPL.g:3312:2: rule__Var__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1_4__1"


    // $ANTLR start "rule__Var__Group_1_4__1__Impl"
    // InternalMGPL.g:3318:1: rule__Var__Group_1_4__1__Impl : ( ( rule__Var__AttributeAssignment_1_4_1 ) ) ;
    public final void rule__Var__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3322:1: ( ( ( rule__Var__AttributeAssignment_1_4_1 ) ) )
            // InternalMGPL.g:3323:1: ( ( rule__Var__AttributeAssignment_1_4_1 ) )
            {
            // InternalMGPL.g:3323:1: ( ( rule__Var__AttributeAssignment_1_4_1 ) )
            // InternalMGPL.g:3324:2: ( rule__Var__AttributeAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAttributeAssignment_1_4_1()); 
            }
            // InternalMGPL.g:3325:2: ( rule__Var__AttributeAssignment_1_4_1 )
            // InternalMGPL.g:3325:3: rule__Var__AttributeAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Var__AttributeAssignment_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getAttributeAssignment_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1_4__1__Impl"


    // $ANTLR start "rule__Var__Group_2__0"
    // InternalMGPL.g:3334:1: rule__Var__Group_2__0 : rule__Var__Group_2__0__Impl rule__Var__Group_2__1 ;
    public final void rule__Var__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3338:1: ( rule__Var__Group_2__0__Impl rule__Var__Group_2__1 )
            // InternalMGPL.g:3339:2: rule__Var__Group_2__0__Impl rule__Var__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__Var__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__0"


    // $ANTLR start "rule__Var__Group_2__0__Impl"
    // InternalMGPL.g:3346:1: rule__Var__Group_2__0__Impl : ( ( rule__Var__VariableAssignment_2_0 ) ) ;
    public final void rule__Var__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3350:1: ( ( ( rule__Var__VariableAssignment_2_0 ) ) )
            // InternalMGPL.g:3351:1: ( ( rule__Var__VariableAssignment_2_0 ) )
            {
            // InternalMGPL.g:3351:1: ( ( rule__Var__VariableAssignment_2_0 ) )
            // InternalMGPL.g:3352:2: ( rule__Var__VariableAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVariableAssignment_2_0()); 
            }
            // InternalMGPL.g:3353:2: ( rule__Var__VariableAssignment_2_0 )
            // InternalMGPL.g:3353:3: rule__Var__VariableAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Var__VariableAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVariableAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__0__Impl"


    // $ANTLR start "rule__Var__Group_2__1"
    // InternalMGPL.g:3361:1: rule__Var__Group_2__1 : rule__Var__Group_2__1__Impl rule__Var__Group_2__2 ;
    public final void rule__Var__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3365:1: ( rule__Var__Group_2__1__Impl rule__Var__Group_2__2 )
            // InternalMGPL.g:3366:2: rule__Var__Group_2__1__Impl rule__Var__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Var__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__1"


    // $ANTLR start "rule__Var__Group_2__1__Impl"
    // InternalMGPL.g:3373:1: rule__Var__Group_2__1__Impl : ( ( '.' ) ) ;
    public final void rule__Var__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3377:1: ( ( ( '.' ) ) )
            // InternalMGPL.g:3378:1: ( ( '.' ) )
            {
            // InternalMGPL.g:3378:1: ( ( '.' ) )
            // InternalMGPL.g:3379:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getFullStopKeyword_2_1()); 
            }
            // InternalMGPL.g:3380:2: ( '.' )
            // InternalMGPL.g:3380:3: '.'
            {
            match(input,44,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getFullStopKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__1__Impl"


    // $ANTLR start "rule__Var__Group_2__2"
    // InternalMGPL.g:3388:1: rule__Var__Group_2__2 : rule__Var__Group_2__2__Impl ;
    public final void rule__Var__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3392:1: ( rule__Var__Group_2__2__Impl )
            // InternalMGPL.g:3393:2: rule__Var__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__2"


    // $ANTLR start "rule__Var__Group_2__2__Impl"
    // InternalMGPL.g:3399:1: rule__Var__Group_2__2__Impl : ( ( rule__Var__AttributeAssignment_2_2 ) ) ;
    public final void rule__Var__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3403:1: ( ( ( rule__Var__AttributeAssignment_2_2 ) ) )
            // InternalMGPL.g:3404:1: ( ( rule__Var__AttributeAssignment_2_2 ) )
            {
            // InternalMGPL.g:3404:1: ( ( rule__Var__AttributeAssignment_2_2 ) )
            // InternalMGPL.g:3405:2: ( rule__Var__AttributeAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAttributeAssignment_2_2()); 
            }
            // InternalMGPL.g:3406:2: ( rule__Var__AttributeAssignment_2_2 )
            // InternalMGPL.g:3406:3: rule__Var__AttributeAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Var__AttributeAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getAttributeAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__2__Impl"


    // $ANTLR start "rule__OrExpr__Group__0"
    // InternalMGPL.g:3415:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3419:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // InternalMGPL.g:3420:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__0"


    // $ANTLR start "rule__OrExpr__Group__0__Impl"
    // InternalMGPL.g:3427:1: rule__OrExpr__Group__0__Impl : ( ruleBoolExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3431:1: ( ( ruleBoolExpr ) )
            // InternalMGPL.g:3432:1: ( ruleBoolExpr )
            {
            // InternalMGPL.g:3432:1: ( ruleBoolExpr )
            // InternalMGPL.g:3433:2: ruleBoolExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getBoolExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getBoolExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__0__Impl"


    // $ANTLR start "rule__OrExpr__Group__1"
    // InternalMGPL.g:3442:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3446:1: ( rule__OrExpr__Group__1__Impl )
            // InternalMGPL.g:3447:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__1"


    // $ANTLR start "rule__OrExpr__Group__1__Impl"
    // InternalMGPL.g:3453:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3457:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // InternalMGPL.g:3458:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // InternalMGPL.g:3458:1: ( ( rule__OrExpr__Group_1__0 )* )
            // InternalMGPL.g:3459:2: ( rule__OrExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup_1()); 
            }
            // InternalMGPL.g:3460:2: ( rule__OrExpr__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMGPL.g:3460:3: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__0"
    // InternalMGPL.g:3469:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3473:1: ( rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 )
            // InternalMGPL.g:3474:2: rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__OrExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0"


    // $ANTLR start "rule__OrExpr__Group_1__0__Impl"
    // InternalMGPL.g:3481:1: rule__OrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3485:1: ( ( () ) )
            // InternalMGPL.g:3486:1: ( () )
            {
            // InternalMGPL.g:3486:1: ( () )
            // InternalMGPL.g:3487:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0()); 
            }
            // InternalMGPL.g:3488:2: ()
            // InternalMGPL.g:3488:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__1"
    // InternalMGPL.g:3496:1: rule__OrExpr__Group_1__1 : rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 ;
    public final void rule__OrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3500:1: ( rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 )
            // InternalMGPL.g:3501:2: rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__OrExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__1"


    // $ANTLR start "rule__OrExpr__Group_1__1__Impl"
    // InternalMGPL.g:3508:1: rule__OrExpr__Group_1__1__Impl : ( ( rule__OrExpr__OpAssignment_1_1 ) ) ;
    public final void rule__OrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3512:1: ( ( ( rule__OrExpr__OpAssignment_1_1 ) ) )
            // InternalMGPL.g:3513:1: ( ( rule__OrExpr__OpAssignment_1_1 ) )
            {
            // InternalMGPL.g:3513:1: ( ( rule__OrExpr__OpAssignment_1_1 ) )
            // InternalMGPL.g:3514:2: ( rule__OrExpr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpAssignment_1_1()); 
            }
            // InternalMGPL.g:3515:2: ( rule__OrExpr__OpAssignment_1_1 )
            // InternalMGPL.g:3515:3: rule__OrExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__2"
    // InternalMGPL.g:3523:1: rule__OrExpr__Group_1__2 : rule__OrExpr__Group_1__2__Impl ;
    public final void rule__OrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3527:1: ( rule__OrExpr__Group_1__2__Impl )
            // InternalMGPL.g:3528:2: rule__OrExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__2"


    // $ANTLR start "rule__OrExpr__Group_1__2__Impl"
    // InternalMGPL.g:3534:1: rule__OrExpr__Group_1__2__Impl : ( ( rule__OrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3538:1: ( ( ( rule__OrExpr__RightAssignment_1_2 ) ) )
            // InternalMGPL.g:3539:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            {
            // InternalMGPL.g:3539:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            // InternalMGPL.g:3540:2: ( rule__OrExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
            }
            // InternalMGPL.g:3541:2: ( rule__OrExpr__RightAssignment_1_2 )
            // InternalMGPL.g:3541:3: rule__OrExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__2__Impl"


    // $ANTLR start "rule__BoolExpr__Group__0"
    // InternalMGPL.g:3550:1: rule__BoolExpr__Group__0 : rule__BoolExpr__Group__0__Impl rule__BoolExpr__Group__1 ;
    public final void rule__BoolExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3554:1: ( rule__BoolExpr__Group__0__Impl rule__BoolExpr__Group__1 )
            // InternalMGPL.g:3555:2: rule__BoolExpr__Group__0__Impl rule__BoolExpr__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__BoolExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group__0"


    // $ANTLR start "rule__BoolExpr__Group__0__Impl"
    // InternalMGPL.g:3562:1: rule__BoolExpr__Group__0__Impl : ( ruleRelExpr ) ;
    public final void rule__BoolExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3566:1: ( ( ruleRelExpr ) )
            // InternalMGPL.g:3567:1: ( ruleRelExpr )
            {
            // InternalMGPL.g:3567:1: ( ruleRelExpr )
            // InternalMGPL.g:3568:2: ruleRelExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getRelExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getRelExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group__0__Impl"


    // $ANTLR start "rule__BoolExpr__Group__1"
    // InternalMGPL.g:3577:1: rule__BoolExpr__Group__1 : rule__BoolExpr__Group__1__Impl ;
    public final void rule__BoolExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3581:1: ( rule__BoolExpr__Group__1__Impl )
            // InternalMGPL.g:3582:2: rule__BoolExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group__1"


    // $ANTLR start "rule__BoolExpr__Group__1__Impl"
    // InternalMGPL.g:3588:1: rule__BoolExpr__Group__1__Impl : ( ( rule__BoolExpr__Group_1__0 )* ) ;
    public final void rule__BoolExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3592:1: ( ( ( rule__BoolExpr__Group_1__0 )* ) )
            // InternalMGPL.g:3593:1: ( ( rule__BoolExpr__Group_1__0 )* )
            {
            // InternalMGPL.g:3593:1: ( ( rule__BoolExpr__Group_1__0 )* )
            // InternalMGPL.g:3594:2: ( rule__BoolExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getGroup_1()); 
            }
            // InternalMGPL.g:3595:2: ( rule__BoolExpr__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMGPL.g:3595:3: rule__BoolExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__BoolExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group__1__Impl"


    // $ANTLR start "rule__BoolExpr__Group_1__0"
    // InternalMGPL.g:3604:1: rule__BoolExpr__Group_1__0 : rule__BoolExpr__Group_1__0__Impl rule__BoolExpr__Group_1__1 ;
    public final void rule__BoolExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3608:1: ( rule__BoolExpr__Group_1__0__Impl rule__BoolExpr__Group_1__1 )
            // InternalMGPL.g:3609:2: rule__BoolExpr__Group_1__0__Impl rule__BoolExpr__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__BoolExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__0"


    // $ANTLR start "rule__BoolExpr__Group_1__0__Impl"
    // InternalMGPL.g:3616:1: rule__BoolExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3620:1: ( ( () ) )
            // InternalMGPL.g:3621:1: ( () )
            {
            // InternalMGPL.g:3621:1: ( () )
            // InternalMGPL.g:3622:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getBinaryExprLeftAction_1_0()); 
            }
            // InternalMGPL.g:3623:2: ()
            // InternalMGPL.g:3623:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getBinaryExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__0__Impl"


    // $ANTLR start "rule__BoolExpr__Group_1__1"
    // InternalMGPL.g:3631:1: rule__BoolExpr__Group_1__1 : rule__BoolExpr__Group_1__1__Impl rule__BoolExpr__Group_1__2 ;
    public final void rule__BoolExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3635:1: ( rule__BoolExpr__Group_1__1__Impl rule__BoolExpr__Group_1__2 )
            // InternalMGPL.g:3636:2: rule__BoolExpr__Group_1__1__Impl rule__BoolExpr__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__BoolExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__1"


    // $ANTLR start "rule__BoolExpr__Group_1__1__Impl"
    // InternalMGPL.g:3643:1: rule__BoolExpr__Group_1__1__Impl : ( ( rule__BoolExpr__OpAssignment_1_1 ) ) ;
    public final void rule__BoolExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3647:1: ( ( ( rule__BoolExpr__OpAssignment_1_1 ) ) )
            // InternalMGPL.g:3648:1: ( ( rule__BoolExpr__OpAssignment_1_1 ) )
            {
            // InternalMGPL.g:3648:1: ( ( rule__BoolExpr__OpAssignment_1_1 ) )
            // InternalMGPL.g:3649:2: ( rule__BoolExpr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getOpAssignment_1_1()); 
            }
            // InternalMGPL.g:3650:2: ( rule__BoolExpr__OpAssignment_1_1 )
            // InternalMGPL.g:3650:3: rule__BoolExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__1__Impl"


    // $ANTLR start "rule__BoolExpr__Group_1__2"
    // InternalMGPL.g:3658:1: rule__BoolExpr__Group_1__2 : rule__BoolExpr__Group_1__2__Impl ;
    public final void rule__BoolExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3662:1: ( rule__BoolExpr__Group_1__2__Impl )
            // InternalMGPL.g:3663:2: rule__BoolExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__2"


    // $ANTLR start "rule__BoolExpr__Group_1__2__Impl"
    // InternalMGPL.g:3669:1: rule__BoolExpr__Group_1__2__Impl : ( ( rule__BoolExpr__RightAssignment_1_2 ) ) ;
    public final void rule__BoolExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3673:1: ( ( ( rule__BoolExpr__RightAssignment_1_2 ) ) )
            // InternalMGPL.g:3674:1: ( ( rule__BoolExpr__RightAssignment_1_2 ) )
            {
            // InternalMGPL.g:3674:1: ( ( rule__BoolExpr__RightAssignment_1_2 ) )
            // InternalMGPL.g:3675:2: ( rule__BoolExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getRightAssignment_1_2()); 
            }
            // InternalMGPL.g:3676:2: ( rule__BoolExpr__RightAssignment_1_2 )
            // InternalMGPL.g:3676:3: rule__BoolExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__2__Impl"


    // $ANTLR start "rule__RelExpr__Group__0"
    // InternalMGPL.g:3685:1: rule__RelExpr__Group__0 : rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1 ;
    public final void rule__RelExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3689:1: ( rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1 )
            // InternalMGPL.g:3690:2: rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__RelExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group__0"


    // $ANTLR start "rule__RelExpr__Group__0__Impl"
    // InternalMGPL.g:3697:1: rule__RelExpr__Group__0__Impl : ( ruleAddExpr ) ;
    public final void rule__RelExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3701:1: ( ( ruleAddExpr ) )
            // InternalMGPL.g:3702:1: ( ruleAddExpr )
            {
            // InternalMGPL.g:3702:1: ( ruleAddExpr )
            // InternalMGPL.g:3703:2: ruleAddExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group__0__Impl"


    // $ANTLR start "rule__RelExpr__Group__1"
    // InternalMGPL.g:3712:1: rule__RelExpr__Group__1 : rule__RelExpr__Group__1__Impl ;
    public final void rule__RelExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3716:1: ( rule__RelExpr__Group__1__Impl )
            // InternalMGPL.g:3717:2: rule__RelExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group__1"


    // $ANTLR start "rule__RelExpr__Group__1__Impl"
    // InternalMGPL.g:3723:1: rule__RelExpr__Group__1__Impl : ( ( rule__RelExpr__Group_1__0 )* ) ;
    public final void rule__RelExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3727:1: ( ( ( rule__RelExpr__Group_1__0 )* ) )
            // InternalMGPL.g:3728:1: ( ( rule__RelExpr__Group_1__0 )* )
            {
            // InternalMGPL.g:3728:1: ( ( rule__RelExpr__Group_1__0 )* )
            // InternalMGPL.g:3729:2: ( rule__RelExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getGroup_1()); 
            }
            // InternalMGPL.g:3730:2: ( rule__RelExpr__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=12 && LA24_0<=14)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGPL.g:3730:3: rule__RelExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RelExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group__1__Impl"


    // $ANTLR start "rule__RelExpr__Group_1__0"
    // InternalMGPL.g:3739:1: rule__RelExpr__Group_1__0 : rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1 ;
    public final void rule__RelExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3743:1: ( rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1 )
            // InternalMGPL.g:3744:2: rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__RelExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group_1__0"


    // $ANTLR start "rule__RelExpr__Group_1__0__Impl"
    // InternalMGPL.g:3751:1: rule__RelExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__RelExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3755:1: ( ( () ) )
            // InternalMGPL.g:3756:1: ( () )
            {
            // InternalMGPL.g:3756:1: ( () )
            // InternalMGPL.g:3757:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getBinaryExprLeftAction_1_0()); 
            }
            // InternalMGPL.g:3758:2: ()
            // InternalMGPL.g:3758:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getBinaryExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group_1__0__Impl"


    // $ANTLR start "rule__RelExpr__Group_1__1"
    // InternalMGPL.g:3766:1: rule__RelExpr__Group_1__1 : rule__RelExpr__Group_1__1__Impl rule__RelExpr__Group_1__2 ;
    public final void rule__RelExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3770:1: ( rule__RelExpr__Group_1__1__Impl rule__RelExpr__Group_1__2 )
            // InternalMGPL.g:3771:2: rule__RelExpr__Group_1__1__Impl rule__RelExpr__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__RelExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group_1__1"


    // $ANTLR start "rule__RelExpr__Group_1__1__Impl"
    // InternalMGPL.g:3778:1: rule__RelExpr__Group_1__1__Impl : ( ( rule__RelExpr__OpAssignment_1_1 ) ) ;
    public final void rule__RelExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3782:1: ( ( ( rule__RelExpr__OpAssignment_1_1 ) ) )
            // InternalMGPL.g:3783:1: ( ( rule__RelExpr__OpAssignment_1_1 ) )
            {
            // InternalMGPL.g:3783:1: ( ( rule__RelExpr__OpAssignment_1_1 ) )
            // InternalMGPL.g:3784:2: ( rule__RelExpr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getOpAssignment_1_1()); 
            }
            // InternalMGPL.g:3785:2: ( rule__RelExpr__OpAssignment_1_1 )
            // InternalMGPL.g:3785:3: rule__RelExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelExpr__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group_1__1__Impl"


    // $ANTLR start "rule__RelExpr__Group_1__2"
    // InternalMGPL.g:3793:1: rule__RelExpr__Group_1__2 : rule__RelExpr__Group_1__2__Impl ;
    public final void rule__RelExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3797:1: ( rule__RelExpr__Group_1__2__Impl )
            // InternalMGPL.g:3798:2: rule__RelExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group_1__2"


    // $ANTLR start "rule__RelExpr__Group_1__2__Impl"
    // InternalMGPL.g:3804:1: rule__RelExpr__Group_1__2__Impl : ( ( rule__RelExpr__RightAssignment_1_2 ) ) ;
    public final void rule__RelExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3808:1: ( ( ( rule__RelExpr__RightAssignment_1_2 ) ) )
            // InternalMGPL.g:3809:1: ( ( rule__RelExpr__RightAssignment_1_2 ) )
            {
            // InternalMGPL.g:3809:1: ( ( rule__RelExpr__RightAssignment_1_2 ) )
            // InternalMGPL.g:3810:2: ( rule__RelExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getRightAssignment_1_2()); 
            }
            // InternalMGPL.g:3811:2: ( rule__RelExpr__RightAssignment_1_2 )
            // InternalMGPL.g:3811:3: rule__RelExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__Group_1__2__Impl"


    // $ANTLR start "rule__AddExpr__Group__0"
    // InternalMGPL.g:3820:1: rule__AddExpr__Group__0 : rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1 ;
    public final void rule__AddExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3824:1: ( rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1 )
            // InternalMGPL.g:3825:2: rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__AddExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group__0"


    // $ANTLR start "rule__AddExpr__Group__0__Impl"
    // InternalMGPL.g:3832:1: rule__AddExpr__Group__0__Impl : ( ruleMulExpr ) ;
    public final void rule__AddExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3836:1: ( ( ruleMulExpr ) )
            // InternalMGPL.g:3837:1: ( ruleMulExpr )
            {
            // InternalMGPL.g:3837:1: ( ruleMulExpr )
            // InternalMGPL.g:3838:2: ruleMulExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group__0__Impl"


    // $ANTLR start "rule__AddExpr__Group__1"
    // InternalMGPL.g:3847:1: rule__AddExpr__Group__1 : rule__AddExpr__Group__1__Impl ;
    public final void rule__AddExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3851:1: ( rule__AddExpr__Group__1__Impl )
            // InternalMGPL.g:3852:2: rule__AddExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group__1"


    // $ANTLR start "rule__AddExpr__Group__1__Impl"
    // InternalMGPL.g:3858:1: rule__AddExpr__Group__1__Impl : ( ( rule__AddExpr__Group_1__0 )* ) ;
    public final void rule__AddExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3862:1: ( ( ( rule__AddExpr__Group_1__0 )* ) )
            // InternalMGPL.g:3863:1: ( ( rule__AddExpr__Group_1__0 )* )
            {
            // InternalMGPL.g:3863:1: ( ( rule__AddExpr__Group_1__0 )* )
            // InternalMGPL.g:3864:2: ( rule__AddExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getGroup_1()); 
            }
            // InternalMGPL.g:3865:2: ( rule__AddExpr__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=15 && LA25_0<=16)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMGPL.g:3865:3: rule__AddExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__AddExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group__1__Impl"


    // $ANTLR start "rule__AddExpr__Group_1__0"
    // InternalMGPL.g:3874:1: rule__AddExpr__Group_1__0 : rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1 ;
    public final void rule__AddExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3878:1: ( rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1 )
            // InternalMGPL.g:3879:2: rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__AddExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group_1__0"


    // $ANTLR start "rule__AddExpr__Group_1__0__Impl"
    // InternalMGPL.g:3886:1: rule__AddExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3890:1: ( ( () ) )
            // InternalMGPL.g:3891:1: ( () )
            {
            // InternalMGPL.g:3891:1: ( () )
            // InternalMGPL.g:3892:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getBinaryExprLeftAction_1_0()); 
            }
            // InternalMGPL.g:3893:2: ()
            // InternalMGPL.g:3893:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getBinaryExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AddExpr__Group_1__1"
    // InternalMGPL.g:3901:1: rule__AddExpr__Group_1__1 : rule__AddExpr__Group_1__1__Impl rule__AddExpr__Group_1__2 ;
    public final void rule__AddExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3905:1: ( rule__AddExpr__Group_1__1__Impl rule__AddExpr__Group_1__2 )
            // InternalMGPL.g:3906:2: rule__AddExpr__Group_1__1__Impl rule__AddExpr__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__AddExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group_1__1"


    // $ANTLR start "rule__AddExpr__Group_1__1__Impl"
    // InternalMGPL.g:3913:1: rule__AddExpr__Group_1__1__Impl : ( ( rule__AddExpr__OpAssignment_1_1 ) ) ;
    public final void rule__AddExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3917:1: ( ( ( rule__AddExpr__OpAssignment_1_1 ) ) )
            // InternalMGPL.g:3918:1: ( ( rule__AddExpr__OpAssignment_1_1 ) )
            {
            // InternalMGPL.g:3918:1: ( ( rule__AddExpr__OpAssignment_1_1 ) )
            // InternalMGPL.g:3919:2: ( rule__AddExpr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getOpAssignment_1_1()); 
            }
            // InternalMGPL.g:3920:2: ( rule__AddExpr__OpAssignment_1_1 )
            // InternalMGPL.g:3920:3: rule__AddExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AddExpr__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group_1__1__Impl"


    // $ANTLR start "rule__AddExpr__Group_1__2"
    // InternalMGPL.g:3928:1: rule__AddExpr__Group_1__2 : rule__AddExpr__Group_1__2__Impl ;
    public final void rule__AddExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3932:1: ( rule__AddExpr__Group_1__2__Impl )
            // InternalMGPL.g:3933:2: rule__AddExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group_1__2"


    // $ANTLR start "rule__AddExpr__Group_1__2__Impl"
    // InternalMGPL.g:3939:1: rule__AddExpr__Group_1__2__Impl : ( ( rule__AddExpr__RightAssignment_1_2 ) ) ;
    public final void rule__AddExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3943:1: ( ( ( rule__AddExpr__RightAssignment_1_2 ) ) )
            // InternalMGPL.g:3944:1: ( ( rule__AddExpr__RightAssignment_1_2 ) )
            {
            // InternalMGPL.g:3944:1: ( ( rule__AddExpr__RightAssignment_1_2 ) )
            // InternalMGPL.g:3945:2: ( rule__AddExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getRightAssignment_1_2()); 
            }
            // InternalMGPL.g:3946:2: ( rule__AddExpr__RightAssignment_1_2 )
            // InternalMGPL.g:3946:3: rule__AddExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AddExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__Group_1__2__Impl"


    // $ANTLR start "rule__MulExpr__Group__0"
    // InternalMGPL.g:3955:1: rule__MulExpr__Group__0 : rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1 ;
    public final void rule__MulExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3959:1: ( rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1 )
            // InternalMGPL.g:3960:2: rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__MulExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group__0"


    // $ANTLR start "rule__MulExpr__Group__0__Impl"
    // InternalMGPL.g:3967:1: rule__MulExpr__Group__0__Impl : ( ruleSimpleExpr ) ;
    public final void rule__MulExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3971:1: ( ( ruleSimpleExpr ) )
            // InternalMGPL.g:3972:1: ( ruleSimpleExpr )
            {
            // InternalMGPL.g:3972:1: ( ruleSimpleExpr )
            // InternalMGPL.g:3973:2: ruleSimpleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getSimpleExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimpleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getSimpleExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group__0__Impl"


    // $ANTLR start "rule__MulExpr__Group__1"
    // InternalMGPL.g:3982:1: rule__MulExpr__Group__1 : rule__MulExpr__Group__1__Impl ;
    public final void rule__MulExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3986:1: ( rule__MulExpr__Group__1__Impl )
            // InternalMGPL.g:3987:2: rule__MulExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group__1"


    // $ANTLR start "rule__MulExpr__Group__1__Impl"
    // InternalMGPL.g:3993:1: rule__MulExpr__Group__1__Impl : ( ( rule__MulExpr__Group_1__0 )* ) ;
    public final void rule__MulExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:3997:1: ( ( ( rule__MulExpr__Group_1__0 )* ) )
            // InternalMGPL.g:3998:1: ( ( rule__MulExpr__Group_1__0 )* )
            {
            // InternalMGPL.g:3998:1: ( ( rule__MulExpr__Group_1__0 )* )
            // InternalMGPL.g:3999:2: ( rule__MulExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getGroup_1()); 
            }
            // InternalMGPL.g:4000:2: ( rule__MulExpr__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=17 && LA26_0<=18)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMGPL.g:4000:3: rule__MulExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__MulExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group__1__Impl"


    // $ANTLR start "rule__MulExpr__Group_1__0"
    // InternalMGPL.g:4009:1: rule__MulExpr__Group_1__0 : rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 ;
    public final void rule__MulExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4013:1: ( rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 )
            // InternalMGPL.g:4014:2: rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__MulExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__0"


    // $ANTLR start "rule__MulExpr__Group_1__0__Impl"
    // InternalMGPL.g:4021:1: rule__MulExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__MulExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4025:1: ( ( () ) )
            // InternalMGPL.g:4026:1: ( () )
            {
            // InternalMGPL.g:4026:1: ( () )
            // InternalMGPL.g:4027:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getBinaryExprLeftAction_1_0()); 
            }
            // InternalMGPL.g:4028:2: ()
            // InternalMGPL.g:4028:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getBinaryExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__0__Impl"


    // $ANTLR start "rule__MulExpr__Group_1__1"
    // InternalMGPL.g:4036:1: rule__MulExpr__Group_1__1 : rule__MulExpr__Group_1__1__Impl rule__MulExpr__Group_1__2 ;
    public final void rule__MulExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4040:1: ( rule__MulExpr__Group_1__1__Impl rule__MulExpr__Group_1__2 )
            // InternalMGPL.g:4041:2: rule__MulExpr__Group_1__1__Impl rule__MulExpr__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__MulExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__1"


    // $ANTLR start "rule__MulExpr__Group_1__1__Impl"
    // InternalMGPL.g:4048:1: rule__MulExpr__Group_1__1__Impl : ( ( rule__MulExpr__OpAssignment_1_1 ) ) ;
    public final void rule__MulExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4052:1: ( ( ( rule__MulExpr__OpAssignment_1_1 ) ) )
            // InternalMGPL.g:4053:1: ( ( rule__MulExpr__OpAssignment_1_1 ) )
            {
            // InternalMGPL.g:4053:1: ( ( rule__MulExpr__OpAssignment_1_1 ) )
            // InternalMGPL.g:4054:2: ( rule__MulExpr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getOpAssignment_1_1()); 
            }
            // InternalMGPL.g:4055:2: ( rule__MulExpr__OpAssignment_1_1 )
            // InternalMGPL.g:4055:3: rule__MulExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__1__Impl"


    // $ANTLR start "rule__MulExpr__Group_1__2"
    // InternalMGPL.g:4063:1: rule__MulExpr__Group_1__2 : rule__MulExpr__Group_1__2__Impl ;
    public final void rule__MulExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4067:1: ( rule__MulExpr__Group_1__2__Impl )
            // InternalMGPL.g:4068:2: rule__MulExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__2"


    // $ANTLR start "rule__MulExpr__Group_1__2__Impl"
    // InternalMGPL.g:4074:1: rule__MulExpr__Group_1__2__Impl : ( ( rule__MulExpr__RightAssignment_1_2 ) ) ;
    public final void rule__MulExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4078:1: ( ( ( rule__MulExpr__RightAssignment_1_2 ) ) )
            // InternalMGPL.g:4079:1: ( ( rule__MulExpr__RightAssignment_1_2 ) )
            {
            // InternalMGPL.g:4079:1: ( ( rule__MulExpr__RightAssignment_1_2 ) )
            // InternalMGPL.g:4080:2: ( rule__MulExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getRightAssignment_1_2()); 
            }
            // InternalMGPL.g:4081:2: ( rule__MulExpr__RightAssignment_1_2 )
            // InternalMGPL.g:4081:3: rule__MulExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__2__Impl"


    // $ANTLR start "rule__SimpleExpr__Group_2__0"
    // InternalMGPL.g:4090:1: rule__SimpleExpr__Group_2__0 : rule__SimpleExpr__Group_2__0__Impl rule__SimpleExpr__Group_2__1 ;
    public final void rule__SimpleExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4094:1: ( rule__SimpleExpr__Group_2__0__Impl rule__SimpleExpr__Group_2__1 )
            // InternalMGPL.g:4095:2: rule__SimpleExpr__Group_2__0__Impl rule__SimpleExpr__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2__0"


    // $ANTLR start "rule__SimpleExpr__Group_2__0__Impl"
    // InternalMGPL.g:4102:1: rule__SimpleExpr__Group_2__0__Impl : ( ruleVarExpr ) ;
    public final void rule__SimpleExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4106:1: ( ( ruleVarExpr ) )
            // InternalMGPL.g:4107:1: ( ruleVarExpr )
            {
            // InternalMGPL.g:4107:1: ( ruleVarExpr )
            // InternalMGPL.g:4108:2: ruleVarExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getVarExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getVarExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2__0__Impl"


    // $ANTLR start "rule__SimpleExpr__Group_2__1"
    // InternalMGPL.g:4117:1: rule__SimpleExpr__Group_2__1 : rule__SimpleExpr__Group_2__1__Impl ;
    public final void rule__SimpleExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4121:1: ( rule__SimpleExpr__Group_2__1__Impl )
            // InternalMGPL.g:4122:2: rule__SimpleExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2__1"


    // $ANTLR start "rule__SimpleExpr__Group_2__1__Impl"
    // InternalMGPL.g:4128:1: rule__SimpleExpr__Group_2__1__Impl : ( ( rule__SimpleExpr__Group_2_1__0 )? ) ;
    public final void rule__SimpleExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4132:1: ( ( ( rule__SimpleExpr__Group_2_1__0 )? ) )
            // InternalMGPL.g:4133:1: ( ( rule__SimpleExpr__Group_2_1__0 )? )
            {
            // InternalMGPL.g:4133:1: ( ( rule__SimpleExpr__Group_2_1__0 )? )
            // InternalMGPL.g:4134:2: ( rule__SimpleExpr__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getGroup_2_1()); 
            }
            // InternalMGPL.g:4135:2: ( rule__SimpleExpr__Group_2_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMGPL.g:4135:3: rule__SimpleExpr__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleExpr__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2__1__Impl"


    // $ANTLR start "rule__SimpleExpr__Group_2_1__0"
    // InternalMGPL.g:4144:1: rule__SimpleExpr__Group_2_1__0 : rule__SimpleExpr__Group_2_1__0__Impl rule__SimpleExpr__Group_2_1__1 ;
    public final void rule__SimpleExpr__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4148:1: ( rule__SimpleExpr__Group_2_1__0__Impl rule__SimpleExpr__Group_2_1__1 )
            // InternalMGPL.g:4149:2: rule__SimpleExpr__Group_2_1__0__Impl rule__SimpleExpr__Group_2_1__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleExpr__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2_1__0"


    // $ANTLR start "rule__SimpleExpr__Group_2_1__0__Impl"
    // InternalMGPL.g:4156:1: rule__SimpleExpr__Group_2_1__0__Impl : ( () ) ;
    public final void rule__SimpleExpr__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4160:1: ( ( () ) )
            // InternalMGPL.g:4161:1: ( () )
            {
            // InternalMGPL.g:4161:1: ( () )
            // InternalMGPL.g:4162:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getTouchExprToucherAction_2_1_0()); 
            }
            // InternalMGPL.g:4163:2: ()
            // InternalMGPL.g:4163:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getTouchExprToucherAction_2_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2_1__0__Impl"


    // $ANTLR start "rule__SimpleExpr__Group_2_1__1"
    // InternalMGPL.g:4171:1: rule__SimpleExpr__Group_2_1__1 : rule__SimpleExpr__Group_2_1__1__Impl rule__SimpleExpr__Group_2_1__2 ;
    public final void rule__SimpleExpr__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4175:1: ( rule__SimpleExpr__Group_2_1__1__Impl rule__SimpleExpr__Group_2_1__2 )
            // InternalMGPL.g:4176:2: rule__SimpleExpr__Group_2_1__1__Impl rule__SimpleExpr__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SimpleExpr__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2_1__1"


    // $ANTLR start "rule__SimpleExpr__Group_2_1__1__Impl"
    // InternalMGPL.g:4183:1: rule__SimpleExpr__Group_2_1__1__Impl : ( 'touches' ) ;
    public final void rule__SimpleExpr__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4187:1: ( ( 'touches' ) )
            // InternalMGPL.g:4188:1: ( 'touches' )
            {
            // InternalMGPL.g:4188:1: ( 'touches' )
            // InternalMGPL.g:4189:2: 'touches'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getTouchesKeyword_2_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getTouchesKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2_1__1__Impl"


    // $ANTLR start "rule__SimpleExpr__Group_2_1__2"
    // InternalMGPL.g:4198:1: rule__SimpleExpr__Group_2_1__2 : rule__SimpleExpr__Group_2_1__2__Impl ;
    public final void rule__SimpleExpr__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4202:1: ( rule__SimpleExpr__Group_2_1__2__Impl )
            // InternalMGPL.g:4203:2: rule__SimpleExpr__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2_1__2"


    // $ANTLR start "rule__SimpleExpr__Group_2_1__2__Impl"
    // InternalMGPL.g:4209:1: rule__SimpleExpr__Group_2_1__2__Impl : ( ( rule__SimpleExpr__ToucheeAssignment_2_1_2 ) ) ;
    public final void rule__SimpleExpr__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4213:1: ( ( ( rule__SimpleExpr__ToucheeAssignment_2_1_2 ) ) )
            // InternalMGPL.g:4214:1: ( ( rule__SimpleExpr__ToucheeAssignment_2_1_2 ) )
            {
            // InternalMGPL.g:4214:1: ( ( rule__SimpleExpr__ToucheeAssignment_2_1_2 ) )
            // InternalMGPL.g:4215:2: ( rule__SimpleExpr__ToucheeAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getToucheeAssignment_2_1_2()); 
            }
            // InternalMGPL.g:4216:2: ( rule__SimpleExpr__ToucheeAssignment_2_1_2 )
            // InternalMGPL.g:4216:3: rule__SimpleExpr__ToucheeAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__ToucheeAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getToucheeAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_2_1__2__Impl"


    // $ANTLR start "rule__SimpleExpr__Group_3__0"
    // InternalMGPL.g:4225:1: rule__SimpleExpr__Group_3__0 : rule__SimpleExpr__Group_3__0__Impl rule__SimpleExpr__Group_3__1 ;
    public final void rule__SimpleExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4229:1: ( rule__SimpleExpr__Group_3__0__Impl rule__SimpleExpr__Group_3__1 )
            // InternalMGPL.g:4230:2: rule__SimpleExpr__Group_3__0__Impl rule__SimpleExpr__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__SimpleExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_3__0"


    // $ANTLR start "rule__SimpleExpr__Group_3__0__Impl"
    // InternalMGPL.g:4237:1: rule__SimpleExpr__Group_3__0__Impl : ( '(' ) ;
    public final void rule__SimpleExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4241:1: ( ( '(' ) )
            // InternalMGPL.g:4242:1: ( '(' )
            {
            // InternalMGPL.g:4242:1: ( '(' )
            // InternalMGPL.g:4243:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_3__0__Impl"


    // $ANTLR start "rule__SimpleExpr__Group_3__1"
    // InternalMGPL.g:4252:1: rule__SimpleExpr__Group_3__1 : rule__SimpleExpr__Group_3__1__Impl rule__SimpleExpr__Group_3__2 ;
    public final void rule__SimpleExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4256:1: ( rule__SimpleExpr__Group_3__1__Impl rule__SimpleExpr__Group_3__2 )
            // InternalMGPL.g:4257:2: rule__SimpleExpr__Group_3__1__Impl rule__SimpleExpr__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__SimpleExpr__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_3__1"


    // $ANTLR start "rule__SimpleExpr__Group_3__1__Impl"
    // InternalMGPL.g:4264:1: rule__SimpleExpr__Group_3__1__Impl : ( ruleExpr ) ;
    public final void rule__SimpleExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4268:1: ( ( ruleExpr ) )
            // InternalMGPL.g:4269:1: ( ruleExpr )
            {
            // InternalMGPL.g:4269:1: ( ruleExpr )
            // InternalMGPL.g:4270:2: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getExprParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getExprParserRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_3__1__Impl"


    // $ANTLR start "rule__SimpleExpr__Group_3__2"
    // InternalMGPL.g:4279:1: rule__SimpleExpr__Group_3__2 : rule__SimpleExpr__Group_3__2__Impl ;
    public final void rule__SimpleExpr__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4283:1: ( rule__SimpleExpr__Group_3__2__Impl )
            // InternalMGPL.g:4284:2: rule__SimpleExpr__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpr__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_3__2"


    // $ANTLR start "rule__SimpleExpr__Group_3__2__Impl"
    // InternalMGPL.g:4290:1: rule__SimpleExpr__Group_3__2__Impl : ( ')' ) ;
    public final void rule__SimpleExpr__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4294:1: ( ( ')' ) )
            // InternalMGPL.g:4295:1: ( ')' )
            {
            // InternalMGPL.g:4295:1: ( ')' )
            // InternalMGPL.g:4296:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__Group_3__2__Impl"


    // $ANTLR start "rule__UnaryExpr__Group__0"
    // InternalMGPL.g:4306:1: rule__UnaryExpr__Group__0 : rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 ;
    public final void rule__UnaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4310:1: ( rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 )
            // InternalMGPL.g:4311:2: rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__UnaryExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group__0"


    // $ANTLR start "rule__UnaryExpr__Group__0__Impl"
    // InternalMGPL.g:4318:1: rule__UnaryExpr__Group__0__Impl : ( ( rule__UnaryExpr__OpAssignment_0 ) ) ;
    public final void rule__UnaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4322:1: ( ( ( rule__UnaryExpr__OpAssignment_0 ) ) )
            // InternalMGPL.g:4323:1: ( ( rule__UnaryExpr__OpAssignment_0 ) )
            {
            // InternalMGPL.g:4323:1: ( ( rule__UnaryExpr__OpAssignment_0 ) )
            // InternalMGPL.g:4324:2: ( rule__UnaryExpr__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getOpAssignment_0()); 
            }
            // InternalMGPL.g:4325:2: ( rule__UnaryExpr__OpAssignment_0 )
            // InternalMGPL.g:4325:3: rule__UnaryExpr__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group__0__Impl"


    // $ANTLR start "rule__UnaryExpr__Group__1"
    // InternalMGPL.g:4333:1: rule__UnaryExpr__Group__1 : rule__UnaryExpr__Group__1__Impl ;
    public final void rule__UnaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4337:1: ( rule__UnaryExpr__Group__1__Impl )
            // InternalMGPL.g:4338:2: rule__UnaryExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group__1"


    // $ANTLR start "rule__UnaryExpr__Group__1__Impl"
    // InternalMGPL.g:4344:1: rule__UnaryExpr__Group__1__Impl : ( ( rule__UnaryExpr__OperandAssignment_1 ) ) ;
    public final void rule__UnaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4348:1: ( ( ( rule__UnaryExpr__OperandAssignment_1 ) ) )
            // InternalMGPL.g:4349:1: ( ( rule__UnaryExpr__OperandAssignment_1 ) )
            {
            // InternalMGPL.g:4349:1: ( ( rule__UnaryExpr__OperandAssignment_1 ) )
            // InternalMGPL.g:4350:2: ( rule__UnaryExpr__OperandAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getOperandAssignment_1()); 
            }
            // InternalMGPL.g:4351:2: ( rule__UnaryExpr__OperandAssignment_1 )
            // InternalMGPL.g:4351:3: rule__UnaryExpr__OperandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__OperandAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getOperandAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group__1__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalMGPL.g:4360:1: rule__Program__NameAssignment_1 : ( RULE_IDF ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4364:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4365:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4365:2: ( RULE_IDF )
            // InternalMGPL.g:4366:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameIDFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameIDFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__AttributesAssignment_3"
    // InternalMGPL.g:4375:1: rule__Program__AttributesAssignment_3 : ( ruleAttrAssList ) ;
    public final void rule__Program__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4379:1: ( ( ruleAttrAssList ) )
            // InternalMGPL.g:4380:2: ( ruleAttrAssList )
            {
            // InternalMGPL.g:4380:2: ( ruleAttrAssList )
            // InternalMGPL.g:4381:3: ruleAttrAssList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getAttributesAttrAssListParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttrAssList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getAttributesAttrAssListParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__AttributesAssignment_3"


    // $ANTLR start "rule__Program__DeclarationsAssignment_5"
    // InternalMGPL.g:4390:1: rule__Program__DeclarationsAssignment_5 : ( ruleDecl ) ;
    public final void rule__Program__DeclarationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4394:1: ( ( ruleDecl ) )
            // InternalMGPL.g:4395:2: ( ruleDecl )
            {
            // InternalMGPL.g:4395:2: ( ruleDecl )
            // InternalMGPL.g:4396:3: ruleDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getDeclarationsDeclParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getDeclarationsDeclParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DeclarationsAssignment_5"


    // $ANTLR start "rule__Program__InitAssignment_6"
    // InternalMGPL.g:4405:1: rule__Program__InitAssignment_6 : ( ruleStmtBlock ) ;
    public final void rule__Program__InitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4409:1: ( ( ruleStmtBlock ) )
            // InternalMGPL.g:4410:2: ( ruleStmtBlock )
            {
            // InternalMGPL.g:4410:2: ( ruleStmtBlock )
            // InternalMGPL.g:4411:3: ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getInitStmtBlockParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmtBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getInitStmtBlockParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__InitAssignment_6"


    // $ANTLR start "rule__Program__BlocksAssignment_7"
    // InternalMGPL.g:4420:1: rule__Program__BlocksAssignment_7 : ( ruleBlock ) ;
    public final void rule__Program__BlocksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4424:1: ( ( ruleBlock ) )
            // InternalMGPL.g:4425:2: ( ruleBlock )
            {
            // InternalMGPL.g:4425:2: ( ruleBlock )
            // InternalMGPL.g:4426:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getBlocksBlockParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getBlocksBlockParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlocksAssignment_7"


    // $ANTLR start "rule__ScalarVarDecl__NameAssignment_1"
    // InternalMGPL.g:4435:1: rule__ScalarVarDecl__NameAssignment_1 : ( RULE_IDF ) ;
    public final void rule__ScalarVarDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4439:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4440:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4440:2: ( RULE_IDF )
            // InternalMGPL.g:4441:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclAccess().getNameIDFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclAccess().getNameIDFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__NameAssignment_1"


    // $ANTLR start "rule__ScalarVarDecl__InitializationAssignment_2_1"
    // InternalMGPL.g:4450:1: rule__ScalarVarDecl__InitializationAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__ScalarVarDecl__InitializationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4454:1: ( ( ruleExpr ) )
            // InternalMGPL.g:4455:2: ( ruleExpr )
            {
            // InternalMGPL.g:4455:2: ( ruleExpr )
            // InternalMGPL.g:4456:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScalarVarDeclAccess().getInitializationExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScalarVarDeclAccess().getInitializationExprParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarVarDecl__InitializationAssignment_2_1"


    // $ANTLR start "rule__ArrayVarDecl__NameAssignment_1"
    // InternalMGPL.g:4465:1: rule__ArrayVarDecl__NameAssignment_1 : ( RULE_IDF ) ;
    public final void rule__ArrayVarDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4469:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4470:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4470:2: ( RULE_IDF )
            // InternalMGPL.g:4471:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclAccess().getNameIDFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclAccess().getNameIDFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__NameAssignment_1"


    // $ANTLR start "rule__ArrayVarDecl__SizeAssignment_3"
    // InternalMGPL.g:4480:1: rule__ArrayVarDecl__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__ArrayVarDecl__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4484:1: ( ( RULE_INT ) )
            // InternalMGPL.g:4485:2: ( RULE_INT )
            {
            // InternalMGPL.g:4485:2: ( RULE_INT )
            // InternalMGPL.g:4486:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayVarDeclAccess().getSizeINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayVarDeclAccess().getSizeINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayVarDecl__SizeAssignment_3"


    // $ANTLR start "rule__ObjDecl__TypeAssignment_0"
    // InternalMGPL.g:4495:1: rule__ObjDecl__TypeAssignment_0 : ( ruleObjType ) ;
    public final void rule__ObjDecl__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4499:1: ( ( ruleObjType ) )
            // InternalMGPL.g:4500:2: ( ruleObjType )
            {
            // InternalMGPL.g:4500:2: ( ruleObjType )
            // InternalMGPL.g:4501:3: ruleObjType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getTypeObjTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObjType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getTypeObjTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__TypeAssignment_0"


    // $ANTLR start "rule__ObjDecl__NameAssignment_1"
    // InternalMGPL.g:4510:1: rule__ObjDecl__NameAssignment_1 : ( RULE_IDF ) ;
    public final void rule__ObjDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4514:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4515:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4515:2: ( RULE_IDF )
            // InternalMGPL.g:4516:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getNameIDFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getNameIDFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__NameAssignment_1"


    // $ANTLR start "rule__ObjDecl__AttributesAssignment_3"
    // InternalMGPL.g:4525:1: rule__ObjDecl__AttributesAssignment_3 : ( ruleAttrAssList ) ;
    public final void rule__ObjDecl__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4529:1: ( ( ruleAttrAssList ) )
            // InternalMGPL.g:4530:2: ( ruleAttrAssList )
            {
            // InternalMGPL.g:4530:2: ( ruleAttrAssList )
            // InternalMGPL.g:4531:3: ruleAttrAssList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjDeclAccess().getAttributesAttrAssListParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttrAssList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjDeclAccess().getAttributesAttrAssListParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__AttributesAssignment_3"


    // $ANTLR start "rule__ObjArrayDecl__TypeAssignment_0"
    // InternalMGPL.g:4540:1: rule__ObjArrayDecl__TypeAssignment_0 : ( ruleObjType ) ;
    public final void rule__ObjArrayDecl__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4544:1: ( ( ruleObjType ) )
            // InternalMGPL.g:4545:2: ( ruleObjType )
            {
            // InternalMGPL.g:4545:2: ( ruleObjType )
            // InternalMGPL.g:4546:3: ruleObjType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getTypeObjTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObjType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getTypeObjTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__TypeAssignment_0"


    // $ANTLR start "rule__ObjArrayDecl__NameAssignment_1"
    // InternalMGPL.g:4555:1: rule__ObjArrayDecl__NameAssignment_1 : ( RULE_IDF ) ;
    public final void rule__ObjArrayDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4559:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4560:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4560:2: ( RULE_IDF )
            // InternalMGPL.g:4561:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getNameIDFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getNameIDFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__NameAssignment_1"


    // $ANTLR start "rule__ObjArrayDecl__SizeAssignment_3"
    // InternalMGPL.g:4570:1: rule__ObjArrayDecl__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__ObjArrayDecl__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4574:1: ( ( RULE_INT ) )
            // InternalMGPL.g:4575:2: ( RULE_INT )
            {
            // InternalMGPL.g:4575:2: ( RULE_INT )
            // InternalMGPL.g:4576:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjArrayDeclAccess().getSizeINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjArrayDeclAccess().getSizeINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjArrayDecl__SizeAssignment_3"


    // $ANTLR start "rule__AttrAssList__AssignmentsAssignment_0"
    // InternalMGPL.g:4585:1: rule__AttrAssList__AssignmentsAssignment_0 : ( ruleAttrAss ) ;
    public final void rule__AttrAssList__AssignmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4589:1: ( ( ruleAttrAss ) )
            // InternalMGPL.g:4590:2: ( ruleAttrAss )
            {
            // InternalMGPL.g:4590:2: ( ruleAttrAss )
            // InternalMGPL.g:4591:3: ruleAttrAss
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssListAccess().getAssignmentsAttrAssParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttrAss();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssListAccess().getAssignmentsAttrAssParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__AssignmentsAssignment_0"


    // $ANTLR start "rule__AttrAssList__AssignmentsAssignment_1_1"
    // InternalMGPL.g:4600:1: rule__AttrAssList__AssignmentsAssignment_1_1 : ( ruleAttrAss ) ;
    public final void rule__AttrAssList__AssignmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4604:1: ( ( ruleAttrAss ) )
            // InternalMGPL.g:4605:2: ( ruleAttrAss )
            {
            // InternalMGPL.g:4605:2: ( ruleAttrAss )
            // InternalMGPL.g:4606:3: ruleAttrAss
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssListAccess().getAssignmentsAttrAssParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttrAss();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssListAccess().getAssignmentsAttrAssParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAssList__AssignmentsAssignment_1_1"


    // $ANTLR start "rule__AttrAss__AttributeNameAssignment_0"
    // InternalMGPL.g:4615:1: rule__AttrAss__AttributeNameAssignment_0 : ( RULE_IDF ) ;
    public final void rule__AttrAss__AttributeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4619:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4620:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4620:2: ( RULE_IDF )
            // InternalMGPL.g:4621:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssAccess().getAttributeNameIDFTerminalRuleCall_0_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssAccess().getAttributeNameIDFTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAss__AttributeNameAssignment_0"


    // $ANTLR start "rule__AttrAss__ValueAssignment_2"
    // InternalMGPL.g:4630:1: rule__AttrAss__ValueAssignment_2 : ( ruleExpr ) ;
    public final void rule__AttrAss__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4634:1: ( ( ruleExpr ) )
            // InternalMGPL.g:4635:2: ( ruleExpr )
            {
            // InternalMGPL.g:4635:2: ( ruleExpr )
            // InternalMGPL.g:4636:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrAssAccess().getValueExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrAssAccess().getValueExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrAss__ValueAssignment_2"


    // $ANTLR start "rule__AnimBlock__NameAssignment_1"
    // InternalMGPL.g:4645:1: rule__AnimBlock__NameAssignment_1 : ( RULE_IDF ) ;
    public final void rule__AnimBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4649:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4650:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4650:2: ( RULE_IDF )
            // InternalMGPL.g:4651:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getNameIDFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getNameIDFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__NameAssignment_1"


    // $ANTLR start "rule__AnimBlock__TargetAssignment_3"
    // InternalMGPL.g:4660:1: rule__AnimBlock__TargetAssignment_3 : ( ruleAnimTarget ) ;
    public final void rule__AnimBlock__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4664:1: ( ( ruleAnimTarget ) )
            // InternalMGPL.g:4665:2: ( ruleAnimTarget )
            {
            // InternalMGPL.g:4665:2: ( ruleAnimTarget )
            // InternalMGPL.g:4666:3: ruleAnimTarget
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getTargetAnimTargetParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnimTarget();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getTargetAnimTargetParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__TargetAssignment_3"


    // $ANTLR start "rule__AnimBlock__ActionAssignment_5"
    // InternalMGPL.g:4675:1: rule__AnimBlock__ActionAssignment_5 : ( ruleStmtBlock ) ;
    public final void rule__AnimBlock__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4679:1: ( ( ruleStmtBlock ) )
            // InternalMGPL.g:4680:2: ( ruleStmtBlock )
            {
            // InternalMGPL.g:4680:2: ( ruleStmtBlock )
            // InternalMGPL.g:4681:3: ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimBlockAccess().getActionStmtBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmtBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimBlockAccess().getActionStmtBlockParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimBlock__ActionAssignment_5"


    // $ANTLR start "rule__AnimTarget__TypeAssignment_0"
    // InternalMGPL.g:4690:1: rule__AnimTarget__TypeAssignment_0 : ( ruleObjType ) ;
    public final void rule__AnimTarget__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4694:1: ( ( ruleObjType ) )
            // InternalMGPL.g:4695:2: ( ruleObjType )
            {
            // InternalMGPL.g:4695:2: ( ruleObjType )
            // InternalMGPL.g:4696:3: ruleObjType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimTargetAccess().getTypeObjTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObjType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimTargetAccess().getTypeObjTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimTarget__TypeAssignment_0"


    // $ANTLR start "rule__AnimTarget__NameAssignment_1"
    // InternalMGPL.g:4705:1: rule__AnimTarget__NameAssignment_1 : ( RULE_IDF ) ;
    public final void rule__AnimTarget__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4709:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4710:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4710:2: ( RULE_IDF )
            // InternalMGPL.g:4711:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimTargetAccess().getNameIDFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimTargetAccess().getNameIDFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimTarget__NameAssignment_1"


    // $ANTLR start "rule__EventBlock__KeyAssignment_1"
    // InternalMGPL.g:4720:1: rule__EventBlock__KeyAssignment_1 : ( ruleKeyStroke ) ;
    public final void rule__EventBlock__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4724:1: ( ( ruleKeyStroke ) )
            // InternalMGPL.g:4725:2: ( ruleKeyStroke )
            {
            // InternalMGPL.g:4725:2: ( ruleKeyStroke )
            // InternalMGPL.g:4726:3: ruleKeyStroke
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventBlockAccess().getKeyKeyStrokeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKeyStroke();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventBlockAccess().getKeyKeyStrokeEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBlock__KeyAssignment_1"


    // $ANTLR start "rule__EventBlock__ActionAssignment_2"
    // InternalMGPL.g:4735:1: rule__EventBlock__ActionAssignment_2 : ( ruleStmtBlock ) ;
    public final void rule__EventBlock__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4739:1: ( ( ruleStmtBlock ) )
            // InternalMGPL.g:4740:2: ( ruleStmtBlock )
            {
            // InternalMGPL.g:4740:2: ( ruleStmtBlock )
            // InternalMGPL.g:4741:3: ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventBlockAccess().getActionStmtBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmtBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventBlockAccess().getActionStmtBlockParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBlock__ActionAssignment_2"


    // $ANTLR start "rule__StmtBlock__StatementsAssignment_2"
    // InternalMGPL.g:4750:1: rule__StmtBlock__StatementsAssignment_2 : ( ruleStmt ) ;
    public final void rule__StmtBlock__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4754:1: ( ( ruleStmt ) )
            // InternalMGPL.g:4755:2: ( ruleStmt )
            {
            // InternalMGPL.g:4755:2: ( ruleStmt )
            // InternalMGPL.g:4756:3: ruleStmt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtBlockAccess().getStatementsStmtParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtBlockAccess().getStatementsStmtParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtBlock__StatementsAssignment_2"


    // $ANTLR start "rule__IfStmt__ConditionAssignment_2"
    // InternalMGPL.g:4765:1: rule__IfStmt__ConditionAssignment_2 : ( ruleExpr ) ;
    public final void rule__IfStmt__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4769:1: ( ( ruleExpr ) )
            // InternalMGPL.g:4770:2: ( ruleExpr )
            {
            // InternalMGPL.g:4770:2: ( ruleExpr )
            // InternalMGPL.g:4771:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getConditionExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getConditionExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__ConditionAssignment_2"


    // $ANTLR start "rule__IfStmt__ThenAssignment_4"
    // InternalMGPL.g:4780:1: rule__IfStmt__ThenAssignment_4 : ( ruleStmtBlock ) ;
    public final void rule__IfStmt__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4784:1: ( ( ruleStmtBlock ) )
            // InternalMGPL.g:4785:2: ( ruleStmtBlock )
            {
            // InternalMGPL.g:4785:2: ( ruleStmtBlock )
            // InternalMGPL.g:4786:3: ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getThenStmtBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmtBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getThenStmtBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__ThenAssignment_4"


    // $ANTLR start "rule__IfStmt__ElseAssignment_5_1"
    // InternalMGPL.g:4795:1: rule__IfStmt__ElseAssignment_5_1 : ( ruleStmtBlock ) ;
    public final void rule__IfStmt__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4799:1: ( ( ruleStmtBlock ) )
            // InternalMGPL.g:4800:2: ( ruleStmtBlock )
            {
            // InternalMGPL.g:4800:2: ( ruleStmtBlock )
            // InternalMGPL.g:4801:3: ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStmtAccess().getElseStmtBlockParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmtBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStmtAccess().getElseStmtBlockParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStmt__ElseAssignment_5_1"


    // $ANTLR start "rule__ForStmt__InitAssignment_2"
    // InternalMGPL.g:4810:1: rule__ForStmt__InitAssignment_2 : ( ruleAssignment ) ;
    public final void rule__ForStmt__InitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4814:1: ( ( ruleAssignment ) )
            // InternalMGPL.g:4815:2: ( ruleAssignment )
            {
            // InternalMGPL.g:4815:2: ( ruleAssignment )
            // InternalMGPL.g:4816:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getInitAssignmentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getInitAssignmentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__InitAssignment_2"


    // $ANTLR start "rule__ForStmt__ConditionAssignment_4"
    // InternalMGPL.g:4825:1: rule__ForStmt__ConditionAssignment_4 : ( ruleExpr ) ;
    public final void rule__ForStmt__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4829:1: ( ( ruleExpr ) )
            // InternalMGPL.g:4830:2: ( ruleExpr )
            {
            // InternalMGPL.g:4830:2: ( ruleExpr )
            // InternalMGPL.g:4831:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getConditionExprParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getConditionExprParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__ConditionAssignment_4"


    // $ANTLR start "rule__ForStmt__StepAssignment_6"
    // InternalMGPL.g:4840:1: rule__ForStmt__StepAssignment_6 : ( ruleAssignment ) ;
    public final void rule__ForStmt__StepAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4844:1: ( ( ruleAssignment ) )
            // InternalMGPL.g:4845:2: ( ruleAssignment )
            {
            // InternalMGPL.g:4845:2: ( ruleAssignment )
            // InternalMGPL.g:4846:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getStepAssignmentParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getStepAssignmentParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__StepAssignment_6"


    // $ANTLR start "rule__ForStmt__BodyAssignment_8"
    // InternalMGPL.g:4855:1: rule__ForStmt__BodyAssignment_8 : ( ruleStmtBlock ) ;
    public final void rule__ForStmt__BodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4859:1: ( ( ruleStmtBlock ) )
            // InternalMGPL.g:4860:2: ( ruleStmtBlock )
            {
            // InternalMGPL.g:4860:2: ( ruleStmtBlock )
            // InternalMGPL.g:4861:3: ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStmtAccess().getBodyStmtBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStmtBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStmtAccess().getBodyStmtBlockParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStmt__BodyAssignment_8"


    // $ANTLR start "rule__Assignment__VarAssignment_0"
    // InternalMGPL.g:4870:1: rule__Assignment__VarAssignment_0 : ( ruleVar ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4874:1: ( ( ruleVar ) )
            // InternalMGPL.g:4875:2: ( ruleVar )
            {
            // InternalMGPL.g:4875:2: ( ruleVar )
            // InternalMGPL.g:4876:3: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVarVarParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVarVarParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VarAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalMGPL.g:4885:1: rule__Assignment__ValueAssignment_2 : ( ruleExpr ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4889:1: ( ( ruleExpr ) )
            // InternalMGPL.g:4890:2: ( ruleExpr )
            {
            // InternalMGPL.g:4890:2: ( ruleExpr )
            // InternalMGPL.g:4891:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__Var__VariableAssignment_0"
    // InternalMGPL.g:4900:1: rule__Var__VariableAssignment_0 : ( ( RULE_IDF ) ) ;
    public final void rule__Var__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4904:1: ( ( ( RULE_IDF ) ) )
            // InternalMGPL.g:4905:2: ( ( RULE_IDF ) )
            {
            // InternalMGPL.g:4905:2: ( ( RULE_IDF ) )
            // InternalMGPL.g:4906:3: ( RULE_IDF )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_0_0()); 
            }
            // InternalMGPL.g:4907:3: ( RULE_IDF )
            // InternalMGPL.g:4908:4: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVariableReferenceTargetIDFTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVariableReferenceTargetIDFTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__VariableAssignment_0"


    // $ANTLR start "rule__Var__VariableAssignment_1_0"
    // InternalMGPL.g:4919:1: rule__Var__VariableAssignment_1_0 : ( ( RULE_IDF ) ) ;
    public final void rule__Var__VariableAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4923:1: ( ( ( RULE_IDF ) ) )
            // InternalMGPL.g:4924:2: ( ( RULE_IDF ) )
            {
            // InternalMGPL.g:4924:2: ( ( RULE_IDF ) )
            // InternalMGPL.g:4925:3: ( RULE_IDF )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_1_0_0()); 
            }
            // InternalMGPL.g:4926:3: ( RULE_IDF )
            // InternalMGPL.g:4927:4: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVariableReferenceTargetIDFTerminalRuleCall_1_0_0_1()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVariableReferenceTargetIDFTerminalRuleCall_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__VariableAssignment_1_0"


    // $ANTLR start "rule__Var__IndexAssignment_1_2"
    // InternalMGPL.g:4938:1: rule__Var__IndexAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__Var__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4942:1: ( ( ruleExpr ) )
            // InternalMGPL.g:4943:2: ( ruleExpr )
            {
            // InternalMGPL.g:4943:2: ( ruleExpr )
            // InternalMGPL.g:4944:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getIndexExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getIndexExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__IndexAssignment_1_2"


    // $ANTLR start "rule__Var__AttributeAssignment_1_4_1"
    // InternalMGPL.g:4953:1: rule__Var__AttributeAssignment_1_4_1 : ( RULE_IDF ) ;
    public final void rule__Var__AttributeAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4957:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4958:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4958:2: ( RULE_IDF )
            // InternalMGPL.g:4959:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAttributeIDFTerminalRuleCall_1_4_1_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getAttributeIDFTerminalRuleCall_1_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__AttributeAssignment_1_4_1"


    // $ANTLR start "rule__Var__VariableAssignment_2_0"
    // InternalMGPL.g:4968:1: rule__Var__VariableAssignment_2_0 : ( ( RULE_IDF ) ) ;
    public final void rule__Var__VariableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4972:1: ( ( ( RULE_IDF ) ) )
            // InternalMGPL.g:4973:2: ( ( RULE_IDF ) )
            {
            // InternalMGPL.g:4973:2: ( ( RULE_IDF ) )
            // InternalMGPL.g:4974:3: ( RULE_IDF )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_2_0_0()); 
            }
            // InternalMGPL.g:4975:3: ( RULE_IDF )
            // InternalMGPL.g:4976:4: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVariableReferenceTargetIDFTerminalRuleCall_2_0_0_1()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVariableReferenceTargetIDFTerminalRuleCall_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVariableReferenceTargetCrossReference_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__VariableAssignment_2_0"


    // $ANTLR start "rule__Var__AttributeAssignment_2_2"
    // InternalMGPL.g:4987:1: rule__Var__AttributeAssignment_2_2 : ( RULE_IDF ) ;
    public final void rule__Var__AttributeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:4991:1: ( ( RULE_IDF ) )
            // InternalMGPL.g:4992:2: ( RULE_IDF )
            {
            // InternalMGPL.g:4992:2: ( RULE_IDF )
            // InternalMGPL.g:4993:3: RULE_IDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getAttributeIDFTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_IDF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getAttributeIDFTerminalRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__AttributeAssignment_2_2"


    // $ANTLR start "rule__OrExpr__OpAssignment_1_1"
    // InternalMGPL.g:5002:1: rule__OrExpr__OpAssignment_1_1 : ( ( '||' ) ) ;
    public final void rule__OrExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5006:1: ( ( ( '||' ) ) )
            // InternalMGPL.g:5007:2: ( ( '||' ) )
            {
            // InternalMGPL.g:5007:2: ( ( '||' ) )
            // InternalMGPL.g:5008:3: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            // InternalMGPL.g:5009:3: ( '||' )
            // InternalMGPL.g:5010:4: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__OpAssignment_1_1"


    // $ANTLR start "rule__OrExpr__RightAssignment_1_2"
    // InternalMGPL.g:5021:1: rule__OrExpr__RightAssignment_1_2 : ( ruleBoolExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5025:1: ( ( ruleBoolExpr ) )
            // InternalMGPL.g:5026:2: ( ruleBoolExpr )
            {
            // InternalMGPL.g:5026:2: ( ruleBoolExpr )
            // InternalMGPL.g:5027:3: ruleBoolExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightBoolExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getRightBoolExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__RightAssignment_1_2"


    // $ANTLR start "rule__BoolExpr__OpAssignment_1_1"
    // InternalMGPL.g:5036:1: rule__BoolExpr__OpAssignment_1_1 : ( ( '&&' ) ) ;
    public final void rule__BoolExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5040:1: ( ( ( '&&' ) ) )
            // InternalMGPL.g:5041:2: ( ( '&&' ) )
            {
            // InternalMGPL.g:5041:2: ( ( '&&' ) )
            // InternalMGPL.g:5042:3: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            // InternalMGPL.g:5043:3: ( '&&' )
            // InternalMGPL.g:5044:4: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__OpAssignment_1_1"


    // $ANTLR start "rule__BoolExpr__RightAssignment_1_2"
    // InternalMGPL.g:5055:1: rule__BoolExpr__RightAssignment_1_2 : ( ruleRelExpr ) ;
    public final void rule__BoolExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5059:1: ( ( ruleRelExpr ) )
            // InternalMGPL.g:5060:2: ( ruleRelExpr )
            {
            // InternalMGPL.g:5060:2: ( ruleRelExpr )
            // InternalMGPL.g:5061:3: ruleRelExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getRightRelExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getRightRelExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__RightAssignment_1_2"


    // $ANTLR start "rule__RelExpr__OpAssignment_1_1"
    // InternalMGPL.g:5070:1: rule__RelExpr__OpAssignment_1_1 : ( ( rule__RelExpr__OpAlternatives_1_1_0 ) ) ;
    public final void rule__RelExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5074:1: ( ( ( rule__RelExpr__OpAlternatives_1_1_0 ) ) )
            // InternalMGPL.g:5075:2: ( ( rule__RelExpr__OpAlternatives_1_1_0 ) )
            {
            // InternalMGPL.g:5075:2: ( ( rule__RelExpr__OpAlternatives_1_1_0 ) )
            // InternalMGPL.g:5076:3: ( rule__RelExpr__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalMGPL.g:5077:3: ( rule__RelExpr__OpAlternatives_1_1_0 )
            // InternalMGPL.g:5077:4: rule__RelExpr__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RelExpr__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__OpAssignment_1_1"


    // $ANTLR start "rule__RelExpr__RightAssignment_1_2"
    // InternalMGPL.g:5085:1: rule__RelExpr__RightAssignment_1_2 : ( ruleAddExpr ) ;
    public final void rule__RelExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5089:1: ( ( ruleAddExpr ) )
            // InternalMGPL.g:5090:2: ( ruleAddExpr )
            {
            // InternalMGPL.g:5090:2: ( ruleAddExpr )
            // InternalMGPL.g:5091:3: ruleAddExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getRightAddExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getRightAddExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelExpr__RightAssignment_1_2"


    // $ANTLR start "rule__AddExpr__OpAssignment_1_1"
    // InternalMGPL.g:5100:1: rule__AddExpr__OpAssignment_1_1 : ( ( rule__AddExpr__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AddExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5104:1: ( ( ( rule__AddExpr__OpAlternatives_1_1_0 ) ) )
            // InternalMGPL.g:5105:2: ( ( rule__AddExpr__OpAlternatives_1_1_0 ) )
            {
            // InternalMGPL.g:5105:2: ( ( rule__AddExpr__OpAlternatives_1_1_0 ) )
            // InternalMGPL.g:5106:3: ( rule__AddExpr__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalMGPL.g:5107:3: ( rule__AddExpr__OpAlternatives_1_1_0 )
            // InternalMGPL.g:5107:4: rule__AddExpr__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpr__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__OpAssignment_1_1"


    // $ANTLR start "rule__AddExpr__RightAssignment_1_2"
    // InternalMGPL.g:5115:1: rule__AddExpr__RightAssignment_1_2 : ( ruleMulExpr ) ;
    public final void rule__AddExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5119:1: ( ( ruleMulExpr ) )
            // InternalMGPL.g:5120:2: ( ruleMulExpr )
            {
            // InternalMGPL.g:5120:2: ( ruleMulExpr )
            // InternalMGPL.g:5121:3: ruleMulExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getRightMulExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getRightMulExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpr__RightAssignment_1_2"


    // $ANTLR start "rule__MulExpr__OpAssignment_1_1"
    // InternalMGPL.g:5130:1: rule__MulExpr__OpAssignment_1_1 : ( ( rule__MulExpr__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5134:1: ( ( ( rule__MulExpr__OpAlternatives_1_1_0 ) ) )
            // InternalMGPL.g:5135:2: ( ( rule__MulExpr__OpAlternatives_1_1_0 ) )
            {
            // InternalMGPL.g:5135:2: ( ( rule__MulExpr__OpAlternatives_1_1_0 ) )
            // InternalMGPL.g:5136:3: ( rule__MulExpr__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalMGPL.g:5137:3: ( rule__MulExpr__OpAlternatives_1_1_0 )
            // InternalMGPL.g:5137:4: rule__MulExpr__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__OpAssignment_1_1"


    // $ANTLR start "rule__MulExpr__RightAssignment_1_2"
    // InternalMGPL.g:5145:1: rule__MulExpr__RightAssignment_1_2 : ( ruleSimpleExpr ) ;
    public final void rule__MulExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5149:1: ( ( ruleSimpleExpr ) )
            // InternalMGPL.g:5150:2: ( ruleSimpleExpr )
            {
            // InternalMGPL.g:5150:2: ( ruleSimpleExpr )
            // InternalMGPL.g:5151:3: ruleSimpleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getRightSimpleExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimpleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getRightSimpleExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__RightAssignment_1_2"


    // $ANTLR start "rule__SimpleExpr__ToucheeAssignment_2_1_2"
    // InternalMGPL.g:5160:1: rule__SimpleExpr__ToucheeAssignment_2_1_2 : ( ruleVarExpr ) ;
    public final void rule__SimpleExpr__ToucheeAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5164:1: ( ( ruleVarExpr ) )
            // InternalMGPL.g:5165:2: ( ruleVarExpr )
            {
            // InternalMGPL.g:5165:2: ( ruleVarExpr )
            // InternalMGPL.g:5166:3: ruleVarExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExprAccess().getToucheeVarExprParserRuleCall_2_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExprAccess().getToucheeVarExprParserRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpr__ToucheeAssignment_2_1_2"


    // $ANTLR start "rule__UnaryExpr__OpAssignment_0"
    // InternalMGPL.g:5175:1: rule__UnaryExpr__OpAssignment_0 : ( ( rule__UnaryExpr__OpAlternatives_0_0 ) ) ;
    public final void rule__UnaryExpr__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5179:1: ( ( ( rule__UnaryExpr__OpAlternatives_0_0 ) ) )
            // InternalMGPL.g:5180:2: ( ( rule__UnaryExpr__OpAlternatives_0_0 ) )
            {
            // InternalMGPL.g:5180:2: ( ( rule__UnaryExpr__OpAlternatives_0_0 ) )
            // InternalMGPL.g:5181:3: ( rule__UnaryExpr__OpAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getOpAlternatives_0_0()); 
            }
            // InternalMGPL.g:5182:3: ( rule__UnaryExpr__OpAlternatives_0_0 )
            // InternalMGPL.g:5182:4: rule__UnaryExpr__OpAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__OpAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getOpAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__OpAssignment_0"


    // $ANTLR start "rule__UnaryExpr__OperandAssignment_1"
    // InternalMGPL.g:5190:1: rule__UnaryExpr__OperandAssignment_1 : ( ruleSimpleExpr ) ;
    public final void rule__UnaryExpr__OperandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5194:1: ( ( ruleSimpleExpr ) )
            // InternalMGPL.g:5195:2: ( ruleSimpleExpr )
            {
            // InternalMGPL.g:5195:2: ( ruleSimpleExpr )
            // InternalMGPL.g:5196:3: ruleSimpleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getOperandSimpleExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimpleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getOperandSimpleExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__OperandAssignment_1"


    // $ANTLR start "rule__NumberExpr__NumberAssignment"
    // InternalMGPL.g:5205:1: rule__NumberExpr__NumberAssignment : ( RULE_INT ) ;
    public final void rule__NumberExpr__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5209:1: ( ( RULE_INT ) )
            // InternalMGPL.g:5210:2: ( RULE_INT )
            {
            // InternalMGPL.g:5210:2: ( RULE_INT )
            // InternalMGPL.g:5211:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberExprAccess().getNumberINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberExprAccess().getNumberINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberExpr__NumberAssignment"


    // $ANTLR start "rule__VarExpr__VarAssignment"
    // InternalMGPL.g:5220:1: rule__VarExpr__VarAssignment : ( ruleVar ) ;
    public final void rule__VarExpr__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGPL.g:5224:1: ( ( ruleVar ) )
            // InternalMGPL.g:5225:2: ( ruleVar )
            {
            // InternalMGPL.g:5225:2: ( ruleVar )
            // InternalMGPL.g:5226:3: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExprAccess().getVarVarParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExprAccess().getVarVarParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__VarAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008100700000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100700002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020090030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000B0000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000A0000000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000A0000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});

}