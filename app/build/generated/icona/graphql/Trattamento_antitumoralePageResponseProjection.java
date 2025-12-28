package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Trattamento_antitumoralePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Trattamento_antitumoralePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Trattamento_antitumoralePageResponseProjection() {
    }

    public Trattamento_antitumoralePageResponseProjection(Trattamento_antitumoralePageResponseProjection projection) {
        super(projection);
    }

    public Trattamento_antitumoralePageResponseProjection(List<Trattamento_antitumoralePageResponseProjection> projections) {
        super(projections);
    }

    public Trattamento_antitumoralePageResponseProjection all$() {
        return all$(3);
    }

    public Trattamento_antitumoralePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Trattamento_antitumoralePageResponseProjection.Trattamento_antitumoraleResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Trattamento_antitumoralePageResponseProjection.Trattamento_antitumoraleResponseProjection.items", projectionDepthOnFields.getOrDefault("Trattamento_antitumoralePageResponseProjection.Trattamento_antitumoraleResponseProjection.items", 0) + 1);
            this.items(new Trattamento_antitumoraleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Trattamento_antitumoralePageResponseProjection.Trattamento_antitumoraleResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Trattamento_antitumoralePageResponseProjection items(Trattamento_antitumoraleResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Trattamento_antitumoralePageResponseProjection items(String alias, Trattamento_antitumoraleResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoralePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Trattamento_antitumoralePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Trattamento_antitumoralePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Trattamento_antitumoralePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Trattamento_antitumoralePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Trattamento_antitumoralePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Trattamento_antitumoralePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Trattamento_antitumoralePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Trattamento_antitumoralePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Trattamento_antitumoralePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Trattamento_antitumoralePageResponseProjection typename() {
        return typename(null);
    }

    public Trattamento_antitumoralePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Trattamento_antitumoralePageResponseProjection deepCopy$() {
        return new Trattamento_antitumoralePageResponseProjection(this);
    }


}
