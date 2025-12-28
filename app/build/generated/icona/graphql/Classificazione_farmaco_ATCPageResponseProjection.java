package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Classificazione_farmaco_ATCPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Classificazione_farmaco_ATCPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Classificazione_farmaco_ATCPageResponseProjection() {
    }

    public Classificazione_farmaco_ATCPageResponseProjection(Classificazione_farmaco_ATCPageResponseProjection projection) {
        super(projection);
    }

    public Classificazione_farmaco_ATCPageResponseProjection(List<Classificazione_farmaco_ATCPageResponseProjection> projections) {
        super(projections);
    }

    public Classificazione_farmaco_ATCPageResponseProjection all$() {
        return all$(3);
    }

    public Classificazione_farmaco_ATCPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Classificazione_farmaco_ATCPageResponseProjection.Classificazione_farmaco_ATCResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Classificazione_farmaco_ATCPageResponseProjection.Classificazione_farmaco_ATCResponseProjection.items", projectionDepthOnFields.getOrDefault("Classificazione_farmaco_ATCPageResponseProjection.Classificazione_farmaco_ATCResponseProjection.items", 0) + 1);
            this.items(new Classificazione_farmaco_ATCResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Classificazione_farmaco_ATCPageResponseProjection.Classificazione_farmaco_ATCResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Classificazione_farmaco_ATCPageResponseProjection items(Classificazione_farmaco_ATCResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Classificazione_farmaco_ATCPageResponseProjection items(String alias, Classificazione_farmaco_ATCResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Classificazione_farmaco_ATCPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Classificazione_farmaco_ATCPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Classificazione_farmaco_ATCPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Classificazione_farmaco_ATCPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Classificazione_farmaco_ATCPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Classificazione_farmaco_ATCPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Classificazione_farmaco_ATCPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Classificazione_farmaco_ATCPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Classificazione_farmaco_ATCPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Classificazione_farmaco_ATCPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Classificazione_farmaco_ATCPageResponseProjection typename() {
        return typename(null);
    }

    public Classificazione_farmaco_ATCPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Classificazione_farmaco_ATCPageResponseProjection deepCopy$() {
        return new Classificazione_farmaco_ATCPageResponseProjection(this);
    }


}
