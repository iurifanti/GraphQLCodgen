package icona.graphql;


/**
 * Retrieve a preview object of class P_Paziente for an object of P_Paziente not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___previewQueryResolver {

    /**
     * Retrieve a preview object of class P_Paziente for an object of P_Paziente not yet instanced.
     */
    CliP_PazienteDTO P_Paziente___preview(@javax.validation.constraints.NotNull CliP_PazienteDraftDTO data) throws Exception;

}
