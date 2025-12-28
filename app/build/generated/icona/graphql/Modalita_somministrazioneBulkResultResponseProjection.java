package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Modalita_somministrazioneBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Modalita_somministrazioneBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Modalita_somministrazioneBulkResultResponseProjection() {
    }

    public Modalita_somministrazioneBulkResultResponseProjection(Modalita_somministrazioneBulkResultResponseProjection projection) {
        super(projection);
    }

    public Modalita_somministrazioneBulkResultResponseProjection(List<Modalita_somministrazioneBulkResultResponseProjection> projections) {
        super(projections);
    }

    public Modalita_somministrazioneBulkResultResponseProjection all$() {
        return all$(3);
    }

    public Modalita_somministrazioneBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Modalita_somministrazioneBulkResultResponseProjection.Modalita_somministrazioneResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Modalita_somministrazioneBulkResultResponseProjection.Modalita_somministrazioneResponseProjection.items", projectionDepthOnFields.getOrDefault("Modalita_somministrazioneBulkResultResponseProjection.Modalita_somministrazioneResponseProjection.items", 0) + 1);
            this.items(new Modalita_somministrazioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Modalita_somministrazioneBulkResultResponseProjection.Modalita_somministrazioneResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public Modalita_somministrazioneBulkResultResponseProjection items(Modalita_somministrazioneResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Modalita_somministrazioneBulkResultResponseProjection items(String alias, Modalita_somministrazioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Modalita_somministrazioneBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public Modalita_somministrazioneBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Modalita_somministrazioneBulkResultResponseProjection typename() {
        return typename(null);
    }

    public Modalita_somministrazioneBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Modalita_somministrazioneBulkResultResponseProjection deepCopy$() {
        return new Modalita_somministrazioneBulkResultResponseProjection(this);
    }


}
