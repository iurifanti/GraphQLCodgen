package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Unita_di_misura_viremiaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Unita_di_misura_viremiaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Unita_di_misura_viremiaPageResponseProjection() {
    }

    public Unita_di_misura_viremiaPageResponseProjection(Unita_di_misura_viremiaPageResponseProjection projection) {
        super(projection);
    }

    public Unita_di_misura_viremiaPageResponseProjection(List<Unita_di_misura_viremiaPageResponseProjection> projections) {
        super(projections);
    }

    public Unita_di_misura_viremiaPageResponseProjection all$() {
        return all$(3);
    }

    public Unita_di_misura_viremiaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Unita_di_misura_viremiaPageResponseProjection.Unita_di_misura_viremiaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Unita_di_misura_viremiaPageResponseProjection.Unita_di_misura_viremiaResponseProjection.items", projectionDepthOnFields.getOrDefault("Unita_di_misura_viremiaPageResponseProjection.Unita_di_misura_viremiaResponseProjection.items", 0) + 1);
            this.items(new Unita_di_misura_viremiaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Unita_di_misura_viremiaPageResponseProjection.Unita_di_misura_viremiaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Unita_di_misura_viremiaPageResponseProjection items(Unita_di_misura_viremiaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Unita_di_misura_viremiaPageResponseProjection items(String alias, Unita_di_misura_viremiaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Unita_di_misura_viremiaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Unita_di_misura_viremiaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Unita_di_misura_viremiaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Unita_di_misura_viremiaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Unita_di_misura_viremiaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Unita_di_misura_viremiaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaPageResponseProjection typename() {
        return typename(null);
    }

    public Unita_di_misura_viremiaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Unita_di_misura_viremiaPageResponseProjection deepCopy$() {
        return new Unita_di_misura_viremiaPageResponseProjection(this);
    }


}
