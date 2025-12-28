package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazioni_seconda_dose
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazioni_seconda_doseResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazioni_seconda_doseResponseProjection() {
    }

    public Motivazioni_seconda_doseResponseProjection(Motivazioni_seconda_doseResponseProjection projection) {
        super(projection);
    }

    public Motivazioni_seconda_doseResponseProjection(List<Motivazioni_seconda_doseResponseProjection> projections) {
        super(projections);
    }

    public Motivazioni_seconda_doseResponseProjection all$() {
        return all$(3);
    }

    public Motivazioni_seconda_doseResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Motivazioni_seconda_doseResponseProjection _clientId() {
        return _clientId(null);
    }

    public Motivazioni_seconda_doseResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Motivazioni_seconda_doseResponseProjection _id() {
        return _id(null);
    }

    public Motivazioni_seconda_doseResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Motivazioni_seconda_doseResponseProjection nome() {
        return nome(null);
    }

    public Motivazioni_seconda_doseResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Motivazioni_seconda_doseResponseProjection typename() {
        return typename(null);
    }

    public Motivazioni_seconda_doseResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazioni_seconda_doseResponseProjection deepCopy$() {
        return new Motivazioni_seconda_doseResponseProjection(this);
    }


}
