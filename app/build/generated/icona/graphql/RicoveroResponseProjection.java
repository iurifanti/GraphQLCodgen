package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Ricovero
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class RicoveroResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RicoveroResponseProjection() {
    }

    public RicoveroResponseProjection(RicoveroResponseProjection projection) {
        super(projection);
    }

    public RicoveroResponseProjection(List<RicoveroResponseProjection> projections) {
        super(projections);
    }

    public RicoveroResponseProjection all$() {
        return all$(3);
    }

    public RicoveroResponseProjection all$(int maxDepth) {
        this._clientId();
        this.ICD9_1();
        this.ICD9_10();
        this.ICD9_2();
        this.ICD9_3();
        this.ICD9_4();
        this.ICD9_5();
        this.ICD9_6();
        this.ICD9_7();
        this.ICD9_8();
        this.ICD9_9();
        this._id();
        this.codice_centro();
        this.data_approssimata();
        this.data_dimissione();
        this.data_ricovero();
        this.diagnosi();
        if (projectionDepthOnFields.getOrDefault("RicoveroResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("RicoveroResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("RicoveroResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RicoveroResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public RicoveroResponseProjection _clientId() {
        return _clientId(null);
    }

    public RicoveroResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_1() {
        return ICD9_1(null);
    }

    public RicoveroResponseProjection ICD9_1(String alias) {
        add$(new GraphQLResponseField("ICD9_1").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_10() {
        return ICD9_10(null);
    }

    public RicoveroResponseProjection ICD9_10(String alias) {
        add$(new GraphQLResponseField("ICD9_10").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_2() {
        return ICD9_2(null);
    }

    public RicoveroResponseProjection ICD9_2(String alias) {
        add$(new GraphQLResponseField("ICD9_2").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_3() {
        return ICD9_3(null);
    }

    public RicoveroResponseProjection ICD9_3(String alias) {
        add$(new GraphQLResponseField("ICD9_3").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_4() {
        return ICD9_4(null);
    }

    public RicoveroResponseProjection ICD9_4(String alias) {
        add$(new GraphQLResponseField("ICD9_4").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_5() {
        return ICD9_5(null);
    }

    public RicoveroResponseProjection ICD9_5(String alias) {
        add$(new GraphQLResponseField("ICD9_5").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_6() {
        return ICD9_6(null);
    }

    public RicoveroResponseProjection ICD9_6(String alias) {
        add$(new GraphQLResponseField("ICD9_6").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_7() {
        return ICD9_7(null);
    }

    public RicoveroResponseProjection ICD9_7(String alias) {
        add$(new GraphQLResponseField("ICD9_7").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_8() {
        return ICD9_8(null);
    }

    public RicoveroResponseProjection ICD9_8(String alias) {
        add$(new GraphQLResponseField("ICD9_8").alias(alias));
        return this;
    }

    public RicoveroResponseProjection ICD9_9() {
        return ICD9_9(null);
    }

    public RicoveroResponseProjection ICD9_9(String alias) {
        add$(new GraphQLResponseField("ICD9_9").alias(alias));
        return this;
    }

    public RicoveroResponseProjection _id() {
        return _id(null);
    }

    public RicoveroResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public RicoveroResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public RicoveroResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public RicoveroResponseProjection data_approssimata() {
        return data_approssimata(null);
    }

    public RicoveroResponseProjection data_approssimata(String alias) {
        add$(new GraphQLResponseField("data_approssimata").alias(alias));
        return this;
    }

    public RicoveroResponseProjection data_dimissione() {
        return data_dimissione(null);
    }

    public RicoveroResponseProjection data_dimissione(String alias) {
        add$(new GraphQLResponseField("data_dimissione").alias(alias));
        return this;
    }

    public RicoveroResponseProjection data_ricovero() {
        return data_ricovero(null);
    }

    public RicoveroResponseProjection data_ricovero(String alias) {
        add$(new GraphQLResponseField("data_ricovero").alias(alias));
        return this;
    }

    public RicoveroResponseProjection diagnosi() {
        return diagnosi(null);
    }

    public RicoveroResponseProjection diagnosi(String alias) {
        add$(new GraphQLResponseField("diagnosi").alias(alias));
        return this;
    }

    public RicoveroResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public RicoveroResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public RicoveroResponseProjection typename() {
        return typename(null);
    }

    public RicoveroResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RicoveroResponseProjection deepCopy$() {
        return new RicoveroResponseProjection(this);
    }


}
