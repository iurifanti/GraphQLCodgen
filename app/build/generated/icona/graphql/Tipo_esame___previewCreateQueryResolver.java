package icona.graphql;


/**
 * Retrieve a preview object of class Tipo_esame for an object of Tipo_esame not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_esame___previewCreateQueryResolver {

    /**
     * Retrieve a preview object of class Tipo_esame for an object of Tipo_esame not yet instanced.
     */
    CliTipo_esameDTO Tipo_esame___previewCreate(@javax.validation.constraints.NotNull CliTipo_esameDraftCreateDTO data) throws Exception;

}
