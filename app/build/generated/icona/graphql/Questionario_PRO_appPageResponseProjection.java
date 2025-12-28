package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Questionario_PRO_appPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Questionario_PRO_appPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Questionario_PRO_appPageResponseProjection() {
    }

    public Questionario_PRO_appPageResponseProjection(Questionario_PRO_appPageResponseProjection projection) {
        super(projection);
    }

    public Questionario_PRO_appPageResponseProjection(List<Questionario_PRO_appPageResponseProjection> projections) {
        super(projections);
    }

    public Questionario_PRO_appPageResponseProjection all$() {
        return all$(3);
    }

    public Questionario_PRO_appPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Questionario_PRO_appPageResponseProjection.Questionario_PRO_appResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PRO_appPageResponseProjection.Questionario_PRO_appResponseProjection.items", projectionDepthOnFields.getOrDefault("Questionario_PRO_appPageResponseProjection.Questionario_PRO_appResponseProjection.items", 0) + 1);
            this.items(new Questionario_PRO_appResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PRO_appPageResponseProjection.Questionario_PRO_appResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Questionario_PRO_appPageResponseProjection items(Questionario_PRO_appResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Questionario_PRO_appPageResponseProjection items(String alias, Questionario_PRO_appResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Questionario_PRO_appPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Questionario_PRO_appPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Questionario_PRO_appPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Questionario_PRO_appPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Questionario_PRO_appPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Questionario_PRO_appPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Questionario_PRO_appPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Questionario_PRO_appPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Questionario_PRO_appPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Questionario_PRO_appPageResponseProjection typename() {
        return typename(null);
    }

    public Questionario_PRO_appPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Questionario_PRO_appPageResponseProjection deepCopy$() {
        return new Questionario_PRO_appPageResponseProjection(this);
    }


}
