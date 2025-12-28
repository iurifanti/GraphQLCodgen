package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Terapia_covidPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_covidPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Terapia_covidPageResponseProjection() {
    }

    public Terapia_covidPageResponseProjection(Terapia_covidPageResponseProjection projection) {
        super(projection);
    }

    public Terapia_covidPageResponseProjection(List<Terapia_covidPageResponseProjection> projections) {
        super(projections);
    }

    public Terapia_covidPageResponseProjection all$() {
        return all$(3);
    }

    public Terapia_covidPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Terapia_covidPageResponseProjection.Terapia_covidResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_covidPageResponseProjection.Terapia_covidResponseProjection.items", projectionDepthOnFields.getOrDefault("Terapia_covidPageResponseProjection.Terapia_covidResponseProjection.items", 0) + 1);
            this.items(new Terapia_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_covidPageResponseProjection.Terapia_covidResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Terapia_covidPageResponseProjection items(Terapia_covidResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Terapia_covidPageResponseProjection items(String alias, Terapia_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_covidPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Terapia_covidPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Terapia_covidPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Terapia_covidPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Terapia_covidPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Terapia_covidPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Terapia_covidPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Terapia_covidPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Terapia_covidPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Terapia_covidPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Terapia_covidPageResponseProjection typename() {
        return typename(null);
    }

    public Terapia_covidPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Terapia_covidPageResponseProjection deepCopy$() {
        return new Terapia_covidPageResponseProjection(this);
    }


}
