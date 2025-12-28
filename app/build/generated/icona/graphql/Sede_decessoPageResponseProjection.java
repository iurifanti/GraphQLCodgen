package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sede_decessoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sede_decessoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sede_decessoPageResponseProjection() {
    }

    public Sede_decessoPageResponseProjection(Sede_decessoPageResponseProjection projection) {
        super(projection);
    }

    public Sede_decessoPageResponseProjection(List<Sede_decessoPageResponseProjection> projections) {
        super(projections);
    }

    public Sede_decessoPageResponseProjection all$() {
        return all$(3);
    }

    public Sede_decessoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Sede_decessoPageResponseProjection.Sede_decessoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sede_decessoPageResponseProjection.Sede_decessoResponseProjection.items", projectionDepthOnFields.getOrDefault("Sede_decessoPageResponseProjection.Sede_decessoResponseProjection.items", 0) + 1);
            this.items(new Sede_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sede_decessoPageResponseProjection.Sede_decessoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Sede_decessoPageResponseProjection items(Sede_decessoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Sede_decessoPageResponseProjection items(String alias, Sede_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Sede_decessoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Sede_decessoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Sede_decessoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Sede_decessoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Sede_decessoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Sede_decessoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Sede_decessoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Sede_decessoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Sede_decessoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Sede_decessoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Sede_decessoPageResponseProjection typename() {
        return typename(null);
    }

    public Sede_decessoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sede_decessoPageResponseProjection deepCopy$() {
        return new Sede_decessoPageResponseProjection(this);
    }


}
