package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Livello_ventilazione_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Livello_ventilazione_covidResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Livello_ventilazione_covidResponseProjection() {
    }

    public Livello_ventilazione_covidResponseProjection(Livello_ventilazione_covidResponseProjection projection) {
        super(projection);
    }

    public Livello_ventilazione_covidResponseProjection(List<Livello_ventilazione_covidResponseProjection> projections) {
        super(projections);
    }

    public Livello_ventilazione_covidResponseProjection all$() {
        return all$(3);
    }

    public Livello_ventilazione_covidResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Livello_ventilazione_covidResponseProjection _clientId() {
        return _clientId(null);
    }

    public Livello_ventilazione_covidResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Livello_ventilazione_covidResponseProjection _id() {
        return _id(null);
    }

    public Livello_ventilazione_covidResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Livello_ventilazione_covidResponseProjection nome() {
        return nome(null);
    }

    public Livello_ventilazione_covidResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Livello_ventilazione_covidResponseProjection typename() {
        return typename(null);
    }

    public Livello_ventilazione_covidResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Livello_ventilazione_covidResponseProjection deepCopy$() {
        return new Livello_ventilazione_covidResponseProjection(this);
    }


}
