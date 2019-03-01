    AtomFeatureNum   = 30   => 33 (30 + 4 - 1)
    RepairFeatureNum = 5    => 5
    ValueFeatureNum  = 12   => 10 (12 - 2)
    
    RepairFeatureNum     = RepairFeatureNum                      = 5    => 5
    GlobalFeatureNum     = 3 * AtomFeatureNum * RepairFeatureNum = 450  => 495
    VarCrossFeatureNum   = 3 * AtomFeatureNum * AtomFeatureNum   = 2700 => 3267
    ValueCrossFeatureNum = AtomFeatureNum * ValueFeatureNum      = 360  => 330

    There are some features mentioned in ProphetPaper but not implemented in ProphetCode, like VARIABLE_AF, EXCLUDE_ATOM_AF, OPERATE_LHS_AF, OPERATE_RHS_AF, ASSIGN_RHS_AF. As well as some features seem useful but not introduced in ProphetPaper and ProphetCode, such as DELETE_STMT_RF, UNKNOWN_STMT_RF. Prophet4J follows the way of ProphetCode, excluding these features.
    
    Some features are inapplicable to Java, namely ADDRESS_OF_AF, POINTER_VF, STRUCT_POINTER_VF, marked with :no_entry_sign:. In addition, there are some features are extended from original features, that is, OP_DIV_AF and OP_MOD_AF are from DivOpAF, OP_LE_AF and OP_LT_AF are from LessOpAF, OP_GE_AF and OP_GT_AF are from GreaterOpAF, as well as OP_EQ_AF and OP_NE_AF are from EqOpAF.

|FeatureCate|FeatureType4C|FeatureType4J|Test|
|:-:|:-:|:-:|:-:|
|`AtomFeature`|`AddOpAF`|`OP_ADD_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L25)|
|`AtomFeature`|`SubOpAF`|`OP_SUB_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L34)|
|`AtomFeature`|`MulOpAF`|`OP_MUL_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L43)|
|`AtomFeature`|`DivOpAF`|`OP_DIV_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L50)|
|`AtomFeature`|`DivOpAF`|`OP_MOD_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L57)|
|`AtomFeature`|`LessOpAF`|`OP_LE_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L64)|
|`AtomFeature`|`LessOpAF`|`OP_LT_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L69)|
|`AtomFeature`|`GreaterOpAF`|`OP_GE_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L74)|
|`AtomFeature`|`GreaterOpAF`|`OP_GT_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L79)|
|`AtomFeature`|`EqOpAF`|`OP_EQ_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L84)|
|`AtomFeature`|`EqOpAF`|`OP_NE_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L89)|
|`AtomFeature`|`IncUOpAF`|`UOP_INC_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L94)|
|`AtomFeature`|`DecUOpAF`|`UOP_DEC_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L101)|
|`AtomFeature`|`AssignLHSAF`|`ASSIGN_LHS_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L108)|
|`AtomFeature`|`AssignZeroAF`|`ASSIGN_ZERO_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L113)|
|`AtomFeature`|`AssignConstantAF`|`ASSIGN_CONST_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L118)|
|`AtomFeature`|`ChangedAF`|`CHANGED_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L123)|
|`AtomFeature`|`DerefAF`|`DEREF_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L135)|
|`AtomFeature`|`IndexAF`|`INDEX_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L140)|
|`AtomFeature`|`MemberAccessAF`|`MEMBER_ACCESS_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L145)|
|`AtomFeature`|`CalleeAF`|`CALLEE_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L150)|
|`AtomFeature`|`CallArgumentAF`|`CALL_ARGUMENT_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L155)|
|`AtomFeature`|`AbstVAF`|`ABST_V_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L160)|
|`AtomFeature`|`StmtLabelAF`|`STMT_LABEL_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L174)|
|`AtomFeature`|`StmtLoopAF`|`STMT_LOOP_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L182)|
|`AtomFeature`|`StmtAssignAF`|`STMT_ASSIGN_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L193)|
|`AtomFeature`|`StmtCallAF`|`STMT_CALL_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L198)|
|`AtomFeature`|`StmtIfAF`|`STMT_COND_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L203)|
|`AtomFeature`|`StmtControlAF`|`STMT_CONTROL_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L208)|
|`AtomFeature`|`RStmtAssignAF`|`R_STMT_ASSIGN_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L213)|
|`AtomFeature`|`RStmtCallAF`|`R_STMT_CALL_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L218)|
|`AtomFeature`|`RStmtCondAF`|`R_STMT_COND_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L223)|
|`AtomFeature`|`RStmtControlAF`|`R_STMT_CONTROL_AF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L228)|
|`AtomFeature`|`AddrOfAF`|`ADDRESS_OF_AF`|:no_entry_sign:|
|`RepairFeature`|`InsertControlRF`|`INSERT_CONTROL_RF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L240)|
|`RepairFeature`|`AddGuardCondRF`|`INSERT_GUARD_RF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L245)|
|`RepairFeature`|`InsertStmtRF`|`INSERT_STMT_RF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L250)|
|`RepairFeature`|`ReplaceCondRF`|`REPLACE_COND_RF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L255)|
|`RepairFeature`|`ReplaceStmtRF`|`REPLACE_STMT_RF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L260)|
|`ValueFeature`|`ModifiedVF`|`MODIFIED_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L270)|
|`ValueFeature`|`ModifiedSimilarVF`|`MODIFIED_SIMILAR_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L275)|
|`ValueFeature`|`FuncArgumentVF`|`FUNC_ARGUMENT_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L280)|
|`ValueFeature`|`MemberVF`|`MEMBER_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L285)|
|`ValueFeature`|`LocalVarVF`|`LOCAL_VARIABLE_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L288)|
|`ValueFeature`|`GlobalVarVF`|`GLOBAL_VARIABLE_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L293)|
|`ValueFeature`|`ZeroConstVF`|`ZERO_CONST_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L298)|
|`ValueFeature`|`NonZeroConstVF`|`NONZERO_CONST_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L303)|
|`ValueFeature`|`StringLiteralVF`|`STRING_LITERAL_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L308)|
|`ValueFeature`|`LenLiteralVF`|`SIZE_LITERAL_VF`|[okay](https://github.com/SpoonLabs/coming/blob/master/src/test/java/prophet4j/FeatureExtractorTest.java#L313)|
|`ValueFeature`|`PointerVF`|`POINTER_VF`|:no_entry_sign:|
|`ValueFeature`|`StructPointerVF`|`STRUCT_POINTER_VF`|:no_entry_sign:|