package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Centro_sequenziatorePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Centro_sequenziatorePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Centro_sequenziatorePageResponseProjection() {
    }

    public Centro_sequenziatorePageResponseProjection(Centro_sequenziatorePageResponseProjection projection) {
        super(projection);
    }

    public Centro_sequenziatorePageResponseProjection(List<Centro_sequenziatorePageResponseProjection> projections) {
        super(projections);
    }

    public Centro_sequenziatorePageResponseProjection all$() {
        return all$(3);
    }

    public Centro_sequenziatorePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Centro_sequenziatorePageResponseProjection.Centro_sequenziatoreResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Centro_sequenziatorePageResponseProjection.Centro_sequenziatoreResponseProjection.items", projectionDepthOnFields.getOrDefault("Centro_sequenziatorePageResponseProjection.Centro_sequenziatoreResponseProjection.items", 0) + 1);
            this.items(new Centro_sequenziatoreResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Centro_sequenziatorePageResponseProjection.Centro_sequenziatoreResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Centro_sequenziatorePageResponseProjection items(Centro_sequenziatoreResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Centro_sequenziatorePageResponseProjection items(String alias, Centro_sequenziatoreResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Centro_sequenziatorePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Centro_sequenziatorePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Centro_sequenziatorePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Centro_sequenziatorePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Centro_sequenziatorePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Centro_sequenziatorePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Centro_sequenziatorePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Centro_sequenziatorePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Centro_sequenziatorePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Centro_sequenziatorePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Centro_sequenziatorePageResponseProjection typename() {
        return typename(null);
    }

    public Centro_sequenziatorePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Centro_sequenziatorePageResponseProjection deepCopy$() {
        return new Centro_sequenziatorePageResponseProjection(this);
    }


}
