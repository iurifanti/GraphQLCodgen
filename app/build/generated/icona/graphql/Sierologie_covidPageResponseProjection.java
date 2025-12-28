package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sierologie_covidPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sierologie_covidPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sierologie_covidPageResponseProjection() {
    }

    public Sierologie_covidPageResponseProjection(Sierologie_covidPageResponseProjection projection) {
        super(projection);
    }

    public Sierologie_covidPageResponseProjection(List<Sierologie_covidPageResponseProjection> projections) {
        super(projections);
    }

    public Sierologie_covidPageResponseProjection all$() {
        return all$(3);
    }

    public Sierologie_covidPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidPageResponseProjection.Sierologie_covidResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidPageResponseProjection.Sierologie_covidResponseProjection.items", projectionDepthOnFields.getOrDefault("Sierologie_covidPageResponseProjection.Sierologie_covidResponseProjection.items", 0) + 1);
            this.items(new Sierologie_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidPageResponseProjection.Sierologie_covidResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Sierologie_covidPageResponseProjection items(Sierologie_covidResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Sierologie_covidPageResponseProjection items(String alias, Sierologie_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Sierologie_covidPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Sierologie_covidPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Sierologie_covidPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Sierologie_covidPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Sierologie_covidPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Sierologie_covidPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Sierologie_covidPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Sierologie_covidPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Sierologie_covidPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Sierologie_covidPageResponseProjection typename() {
        return typename(null);
    }

    public Sierologie_covidPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sierologie_covidPageResponseProjection deepCopy$() {
        return new Sierologie_covidPageResponseProjection(this);
    }


}
