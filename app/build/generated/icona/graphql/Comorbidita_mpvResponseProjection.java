package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Comorbidita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Comorbidita_mpvResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Comorbidita_mpvResponseProjection() {
    }

    public Comorbidita_mpvResponseProjection(Comorbidita_mpvResponseProjection projection) {
        super(projection);
    }

    public Comorbidita_mpvResponseProjection(List<Comorbidita_mpvResponseProjection> projections) {
        super(projections);
    }

    public Comorbidita_mpvResponseProjection all$() {
        return all$(3);
    }

    public Comorbidita_mpvResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.name();
        this.ordine();
        this.typename();
        return this;
    }

    public Comorbidita_mpvResponseProjection _clientId() {
        return _clientId(null);
    }

    public Comorbidita_mpvResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Comorbidita_mpvResponseProjection _id() {
        return _id(null);
    }

    public Comorbidita_mpvResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Comorbidita_mpvResponseProjection name() {
        return name(null);
    }

    public Comorbidita_mpvResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public Comorbidita_mpvResponseProjection ordine() {
        return ordine(null);
    }

    public Comorbidita_mpvResponseProjection ordine(String alias) {
        add$(new GraphQLResponseField("ordine").alias(alias));
        return this;
    }

    public Comorbidita_mpvResponseProjection typename() {
        return typename(null);
    }

    public Comorbidita_mpvResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Comorbidita_mpvResponseProjection deepCopy$() {
        return new Comorbidita_mpvResponseProjection(this);
    }


}
