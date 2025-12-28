package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_visita_mpvPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_visita_mpvPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_visita_mpvPageResponseProjection() {
    }

    public Tipo_visita_mpvPageResponseProjection(Tipo_visita_mpvPageResponseProjection projection) {
        super(projection);
    }

    public Tipo_visita_mpvPageResponseProjection(List<Tipo_visita_mpvPageResponseProjection> projections) {
        super(projections);
    }

    public Tipo_visita_mpvPageResponseProjection all$() {
        return all$(3);
    }

    public Tipo_visita_mpvPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tipo_visita_mpvPageResponseProjection.Tipo_visita_mpvResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tipo_visita_mpvPageResponseProjection.Tipo_visita_mpvResponseProjection.items", projectionDepthOnFields.getOrDefault("Tipo_visita_mpvPageResponseProjection.Tipo_visita_mpvResponseProjection.items", 0) + 1);
            this.items(new Tipo_visita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tipo_visita_mpvPageResponseProjection.Tipo_visita_mpvResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Tipo_visita_mpvPageResponseProjection items(Tipo_visita_mpvResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tipo_visita_mpvPageResponseProjection items(String alias, Tipo_visita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tipo_visita_mpvPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tipo_visita_mpvPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tipo_visita_mpvPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Tipo_visita_mpvPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Tipo_visita_mpvPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Tipo_visita_mpvPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Tipo_visita_mpvPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Tipo_visita_mpvPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Tipo_visita_mpvPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Tipo_visita_mpvPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Tipo_visita_mpvPageResponseProjection typename() {
        return typename(null);
    }

    public Tipo_visita_mpvPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_visita_mpvPageResponseProjection deepCopy$() {
        return new Tipo_visita_mpvPageResponseProjection(this);
    }


}
