package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_ATCPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ATCPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_ATCPageResponseProjection() {
    }

    public Farmaco_ATCPageResponseProjection(Farmaco_ATCPageResponseProjection projection) {
        super(projection);
    }

    public Farmaco_ATCPageResponseProjection(List<Farmaco_ATCPageResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_ATCPageResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_ATCPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Farmaco_ATCPageResponseProjection.Farmaco_ATCResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ATCPageResponseProjection.Farmaco_ATCResponseProjection.items", projectionDepthOnFields.getOrDefault("Farmaco_ATCPageResponseProjection.Farmaco_ATCResponseProjection.items", 0) + 1);
            this.items(new Farmaco_ATCResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ATCPageResponseProjection.Farmaco_ATCResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Farmaco_ATCPageResponseProjection items(Farmaco_ATCResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Farmaco_ATCPageResponseProjection items(String alias, Farmaco_ATCResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ATCPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Farmaco_ATCPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Farmaco_ATCPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Farmaco_ATCPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Farmaco_ATCPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Farmaco_ATCPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Farmaco_ATCPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Farmaco_ATCPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Farmaco_ATCPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Farmaco_ATCPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Farmaco_ATCPageResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_ATCPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_ATCPageResponseProjection deepCopy$() {
        return new Farmaco_ATCPageResponseProjection(this);
    }


}
