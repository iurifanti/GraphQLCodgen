package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_trattamento_antitumoralePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_trattamento_antitumoralePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_trattamento_antitumoralePageResponseProjection() {
    }

    public Tipo_trattamento_antitumoralePageResponseProjection(Tipo_trattamento_antitumoralePageResponseProjection projection) {
        super(projection);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection(List<Tipo_trattamento_antitumoralePageResponseProjection> projections) {
        super(projections);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection all$() {
        return all$(3);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoralePageResponseProjection.Tipo_trattamento_antitumoraleResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tipo_trattamento_antitumoralePageResponseProjection.Tipo_trattamento_antitumoraleResponseProjection.items", projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoralePageResponseProjection.Tipo_trattamento_antitumoraleResponseProjection.items", 0) + 1);
            this.items(new Tipo_trattamento_antitumoraleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoralePageResponseProjection.Tipo_trattamento_antitumoraleResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Tipo_trattamento_antitumoralePageResponseProjection items(Tipo_trattamento_antitumoraleResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection items(String alias, Tipo_trattamento_antitumoraleResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tipo_trattamento_antitumoralePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoralePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoralePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoralePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoralePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoralePageResponseProjection typename() {
        return typename(null);
    }

    public Tipo_trattamento_antitumoralePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_trattamento_antitumoralePageResponseProjection deepCopy$() {
        return new Tipo_trattamento_antitumoralePageResponseProjection(this);
    }


}
