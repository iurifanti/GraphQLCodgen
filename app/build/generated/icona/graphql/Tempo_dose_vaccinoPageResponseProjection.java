package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tempo_dose_vaccinoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tempo_dose_vaccinoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tempo_dose_vaccinoPageResponseProjection() {
    }

    public Tempo_dose_vaccinoPageResponseProjection(Tempo_dose_vaccinoPageResponseProjection projection) {
        super(projection);
    }

    public Tempo_dose_vaccinoPageResponseProjection(List<Tempo_dose_vaccinoPageResponseProjection> projections) {
        super(projections);
    }

    public Tempo_dose_vaccinoPageResponseProjection all$() {
        return all$(3);
    }

    public Tempo_dose_vaccinoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tempo_dose_vaccinoPageResponseProjection.Tempo_dose_vaccinoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tempo_dose_vaccinoPageResponseProjection.Tempo_dose_vaccinoResponseProjection.items", projectionDepthOnFields.getOrDefault("Tempo_dose_vaccinoPageResponseProjection.Tempo_dose_vaccinoResponseProjection.items", 0) + 1);
            this.items(new Tempo_dose_vaccinoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tempo_dose_vaccinoPageResponseProjection.Tempo_dose_vaccinoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Tempo_dose_vaccinoPageResponseProjection items(Tempo_dose_vaccinoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tempo_dose_vaccinoPageResponseProjection items(String alias, Tempo_dose_vaccinoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tempo_dose_vaccinoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tempo_dose_vaccinoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Tempo_dose_vaccinoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Tempo_dose_vaccinoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Tempo_dose_vaccinoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Tempo_dose_vaccinoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoPageResponseProjection typename() {
        return typename(null);
    }

    public Tempo_dose_vaccinoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tempo_dose_vaccinoPageResponseProjection deepCopy$() {
        return new Tempo_dose_vaccinoPageResponseProjection(this);
    }


}
