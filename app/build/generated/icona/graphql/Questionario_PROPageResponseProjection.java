package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Questionario_PROPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Questionario_PROPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Questionario_PROPageResponseProjection() {
    }

    public Questionario_PROPageResponseProjection(Questionario_PROPageResponseProjection projection) {
        super(projection);
    }

    public Questionario_PROPageResponseProjection(List<Questionario_PROPageResponseProjection> projections) {
        super(projections);
    }

    public Questionario_PROPageResponseProjection all$() {
        return all$(3);
    }

    public Questionario_PROPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Questionario_PROPageResponseProjection.Questionario_PROResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PROPageResponseProjection.Questionario_PROResponseProjection.items", projectionDepthOnFields.getOrDefault("Questionario_PROPageResponseProjection.Questionario_PROResponseProjection.items", 0) + 1);
            this.items(new Questionario_PROResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PROPageResponseProjection.Questionario_PROResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Questionario_PROPageResponseProjection items(Questionario_PROResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Questionario_PROPageResponseProjection items(String alias, Questionario_PROResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PROPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Questionario_PROPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Questionario_PROPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Questionario_PROPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Questionario_PROPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Questionario_PROPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Questionario_PROPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Questionario_PROPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Questionario_PROPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Questionario_PROPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Questionario_PROPageResponseProjection typename() {
        return typename(null);
    }

    public Questionario_PROPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Questionario_PROPageResponseProjection deepCopy$() {
        return new Questionario_PROPageResponseProjection(this);
    }


}
