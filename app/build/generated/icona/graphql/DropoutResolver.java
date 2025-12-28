package icona.graphql;


/**
 * Resolver for Dropout
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface DropoutResolver {

    /**
     * The associable objects for the role causa_decesso.
     */
    CliCausa_decessoPageDTO causa_decesso___associables(CliDropoutDTO dropout, CliCausa_decessoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role causa_decesso_sec.
     */
    CliCausa_decessoPageDTO causa_decesso_sec___associables(CliDropoutDTO dropout, CliCausa_decessoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role causa_decesso_stimata.
     */
    CliCausa_decessoPageDTO causa_decesso_stimata___associables(CliDropoutDTO dropout, CliCausa_decessoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role motivazione_dropout.
     */
    CliMotivazione_dropoutPageDTO motivazione_dropout___associables(CliDropoutDTO dropout, CliMotivazione_dropoutPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role relazione_decesso_1.
     */
    CliRelazione_decessoPageDTO relazione_decesso_1___associables(CliDropoutDTO dropout, CliRelazione_decessoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role relazione_decesso_2.
     */
    CliRelazione_decessoPageDTO relazione_decesso_2___associables(CliDropoutDTO dropout, CliRelazione_decessoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role sede_decesso.
     */
    CliSede_decessoPageDTO sede_decesso___associables(CliDropoutDTO dropout, CliSede_decessoPageOptionsDTO options) throws Exception;

}
