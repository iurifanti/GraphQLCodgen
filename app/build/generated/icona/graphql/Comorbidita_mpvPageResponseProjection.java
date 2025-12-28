package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Comorbidita_mpvPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Comorbidita_mpvPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Comorbidita_mpvPageResponseProjection() {
    }

    public Comorbidita_mpvPageResponseProjection(Comorbidita_mpvPageResponseProjection projection) {
        super(projection);
    }

    public Comorbidita_mpvPageResponseProjection(List<Comorbidita_mpvPageResponseProjection> projections) {
        super(projections);
    }

    public Comorbidita_mpvPageResponseProjection all$() {
        return all$(3);
    }

    public Comorbidita_mpvPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Comorbidita_mpvPageResponseProjection.Comorbidita_mpvResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Comorbidita_mpvPageResponseProjection.Comorbidita_mpvResponseProjection.items", projectionDepthOnFields.getOrDefault("Comorbidita_mpvPageResponseProjection.Comorbidita_mpvResponseProjection.items", 0) + 1);
            this.items(new Comorbidita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Comorbidita_mpvPageResponseProjection.Comorbidita_mpvResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Comorbidita_mpvPageResponseProjection items(Comorbidita_mpvResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Comorbidita_mpvPageResponseProjection items(String alias, Comorbidita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Comorbidita_mpvPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Comorbidita_mpvPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Comorbidita_mpvPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Comorbidita_mpvPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Comorbidita_mpvPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Comorbidita_mpvPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Comorbidita_mpvPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Comorbidita_mpvPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Comorbidita_mpvPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Comorbidita_mpvPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Comorbidita_mpvPageResponseProjection typename() {
        return typename(null);
    }

    public Comorbidita_mpvPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Comorbidita_mpvPageResponseProjection deepCopy$() {
        return new Comorbidita_mpvPageResponseProjection(this);
    }


}
