package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tempo_visitaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tempo_visitaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tempo_visitaPageResponseProjection() {
    }

    public Tempo_visitaPageResponseProjection(Tempo_visitaPageResponseProjection projection) {
        super(projection);
    }

    public Tempo_visitaPageResponseProjection(List<Tempo_visitaPageResponseProjection> projections) {
        super(projections);
    }

    public Tempo_visitaPageResponseProjection all$() {
        return all$(3);
    }

    public Tempo_visitaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tempo_visitaPageResponseProjection.Tempo_visitaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tempo_visitaPageResponseProjection.Tempo_visitaResponseProjection.items", projectionDepthOnFields.getOrDefault("Tempo_visitaPageResponseProjection.Tempo_visitaResponseProjection.items", 0) + 1);
            this.items(new Tempo_visitaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tempo_visitaPageResponseProjection.Tempo_visitaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Tempo_visitaPageResponseProjection items(Tempo_visitaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tempo_visitaPageResponseProjection items(String alias, Tempo_visitaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tempo_visitaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tempo_visitaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tempo_visitaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Tempo_visitaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Tempo_visitaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Tempo_visitaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Tempo_visitaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Tempo_visitaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Tempo_visitaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Tempo_visitaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Tempo_visitaPageResponseProjection typename() {
        return typename(null);
    }

    public Tempo_visitaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tempo_visitaPageResponseProjection deepCopy$() {
        return new Tempo_visitaPageResponseProjection(this);
    }


}
