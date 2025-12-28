package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Episodio_MPOXPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Episodio_MPOXPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Episodio_MPOXPageResponseProjection() {
    }

    public Episodio_MPOXPageResponseProjection(Episodio_MPOXPageResponseProjection projection) {
        super(projection);
    }

    public Episodio_MPOXPageResponseProjection(List<Episodio_MPOXPageResponseProjection> projections) {
        super(projections);
    }

    public Episodio_MPOXPageResponseProjection all$() {
        return all$(3);
    }

    public Episodio_MPOXPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Episodio_MPOXPageResponseProjection.Episodio_MPOXResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Episodio_MPOXPageResponseProjection.Episodio_MPOXResponseProjection.items", projectionDepthOnFields.getOrDefault("Episodio_MPOXPageResponseProjection.Episodio_MPOXResponseProjection.items", 0) + 1);
            this.items(new Episodio_MPOXResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Episodio_MPOXPageResponseProjection.Episodio_MPOXResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Episodio_MPOXPageResponseProjection items(Episodio_MPOXResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Episodio_MPOXPageResponseProjection items(String alias, Episodio_MPOXResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Episodio_MPOXPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Episodio_MPOXPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Episodio_MPOXPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Episodio_MPOXPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Episodio_MPOXPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Episodio_MPOXPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Episodio_MPOXPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Episodio_MPOXPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Episodio_MPOXPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Episodio_MPOXPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Episodio_MPOXPageResponseProjection typename() {
        return typename(null);
    }

    public Episodio_MPOXPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Episodio_MPOXPageResponseProjection deepCopy$() {
        return new Episodio_MPOXPageResponseProjection(this);
    }


}
