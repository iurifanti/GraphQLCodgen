package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Identita_generePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Identita_generePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Identita_generePageResponseProjection() {
    }

    public Identita_generePageResponseProjection(Identita_generePageResponseProjection projection) {
        super(projection);
    }

    public Identita_generePageResponseProjection(List<Identita_generePageResponseProjection> projections) {
        super(projections);
    }

    public Identita_generePageResponseProjection all$() {
        return all$(3);
    }

    public Identita_generePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Identita_generePageResponseProjection.Identita_genereResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Identita_generePageResponseProjection.Identita_genereResponseProjection.items", projectionDepthOnFields.getOrDefault("Identita_generePageResponseProjection.Identita_genereResponseProjection.items", 0) + 1);
            this.items(new Identita_genereResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Identita_generePageResponseProjection.Identita_genereResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Identita_generePageResponseProjection items(Identita_genereResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Identita_generePageResponseProjection items(String alias, Identita_genereResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Identita_generePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Identita_generePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Identita_generePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Identita_generePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Identita_generePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Identita_generePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Identita_generePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Identita_generePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Identita_generePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Identita_generePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Identita_generePageResponseProjection typename() {
        return typename(null);
    }

    public Identita_generePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Identita_generePageResponseProjection deepCopy$() {
        return new Identita_generePageResponseProjection(this);
    }


}
