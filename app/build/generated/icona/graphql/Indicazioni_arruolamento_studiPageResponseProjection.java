package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Indicazioni_arruolamento_studiPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Indicazioni_arruolamento_studiPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Indicazioni_arruolamento_studiPageResponseProjection() {
    }

    public Indicazioni_arruolamento_studiPageResponseProjection(Indicazioni_arruolamento_studiPageResponseProjection projection) {
        super(projection);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection(List<Indicazioni_arruolamento_studiPageResponseProjection> projections) {
        super(projections);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection all$() {
        return all$(3);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiPageResponseProjection.Indicazioni_arruolamento_studiResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Indicazioni_arruolamento_studiPageResponseProjection.Indicazioni_arruolamento_studiResponseProjection.items", projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiPageResponseProjection.Indicazioni_arruolamento_studiResponseProjection.items", 0) + 1);
            this.items(new Indicazioni_arruolamento_studiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiPageResponseProjection.Indicazioni_arruolamento_studiResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Indicazioni_arruolamento_studiPageResponseProjection items(Indicazioni_arruolamento_studiResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection items(String alias, Indicazioni_arruolamento_studiResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Indicazioni_arruolamento_studiPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiPageResponseProjection typename() {
        return typename(null);
    }

    public Indicazioni_arruolamento_studiPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Indicazioni_arruolamento_studiPageResponseProjection deepCopy$() {
        return new Indicazioni_arruolamento_studiPageResponseProjection(this);
    }


}
