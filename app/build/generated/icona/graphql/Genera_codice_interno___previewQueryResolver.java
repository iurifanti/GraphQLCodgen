package icona.graphql;


/**
 * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
Note that the passed param should NOT have the _id attribute
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Genera_codice_interno___previewQueryResolver {

    /**
     * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
Note that the passed param should NOT have the _id attribute
     */
    CliGenera_codice_internoDTO Genera_codice_interno___preview(@javax.validation.constraints.NotNull CliGenera_codice_internoDraftDTO data) throws Exception;

}
