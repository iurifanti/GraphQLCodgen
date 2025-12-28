package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Classificazione_ICD10Page
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Classificazione_ICD10PageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Classificazione_ICD10PageResponseProjection() {
    }

    public Classificazione_ICD10PageResponseProjection(Classificazione_ICD10PageResponseProjection projection) {
        super(projection);
    }

    public Classificazione_ICD10PageResponseProjection(List<Classificazione_ICD10PageResponseProjection> projections) {
        super(projections);
    }

    public Classificazione_ICD10PageResponseProjection all$() {
        return all$(3);
    }

    public Classificazione_ICD10PageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Classificazione_ICD10PageResponseProjection.Classificazione_ICD10ResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Classificazione_ICD10PageResponseProjection.Classificazione_ICD10ResponseProjection.items", projectionDepthOnFields.getOrDefault("Classificazione_ICD10PageResponseProjection.Classificazione_ICD10ResponseProjection.items", 0) + 1);
            this.items(new Classificazione_ICD10ResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Classificazione_ICD10PageResponseProjection.Classificazione_ICD10ResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Classificazione_ICD10PageResponseProjection items(Classificazione_ICD10ResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Classificazione_ICD10PageResponseProjection items(String alias, Classificazione_ICD10ResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Classificazione_ICD10PageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Classificazione_ICD10PageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Classificazione_ICD10PageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Classificazione_ICD10PageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Classificazione_ICD10PageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Classificazione_ICD10PageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Classificazione_ICD10PageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Classificazione_ICD10PageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Classificazione_ICD10PageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Classificazione_ICD10PageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Classificazione_ICD10PageResponseProjection typename() {
        return typename(null);
    }

    public Classificazione_ICD10PageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Classificazione_ICD10PageResponseProjection deepCopy$() {
        return new Classificazione_ICD10PageResponseProjection(this);
    }


}
