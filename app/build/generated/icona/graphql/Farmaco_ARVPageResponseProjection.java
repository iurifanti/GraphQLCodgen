package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_ARVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ARVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_ARVPageResponseProjection() {
    }

    public Farmaco_ARVPageResponseProjection(Farmaco_ARVPageResponseProjection projection) {
        super(projection);
    }

    public Farmaco_ARVPageResponseProjection(List<Farmaco_ARVPageResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_ARVPageResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_ARVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Farmaco_ARVPageResponseProjection.Farmaco_ARVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ARVPageResponseProjection.Farmaco_ARVResponseProjection.items", projectionDepthOnFields.getOrDefault("Farmaco_ARVPageResponseProjection.Farmaco_ARVResponseProjection.items", 0) + 1);
            this.items(new Farmaco_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ARVPageResponseProjection.Farmaco_ARVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Farmaco_ARVPageResponseProjection items(Farmaco_ARVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Farmaco_ARVPageResponseProjection items(String alias, Farmaco_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ARVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Farmaco_ARVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Farmaco_ARVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Farmaco_ARVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Farmaco_ARVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Farmaco_ARVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Farmaco_ARVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Farmaco_ARVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Farmaco_ARVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Farmaco_ARVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Farmaco_ARVPageResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_ARVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_ARVPageResponseProjection deepCopy$() {
        return new Farmaco_ARVPageResponseProjection(this);
    }


}
