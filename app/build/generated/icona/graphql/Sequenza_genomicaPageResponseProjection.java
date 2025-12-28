package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sequenza_genomicaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sequenza_genomicaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sequenza_genomicaPageResponseProjection() {
    }

    public Sequenza_genomicaPageResponseProjection(Sequenza_genomicaPageResponseProjection projection) {
        super(projection);
    }

    public Sequenza_genomicaPageResponseProjection(List<Sequenza_genomicaPageResponseProjection> projections) {
        super(projections);
    }

    public Sequenza_genomicaPageResponseProjection all$() {
        return all$(3);
    }

    public Sequenza_genomicaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaPageResponseProjection.Sequenza_genomicaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaPageResponseProjection.Sequenza_genomicaResponseProjection.items", projectionDepthOnFields.getOrDefault("Sequenza_genomicaPageResponseProjection.Sequenza_genomicaResponseProjection.items", 0) + 1);
            this.items(new Sequenza_genomicaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaPageResponseProjection.Sequenza_genomicaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Sequenza_genomicaPageResponseProjection items(Sequenza_genomicaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Sequenza_genomicaPageResponseProjection items(String alias, Sequenza_genomicaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Sequenza_genomicaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Sequenza_genomicaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Sequenza_genomicaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Sequenza_genomicaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Sequenza_genomicaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Sequenza_genomicaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Sequenza_genomicaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Sequenza_genomicaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Sequenza_genomicaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Sequenza_genomicaPageResponseProjection typename() {
        return typename(null);
    }

    public Sequenza_genomicaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sequenza_genomicaPageResponseProjection deepCopy$() {
        return new Sequenza_genomicaPageResponseProjection(this);
    }


}
