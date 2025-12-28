package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_covidPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_covidPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_covidPageResponseProjection() {
    }

    public Farmaco_covidPageResponseProjection(Farmaco_covidPageResponseProjection projection) {
        super(projection);
    }

    public Farmaco_covidPageResponseProjection(List<Farmaco_covidPageResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_covidPageResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_covidPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Farmaco_covidPageResponseProjection.Farmaco_covidResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_covidPageResponseProjection.Farmaco_covidResponseProjection.items", projectionDepthOnFields.getOrDefault("Farmaco_covidPageResponseProjection.Farmaco_covidResponseProjection.items", 0) + 1);
            this.items(new Farmaco_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_covidPageResponseProjection.Farmaco_covidResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Farmaco_covidPageResponseProjection items(Farmaco_covidResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Farmaco_covidPageResponseProjection items(String alias, Farmaco_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_covidPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Farmaco_covidPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Farmaco_covidPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Farmaco_covidPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Farmaco_covidPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Farmaco_covidPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Farmaco_covidPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Farmaco_covidPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Farmaco_covidPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Farmaco_covidPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Farmaco_covidPageResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_covidPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_covidPageResponseProjection deepCopy$() {
        return new Farmaco_covidPageResponseProjection(this);
    }


}
