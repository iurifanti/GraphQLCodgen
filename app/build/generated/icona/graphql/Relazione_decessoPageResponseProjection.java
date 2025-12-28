package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Relazione_decessoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Relazione_decessoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Relazione_decessoPageResponseProjection() {
    }

    public Relazione_decessoPageResponseProjection(Relazione_decessoPageResponseProjection projection) {
        super(projection);
    }

    public Relazione_decessoPageResponseProjection(List<Relazione_decessoPageResponseProjection> projections) {
        super(projections);
    }

    public Relazione_decessoPageResponseProjection all$() {
        return all$(3);
    }

    public Relazione_decessoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Relazione_decessoPageResponseProjection.Relazione_decessoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Relazione_decessoPageResponseProjection.Relazione_decessoResponseProjection.items", projectionDepthOnFields.getOrDefault("Relazione_decessoPageResponseProjection.Relazione_decessoResponseProjection.items", 0) + 1);
            this.items(new Relazione_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Relazione_decessoPageResponseProjection.Relazione_decessoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Relazione_decessoPageResponseProjection items(Relazione_decessoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Relazione_decessoPageResponseProjection items(String alias, Relazione_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Relazione_decessoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Relazione_decessoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Relazione_decessoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Relazione_decessoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Relazione_decessoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Relazione_decessoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Relazione_decessoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Relazione_decessoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Relazione_decessoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Relazione_decessoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Relazione_decessoPageResponseProjection typename() {
        return typename(null);
    }

    public Relazione_decessoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Relazione_decessoPageResponseProjection deepCopy$() {
        return new Relazione_decessoPageResponseProjection(this);
    }


}
