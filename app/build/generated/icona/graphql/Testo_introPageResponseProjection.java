package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Testo_introPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Testo_introPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Testo_introPageResponseProjection() {
    }

    public Testo_introPageResponseProjection(Testo_introPageResponseProjection projection) {
        super(projection);
    }

    public Testo_introPageResponseProjection(List<Testo_introPageResponseProjection> projections) {
        super(projections);
    }

    public Testo_introPageResponseProjection all$() {
        return all$(3);
    }

    public Testo_introPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Testo_introPageResponseProjection.Testo_introResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Testo_introPageResponseProjection.Testo_introResponseProjection.items", projectionDepthOnFields.getOrDefault("Testo_introPageResponseProjection.Testo_introResponseProjection.items", 0) + 1);
            this.items(new Testo_introResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Testo_introPageResponseProjection.Testo_introResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Testo_introPageResponseProjection items(Testo_introResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Testo_introPageResponseProjection items(String alias, Testo_introResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Testo_introPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Testo_introPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Testo_introPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Testo_introPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Testo_introPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Testo_introPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Testo_introPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Testo_introPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Testo_introPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Testo_introPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Testo_introPageResponseProjection typename() {
        return typename(null);
    }

    public Testo_introPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Testo_introPageResponseProjection deepCopy$() {
        return new Testo_introPageResponseProjection(this);
    }


}
