package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Range_BMI
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Range_BMIResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Range_BMIResponseProjection() {
    }

    public Range_BMIResponseProjection(Range_BMIResponseProjection projection) {
        super(projection);
    }

    public Range_BMIResponseProjection(List<Range_BMIResponseProjection> projections) {
        super(projections);
    }

    public Range_BMIResponseProjection all$() {
        return all$(3);
    }

    public Range_BMIResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.colore();
        this.messaggio();
        this.min();
        if (projectionDepthOnFields.getOrDefault("Range_BMIResponseProjection.Settings_PROResponseProjection.settings_PRO_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Range_BMIResponseProjection.Settings_PROResponseProjection.settings_PRO_", projectionDepthOnFields.getOrDefault("Range_BMIResponseProjection.Settings_PROResponseProjection.settings_PRO_", 0) + 1);
            this.settings_PRO_(new Settings_PROResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Range_BMIResponseProjection.Settings_PROResponseProjection.settings_PRO_", 0)));
        }
        this.typename();
        return this;
    }

    public Range_BMIResponseProjection _clientId() {
        return _clientId(null);
    }

    public Range_BMIResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Range_BMIResponseProjection _id() {
        return _id(null);
    }

    public Range_BMIResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Range_BMIResponseProjection colore() {
        return colore(null);
    }

    public Range_BMIResponseProjection colore(String alias) {
        add$(new GraphQLResponseField("colore").alias(alias));
        return this;
    }

    public Range_BMIResponseProjection messaggio() {
        return messaggio(null);
    }

    public Range_BMIResponseProjection messaggio(String alias) {
        add$(new GraphQLResponseField("messaggio").alias(alias));
        return this;
    }

    public Range_BMIResponseProjection min() {
        return min(null);
    }

    public Range_BMIResponseProjection min(String alias) {
        add$(new GraphQLResponseField("min").alias(alias));
        return this;
    }

    public Range_BMIResponseProjection settings_PRO_(Settings_PROResponseProjection subProjection) {
        return settings_PRO_(null, subProjection);
    }

    public Range_BMIResponseProjection settings_PRO_(String alias, Settings_PROResponseProjection subProjection) {
        add$(new GraphQLResponseField("settings_PRO_").alias(alias).projection(subProjection));
        return this;
    }

    public Range_BMIResponseProjection typename() {
        return typename(null);
    }

    public Range_BMIResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Range_BMIResponseProjection deepCopy$() {
        return new Range_BMIResponseProjection(this);
    }


}
