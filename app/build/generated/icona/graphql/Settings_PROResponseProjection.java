package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Settings_PRO
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Settings_PROResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Settings_PROResponseProjection() {
    }

    public Settings_PROResponseProjection(Settings_PROResponseProjection projection) {
        super(projection);
    }

    public Settings_PROResponseProjection(List<Settings_PROResponseProjection> projections) {
        super(projections);
    }

    public Settings_PROResponseProjection all$() {
        return all$(3);
    }

    public Settings_PROResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        if (projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.FileInfoResponseProjection.template_credenziali", 0) <= maxDepth) {
            projectionDepthOnFields.put("Settings_PROResponseProjection.FileInfoResponseProjection.template_credenziali", projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.FileInfoResponseProjection.template_credenziali", 0) + 1);
            this.template_credenziali(new FileInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.FileInfoResponseProjection.template_credenziali", 0)));
        }
        this.tempo_disponibile_mesi();
        if (projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.Range_BMIPageResponseProjection.range_BMI_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Settings_PROResponseProjection.Range_BMIPageResponseProjection.range_BMI_", projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.Range_BMIPageResponseProjection.range_BMI_", 0) + 1);
            this.range_BMI_(new Range_BMIPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.Range_BMIPageResponseProjection.range_BMI_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.Testo_introPageResponseProjection.testo_intro_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Settings_PROResponseProjection.Testo_introPageResponseProjection.testo_intro_", projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.Testo_introPageResponseProjection.testo_intro_", 0) + 1);
            this.testo_intro_(new Testo_introPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Settings_PROResponseProjection.Testo_introPageResponseProjection.testo_intro_", 0)));
        }
        this.typename();
        return this;
    }

    public Settings_PROResponseProjection _clientId() {
        return _clientId(null);
    }

    public Settings_PROResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Settings_PROResponseProjection _id() {
        return _id(null);
    }

    public Settings_PROResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Settings_PROResponseProjection template_credenziali(FileInfoResponseProjection subProjection) {
        return template_credenziali(null, subProjection);
    }

    public Settings_PROResponseProjection template_credenziali(String alias, FileInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("template_credenziali").alias(alias).projection(subProjection));
        return this;
    }

    public Settings_PROResponseProjection tempo_disponibile_mesi() {
        return tempo_disponibile_mesi(null);
    }

    public Settings_PROResponseProjection tempo_disponibile_mesi(String alias) {
        add$(new GraphQLResponseField("tempo_disponibile_mesi").alias(alias));
        return this;
    }

    public Settings_PROResponseProjection range_BMI_(Range_BMIPageResponseProjection subProjection) {
        return range_BMI_((String)null, subProjection);
    }

    public Settings_PROResponseProjection range_BMI_(String alias, Range_BMIPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("range_BMI_").alias(alias).projection(subProjection));
        return this;
    }

    public Settings_PROResponseProjection range_BMI_(Settings_PRORange_BMI_ParametrizedInput input, Range_BMIPageResponseProjection subProjection) {
        return range_BMI_(null, input, subProjection);
    }

    public Settings_PROResponseProjection range_BMI_(String alias, Settings_PRORange_BMI_ParametrizedInput input, Range_BMIPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("range_BMI_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Settings_PROResponseProjection testo_intro_(Testo_introPageResponseProjection subProjection) {
        return testo_intro_((String)null, subProjection);
    }

    public Settings_PROResponseProjection testo_intro_(String alias, Testo_introPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("testo_intro_").alias(alias).projection(subProjection));
        return this;
    }

    public Settings_PROResponseProjection testo_intro_(Settings_PROTesto_intro_ParametrizedInput input, Testo_introPageResponseProjection subProjection) {
        return testo_intro_(null, input, subProjection);
    }

    public Settings_PROResponseProjection testo_intro_(String alias, Settings_PROTesto_intro_ParametrizedInput input, Testo_introPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("testo_intro_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Settings_PROResponseProjection typename() {
        return typename(null);
    }

    public Settings_PROResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Settings_PROResponseProjection deepCopy$() {
        return new Settings_PROResponseProjection(this);
    }


}
