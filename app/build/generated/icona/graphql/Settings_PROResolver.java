package icona.graphql;


/**
 * Resolver for Settings_PRO
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Settings_PROResolver {

    /**
     * The associated objects for the role range_BMI_.
     */
    CliRange_BMIPageDTO range_BMI_(CliSettings_PRODTO settings_PRO, CliRange_BMIPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role testo_intro_.
     */
    CliTesto_introPageDTO testo_intro_(CliSettings_PRODTO settings_PRO, CliTesto_introPageOptionsDTO options) throws Exception;

}
