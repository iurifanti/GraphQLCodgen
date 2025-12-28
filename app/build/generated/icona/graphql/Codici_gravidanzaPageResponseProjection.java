package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Codici_gravidanzaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Codici_gravidanzaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Codici_gravidanzaPageResponseProjection() {
    }

    public Codici_gravidanzaPageResponseProjection(Codici_gravidanzaPageResponseProjection projection) {
        super(projection);
    }

    public Codici_gravidanzaPageResponseProjection(List<Codici_gravidanzaPageResponseProjection> projections) {
        super(projections);
    }

    public Codici_gravidanzaPageResponseProjection all$() {
        return all$(3);
    }

    public Codici_gravidanzaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Codici_gravidanzaPageResponseProjection.Codici_gravidanzaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Codici_gravidanzaPageResponseProjection.Codici_gravidanzaResponseProjection.items", projectionDepthOnFields.getOrDefault("Codici_gravidanzaPageResponseProjection.Codici_gravidanzaResponseProjection.items", 0) + 1);
            this.items(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Codici_gravidanzaPageResponseProjection.Codici_gravidanzaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Codici_gravidanzaPageResponseProjection items(Codici_gravidanzaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Codici_gravidanzaPageResponseProjection items(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Codici_gravidanzaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Codici_gravidanzaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Codici_gravidanzaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Codici_gravidanzaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Codici_gravidanzaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Codici_gravidanzaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Codici_gravidanzaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Codici_gravidanzaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Codici_gravidanzaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Codici_gravidanzaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Codici_gravidanzaPageResponseProjection typename() {
        return typename(null);
    }

    public Codici_gravidanzaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Codici_gravidanzaPageResponseProjection deepCopy$() {
        return new Codici_gravidanzaPageResponseProjection(this);
    }


}
