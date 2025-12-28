package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tempo_sierologia_covidPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tempo_sierologia_covidPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tempo_sierologia_covidPageResponseProjection() {
    }

    public Tempo_sierologia_covidPageResponseProjection(Tempo_sierologia_covidPageResponseProjection projection) {
        super(projection);
    }

    public Tempo_sierologia_covidPageResponseProjection(List<Tempo_sierologia_covidPageResponseProjection> projections) {
        super(projections);
    }

    public Tempo_sierologia_covidPageResponseProjection all$() {
        return all$(3);
    }

    public Tempo_sierologia_covidPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tempo_sierologia_covidPageResponseProjection.Tempo_sierologia_covidResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tempo_sierologia_covidPageResponseProjection.Tempo_sierologia_covidResponseProjection.items", projectionDepthOnFields.getOrDefault("Tempo_sierologia_covidPageResponseProjection.Tempo_sierologia_covidResponseProjection.items", 0) + 1);
            this.items(new Tempo_sierologia_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tempo_sierologia_covidPageResponseProjection.Tempo_sierologia_covidResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Tempo_sierologia_covidPageResponseProjection items(Tempo_sierologia_covidResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tempo_sierologia_covidPageResponseProjection items(String alias, Tempo_sierologia_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tempo_sierologia_covidPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tempo_sierologia_covidPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Tempo_sierologia_covidPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Tempo_sierologia_covidPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Tempo_sierologia_covidPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Tempo_sierologia_covidPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidPageResponseProjection typename() {
        return typename(null);
    }

    public Tempo_sierologia_covidPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tempo_sierologia_covidPageResponseProjection deepCopy$() {
        return new Tempo_sierologia_covidPageResponseProjection(this);
    }


}
