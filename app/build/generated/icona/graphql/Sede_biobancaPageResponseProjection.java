package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sede_biobancaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sede_biobancaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sede_biobancaPageResponseProjection() {
    }

    public Sede_biobancaPageResponseProjection(Sede_biobancaPageResponseProjection projection) {
        super(projection);
    }

    public Sede_biobancaPageResponseProjection(List<Sede_biobancaPageResponseProjection> projections) {
        super(projections);
    }

    public Sede_biobancaPageResponseProjection all$() {
        return all$(3);
    }

    public Sede_biobancaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Sede_biobancaPageResponseProjection.Sede_biobancaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sede_biobancaPageResponseProjection.Sede_biobancaResponseProjection.items", projectionDepthOnFields.getOrDefault("Sede_biobancaPageResponseProjection.Sede_biobancaResponseProjection.items", 0) + 1);
            this.items(new Sede_biobancaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sede_biobancaPageResponseProjection.Sede_biobancaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Sede_biobancaPageResponseProjection items(Sede_biobancaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Sede_biobancaPageResponseProjection items(String alias, Sede_biobancaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Sede_biobancaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Sede_biobancaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Sede_biobancaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Sede_biobancaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Sede_biobancaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Sede_biobancaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Sede_biobancaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Sede_biobancaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Sede_biobancaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Sede_biobancaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Sede_biobancaPageResponseProjection typename() {
        return typename(null);
    }

    public Sede_biobancaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sede_biobancaPageResponseProjection deepCopy$() {
        return new Sede_biobancaPageResponseProjection(this);
    }


}
