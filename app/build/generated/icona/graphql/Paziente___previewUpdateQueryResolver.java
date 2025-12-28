package icona.graphql;


/**
 * Retrieve a preview object of class Paziente for an updated instance of Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Paziente___previewUpdateQueryResolver {

    /**
     * Retrieve a preview object of class Paziente for an updated instance of Paziente.
     */
    CliPazienteDTO Paziente___previewUpdate(@javax.validation.constraints.NotNull CliPazienteDraftUpdateDTO data) throws Exception;

}
