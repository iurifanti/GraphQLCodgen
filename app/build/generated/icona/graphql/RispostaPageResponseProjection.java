package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for RispostaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class RispostaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RispostaPageResponseProjection() {
    }

    public RispostaPageResponseProjection(RispostaPageResponseProjection projection) {
        super(projection);
    }

    public RispostaPageResponseProjection(List<RispostaPageResponseProjection> projections) {
        super(projections);
    }

    public RispostaPageResponseProjection all$() {
        return all$(3);
    }

    public RispostaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RispostaPageResponseProjection.RispostaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("RispostaPageResponseProjection.RispostaResponseProjection.items", projectionDepthOnFields.getOrDefault("RispostaPageResponseProjection.RispostaResponseProjection.items", 0) + 1);
            this.items(new RispostaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RispostaPageResponseProjection.RispostaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public RispostaPageResponseProjection items(RispostaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public RispostaPageResponseProjection items(String alias, RispostaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public RispostaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public RispostaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RispostaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public RispostaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public RispostaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public RispostaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public RispostaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public RispostaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public RispostaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public RispostaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public RispostaPageResponseProjection typename() {
        return typename(null);
    }

    public RispostaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RispostaPageResponseProjection deepCopy$() {
        return new RispostaPageResponseProjection(this);
    }


}
