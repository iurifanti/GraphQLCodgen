package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_antitumoralePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_antitumoralePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_antitumoralePageResponseProjection() {
    }

    public Farmaco_antitumoralePageResponseProjection(Farmaco_antitumoralePageResponseProjection projection) {
        super(projection);
    }

    public Farmaco_antitumoralePageResponseProjection(List<Farmaco_antitumoralePageResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_antitumoralePageResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_antitumoralePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Farmaco_antitumoralePageResponseProjection.Farmaco_antitumoraleResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_antitumoralePageResponseProjection.Farmaco_antitumoraleResponseProjection.items", projectionDepthOnFields.getOrDefault("Farmaco_antitumoralePageResponseProjection.Farmaco_antitumoraleResponseProjection.items", 0) + 1);
            this.items(new Farmaco_antitumoraleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_antitumoralePageResponseProjection.Farmaco_antitumoraleResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Farmaco_antitumoralePageResponseProjection items(Farmaco_antitumoraleResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Farmaco_antitumoralePageResponseProjection items(String alias, Farmaco_antitumoraleResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_antitumoralePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Farmaco_antitumoralePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Farmaco_antitumoralePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Farmaco_antitumoralePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Farmaco_antitumoralePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Farmaco_antitumoralePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Farmaco_antitumoralePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Farmaco_antitumoralePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Farmaco_antitumoralePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Farmaco_antitumoralePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Farmaco_antitumoralePageResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_antitumoralePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_antitumoralePageResponseProjection deepCopy$() {
        return new Farmaco_antitumoralePageResponseProjection(this);
    }


}
