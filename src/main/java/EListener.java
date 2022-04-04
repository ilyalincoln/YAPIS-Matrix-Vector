// Generated from E.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EParser}.
 */
public interface EListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void enterDigit_expression(EParser.Digit_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void exitDigit_expression(EParser.Digit_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#input_signature}.
	 * @param ctx the parse tree
	 */
	void enterInput_signature(EParser.Input_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#input_signature}.
	 * @param ctx the parse tree
	 */
	void exitInput_signature(EParser.Input_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign_int}.
	 * @param ctx the parse tree
	 */
	void enterAssign_int(EParser.Assign_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign_int}.
	 * @param ctx the parse tree
	 */
	void exitAssign_int(EParser.Assign_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign_int_by_subprogram}.
	 * @param ctx the parse tree
	 */
	void enterAssign_int_by_subprogram(EParser.Assign_int_by_subprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign_int_by_subprogram}.
	 * @param ctx the parse tree
	 */
	void exitAssign_int_by_subprogram(EParser.Assign_int_by_subprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#programm_call}.
	 * @param ctx the parse tree
	 */
	void enterProgramm_call(EParser.Programm_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#programm_call}.
	 * @param ctx the parse tree
	 */
	void exitProgramm_call(EParser.Programm_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign_vec}.
	 * @param ctx the parse tree
	 */
	void enterAssign_vec(EParser.Assign_vecContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign_vec}.
	 * @param ctx the parse tree
	 */
	void exitAssign_vec(EParser.Assign_vecContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign_vec_by_subprogram}.
	 * @param ctx the parse tree
	 */
	void enterAssign_vec_by_subprogram(EParser.Assign_vec_by_subprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign_vec_by_subprogram}.
	 * @param ctx the parse tree
	 */
	void exitAssign_vec_by_subprogram(EParser.Assign_vec_by_subprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#set_vec_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_vec_expr(EParser.Set_vec_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#set_vec_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_vec_expr(EParser.Set_vec_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#set_vec_expr_by_mat}.
	 * @param ctx the parse tree
	 */
	void enterSet_vec_expr_by_mat(EParser.Set_vec_expr_by_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#set_vec_expr_by_mat}.
	 * @param ctx the parse tree
	 */
	void exitSet_vec_expr_by_mat(EParser.Set_vec_expr_by_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#assign_mat}.
	 * @param ctx the parse tree
	 */
	void enterAssign_mat(EParser.Assign_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#assign_mat}.
	 * @param ctx the parse tree
	 */
	void exitAssign_mat(EParser.Assign_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#set_mat}.
	 * @param ctx the parse tree
	 */
	void enterSet_mat(EParser.Set_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#set_mat}.
	 * @param ctx the parse tree
	 */
	void exitSet_mat(EParser.Set_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#set_mat_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_mat_expr(EParser.Set_mat_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#set_mat_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_mat_expr(EParser.Set_mat_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#get_mat_row_by_id}.
	 * @param ctx the parse tree
	 */
	void enterGet_mat_row_by_id(EParser.Get_mat_row_by_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#get_mat_row_by_id}.
	 * @param ctx the parse tree
	 */
	void exitGet_mat_row_by_id(EParser.Get_mat_row_by_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#print_number}.
	 * @param ctx the parse tree
	 */
	void enterPrint_number(EParser.Print_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#print_number}.
	 * @param ctx the parse tree
	 */
	void exitPrint_number(EParser.Print_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#print_id}.
	 * @param ctx the parse tree
	 */
	void enterPrint_id(EParser.Print_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#print_id}.
	 * @param ctx the parse tree
	 */
	void exitPrint_id(EParser.Print_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#print_string}.
	 * @param ctx the parse tree
	 */
	void enterPrint_string(EParser.Print_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#print_string}.
	 * @param ctx the parse tree
	 */
	void exitPrint_string(EParser.Print_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#print_mat_row}.
	 * @param ctx the parse tree
	 */
	void enterPrint_mat_row(EParser.Print_mat_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#print_mat_row}.
	 * @param ctx the parse tree
	 */
	void exitPrint_mat_row(EParser.Print_mat_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void enterSimple_compare(EParser.Simple_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void exitSimple_compare(EParser.Simple_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void enterHard_compare(EParser.Hard_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void exitHard_compare(EParser.Hard_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#else_compare}.
	 * @param ctx the parse tree
	 */
	void enterElse_compare(EParser.Else_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#else_compare}.
	 * @param ctx the parse tree
	 */
	void exitElse_compare(EParser.Else_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cicle(EParser.While_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cicle(EParser.While_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(EParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(EParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(EParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(EParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_return(EParser.Subprogram_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_return(EParser.Subprogram_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_non_return(EParser.Subprogram_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_non_return(EParser.Subprogram_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(EParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(EParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(EParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(EParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#global_program}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_program(EParser.Global_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#global_program}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_program(EParser.Global_programContext ctx);
}