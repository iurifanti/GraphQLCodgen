package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Classificazione_farmaco_ATC
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Classificazione_farmaco_ATCResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Classificazione_farmaco_ATCResponseProjection() {
    }

    public Classificazione_farmaco_ATCResponseProjection(Classificazione_farmaco_ATCResponseProjection projection) {
        super(projection);
    }

    public Classificazione_farmaco_ATCResponseProjection(List<Classificazione_farmaco_ATCResponseProjection> projections) {
        super(projections);
    }

    public Classificazione_farmaco_ATCResponseProjection all$() {
        return all$(3);
    }

    public Classificazione_farmaco_ATCResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Classificazione_farmaco_ATCResponseProjection _clientId() {
        return _clientId(null);
    }

    public Classificazione_farmaco_ATCResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Classificazione_farmaco_ATCResponseProjection _id() {
        return _id(null);
    }

    public Classificazione_farmaco_ATCResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Classificazione_farmaco_ATCResponseProjection nome() {
        return nome(null);
    }

    public Classificazione_farmaco_ATCResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Classificazione_farmaco_ATCResponseProjection typename() {
        return typename(null);
    }

    public Classificazione_farmaco_ATCResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Classificazione_farmaco_ATCResponseProjection deepCopy$() {
        return new Classificazione_farmaco_ATCResponseProjection(this);
    }


}
