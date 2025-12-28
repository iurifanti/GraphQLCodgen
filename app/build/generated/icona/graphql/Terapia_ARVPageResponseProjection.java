package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Terapia_ARVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_ARVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Terapia_ARVPageResponseProjection() {
    }

    public Terapia_ARVPageResponseProjection(Terapia_ARVPageResponseProjection projection) {
        super(projection);
    }

    public Terapia_ARVPageResponseProjection(List<Terapia_ARVPageResponseProjection> projections) {
        super(projections);
    }

    public Terapia_ARVPageResponseProjection all$() {
        return all$(3);
    }

    public Terapia_ARVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVPageResponseProjection.Terapia_ARVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVPageResponseProjection.Terapia_ARVResponseProjection.items", projectionDepthOnFields.getOrDefault("Terapia_ARVPageResponseProjection.Terapia_ARVResponseProjection.items", 0) + 1);
            this.items(new Terapia_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVPageResponseProjection.Terapia_ARVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Terapia_ARVPageResponseProjection items(Terapia_ARVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Terapia_ARVPageResponseProjection items(String alias, Terapia_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Terapia_ARVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Terapia_ARVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Terapia_ARVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Terapia_ARVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Terapia_ARVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Terapia_ARVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Terapia_ARVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Terapia_ARVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Terapia_ARVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Terapia_ARVPageResponseProjection typename() {
        return typename(null);
    }

    public Terapia_ARVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Terapia_ARVPageResponseProjection deepCopy$() {
        return new Terapia_ARVPageResponseProjection(this);
    }


}
