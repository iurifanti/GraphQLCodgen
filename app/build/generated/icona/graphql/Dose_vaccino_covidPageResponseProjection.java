package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Dose_vaccino_covidPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Dose_vaccino_covidPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Dose_vaccino_covidPageResponseProjection() {
    }

    public Dose_vaccino_covidPageResponseProjection(Dose_vaccino_covidPageResponseProjection projection) {
        super(projection);
    }

    public Dose_vaccino_covidPageResponseProjection(List<Dose_vaccino_covidPageResponseProjection> projections) {
        super(projections);
    }

    public Dose_vaccino_covidPageResponseProjection all$() {
        return all$(3);
    }

    public Dose_vaccino_covidPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidPageResponseProjection.Dose_vaccino_covidResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidPageResponseProjection.Dose_vaccino_covidResponseProjection.items", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidPageResponseProjection.Dose_vaccino_covidResponseProjection.items", 0) + 1);
            this.items(new Dose_vaccino_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidPageResponseProjection.Dose_vaccino_covidResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Dose_vaccino_covidPageResponseProjection items(Dose_vaccino_covidResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Dose_vaccino_covidPageResponseProjection items(String alias, Dose_vaccino_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Dose_vaccino_covidPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Dose_vaccino_covidPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Dose_vaccino_covidPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Dose_vaccino_covidPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Dose_vaccino_covidPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Dose_vaccino_covidPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Dose_vaccino_covidPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Dose_vaccino_covidPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Dose_vaccino_covidPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Dose_vaccino_covidPageResponseProjection typename() {
        return typename(null);
    }

    public Dose_vaccino_covidPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Dose_vaccino_covidPageResponseProjection deepCopy$() {
        return new Dose_vaccino_covidPageResponseProjection(this);
    }


}
