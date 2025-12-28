package icona.graphql;


/**
 * Retrieve a preview object of class Paziente for an object of Paziente not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Paziente___previewCreateQueryResolver {

    /**
     * Retrieve a preview object of class Paziente for an object of Paziente not yet instanced.
     */
    CliPazienteDTO Paziente___previewCreate(@javax.validation.constraints.NotNull CliPazienteDraftCreateDTO data) throws Exception;

}
