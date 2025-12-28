package icona.graphql;


/**
 * Resolver for Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Visita_mpvResolver {

    /**
     * The associable objects for the role centro_provenienza_.
     */
    CliCentro_provenienzaPageDTO centro_provenienza____associables(CliVisita_mpvDTO visita_mpv, CliCentro_provenienzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role comorbidita_mpv_.
     */
    CliComorbidita_mpvPageDTO comorbidita_mpv____associables(CliVisita_mpvDTO visita_mpv, CliComorbidita_mpvPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role comorbidita_mpv_.
     */
    CliComorbidita_mpvPageDTO comorbidita_mpv_(CliVisita_mpvDTO visita_mpv, CliComorbidita_mpvPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role dose_mpv_.
     */
    CliDose_mpvPageDTO dose_mpv_(CliVisita_mpvDTO visita_mpv, CliDose_mpvPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role episodio_MPOX_.
     */
    CliEpisodio_MPOXPageDTO episodio_MPOX_(CliVisita_mpvDTO visita_mpv, CliEpisodio_MPOXPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role gruppo_.
     */
    CliGruppoPageDTO gruppo____associables(CliVisita_mpvDTO visita_mpv, CliGruppoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role modalita_somministrazione_pre1.
     */
    CliModalita_somministrazionePageDTO modalita_somministrazione_pre1___associables(CliVisita_mpvDTO visita_mpv, CliModalita_somministrazionePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role modalita_somministrazione_pre2.
     */
    CliModalita_somministrazionePageDTO modalita_somministrazione_pre2___associables(CliVisita_mpvDTO visita_mpv, CliModalita_somministrazionePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role tipo_visita_mp_.
     */
    CliTipo_visita_mpvPageDTO tipo_visita_mp____associables(CliVisita_mpvDTO visita_mpv, CliTipo_visita_mpvPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role tipo_visita_mp_booster.
     */
    CliTipo_visita_mpvPageDTO tipo_visita_mp_booster___associables(CliVisita_mpvDTO visita_mpv, CliTipo_visita_mpvPageOptionsDTO options) throws Exception;

}
