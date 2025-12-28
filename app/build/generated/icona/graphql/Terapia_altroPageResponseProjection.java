package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Terapia_altroPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_altroPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Terapia_altroPageResponseProjection() {
    }

    public Terapia_altroPageResponseProjection(Terapia_altroPageResponseProjection projection) {
        super(projection);
    }

    public Terapia_altroPageResponseProjection(List<Terapia_altroPageResponseProjection> projections) {
        super(projections);
    }

    public Terapia_altroPageResponseProjection all$() {
        return all$(3);
    }

    public Terapia_altroPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Terapia_altroPageResponseProjection.Terapia_altroResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_altroPageResponseProjection.Terapia_altroResponseProjection.items", projectionDepthOnFields.getOrDefault("Terapia_altroPageResponseProjection.Terapia_altroResponseProjection.items", 0) + 1);
            this.items(new Terapia_altroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_altroPageResponseProjection.Terapia_altroResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Terapia_altroPageResponseProjection items(Terapia_altroResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Terapia_altroPageResponseProjection items(String alias, Terapia_altroResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_altroPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Terapia_altroPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Terapia_altroPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Terapia_altroPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Terapia_altroPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Terapia_altroPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Terapia_altroPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Terapia_altroPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Terapia_altroPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Terapia_altroPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Terapia_altroPageResponseProjection typename() {
        return typename(null);
    }

    public Terapia_altroPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Terapia_altroPageResponseProjection deepCopy$() {
        return new Terapia_altroPageResponseProjection(this);
    }


}
