package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Fattore_di_rischioPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Fattore_di_rischioPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Fattore_di_rischioPageResponseProjection() {
    }

    public Fattore_di_rischioPageResponseProjection(Fattore_di_rischioPageResponseProjection projection) {
        super(projection);
    }

    public Fattore_di_rischioPageResponseProjection(List<Fattore_di_rischioPageResponseProjection> projections) {
        super(projections);
    }

    public Fattore_di_rischioPageResponseProjection all$() {
        return all$(3);
    }

    public Fattore_di_rischioPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Fattore_di_rischioPageResponseProjection.Fattore_di_rischioResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Fattore_di_rischioPageResponseProjection.Fattore_di_rischioResponseProjection.items", projectionDepthOnFields.getOrDefault("Fattore_di_rischioPageResponseProjection.Fattore_di_rischioResponseProjection.items", 0) + 1);
            this.items(new Fattore_di_rischioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Fattore_di_rischioPageResponseProjection.Fattore_di_rischioResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Fattore_di_rischioPageResponseProjection items(Fattore_di_rischioResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Fattore_di_rischioPageResponseProjection items(String alias, Fattore_di_rischioResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Fattore_di_rischioPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Fattore_di_rischioPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Fattore_di_rischioPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Fattore_di_rischioPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Fattore_di_rischioPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Fattore_di_rischioPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Fattore_di_rischioPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Fattore_di_rischioPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Fattore_di_rischioPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Fattore_di_rischioPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Fattore_di_rischioPageResponseProjection typename() {
        return typename(null);
    }

    public Fattore_di_rischioPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Fattore_di_rischioPageResponseProjection deepCopy$() {
        return new Fattore_di_rischioPageResponseProjection(this);
    }


}
