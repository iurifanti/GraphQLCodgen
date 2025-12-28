package icona.graphql;


/**
 * Resolver for Sequenza_genomica
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Sequenza_genomicaResolver {

    /**
     * The associable objects for the role centro_sequenziatore.
     */
    CliCentro_sequenziatorePageDTO centro_sequenziatore___associables(CliSequenza_genomicaDTO sequenza_genomica, CliCentro_sequenziatorePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role metodica_genotipo.
     */
    CliMetodica_genotipoPageDTO metodica_genotipo___associables(CliSequenza_genomicaDTO sequenza_genomica, CliMetodica_genotipoPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role mutazione.
     */
    CliMutazionePageDTO mutazione(CliSequenza_genomicaDTO sequenza_genomica, CliMutazionePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role paziente.
     */
    CliPazientePageDTO paziente___associables(CliSequenza_genomicaDTO sequenza_genomica, CliPazientePageOptionsDTO options) throws Exception;

}
