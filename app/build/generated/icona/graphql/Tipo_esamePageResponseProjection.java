package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_esamePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_esamePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_esamePageResponseProjection() {
    }

    public Tipo_esamePageResponseProjection(Tipo_esamePageResponseProjection projection) {
        super(projection);
    }

    public Tipo_esamePageResponseProjection(List<Tipo_esamePageResponseProjection> projections) {
        super(projections);
    }

    public Tipo_esamePageResponseProjection all$() {
        return all$(3);
    }

    public Tipo_esamePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tipo_esamePageResponseProjection.Tipo_esameResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tipo_esamePageResponseProjection.Tipo_esameResponseProjection.items", projectionDepthOnFields.getOrDefault("Tipo_esamePageResponseProjection.Tipo_esameResponseProjection.items", 0) + 1);
            this.items(new Tipo_esameResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tipo_esamePageResponseProjection.Tipo_esameResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Tipo_esamePageResponseProjection items(Tipo_esameResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tipo_esamePageResponseProjection items(String alias, Tipo_esameResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tipo_esamePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tipo_esamePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tipo_esamePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Tipo_esamePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Tipo_esamePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Tipo_esamePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Tipo_esamePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Tipo_esamePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Tipo_esamePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Tipo_esamePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Tipo_esamePageResponseProjection typename() {
        return typename(null);
    }

    public Tipo_esamePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_esamePageResponseProjection deepCopy$() {
        return new Tipo_esamePageResponseProjection(this);
    }


}
