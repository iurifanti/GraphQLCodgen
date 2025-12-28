package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Metodica_genoma_HCV_HBVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Metodica_genoma_HCV_HBVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Metodica_genoma_HCV_HBVPageResponseProjection() {
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection(Metodica_genoma_HCV_HBVPageResponseProjection projection) {
        super(projection);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection(List<Metodica_genoma_HCV_HBVPageResponseProjection> projections) {
        super(projections);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection all$() {
        return all$(3);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Metodica_genoma_HCV_HBVPageResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Metodica_genoma_HCV_HBVPageResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.items", projectionDepthOnFields.getOrDefault("Metodica_genoma_HCV_HBVPageResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.items", 0) + 1);
            this.items(new Metodica_genoma_HCV_HBVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Metodica_genoma_HCV_HBVPageResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection items(Metodica_genoma_HCV_HBVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection items(String alias, Metodica_genoma_HCV_HBVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection typename() {
        return typename(null);
    }

    public Metodica_genoma_HCV_HBVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Metodica_genoma_HCV_HBVPageResponseProjection deepCopy$() {
        return new Metodica_genoma_HCV_HBVPageResponseProjection(this);
    }


}
