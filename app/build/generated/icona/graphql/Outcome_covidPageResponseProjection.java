package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Outcome_covidPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Outcome_covidPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Outcome_covidPageResponseProjection() {
    }

    public Outcome_covidPageResponseProjection(Outcome_covidPageResponseProjection projection) {
        super(projection);
    }

    public Outcome_covidPageResponseProjection(List<Outcome_covidPageResponseProjection> projections) {
        super(projections);
    }

    public Outcome_covidPageResponseProjection all$() {
        return all$(3);
    }

    public Outcome_covidPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Outcome_covidPageResponseProjection.Outcome_covidResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Outcome_covidPageResponseProjection.Outcome_covidResponseProjection.items", projectionDepthOnFields.getOrDefault("Outcome_covidPageResponseProjection.Outcome_covidResponseProjection.items", 0) + 1);
            this.items(new Outcome_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Outcome_covidPageResponseProjection.Outcome_covidResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Outcome_covidPageResponseProjection items(Outcome_covidResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Outcome_covidPageResponseProjection items(String alias, Outcome_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Outcome_covidPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Outcome_covidPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Outcome_covidPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Outcome_covidPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Outcome_covidPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Outcome_covidPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Outcome_covidPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Outcome_covidPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Outcome_covidPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Outcome_covidPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Outcome_covidPageResponseProjection typename() {
        return typename(null);
    }

    public Outcome_covidPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Outcome_covidPageResponseProjection deepCopy$() {
        return new Outcome_covidPageResponseProjection(this);
    }


}
