package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Testo_intro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Testo_introResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Testo_introResponseProjection() {
    }

    public Testo_introResponseProjection(Testo_introResponseProjection projection) {
        super(projection);
    }

    public Testo_introResponseProjection(List<Testo_introResponseProjection> projections) {
        super(projections);
    }

    public Testo_introResponseProjection all$() {
        return all$(3);
    }

    public Testo_introResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.ordine();
        this.testo();
        this.titolo();
        if (projectionDepthOnFields.getOrDefault("Testo_introResponseProjection.Settings_PROResponseProjection.settings_PRO_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Testo_introResponseProjection.Settings_PROResponseProjection.settings_PRO_", projectionDepthOnFields.getOrDefault("Testo_introResponseProjection.Settings_PROResponseProjection.settings_PRO_", 0) + 1);
            this.settings_PRO_(new Settings_PROResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Testo_introResponseProjection.Settings_PROResponseProjection.settings_PRO_", 0)));
        }
        this.typename();
        return this;
    }

    public Testo_introResponseProjection _clientId() {
        return _clientId(null);
    }

    public Testo_introResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Testo_introResponseProjection _id() {
        return _id(null);
    }

    public Testo_introResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Testo_introResponseProjection ordine() {
        return ordine(null);
    }

    public Testo_introResponseProjection ordine(String alias) {
        add$(new GraphQLResponseField("ordine").alias(alias));
        return this;
    }

    public Testo_introResponseProjection testo() {
        return testo(null);
    }

    public Testo_introResponseProjection testo(String alias) {
        add$(new GraphQLResponseField("testo").alias(alias));
        return this;
    }

    public Testo_introResponseProjection titolo() {
        return titolo(null);
    }

    public Testo_introResponseProjection titolo(String alias) {
        add$(new GraphQLResponseField("titolo").alias(alias));
        return this;
    }

    public Testo_introResponseProjection settings_PRO_(Settings_PROResponseProjection subProjection) {
        return settings_PRO_(null, subProjection);
    }

    public Testo_introResponseProjection settings_PRO_(String alias, Settings_PROResponseProjection subProjection) {
        add$(new GraphQLResponseField("settings_PRO_").alias(alias).projection(subProjection));
        return this;
    }

    public Testo_introResponseProjection typename() {
        return typename(null);
    }

    public Testo_introResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Testo_introResponseProjection deepCopy$() {
        return new Testo_introResponseProjection(this);
    }


}
