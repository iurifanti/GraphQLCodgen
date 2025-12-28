package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Studio_pazientePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Studio_pazientePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Studio_pazientePageResponseProjection() {
    }

    public Studio_pazientePageResponseProjection(Studio_pazientePageResponseProjection projection) {
        super(projection);
    }

    public Studio_pazientePageResponseProjection(List<Studio_pazientePageResponseProjection> projections) {
        super(projections);
    }

    public Studio_pazientePageResponseProjection all$() {
        return all$(3);
    }

    public Studio_pazientePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Studio_pazientePageResponseProjection.Studio_pazienteResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Studio_pazientePageResponseProjection.Studio_pazienteResponseProjection.items", projectionDepthOnFields.getOrDefault("Studio_pazientePageResponseProjection.Studio_pazienteResponseProjection.items", 0) + 1);
            this.items(new Studio_pazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Studio_pazientePageResponseProjection.Studio_pazienteResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Studio_pazientePageResponseProjection items(Studio_pazienteResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Studio_pazientePageResponseProjection items(String alias, Studio_pazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Studio_pazientePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Studio_pazientePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Studio_pazientePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Studio_pazientePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Studio_pazientePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Studio_pazientePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Studio_pazientePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Studio_pazientePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Studio_pazientePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Studio_pazientePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Studio_pazientePageResponseProjection typename() {
        return typename(null);
    }

    public Studio_pazientePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Studio_pazientePageResponseProjection deepCopy$() {
        return new Studio_pazientePageResponseProjection(this);
    }


}
